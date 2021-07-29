package com.example.companyservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.companyservice.entity.Ipo;
import com.example.companyservice.repository.IpoServiceRepository;


@Service
public class IpoServiceImpl implements IpoService {

	@Autowired
	private IpoServiceRepository repository;
	
	@Override
	public List<Ipo> findall() {
		return repository.findAll();
	}

	@Override
	public Ipo findbyId(int id) {
		Optional<Ipo> entity = repository.findById(id);
		if (entity.isPresent()) {
        	return entity.get();
        }
		else
			return null;
		}
	

	@Override
	public Ipo addIpo(Ipo ipo) {
		return repository.save(ipo);
	}

	@Override
	public void delete(int id) {
		repository.deleteById(id);
	}
	
	

}
