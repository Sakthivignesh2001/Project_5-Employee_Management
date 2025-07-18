package com.example.service;

import java.util.List;

import com.example.dao.EmployeeDao;
import com.example.dao.EmployeeDaoFactory;
import com.example.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao employeeDao;

	@Override
	public List<Employee> getAllEmployeeDetails() {
		employeeDao = EmployeeDaoFactory.getEmployeeDao();
		return employeeDao.getAllEmployeeDetails();
	}

	@Override
	public String addNewEmployeeDetails(Employee employee) {
		employeeDao = EmployeeDaoFactory.getEmployeeDao();
		return employeeDao.addNewEmployeeDetails(employee);
	}

	@Override
	public String updateEmployeeDetailsById(Employee employee) {
		employeeDao = EmployeeDaoFactory.getEmployeeDao();
		return employeeDao.updateEmployeeDetailsById(employee);
	}

	@Override
	public String deleteEmployeeDetailsById(int id) {
		employeeDao = EmployeeDaoFactory.getEmployeeDao();
		return employeeDao.deleteEmployeeDetailsById(id);
	}

	@Override
	public Employee findEmployeeDetailsById(int id) {
		employeeDao = EmployeeDaoFactory.getEmployeeDao();
		return employeeDao.findEmployeeDetailsById(id);
	}

}
