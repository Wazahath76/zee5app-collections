package com.zee.zee5app.service;

import java.util.Optional;

import com.zee.zee5app.dto.Register;
import com.zee.zee5app.exception.IdNotFoundException;

public interface UserService2 {
	
	public String addUser(Register register);
	public String updateUser(String id, Register register);
	public Register getUserById(String id) throws IdNotFoundException;
	public Register[] getAllUsers();
	public String deleteUserById(String id);
	

}
