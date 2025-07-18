package com.example.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.example.model.Employee;
import com.example.util.HibernateUtil;

public class EmployeeDaoImpl implements EmployeeDao {

	private Session session = HibernateUtil.getSession();

	@Override
	public List<Employee> getAllEmployeeDetails() {

		String getAllEmployeeSqlQuery = "FROM Employee";
		Query<Employee> query = session.createQuery(getAllEmployeeSqlQuery);
		List<Employee> employees = query.list();
		if (!employees.isEmpty())
			return employees;
		else
			return null;
	}

	@Override
	public String addNewEmployeeDetails(Employee employee) {

		Transaction transaction = session.beginTransaction();
		boolean flag = false;
		String status = "";
		try {
			session.save(employee);
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (flag) {
				transaction.commit();
				status = "success";
			} else {
				transaction.rollback();
				status = "failure";
			}
		}
		return status;
	}

	@Override
	public String updateEmployeeDetailsById(Employee employee) {

		Transaction transaction = session.beginTransaction();
		boolean flag = false;
		String status = "";
		try {
			if (transaction != null) {
				session.merge(employee);
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (flag) {
				transaction.commit();
				status = "success";
			} else {
				transaction.rollback();
				status = "failure";
			}
		}
		return status;
	}

	@Override
	public String deleteEmployeeDetailsById(int id) {

		Employee employee = findEmployeeDetailsById(id);
		Transaction transaction = session.beginTransaction();
		boolean flag = false;
		String status = "";
		try {
			if (employee != null) {
				session.delete(employee);
				flag = true;
			} else
				return "not-found";
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (flag) {
				transaction.commit();
				status = "success";
			} else {
				transaction.rollback();
				status = "failure";
			}
		}
		return status;
	}

	@Override
	public Employee findEmployeeDetailsById(int id) {

		Employee employee = session.get(Employee.class, id);
		if (employee != null)
			return employee;
		else
			return null;
	}

}
