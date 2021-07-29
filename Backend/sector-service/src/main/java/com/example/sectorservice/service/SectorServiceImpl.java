package com.example.sectorservice.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.sectorservice.entity.Company;
import com.example.sectorservice.entity.Sector;
import com.example.sectorservice.repository.SectorServiceRepository;

@Service
public class SectorServiceImpl implements SectorService{

	@Autowired
	private SectorServiceRepository repository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public List<Sector> getSectorByName (String sectorName) 
	{
		return repository.findBySectorName(sectorName);
		
	}

	@Override
	public List<Sector> getAllSectors() {
		return repository.findAll();
	}

	@Override
	public void addNewSector(Sector sector) {
		repository.save(sector);
		
	}

	@Override
	public List<Company> getCompanyBySector(String sectorName) {
		ResponseEntity<Company[]> response =
				  restTemplate.getForEntity(
				  "http://COMPANYSERVICE/company/sector/" + sectorName,
				  Company[].class);
				Company[] a = response.getBody();
				
					  return Arrays.stream(a).collect(Collectors.toList());
	}

}
