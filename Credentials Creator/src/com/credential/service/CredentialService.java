package com.credential.service;

import java.util.Random;
import java.util.Scanner;

public class CredentialService implements ICredentialService {

	// Choose Department Method
	private static final Scanner sc = new Scanner(System.in);

	@Override
	public int chooseDepartment() {
		System.out.println("Please Enter Department from following");
		System.out.println("1.) Technical \n2.) Admin \n3.) Human Resource \n4.) Legal");
		System.out.print("Please Type 1 / 2 / 3 / 4 to Choose Department : ");
		int deptType = sc.nextInt();
		return deptType;
	}

	private String empMail = "";

	// Mail Generating Method
	@Override
	public void generateEmailAddress(String empFullName, int deptType) {

		switch (deptType) {
		case 1: {
			setEmpMail(empFullName + "@technical.company.com");
			generatePassword();
			
		}
			break;
		case 2: {
			setEmpMail(empFullName + "@admin.company.com");
			generatePassword();
			
		}
			break;
		case 3: {
			setEmpMail(empFullName + "@Human-resource.company.com");
			generatePassword();
			
		}
			break;
		case 4: {
			setEmpMail(empFullName + "@legal.company.com");
			generatePassword();
			
		}
			break;
		default: {
			System.out.println("---------------------------------");
			System.out.println("Invalid Option, Please Try Again ");
			System.out.println("---------------------------------");
		}
		}

	}

	// Getter Method for Mail
	public String getEmpMail() {
		return empMail;
	}

	// Setter Method for Mail

	public void setEmpMail(String empMail) {
		this.empMail = empMail;
	}

	// Password Generating
	private String password = "";

	@Override
	public void generatePassword() {
		String capitalLetter = "ABCDEFGHIJKLMNOPQ";
		String smallcaseLetter = "abcdefghijklmnopqstvyz";
		String numbers = "1234567890";
		String specialChar = "!@#$%-+*<>?";
		String value = capitalLetter + smallcaseLetter + numbers + specialChar;
		int size = value.length();
		Random randomGenerator = new Random();
		for (int i = 1; i <= 10; i++) {
			int random = randomGenerator.nextInt(size);
			char charpass = value.charAt(random);

			setPassword(getPassword() + charpass);

		}

	}

	// Getter Method for Password
	public String getPassword() {
		return password;
	}

	// Setter Method for Password
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public void showCredentials(String userFirstName) {
		System.out.println("Dear " + userFirstName + " your generated credentials are as follows: ");
		System.out.println("");
		System.out.println("Email --> " + getEmpMail());
		System.out.println("Password --> " + password);
	}

}
