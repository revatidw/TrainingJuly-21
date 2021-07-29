package com.example.companyservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.companyservice.entity.Company;
import com.example.companyservice.repository.CompanyServiceRepository;



@Service
public class CompanyServiceServiceImpl implements CompanyServiceService{
	
	@Autowired
	private CompanyServiceRepository repository;
	
	
	
	@Override
	public Company findCompanyById(Integer companyId)
	{
		Optional<Company> Entity1 = repository.findById(companyId);
		if (Entity1.isPresent()) {
        	return Entity1.get();
        }
		else
			return null;
		}
	
	@Override
	 public List<Company> findAll()
	 {
		return repository.findAll();
	 }
	
	@Override
	public Company addNew (Company company)
	{
		return repository.save(company);
	}
	
	@Override
	public void deleteById(Integer id)
	{
		repository.deleteById(id);
	}

	@Override
	public List<Company> findCompanyByStockExchangeId(String stockExchangeId) {
		
		List<Company> a= repository.findByStockExchangeId(stockExchangeId); 
		return a;
		
	}

	@Override
	public List<Company> findBySectorId(String sectorName) {
		List<Company> a= repository.findBySectorId(sectorName); 
		return a;
	}

	@Override
	public List<Company> getMatching(String pattern) {
		return repository.findByCompanyNameIgnoreCaseContaining(pattern);
	}

	@Override
	public List<Company> getCompanyDetails(String companyName) {
		return repository.findByCompanyName(companyName);
	}

	
}
