package com.example.pages;

import java.util.Scanner;

public class MenuPage {

	public static void displayMenu() throws Exception {
		MenuPage menuPage = new MenuPage();

		while (true) {
			menuPage.showList();
			int value = menuPage.getInput();

			switch (value) {
			case 1:
				GetAllEmployeeDetailsPage.getAllEmployeeDetails();
				break;
			case 2:
				AddEmployeeDetailsPage.addNewEMployeeDetails();
				break;
			case 3:
				UpdateEmployeeDetailsByIdPage.updateEmployeeDetails();
				break;
			case 4:
				DeleteEmployeeDetailsByIdPage.deleteEmployeeDetailsById();
				break;
			case 5:
				GetEmployeeDetailsByIdPage.getEmployeeDetailsById();
				break;
			case 0:
				System.out.println("******* Thanks for using the application *****");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid option please try agin with valid options...");
				break;
			}

		}

	}

	private int getInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please select any one the operation :: ");
		int value = scanner.nextInt();
		return value;
	}

	private void showList() {

		System.out.println("--------------------------------------------");
		System.out.println("Press 1 :: Get All Employee Details");
		System.out.println("Press 2 :: Save New Employee Details");
		System.out.println("Press 3 :: Update Employee Details By Id");
		System.out.println("Press 4 :: Delete Employee Details By Id");
		System.out.println("Press 5 :: Get Employee Details By Id");
		System.out.println("Press 0 :: exit");
		System.out.println("--------------------------------------------");
	}

}
