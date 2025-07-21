package com.example.pages;

import java.util.Scanner;

import com.example.service.EmployeeService;
import com.example.service.EmployeeServiceFactory;

public class DeleteEmployeeDetailsByIdPage {

	public static void deleteEmployeeDetailsById() {

		EmployeeService employeeService = EmployeeServiceFactory.getEmployeeService();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Employee Id:: ");
		int id = scanner.nextInt();
		String status = employeeService.deleteEmployeeDetailsById(id);
		if ("success".equalsIgnoreCase(status)) {
			System.out.println("EMPLOYEE DETAILS HAS BEEN DELETED SUCCESSFULLY..!");
		} else {
			System.out.println("OOPS! EMPLOYEE DETAILS DELETION OPERATION FAILED..!");
		}
	}
}
