import java.util.Scanner;

import com.credential.model.Employee;
import com.credential.service.CredentialService;

public class CredentialsCreator {
	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// Scanner class Object to take input from user

		CredentialService credService = new CredentialService();

		// Employee Name Input
		System.out.print("Please Enter Employee First Name: ");
		String firstName = sc.nextLine();
		firstName = firstName.strip();
		System.out.print("Please Enter Employee Last Name: ");
		String lastName = sc.nextLine();
		lastName = lastName.strip();
		System.out.println("-----");


		// Using parameterized constructor of class Employee to set first and last name
		Employee empData = new Employee(firstName, lastName);

		// concatenating and getting Full Name
		String EmpFullName = empData.getFullName();

		// Choose Department
		int departmentType = credService.chooseDepartment();

		// Credential Creating and getting using respective methods
		credService.generateEmailAddress(EmpFullName, departmentType, empData.getFirstName());

	}

}
