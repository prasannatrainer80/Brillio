package com.java.day1;

import java.util.Scanner;

public class SwitchCaseEx2 {
	public void check(String choice) {
		switch(choice) {
		case "1":
		case "A":
		case "I":
		case "a":
				System.out.println("Grade A");
				break;
		case "2":
		case "B":
		case "b":
				System.out.println("Grade B");
				break;
		case "3":
		case "C":
		case "c":
				System.out.println("Grade C");
				break;
		default : 
			System.out.println("Invalid Choice...");
				
		}
	}
	public static void main(String[] args) {
		String choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Choice  ");
		choice = sc.next();
		new SwitchCaseEx2().check(choice);
	}
}
