package com.example.jwt.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jwt.api.enitity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	User findByUserName(String username);

	

}
