package com.example.stockexchange.service;

import java.util.List;

import com.example.stockexchange.entity.Company;
import com.example.stockexchange.entity.StockExchangeEntity;


public interface StockExchangeService {
	
	List<StockExchangeEntity> findStockExchangeByName(String stockExchangeName);
	List<StockExchangeEntity> findAll();
	void addNew(StockExchangeEntity stock);
	void deleteById(Integer id);
	List<Company> findCompanyByStockExchangeName(String stockExchangeName);

}
