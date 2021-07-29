package com.example.companyservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.companyservice.entity.Company;
import com.example.companyservice.entity.Ipo;
import com.example.companyservice.service.CompanyServiceService;
import com.example.companyservice.service.IpoService;


@RestController
@CrossOrigin(origins="*")
@RequestMapping("/company")
public class CompanyServiceController {
	@Autowired
	private CompanyServiceService service;
	
	
	@Autowired
	private IpoService service1;
	
	@GetMapping("/ipo/findAll")
	public List<Ipo> findall()
	{
		return service1.findall();
	}
	
	@PostMapping("/add")
	public Company addCompany(@RequestBody Company company)
	{
		return service.addNew(company);
		//return "Company with name " + company.getCompanyName() + " saved";
	}
	
	
	@GetMapping("/getAll")
	public List<Company> findAllUsers() 
	{
        return service.findAll();
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id)
	{
		service.deleteById(id);
		return id+ " deleted successfully!";
	}
	
	@GetMapping("/stockexchange/{id}")
	public List<Company> findByStockexchangeId(@PathVariable String id)
	{
		return service.findCompanyByStockExchangeId(id);
	}
	
	@GetMapping("/sector/{name}")
	public List<Company> findBySectorId(@PathVariable String name)
	{
		return service.findBySectorId(name);
	}
	
	@GetMapping("/details/{companyName}")
	public List<Company> getDetails(@PathVariable String companyName)
	{
		return service.getCompanyDetails(companyName);
	}
	
	@GetMapping("/getMatching/{pattern}")
	public List<Company> getMatching(@PathVariable String pattern)
	{
		return service.getMatching(pattern);
	}
	

}
