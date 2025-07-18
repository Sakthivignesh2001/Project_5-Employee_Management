package com.example.service;

import java.util.List;

import com.example.model.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployeeDetails();

	String addNewEmployeeDetails(Employee employee);

	String updateEmployeeDetailsById(Employee employee);

	String deleteEmployeeDetailsById(int id);

	Employee findEmployeeDetailsById(int id);
}
