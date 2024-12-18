package com.java.day1;

import java.util.Scanner;

public class Arith {

	public int sum(int a, int b) {
		return a + b;
	}
	
	public int sub(int a, int b) {
		return a - b;
	}
	
	public int mult(int a, int b) {
		return a * b;
	}
	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 Numbers  ");
		a = sc.nextInt();
		b = sc.nextInt();
		Arith obj = new Arith();
		System.out.println("Sum is  " +obj.sum(a, b));
		System.out.println("Sub is  " +obj.sub(a, b));
		System.out.println("Mult is  " +obj.mult(a, b));
	}
}
