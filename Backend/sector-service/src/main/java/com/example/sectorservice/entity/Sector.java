package com.example.sectorservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.NonNull;

@Entity
@Table(name="SECTOR")
public class Sector {

	@Id
	@GeneratedValue
	private int sectorId;
	
	@Column
	@NonNull
	private String sectorName;
	
	@Column
	private String sectorBrief;
	
	public Sector(int sectorId, String sectorName, String sectorBrief) {
		super();
		this.sectorId = sectorId;
		this.sectorName = sectorName;
		this.sectorBrief = sectorBrief;
	}
	public Sector() {
		super();
	}
	
	public int getSectorId() {
		return sectorId;
	}
	public void setSectorId(int sectorId) {
		this.sectorId = sectorId;
	}
	public String getSectorName() {
		return sectorName;
	}
	public void setSectorName(String sectorName) {
		this.sectorName = sectorName;
	}
	public String getSectorBrief() {
		return sectorBrief;
	}
	public void setSectorBrief(String sectorBrief) {
		this.sectorBrief = sectorBrief;
	}
	
	
}
