package com.zee.zee5app.repository;

//@Data
import com.zee.zee5app.dto.Series;

import lombok.Data;

public class SeriesRepo {
	
private Series[] series = new Series[10]; 
	
	public static int count = -1;
	public Series[] getUsers() {
		return series;
	}
	
	
	
	public Series getUserById(String id) {
		
		//do we need to traverse the array?
		
		for (Series mov : series) {
			if(mov!=null && mov.getId().equals(id)) {
				return mov;
			}
		}
		
		return null;
	}
	
	public String addSubscriber(Series sub) {
		
		//registers,length ==> give us the availability
		if(count==series.length-1) {
			//array is full 
			
			Series temp[] = new Series[series.length*2];
			
			
			//do we need to copy the content from old to new ? yes
			System.arraycopy(series, 0, temp, 0, series.length);
			series=temp;
			series[++count] = sub;
			return "success";
		}
		series[++count] = sub;
		return "success";
		
	}

	public static SeriesRepo repository;

	public static SeriesRepo  getInstance() {
		// TODO Auto-generated method stub
		
		if(repository==null)
			repository = new SeriesRepo();
		return repository;
	}


}
