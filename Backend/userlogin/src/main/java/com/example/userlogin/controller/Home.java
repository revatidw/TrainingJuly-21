package com.example.userlogin.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.userlogin.entity.JwtRequest;
import com.example.userlogin.entity.JwtResponse;
import com.example.userlogin.helper.JwtUtil;
import com.example.userlogin.service.CustomUserDetailsService;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class Home{
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private CustomUserDetailsService customUserDetailsService;
	
	@Autowired
	private JwtUtil jwtUtil;
	
	@GetMapping("/welcome")
	public String welcome() {
		return "Hello Revatii!";
	}
	
	@GetMapping(path="/getUser")
	public ResponseEntity<HashMap<String,String>> getSampleUser(){
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("Name", "revati");
        return ResponseEntity.ok(map);
	}
	@PostMapping("/token")
	public ResponseEntity<?> generateToken(@RequestBody JwtRequest request) throws Exception{
		System.out.println(request);
		try	{
			
			this.authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
		} catch(BadCredentialsException e) {
			throw new Exception("Bad credentials", e);
		}
		
		
		//UserDetails userDetails = customUserDetailsService.loadUserByUsername(request.getUsername());
		String token = jwtUtil.generateToken(request.getUsername());
		return ResponseEntity.ok(new JwtResponse(token));
	}
}
