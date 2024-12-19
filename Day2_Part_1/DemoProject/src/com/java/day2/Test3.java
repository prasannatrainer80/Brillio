package com.java.day2;

public class Test3 {

	public void check(int choice) {
		boolean flag = false;
		if (choice==1) {
			System.out.println("Hi I am Mounika...");
			flag = true;
		}
		if (choice==2) {
			System.out.println("Hi I am Dinesh....");
			flag = true;
		}
		
		if (choice==3) {
			System.out.println("Hi I am Srinath...");
			flag = true;
		}
		
		if (choice == 4) {
			System.out.println("Hi I am Poojitha...");
			flag = true;
		}
		if (flag==false) {
			System.out.println("Invalid Choice...");
		}
	}
	public static void main(String[] args) {
		int choice =3;
		new Test3().check(choice);
	}
}
