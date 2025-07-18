package com.example.service;

public class EmployeeServiceFactory {

	private EmployeeServiceFactory() {}

	private static EmployeeService employeeService = null;

	public static EmployeeService getEmployeeService() {
		if (employeeService == null)
			employeeService = new EmployeeServiceImpl();
		return employeeService;
	}

}
