package com.example.stockexchange.controller;

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

import com.example.stockexchange.entity.Company;
import com.example.stockexchange.entity.StockExchangeEntity;
//import com.example.stockexchange.repository.StockExchangeRepository;
import com.example.stockexchange.service.StockExchangeService;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/stockexchange")
public class StockExchangeController {
	
	@Autowired
	private StockExchangeService service;
	
	@PostMapping("/add")
	public String addStockExchange(@RequestBody StockExchangeEntity stock)
	{
		service.addNew(stock);
		return "Stock Exchange with name" + stock.getStockExchangeName() + "saved";
	}
	
	@GetMapping("/find/{name}")
	public List<StockExchangeEntity> findbyName(@PathVariable String name)
	{
		return service.findStockExchangeByName(name);
	}
	
	@GetMapping("/getAll")
	public List<StockExchangeEntity> findAllUsers() 
	{
        List<StockExchangeEntity> a= service.findAll();
        return a;
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id)
	{
		service.deleteById(id);
		return id+ " deleted successfully!";
	}
	
	@GetMapping("/company/{stockExchangeName}")
	public List<Company> findCompanyByStockExchange(@PathVariable String stockExchangeName)
	{
		return service.findCompanyByStockExchangeName(stockExchangeName);
	}

}
