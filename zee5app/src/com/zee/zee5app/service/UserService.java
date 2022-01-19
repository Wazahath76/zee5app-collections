package com.zee.zee5app.service;

import com.zee.zee5app.repository.UserRepository;
import com.zee.zee5app.dto.Register;

public class UserService {
	
	private UserRepository repository = UserRepository.getInstance();
	
	private UserService() {
		
		//TODO auto generated stub
	}
	
	// if we want to create that single object then we have to create it
	// inside the same class
	// and we have to share ref with others
	// to do the same we have to declare a method
	private static UserService service=null;
	
	// this would be a static
	// only one copy
	
	public static UserService getInstance() {
		
		// it becomes object independant?
		// static will make it independant on the object for execution
		if(service==null)
			service = new UserService();
		return service;
	}
	
	public String addUser(Register register) {
		return this.repository.addUser(register);
	}
	
	public Register getUserById(String id) {
		return this.repository.getUserById(id);
	}
	
	public Register[] getUsers() {
		return repository.getUsers();
	}



}
