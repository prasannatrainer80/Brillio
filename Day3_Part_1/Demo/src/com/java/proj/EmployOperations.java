package com.java.proj;

import java.util.Scanner;

public class EmployOperations {

	static Employ[] arrEmploy;
	static int count;
	static Scanner sc;
	static {
		sc = new Scanner(System.in);
		System.out.println("Enter Total No.of Employ Objects  ");
		count = sc.nextInt();
		arrEmploy = new Employ[count];
	}

	public void readEmploy() {
		System.out.println("Enter " +count + " Of Records for Employ  ");
		for(int i=0;i<count;i++) {
			System.out.println("Enter Employ Id, Name, City and Salary for Employ " +(i+1));
			arrEmploy[i]=new Employ();
			arrEmploy[i].empId = sc.nextInt();
			arrEmploy[i].empName=sc.next();
			arrEmploy[i].city = sc.next();
			arrEmploy[i].salary = sc.nextDouble();
		}
	}
	
	public Employ[] showEmploy() {
		return arrEmploy;
	}
	
	public Employ searchEmploy(int empId) {
		Employ employFound = null;
		for (Employ employ : arrEmploy) {
			if (employ.empId == empId) {
				employFound = employ;
				break;
			}
		}
		return employFound;
	}
}
