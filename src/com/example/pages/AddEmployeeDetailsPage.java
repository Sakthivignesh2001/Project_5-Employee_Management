package com.example.pages;

import java.util.Scanner;

import com.example.model.Employee;
import com.example.service.EmployeeService;
import com.example.service.EmployeeServiceFactory;

public class AddEmployeeDetailsPage {

	public static void addNewEMployeeDetails() {
		EmployeeService employeeService = EmployeeServiceFactory.getEmployeeService();
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the Employee FirstName :: ");
		String firstName = scanner.next();
		System.out.print("Enter the Employee LastName :: ");
		String lastName = scanner.next();
		System.out.print("Enter the Employee Age :: ");
		int age = scanner.nextInt();
		System.out.print("Enter the Employee Gender :: ");
		String gender = scanner.next();
		System.out.print("Enter the Employee City :: ");
		String city = scanner.next();
		System.out.print("Enter the Employee State :: ");
		String state = scanner.next();
		System.out.print("Enter the Employee Salary :: ");
		double salary = scanner.nextDouble();
		System.out.print("Enter the Employee Mobile no :: ");
		String mobileNumber = scanner.next();
		System.out.print("Enter the Employee Blood Group :: ");
		String bloodGroup = scanner.next();

		Employee employee = new Employee();
		employee.setFirstName(firstName);
		employee.setLastName(lastName);
		employee.setAge(age);
		employee.setGender(gender);
		employee.setCity(city);
		employee.setState(state);
		employee.setSalary(salary);
		employee.setMobileNo(mobileNumber);
		employee.setBloodGroup(bloodGroup);

		String status = employeeService.addNewEmployeeDetails(employee);
		if (status.equalsIgnoreCase("success")) {
			System.out.println("Employee Details saved successfully..!");
		} else {
			System.out.println("Oops! Employee Details insertion failed.");
		}
	}
}
