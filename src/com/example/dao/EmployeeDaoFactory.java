package com.example.dao;

public class EmployeeDaoFactory {

	private EmployeeDaoFactory() {}

	private static EmployeeDao employeeDao = null;

	public static EmployeeDao getEmployeeDao() {
		if (employeeDao == null)
			employeeDao = new EmployeeDaoImpl();
		return employeeDao;
	}
}
