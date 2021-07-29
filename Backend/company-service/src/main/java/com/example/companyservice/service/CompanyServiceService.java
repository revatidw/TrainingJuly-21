package com.example.companyservice.service;

import java.util.List;

import com.example.companyservice.entity.Company;



public interface CompanyServiceService {
	
	Company findCompanyById(Integer companyId);
	List<Company> findAll();
	Company addNew(Company company);
	void deleteById(Integer id);
	List<Company> findCompanyByStockExchangeId(String stockExchangeId);
	List<Company> findBySectorId(String sectorName);
	List<Company> getMatching(String pattern);
	List<Company> getCompanyDetails(String companyName);
	
	

}
