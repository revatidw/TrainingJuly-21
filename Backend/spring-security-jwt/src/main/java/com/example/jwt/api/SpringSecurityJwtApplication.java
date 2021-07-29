package com.example.jwt.api;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.jwt.api.enitity.User;
import com.example.jwt.api.repository.UserRepository;

@SpringBootApplication
@CrossOrigin(origins="*")
public class SpringSecurityJwtApplication {
	
	@Autowired
	private UserRepository repository;
	
	
	
	
	
	
	
	@PostConstruct
	public void initUsers()
	{
		List<User> users= Stream.of(
                new User(101, "javatechie", "password", "revati@gmail.com"),
                new User(102, "revati", "pwd1", "user1@gmail.com"),
                new User(103, "user2", "pwd2", "user2@gmail.com"),
                new User(104, "user3", "pwd3", "user3@gmail.com")
        ).collect(Collectors.toList());
        repository.saveAll(users);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityJwtApplication.class, args);
	}

}
