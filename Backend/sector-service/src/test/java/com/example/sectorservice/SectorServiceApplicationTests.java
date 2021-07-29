package com.example.sectorservice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.sectorservice.entity.Sector;
import com.example.sectorservice.repository.SectorServiceRepository;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
class SectorServiceApplicationTests {

	@Autowired
	@Order(1)
	private SectorServiceRepository repo;
	
	@Order(2)
	@Test
	public void createTest()
	{
		Sector sector= new Sector();
		sector.setSectorName("Pharma");
		sector.setSectorBrief("Deals with pharma");
		repo.save(sector);
		System.out.println(sector.getSectorId());
		assertNotNull(repo.findById(sector.getSectorId()).get());
	}
	
	
	
	
	@Order(3)
	@Test
	public void testRead()
	{
		Sector sector= repo.findById(103).get();
		assertEquals("Healthcare", sector.getSectorName());
	}
	
	@Order(4)
	@Test
	public void testUpdate()
	{
		Sector sector= repo.findById(19).get();
		sector.setSectorName("HealthCare");
		repo.save(sector);
		assertEquals("HealthCare", repo.findById(19).get().getSectorName());
	}
	
	@Order(5)
	@Test
	public void testDelete()
	{
		repo.deleteById(111);
		assertEquals(repo.existsById(111),Boolean.FALSE);
		
	}
	


}
