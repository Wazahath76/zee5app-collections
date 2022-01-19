package com.zee.zee5app.service;

import com.zee.zee5app.dto.Movies;
import com.zee.zee5app.repository.MoviesRepo;

public class MoviesService {
	
	
	private MoviesRepo repository = MoviesRepo.getInstance();
	
	private MoviesService() {
		
		//TODO auto generated stub
	}
	
	// if we want to create that single object then we have to create it
	// inside the same class
	// and we have to share ref with others
	// to do the same we have to declare a method
	private static MoviesService service=null;
	
	// this would be a static
	// only one copy
	
	public static MoviesService getInstance() {
		
		// it becomes object independant?
		// static will make it independant on the object for execution
		if(service==null)
			service = new MoviesService();
		return service;
	}
	
	public String addSubscriber(Movies register) {
		return this.repository.addSubscriber(register);
	}
	
	public Movies getUserById(String id) {
		return this.repository.getUserById(id);
	}
	
	public Movies[] getUsers() {
		return repository.getUsers();
	}

}
