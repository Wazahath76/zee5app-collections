package com.zee.zee5app.dto;
//import java.util.Iterator;


import com.zee.zee5app.dto.Register;
import com.zee.zee5app.service.UserService;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Register register = new Register();
		register.setFirstname("waz");
		register.setLastname("hussain");
		register.setEmail("abc@gmail.com");
		
		System.out.println(register);
		UserService service = UserService.getInstance();
		for(int i =1;i<=10;i++) {
			
			Register register2 = new Register();
			register2.setId("ab00"+i);
			register2.setFirstname("waz"+i);
			register2.setLastname("hussain"+i);
			String result = service.addUser(register2);
			System.out.println(result);
		}
		
		Register register2 = service.getUserById("ab001");
		System.out.println(register2!=null);
		
		for(Register register3 : service.getUsers()) {
			if(register3!=null)
			System.out.println(register3);
		}

	}

}
 