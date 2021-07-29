package com.example.companyservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.companyservice.entity.Ipo;

@Repository
public interface IpoServiceRepository extends JpaRepository<Ipo, Integer>{
	

}
