package com.example.sectorservice.service;

import java.util.List;

import com.example.sectorservice.entity.Company;
import com.example.sectorservice.entity.Sector;

public interface SectorService {
	
	List<Sector> getSectorByName(String sectorName);
	List<Sector> getAllSectors();
	void addNewSector(Sector sector);
	List<Company> getCompanyBySector(String sectorName);

}
