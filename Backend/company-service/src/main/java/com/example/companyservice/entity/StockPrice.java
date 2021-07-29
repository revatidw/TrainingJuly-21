package com.example.companyservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="StockPrice")
public class StockPrice {

	@Id
	@GeneratedValue
	private int stockPriceId;
	
	
	private String companyCode;
	private double stockExchangePrice;
	private double currentPrice;
	private String date;
	private String time;
	
	
	
	public StockPrice() {
		super();
	}
	public StockPrice(String companyCode, double stockExchangePrice, double currentPrice, String date, String time) {
		super();
		this.companyCode = companyCode;
		this.stockExchangePrice = stockExchangePrice;
		this.currentPrice = currentPrice;
		this.date = date;
		this.time = time;
	}
	
	public int getStockPriceId() {
		return stockPriceId;
	}
	public void setStockPriceId(int stockPriceId) {
		this.stockPriceId = stockPriceId;
	}
	public String getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
	public double getStockExchangePrice() {
		return stockExchangePrice;
	}
	public void setStockExchangePrice(double stockExchangePrice) {
		this.stockExchangePrice = stockExchangePrice;
	}
	public double getCurrentPrice() {
		return currentPrice;
	}
	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	
}
