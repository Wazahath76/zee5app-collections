package com.zee.zee5app.repository;

import com.zee.zee5app.dto.Register;

public class UserRepository {
	
	private Register[] registers = new Register[10];
	//private Register[] register = new Register[10];
	private static int count = -1;
	private UserRepository() {
		
		//TODO auto-generated constructor stub
	}
	
	public Register[] getUsers() {
		return registers;
	}
	
	public String deleteUser(String id) {
		return null;
		
		// delete user is assignment
		// 20 user on 5th index
		// 
	}
	public String updateUser(String id, Register register) {
		return null;
	}
	// this method should return the user details based on the id 
	
	public Register getUserById(String id) {
		
		//do we need to traverse the array?
		
		for (Register register : registers) {
			if(register!=null && register.getId().equals(id)) {
				return register;
			}
		}
		
		return null;
	}
	
	
	public String addUser(Register register) {
		
		//registers,length ==> give us the availability
		if(count==registers.length-1) {
			//array is full 
			
			Register temp[] = new Register[registers.length*2];
			
			
			//do we need to copy the content from old to new ? yes
			System.arraycopy(registers, 0, temp, 0, registers.length);
			registers=temp;
			registers[++count] = register;
			return "success";
		}
		registers[++count] = register;
		return "success";
		
	}
	
	private static UserRepository userRepository;
	public static UserRepository getInstance() {
		
		if(userRepository==null)
			userRepository = new UserRepository();
		return userRepository;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
