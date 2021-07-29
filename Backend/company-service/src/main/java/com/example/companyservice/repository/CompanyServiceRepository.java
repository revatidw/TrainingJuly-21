package com.example.companyservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.companyservice.entity.Company;

@Repository
public interface CompanyServiceRepository extends JpaRepository<Company, Integer> {

	List<Company> findByStockExchangeId(String stockExchangeId);
	List<Company> findBySectorId(String name);
	public List<Company> findByCompanyNameIgnoreCaseContaining(String pattern);
	public List<Company> findByCompanyName(String companyName);

}
