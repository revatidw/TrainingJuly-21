package com.example.stockexchange.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STOCKEXCHANGE")
public class StockExchangeEntity {
	@Id
	@Column
	@GeneratedValue
	private int stockExchangeId;
	
	@Column
	private String stockExchangeName;
	
	@Column
	private String stockExchangeBrief;
	
	@Column
	private String stockExchangeAddress;
	
	@Column
	private String remarks;
	
	public StockExchangeEntity() {
		super();
	}
	public StockExchangeEntity(String stockExchangeName, String stockExchangeBrief, String stockExchangeAddress,
			String remarks) {
		super();
		this.stockExchangeName = stockExchangeName;
		this.stockExchangeBrief = stockExchangeBrief;
		this.stockExchangeAddress = stockExchangeAddress;
		this.remarks = remarks;
	}
	
	public int getStockExchangeId() {
		return stockExchangeId;
	}
	public void setStockExchangeId(int stockExchangeId) {
		this.stockExchangeId = stockExchangeId;
	}
	public String getStockExchangeName() {
		return stockExchangeName;
	}
	public void setStockExchangeName(String stockExchangeName) {
		this.stockExchangeName = stockExchangeName;
	}
	public String getStockExchangeBrief() {
		return stockExchangeBrief;
	}
	public void setStockExchangeBrief(String stockExchangeBrief) {
		this.stockExchangeBrief = stockExchangeBrief;
	}
	public String getStockExchangeAddress() {
		return stockExchangeAddress;
	}
	public void setStockExchangeAddress(String stockExchangeAddress) {
		this.stockExchangeAddress = stockExchangeAddress;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	

}
