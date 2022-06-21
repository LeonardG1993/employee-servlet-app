package com.revature.models;

import javax.persistence.*;

@Entity
@Table(name="employees")
public class Employee {
	
	@Id
	private int id;
	
	
	private String username;
	
	private String firstName;
	
	private String lastName;
	
	private String password;
	

}
