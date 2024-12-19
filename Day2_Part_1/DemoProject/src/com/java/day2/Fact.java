package com.java.day2;

import java.util.Scanner;

/**
 * Display the Factorial of Given number 
 */
public class Fact {

	public void calc(int n) {
		int f = 1;
		int i=1;
		while(i <= n) {
			f = f * i;
			i++;
		}
		System.out.println("Factorial Value  " +f);
	}
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N value  ");
		n = sc.nextInt();
		new Fact().calc(n);
	}
}
