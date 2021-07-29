package com.example.sectorservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sectorservice.entity.Sector;

@Repository
public interface SectorServiceRepository extends JpaRepository<Sector, Integer> {

	List<Sector> findBySectorName(String sectorName);

}
