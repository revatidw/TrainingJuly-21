package com.example.companyservice.service;

import java.util.List;



import com.example.companyservice.entity.Ipo;

public interface IpoService {
	
	public List<Ipo> findall();
	public Ipo findbyId(int id);
	public Ipo addIpo(Ipo ipo);
	public void delete(int id);

}
