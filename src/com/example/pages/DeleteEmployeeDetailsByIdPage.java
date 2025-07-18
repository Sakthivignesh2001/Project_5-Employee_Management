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
			System.out.println("Employee details has been deleted successfully..!");
		} else {
			System.out.println("Oops! Employee details deletion operation failed..!");
		}
	}
}
