package com.java.day1;

import java.util.Scanner;
/**
 * Program to Perform Calculation of 2 numbers, as Sum, Sub and Mult
 */

public class Calculation {

	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 Numbers  ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = a + b;
		System.out.println("Sum is  " +c);
		c = a - b;
		System.out.println("Sub is  " +c);
		c = a * b;
		System.out.println("Mult is  " +c);
	}
}
