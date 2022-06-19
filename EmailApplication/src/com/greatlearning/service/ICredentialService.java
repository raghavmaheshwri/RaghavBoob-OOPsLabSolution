package com.greatlearning.service;

import com.greatlearning.model.Employee;

public interface ICredentialService {

	String generatePassword();

	String getEmailAddress(String firstName, String lastName, String department);

	void showCredential(Employee employee, String email, String generatepassword);

}
