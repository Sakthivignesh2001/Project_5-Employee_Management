package com.example.pages;

import java.util.Scanner;

import com.example.model.Employee;
import com.example.service.EmployeeService;
import com.example.service.EmployeeServiceFactory;

public class GetEmployeeDetailsByIdPage {
	
	public static void getEmployeeDetailsById() {
		EmployeeService employeeService = EmployeeServiceFactory.getEmployeeService();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Employee Id:: ");
		int id = scanner.nextInt();
		Employee employee = employeeService.findEmployeeDetailsById(id);
		if(employee != null) {
			System.out.println(employee);
		} else {
			System.out.println("Employee not found");
		}
	}
	

}
