package com.java.project;

import java.util.Scanner;

public class EmployMain {

	static EmployOpeartions employOperations;
	static {
		employOperations = new EmployOpeartions();
	}
	
	public static void showEmployMain() {
		if (EmployOpeartions.flag==false) {
			System.out.println("No Records are Added Till Now....");
			return;
		}
		Employ[] arr = employOperations.showEmploy();
		for (Employ employ : arr) {
			System.out.println(employ);
		}
	}
	
	public static void readEmployMain() {
		employOperations.readEmploy();
	}
	
	public static void searchEmployMain() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ Id  ");
		int empId = sc.nextInt();
		Employ employFound = employOperations.searchEmploy(empId);
		if (employFound !=null) {
			System.out.println(employFound);
		} else {
			System.out.println("*** Employ Record Not Found ***");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("O P E R A T I O N S");
			System.out.println("-------------------");
			System.out.println("1. Read Employ");
			System.out.println("2. Show Employ");
			System.out.println("3. Search Employ");
			System.out.println("4. Exit");
			System.out.println("Enter Your Choice  ");
			choice = sc.nextInt();
			switch(choice) {
			case 1 : 
				readEmployMain();
				break;
			case 2 : 
				showEmployMain();
				break;
			case 3 : 
				searchEmployMain();
				break;
			case 4 : 
				return;
			}
		} while(choice!=4);
	}
}
