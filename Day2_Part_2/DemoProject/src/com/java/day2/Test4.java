package com.java.day2;

public class Test4 {

	public void check(int choice) {
		if (choice==1) {
			System.out.println("Hi I am Mounika...");
		} else if (choice==2) {
			System.out.println("Hi I am Srihari...");
		} else if (choice==3) {
			System.out.println("Hi I am Manoj...");
		} else if (choice==4) {
			System.out.println("Hi I am Sri...");
		} else {
			System.out.println("Invalid Choice...");
		}
	}
	public static void main(String[] args) {
		int choice =3;
		new Test4().check(choice);
	}
}
