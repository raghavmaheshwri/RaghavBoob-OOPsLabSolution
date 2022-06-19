package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.model.Employee;

public class CredentialService implements ICredentialService {

	@Override
	public String generatePassword() {
		// TODO Auto-generated method stub
		String capitalLetter ="ABCDEFGHIJKLMNOPQ";
		String smallcaseLetter ="ABCDEFGHIJKLMNOPQ";
		String numbers = "1234567890";
		String specialChar = "!@#$%-+*";
		String value = capitalLetter+smallcaseLetter+numbers+specialChar;
		
		// Random combination of these values 
		
		StringBuffer strBuffer = new StringBuffer("");
		Random random = new Random();
		for(int i=0;i<8;i++) {
			
			int randomCharacter = random.nextInt(value.length());
			strBuffer.append(value.charAt(randomCharacter));
		}
		return strBuffer.toString();
	}

	@Override
	public String getEmailAddress(String firstName, String lastName, String department) {
		// TODO Auto-generated method stub
		return firstName+lastName+"@"+department.toLowerCase()+".company.com";
		
	}

	@Override
	public void showCredential(Employee employee, String email, String generatepassword) {
		// TODO Auto-generated method stub
		System.out.println("Dear"+ employee.getFirstName()+" Your Genrated Credential are as follow");
		System.out.println("Email -->" +email);
		System.out.println("Password --> " +generatepassword);

	}

}
