package com.zee.zee5app.dto;

import lombok.Data;

@Data
public class Subscription {
	
	private String id;
	private String status;
	private String pack_country;
	private String payment_mode;
	private String autorenewal;
	
	public Subscription() {
		System.out.println("done");
	}

}
