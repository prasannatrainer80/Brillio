package com.java.day2;

import java.util.Scanner;

public class EvenShow {

	public void show(int n) {
		int i = 0;
		while(i < n) {
			i=i+2;
			System.out.println("Even  " +i);
		}
	}
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N Value   ");
		n = sc.nextInt();
		EvenShow obj = new EvenShow();
		obj.show(n);
	}
}
