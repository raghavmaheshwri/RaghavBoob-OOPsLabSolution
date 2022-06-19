package com.credential.model;

public class Employee {
	private String firstName;
	private String lastName;

	// parameterized constructor to Set Names
	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	// Get Employee First Name
	public String getFirstName() {
		return firstName;
	}

	// Get Employee Last Name
	public String getLastName() {
		return lastName;
	}

	// Get Employee Full Name

	public String getFullName() {

		return firstName + lastName;

	}
}
