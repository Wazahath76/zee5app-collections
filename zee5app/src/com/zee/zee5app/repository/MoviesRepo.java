package com.zee.zee5app.repository;


import com.zee.zee5app.dto.Movies;

import lombok.Data;

public class MoviesRepo {
	
	
private Movies[] movie = new Movies[10]; 
	
	public static int count = -1;
	public Movies[] getUsers() {
		return movie;
	}
	
	
	
	public Movies getUserById(String id) {
		
		//do we need to traverse the array?
		
		for (Movies mov : movie) {
			if(mov!=null && mov.getId().equals(id)) {
				return mov;
			}
		}
		
		return null;
	}
	
	public String addSubscriber(Movies sub) {
		
		//registers,length ==> give us the availability
		if(count==movie.length-1) {
			//array is full 
			
			Movies temp[] = new Movies[movie.length*2];
			
			
			//do we need to copy the content from old to new ? yes
			System.arraycopy(movie, 0, temp, 0, movie.length);
			movie=temp;
			movie[++count] = sub;
			return "success";
		}
		movie[++count] = sub;
		return "success";
		
	}

	public static MoviesRepo repository;

	public static MoviesRepo  getInstance() {
		// TODO Auto-generated method stub
		
		if(repository==null)
			repository = new MoviesRepo();
		return repository;
	}

}
