package com.zee.zee5app.dto;

import lombok.Data;

@Data
public class Series {
	
	private String id;
	private String name;
	private String language;
	
	public Series() {
		System.out.println("done");
	}


}
