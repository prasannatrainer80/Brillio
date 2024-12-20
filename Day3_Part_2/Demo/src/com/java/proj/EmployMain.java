package com.java.proj;

import java.util.Scanner;

public class EmployMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployOperations operations = new EmployOperations();
		operations.readEmploy();
		Employ[] result = operations.showEmploy();
		for (Employ employ : result) {
			System.out.println(employ);
		}
		
		System.out.println("Enter Employ No to Search  ");
		int empId = sc.nextInt();
		Employ employFound = operations.searchEmploy(empId);
		if (employFound!=null) {
			System.out.println(employFound);
		} else {
			System.out.println("*** Employ Record Not Found...");
		}
	}
}
