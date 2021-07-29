package com.example.stockexchange.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.stockexchange.entity.StockExchangeEntity;

@Repository
public interface StockExchangeRepository extends JpaRepository<StockExchangeEntity, Integer> {

	List<StockExchangeEntity> findByStockExchangeName(String stockExchangeName);

}
