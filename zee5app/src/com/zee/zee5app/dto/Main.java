package com.zee.zee5app.dto;
//import java.util.Iterator;


import com.zee.zee5app.exception.InvalidIdLengthException;
import com.zee.zee5app.exception.InvalidNameException;
import com.zee.zee5app.service.UserService;


public class Main {

	public static void main(String[] args) throws InvalidIdLengthException, InvalidNameException {
		// TODO Auto-generated method stub
		
		Register register = new Register("waz0001", "waz", "hussain", "waz@gmail.com", null);
		register.setId("waz");
		register.setFirstName("paris");
		register.setLastName("googlepay");
		
		try {
			register.setId("waz01");
			register.setFirstName("paris");
			register.setLastName("googlepay");
		}
		
		catch (InvalidIdLengthException e) {
			
			e.printStackTrace();
			
		}
		
		catch (InvalidNameException e1) {
			e1.printStackTrace();
		}
		
		System.out.println(register);
		UserService service = UserService.getInstance();
		for(int i =1;i<=10;i++) {
			
			Register register2 = new Register("waz", null, null, null, null);
			try {
				register2.setId("waz00"+i);
				register2.setFirstName("waz");
				register2.setLastName("huss");
			}
			
			catch (InvalidIdLengthException e) {
				e.printStackTrace();
			}
			
			catch (InvalidNameException e) {
				e.printStackTrace();
				
			}
			
			catch (Exception e) {
				
			}
			
			catch (Throwable e) {
				
			}
			
			String result = service.addUser(register2);
			System.out.println(result);
		}
		
		Register register2 = service.getUserById("az001");
		System.out.println(register2!=null);
		
		for(Register register3 : service.getUsers()) {
			if(register3!=null)
			System.out.println(register3);
		}

	}
	
	//optional<Register>

}
 