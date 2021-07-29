package com.example.companyservice.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name= "COMPANY")
@AllArgsConstructor
@NoArgsConstructor
public class Company {
	
	

	@Id
	@GeneratedValue
	private int companyId;
	
	@Column
	private String companyName;
	@Column
	private double turnover;
	@Column
	private String boardOfDirectors;
	@Column
	private String stockExchangeId;
	@Column
	private String sectorId;
	@Column
	private String briefWriteup;
	@Column
	private Integer ip;
	
	@OneToOne(targetEntity=Ipo.class, cascade=CascadeType.ALL)
	private Ipo abc;
	
	@OneToMany(cascade= CascadeType.ALL)
	@JoinColumn(name="company_stock")
	private List<StockPrice> stockprice;
	
	public Company(String companyName, double turnover, String boardOfDirectors, String stockExchangeId,
			String sectorId, String briefWriteup, Integer ip, Ipo abc) {
		super();
		this.companyName = companyName;
		this.turnover = turnover;
		this.boardOfDirectors = boardOfDirectors;
		this.stockExchangeId = stockExchangeId;
		this.sectorId = sectorId;
		this.briefWriteup = briefWriteup;
		this.ip = ip;
		this.abc = abc;
	}

	

	public Company() {
		super();
	}
	public int getCompanyId() {
		return companyId;
	}



	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public double getTurnover() {
		return turnover;
	}

	public void setTurnover(double turnover) {
		this.turnover = turnover;
	}

	public String getBoardOfDirectors() {
		return boardOfDirectors;
	}

	public void setBoardOfDirectors(String boardOfDirectors) {
		this.boardOfDirectors = boardOfDirectors;
	}

	public String getStockExchangeId() {
		return stockExchangeId;
	}

	public void setStockExchangeId(String stockExchangeId) {
		this.stockExchangeId = stockExchangeId;
	}

	public String getSectorId() {
		return sectorId;
	}

	public void setSectorId(String sectorId) {
		this.sectorId = sectorId;
	}

	public String getBriefWriteup() {
		return briefWriteup;
	}

	public void setBriefWriteup(String briefWriteup) {
		this.briefWriteup = briefWriteup;
	}

	public Integer getIp() {
		return ip;
	}

	public void setIp(Integer ip) {
		this.ip = ip;
	}

	public Ipo getAbc() {
		return abc;
	}

	public void setAbc(Ipo abc) {
		this.abc = abc;
	}
	public List<StockPrice> getStockprice() {
		return stockprice;
	}

	public void setStockprice(List<StockPrice> stockprice) {
		this.stockprice = stockprice;
	}

	
	
	
	
	

	

	
}
