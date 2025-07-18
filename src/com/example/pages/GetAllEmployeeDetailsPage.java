package com.example.pages;

import java.util.List;

import com.example.model.Employee;
import com.example.service.EmployeeService;
import com.example.service.EmployeeServiceFactory;

public class GetAllEmployeeDetailsPage {

	public static void getAllEmployeeDetails() {
		EmployeeService employeeService = EmployeeServiceFactory.getEmployeeService();
		List<Employee> employeeDetails = employeeService.getAllEmployeeDetails();
		if (employeeDetails != null)
			employeeDetails.forEach(System.out::println);
		else
			System.out.println("No employee Record is available please add new employee details..!");
	}
}
