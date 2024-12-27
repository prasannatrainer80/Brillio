package com.java.cols;

import java.util.Scanner;

public class ThrEx {

	public void check(int n) {
		if (n < 0) {
			throw new ArithmeticException("Negative Nos Not Allowed...");
		} else if (n == 0) {
			throw new NumberFormatException("Zero is Invalid Value...");
		} else {
			System.out.println("N value is " +n);
		}
	}
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N value   ");
		n = sc.nextInt();
		try {
			new ThrEx().check(n);
		} catch (ArithmeticException e) {
			System.err.println(e.getMessage());
		} catch (NumberFormatException e) {
			System.err.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}



