package com.example.userlogin.entity;

public class JwtResponse {
 
	private String jwt;

	public String getJwt() {
		return jwt;
	}
	

	public JwtResponse() {
		super();
	}


	public JwtResponse(String jwt) {
		this.jwt = jwt;
	}
}
