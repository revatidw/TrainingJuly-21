package com.example.companyservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="IPO_company")
public class Ipo {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String companyName;
	private String stockExchangeName;
	private double price;
	private int shares;
	private String openDateTime;
	private String remarks;
	
	public Ipo(String companyName, String stockExchangeName, double price, int shares, String openDateTime,
			String remarks) {
		super();
		this.companyName = companyName;
		this.stockExchangeName = stockExchangeName;
		this.price = price;
		this.shares = shares;
		this.openDateTime = openDateTime;
		this.remarks = remarks;
	}
	public Ipo() {
		super();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getStockExchangeName() {
		return stockExchangeName;
	}
	public void setStockExchangeName(String stockExchangeName) {
		this.stockExchangeName = stockExchangeName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getShares() {
		return shares;
	}
	public void setShares(int shares) {
		this.shares = shares;
	}
	public String getOpenDateTime() {
		return openDateTime;
	}
	public void setOpenDateTime(String openDateTime) {
		this.openDateTime = openDateTime;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	
	
	

	
}
