package com.zee.zee5app.dto;

import lombok.Data;

@Data

public class Register {
	
	private String id;
	private String firstname;
	private String lastname;
	private String email;
	private String password;
	
	public Register() {
		//EDC
		System.out.println("wazahath");
		
	}

}
