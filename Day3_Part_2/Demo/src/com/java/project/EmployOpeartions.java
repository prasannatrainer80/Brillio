package com.java.project;

import java.util.Scanner;

public class EmployOpeartions {

	static Scanner sc;
	static Employ[] arrEmploy;
	static int totalEmploys;
	static boolean flag;
	
	static {
		sc = new Scanner(System.in);
		System.out.println("Enter Total Employee Records ");
		totalEmploys = sc.nextInt();
		arrEmploy = new Employ[totalEmploys];
		flag = false;
	}
	
	public void readEmploy() {
		System.out.println("Enter "+totalEmploys + " Records of Employ ");
		for(int i=0;i<totalEmploys;i++) {
			System.out.println("Enter EmpId, Name, City, Salary for Employ " +(i+1));
			arrEmploy[i]=new Employ();
			arrEmploy[i].empId = sc.nextInt();
			arrEmploy[i].empName = sc.next();
			arrEmploy[i].city = sc.next();
			arrEmploy[i].salary = sc.nextDouble();
		}
		flag = true;
	}
	
	public Employ[] showEmploy() {
		return arrEmploy;
	}
	
	public Employ searchEmploy(int empId) {
		
		Employ employFound = null;
		if (flag==false) {
			return employFound;
		}
		for (Employ employ : arrEmploy) {
			if (employ.empId == empId) {
				employFound = employ;
				break;
			}
		}
		return employFound;
	}
}










