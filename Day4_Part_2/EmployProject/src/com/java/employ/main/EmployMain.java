package com.java.employ.main;

import java.util.List;
import java.util.Scanner;

import com.java.employ.dao.EmployDao;
import com.java.employ.dao.EmployDaoImpl;
import com.java.employ.model.Employ;
import com.java.employ.model.Gender;

public class EmployMain {

	static Scanner sc;
	static EmployDao employDao; 
	
	static {
		sc = new Scanner(System.in);
		employDao = new EmployDaoImpl();
	}
	
	public static void addEmployMain() {
		Employ employ = new Employ();
		System.out.println("Enter Employ No  ");
		employ.setEmpno(sc.nextInt());
		System.out.println("Enter Employ Name  ");
		employ.setName(sc.next());
		System.out.println("Enter Gender (MALE/FEMALE) ");
		employ.setGender(Gender.valueOf(sc.next()));
		System.out.println("Enter Department  ");
		employ.setDept(sc.next());
		System.out.println("Enter Designation ");
		employ.setDesig(sc.next());
		System.out.println("Enter Basic  ");
		employ.setBasic(sc.nextDouble());
		System.out.println(employDao.addEmployDao(employ));
	}
	
	public static void showEmployMain() {
		List<Employ> employList = employDao.showEmployDao();
		for (Employ employ : employList) {
			System.out.println(employ);
		}
	}
	
	public static void searchEmployMain() {
		int empno;
		System.out.println("Enter Employ No  ");
		empno = sc.nextInt();
		Employ employFound = employDao.searchEmployDao(empno);
		if (employFound!=null) {
			System.out.println(employFound);
		} else {
			System.out.println("*** Employ Record Not Found ***");
		}
	}
	
	public static void main(String[] args) {
		int choice;
		do {
			System.out.println("O P T I O N S");
			System.out.println("--------------");
			System.out.println("1. Add Employ");
			System.out.println("2. Show Employ");
			System.out.println("3. Search Employ");
			System.out.println("4. Update Employ");
			System.out.println("5. Delete Employ");
			System.out.println("Enter Your Choice  ");
			choice = sc.nextInt();
			switch(choice) {
			case 1 : 
				addEmployMain();
				break;
			case 2 : 
				showEmployMain();
				break;
			case 3 : 
				searchEmployMain();
				break;
			case 6 : 
				return;
			}
		}while(choice!=6);
	}
}
