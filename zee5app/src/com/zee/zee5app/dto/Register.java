package com.zee.zee5app.dto;

import java.util.Objects;

import com.zee.zee5app.exception.InvalidIdLengthException;
import com.zee.zee5app.exception.InvalidNameException;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Setter
@Getter
//@EqualsAndHashCode
//@AllArgsConstructor
//@NoArgsConstructor

public class Register {
	
	public Register(String id, String firstname, String lastname, String email, String password) throws InvalidIdLengthException, InvalidNameException {
		super();
		this.setId(id);
		this.setFirstName(firstname);
		this.setLastName(lastname);
		this.email = email;
		this.password = password;
	}
	


	@Setter(value = AccessLevel.NONE)
	
	private String id;
	
	@Setter(value = AccessLevel.NONE)
	private String firstname;
	
	@Setter(value = AccessLevel.NONE)
	private String lastname;
	
	
	private String email;
	private String password;
	

	public void setFirstName(String firstName) throws InvalidNameException {
		if(firstName==null || firstName=="" || firstName.length()<2) {
			throw new InvalidNameException("firstname is not valid");
		}
		this.firstname = firstName;
	}
	
	public void setLastName(String lastName) throws InvalidNameException {
		if(lastName==null || lastName=="" || lastName.length()<2) {
			throw new InvalidNameException("lastname is not valid");
		}
		this.lastname =lastName;
	}
	

	public void setId(String id) throws InvalidIdLengthException {
		
		// throws : it will provide list of exceptions may be raised
		// it will hold the list of checked exceptions
		
		if(id.length()<6) {
			// it should raise InvalidIdException
			// exception object is created by 
			// user defined exception must be raised by us
			
			throw new InvalidIdLengthException("id length is less than or eq to 6 ");
		}
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Register other = (Register) obj;
		return Objects.equals(email, other.email) && Objects.equals(firstname, other.firstname)
				&& Objects.equals(id, other.id) && Objects.equals(lastname, other.lastname)
				&& Objects.equals(password, other.password);
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, firstname, id, lastname, password);
	}
	
	
	//setter - to set value for a particular field
	//getter - to get/return the value of a field.

}
