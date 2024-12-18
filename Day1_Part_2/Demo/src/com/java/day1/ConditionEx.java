package com.java.day1;
import java.util.Scanner;
public class ConditionEx {

	public void check(int choice) {
		if (choice==1) {
			System.out.println("Hi I am Srinath...");
		} else if (choice == 2) {
			System.out.println("Hi I am Srihari...");
		} else if (choice == 3) {
			System.out.println("Hi I am Dinesh...");
		} else if (choice==4) {
			System.out.println("Hi I am Poojitha...");
		} else if (choice == 5) {
			System.out.println("Hi I am Mounika...");
		} else {
			System.out.println("Invalid Choice...");
		}
	}
	public static void main(String[] args) {
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Choice  ");
		choice = sc.nextInt();
		ConditionEx obj = new ConditionEx();
		obj.check(choice);
	}
}
