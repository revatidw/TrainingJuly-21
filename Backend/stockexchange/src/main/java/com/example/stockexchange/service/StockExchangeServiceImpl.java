package com.example.stockexchange.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.stockexchange.entity.Company;
import com.example.stockexchange.entity.StockExchangeEntity;
import com.example.stockexchange.repository.StockExchangeRepository;
import com.fasterxml.jackson.databind.ObjectMapper;


@Service
public class StockExchangeServiceImpl implements StockExchangeService{
	
	@Autowired
	private StockExchangeRepository repository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public List<StockExchangeEntity> findStockExchangeByName(String stockExchangeName)
	{
		//Optional<StockExchangeEntity> stockExchangeEntity = 
				return repository.findByStockExchangeName(stockExchangeName);
		/*if (stockExchangeEntity.isPresent()) {
        	return stockExchangeEntity.get();
        }
		else
			return null;
		}
	*/
	}
	@Override
	 public List<StockExchangeEntity> findAll()
	 {
		return repository.findAll();
	 }
	
	@Override
	public void addNew(StockExchangeEntity stock)
	{
		repository.save(stock);
	}
	
	@Override
	public void deleteById(Integer id)
	{
		repository.deleteById(id);
	}
	
	@Override
	public List<Company> findCompanyByStockExchangeName(String stockExchangeName) {
		
		//List<Company> a= restTemplate.getForObject("http://localhost:8001/company/stockexchange/" + stockExchangeId, new List<Company>(), Company.class);
		ResponseEntity<Company[]> response =
				  restTemplate.getForEntity(
				  "http://localhost:8001/company/stockexchange/" + stockExchangeName,
				  Company[].class);
				Company[] a = response.getBody();
				
					  return Arrays.stream(a).collect(Collectors.toList());
		
		
	}
	
	
	

}
