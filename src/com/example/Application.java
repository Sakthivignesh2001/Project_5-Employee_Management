package com.example;

import com.example.pages.MenuPage;
import com.example.util.HibernateUtil;

public class Application {
	static {
		HibernateUtil.loadClass();
		System.out.println("**********************************");
		System.out.println("Welcome to Employee Application..!");
		System.out.println("**********************************");
	}
	
	public static void main(String[] args) throws Exception {
		MenuPage.displayMenu();
	}

}
