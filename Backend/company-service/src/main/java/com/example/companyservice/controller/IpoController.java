package com.example.companyservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.companyservice.entity.Ipo;
import com.example.companyservice.service.IpoService;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/ipo")
public class IpoController {
	
	@Autowired
	private IpoService service;
	
	@GetMapping("/findAll")
	public List<Ipo> findall()
	{
		return service.findall();
	}
	
	@GetMapping("/findById/{id}")
	public Ipo findbyId(@PathVariable int id)
	{
		return service.findbyId(id);
	}
	
	@PostMapping("/add")
	public Ipo addIpo(@RequestBody Ipo ipo)
	{
		return service.addIpo(ipo);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id)
	{
		service.delete(id);
		return "IPO with ID " + id +" deleted.";
	}

}
