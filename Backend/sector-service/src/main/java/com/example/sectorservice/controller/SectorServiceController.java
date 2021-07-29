package com.example.sectorservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sectorservice.entity.Company;
import com.example.sectorservice.entity.Sector;
import com.example.sectorservice.service.SectorService;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/sector")
public class SectorServiceController {
	
	@Autowired
	private SectorService service;
	
	@GetMapping("/getAll")
	public List<Sector> getAllSectors()
	{
		return service.getAllSectors();
	}
	
	@PostMapping("/addNewSector")
	public void addNew(@RequestBody Sector sector)
	{
		service.addNewSector(sector);
	}
	
	@GetMapping("/details/{name}")
	public List<Sector> getSector(@PathVariable String name)
	{
		return service.getSectorByName(name);
	}
	
	@GetMapping("/allCompany/{sectorName}")
	public List<Company> getAllCompanies(@PathVariable String sectorName)
	{
		return service.getCompanyBySector(sectorName);
	}
	
	

}
