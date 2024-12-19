package com.java.day2;

import java.util.Scanner;

public class FactSer {

	public void show(int n) {
		int f = 1;
		for(int i=1;i<=n;i++) {
			f = f * i;
			System.out.println("Factorial of " +i+ " Is " +f);
		}
	}
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number  ");
		n = sc.nextInt();
		FactSer obj = new FactSer();
		obj.show(n);
	}
}
