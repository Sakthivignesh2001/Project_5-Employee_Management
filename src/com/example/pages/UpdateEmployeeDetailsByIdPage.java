package com.example.pages;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.example.model.Employee;
import com.example.service.EmployeeService;
import com.example.service.EmployeeServiceFactory;

public class UpdateEmployeeDetailsByIdPage {

	public static void updateEmployeeDetails() throws IOException {

		EmployeeService employeeService = EmployeeServiceFactory.getEmployeeService();

		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

		System.out.println("Enter the Employee-id:: ");
		String id = bufferedReader.readLine();
		Employee employee = employeeService.findEmployeeDetailsById(Integer.parseInt(id));
		if (employee != null) {
			Employee updatedEmployee = new Employee();

			System.out.println("Employee id is :: " + employee.getId());
			updatedEmployee.setId(employee.getId());

			System.out.println("Current firstName :: " + employee.getFirstName() + " ->  Enter new firstName :: ");
			String firstName = bufferedReader.readLine();
			if (firstName.equals("") || firstName == "")
				updatedEmployee.setFirstName(employee.getFirstName());
			else
				updatedEmployee.setFirstName(firstName);

			System.out.println("Current lastName :: " + employee.getLastName() + " -> Enter new lastName :: ");
			String lastName = bufferedReader.readLine();
			if (lastName.equals("") || lastName == "")
				updatedEmployee.setLastName(employee.getLastName());
			else
				updatedEmployee.setLastName(lastName);

			System.out.println("Current age :: " + employee.getAge() + " -> Enter new age :: ");
			String age = bufferedReader.readLine();
			if (age.equals("") || age == "")
				updatedEmployee.setAge(employee.getAge());
			else
				updatedEmployee.setAge(Integer.parseInt(age));

			System.out.println("Current gender :: " + employee.getGender() + " -> Enter new gender :: ");
			String gender = bufferedReader.readLine();
			if (gender.equals("") || gender == "")
				updatedEmployee.setGender(employee.getGender());
			else
				updatedEmployee.setGender(gender);

			System.out.println("Current city :: " + employee.getCity() + " -> Enter new city :: ");
			String city = bufferedReader.readLine();
			if (city.equals("") || city == "")
				updatedEmployee.setCity(employee.getCity());
			else
				updatedEmployee.setCity(city);

			System.out.println("Current state :: " + employee.getState() + " -> Enter new state :: ");
			String state = bufferedReader.readLine();
			if (state.equals("") || state == "")
				updatedEmployee.setState(employee.getState());
			else
				updatedEmployee.setState(state);

			System.out.println("Current salary :: " + employee.getSalary() + " -> Enter new salary :: ");
			String salary = bufferedReader.readLine();
			if (salary.equals("") || salary == "")
				updatedEmployee.setSalary(employee.getSalary());
			else
				updatedEmployee.setSalary(Double.parseDouble(salary));

			System.out.println("Current mobileNo :: " + employee.getMobileNo() + " -> Enter new mobileNo :: ");
			String mobileNo = bufferedReader.readLine();
			if (mobileNo.equals("") || mobileNo == "")
				updatedEmployee.setMobileNo(employee.getMobileNo());
			else
				updatedEmployee.setMobileNo(mobileNo);

			System.out.println("Current bloodGroup :: " + employee.getBloodGroup() + " -> Enter new bloodGroup :: ");
			String bloodGroup = bufferedReader.readLine();
			if (bloodGroup.equals("") || bloodGroup == "")
				updatedEmployee.setBloodGroup(employee.getBloodGroup());
			else
				updatedEmployee.setBloodGroup(bloodGroup);

			String status = employeeService.updateEmployeeDetailsById(updatedEmployee);

			if ("success".equalsIgnoreCase(status))
				System.out.println("EMPLOYEE RECORD UPDATED SUCCESSFULLY..!");
			else
				System.out.println("EMPLOYEE RECORD UPDATION FAILED..!");

		} else {
			System.out.println("OOPS! EMPLOYEE RECORD NOT FOUND..!");
		}

	}

}
