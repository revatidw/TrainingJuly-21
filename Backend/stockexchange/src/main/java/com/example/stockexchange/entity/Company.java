package com.example.stockexchange.entity;



public class Company {
	
	
	private int companyId;
	private String companyName;
	private double turnover;
	private String boardOfDirectors;
	private String stockExchanges;
	private String sectorId;
	private String briefWriteup;
	private Integer ipo;
	
	
	
	public Company() {
		super();
	}


	public Company(String companyName, double turnover, String boardOfDirectors, String stockExchanges, String sectorId,
			String briefWriteup, Integer ipo) {
		super();
		this.companyName = companyName;
		this.turnover = turnover;
		this.boardOfDirectors = boardOfDirectors;
		this.stockExchanges = stockExchanges;
		this.sectorId = sectorId;
		this.briefWriteup = briefWriteup;
		this.ipo = ipo;
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
	public String getStockExchanges() {
		return stockExchanges;
	}
	public void setStockExchanges(String stockExchanges) {
		this.stockExchanges = stockExchanges;
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
	public Integer getIpo() {
		return ipo;
	}
	public void setIpo(Integer ipo) {
		this.ipo = ipo;
	}
	

}
