package com.java.cols;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Gender (MALE/FEMALE)  ");
		try {
			Gender gender = Gender.valueOf(sc.next());
			System.out.println(gender);
		} catch(IllegalArgumentException e) {
			System.err.println("Invalid Enum Value");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
