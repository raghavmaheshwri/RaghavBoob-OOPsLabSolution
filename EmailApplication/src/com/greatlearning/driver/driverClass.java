package com.greatlearning.driver;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialService;

public class driverClass {
	private static final CredentialService CredentialsService = new CredentialService();
	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Please Enter First Name");
		String firstName = sc.nextLine();
		System.out.println("Please Enter Last Name");
		String lastName = sc.nextLine();

		Employee employee = new Employee(firstName, lastName);

		String generatedEmail;
		String generatedPassword;

		System.out.println("Please Enter Department from following");
		System.out.println("1. Technical \n2. Admin \n3. Human Resource \n4. Legal");
		System.out.print("Please Type 1 / 2 / 3 / 4 to Choose Department : ");

		int departmentNumber = sc.nextInt();

		switch (departmentNumber) {
		case 1: {
			generatedPassword = CredentialsService.generatePassword();
			generatedEmail = CredentialsService.getEmailAddress(firstName, lastName, "Technical");
			CredentialsService.showCredential(employee, generatedEmail, generatedPassword);
		}
			break;
		case 2: {
			generatedPassword = CredentialsService.generatePassword();
			generatedEmail = CredentialsService.getEmailAddress(firstName, lastName, "Hr");
			CredentialsService.showCredential(employee, generatedEmail, generatedPassword);
		}
			break;
		case 3: {
			generatedPassword = CredentialsService.generatePassword();
			generatedEmail = CredentialsService.getEmailAddress(firstName, lastName, "Admin");
			CredentialsService.showCredential(employee, generatedEmail, generatedPassword);
		}
			break;
		case 4: {
			generatedPassword = CredentialsService.generatePassword();
			generatedEmail= CredentialsService.getEmailAddress(firstName, lastName, "Legal");
			CredentialsService.showCredential(employee, generatedEmail, generatedPassword);
		}
			break;
		}
	}
}
