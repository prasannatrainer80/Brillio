package com.java.day1;

import java.util.Scanner;

public class Voting {

	public void check(int age) {
		if (age >= 18) {
			System.out.println("You Can Vote...");
		} else {
			System.out.println("You Cannot Vote...");
		}
	}
	public static void main(String[] args) {
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age  ");
		age = sc.nextInt();
		Voting obj = new Voting();
		obj.check(age);
	}
}
