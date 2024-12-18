package com.java.day1;

import java.util.Scanner;
public class SwitchCaseEx1 {
	public void check(int choice) {
		switch(choice) {
		case 1 : 
			System.out.println("Hi I am Mounika....");
			break;
		case 2 : 
			System.out.println("Hi I am Srinidhi...");
			break;
		case 3 : 
			System.out.println("Hi I am Srinath...");
			break;
		case 4 : 
			System.out.println("Hi I am Srihari...");
			break;
		default : 
			System.out.println("Invalid Choice...");
		}
	}
	public static void main(String[] args) {
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Choice  ");
		choice = sc.nextInt();
		new SwitchCaseEx1().check(choice);
	}
}
