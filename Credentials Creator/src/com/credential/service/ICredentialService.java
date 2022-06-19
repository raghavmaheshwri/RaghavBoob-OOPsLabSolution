package com.credential.service;

public interface ICredentialService {
    
	void generateEmailAddress(String empFullName, int type, String firstName);
	
	void generatePassword();

	void showCredentials(String userFirstName);
	
	int chooseDepartment();
}
