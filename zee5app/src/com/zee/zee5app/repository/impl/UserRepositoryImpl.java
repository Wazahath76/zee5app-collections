package com.zee.zee5app.repository.impl;

import java.util.ArrayList;
import java.util.Optional;

import com.zee.zee5app.dto.Register;
import com.zee.zee5app.exception.IdNotFoundException;
import com.zee.zee5app.repository.UserRepository2;
import com.zee.zee5app.repository.impl.UserRepositoryImpl;
//import com.zee.zee5app.service.impl.UserRepositoryImpl2;
//import com.zee.zee5app.service.impl.UserServiceImpl;

public class UserRepositoryImpl implements UserRepository2 {
	private Register[] registers=new Register[10];
	private ArrayList<Register> arrayList=new ArrayList<>();
	//if we use DC instead of AL the by default it holds 
	private static int count=-1;
	private UserRepositoryImpl() {
		
	}
	private static UserRepository2 repository;
	
	public static UserRepository2 getInstance() {
		if(repository==null) {
			repository=new UserRepositoryImpl();
		}
		return repository;
	}
	
	//UserRepository2 userRepositoryImpl=new UserRepositoryImpl2();
	
	@Override
	public String addUser(Register register) {
		// TODO Auto-generated method stub
		boolean result=this.arrayList.add(register);
		if(result) {
			return "success";
		}
		return "fail";
	}

	@Override
	public String updateUser(String id, Register register) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	//optional to handle null pointer exception
	public Register getUserById(String id) throws IdNotFoundException {
		
		//Register register2 = null;
		// TODO Auto-generated method stub
		Register register2 = null;
		for(Register register: arrayList) {
			if(register.getId().equals(id)) {
				register2 = register;
			}
		}
		if(register2==null) {
			throw new IdNotFoundException("id not found");
		}
		else {
			return register2;
		}
		//return Optional.of(register2) ;
	}

	@Override
	public Register[] getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteUserById(String id) {
		// TODO Auto-generated method stub

		return null;
	}

}