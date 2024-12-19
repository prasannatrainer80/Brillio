package com.java.day2;

import java.util.Scanner;

public class ArrayDemo2 {

	static Scanner sc = new Scanner(System.in);
	public void show(int n) {
		int[] a = new int[n];
		System.out.println("Enter "+n  + " Elements into Array  ");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Array Elements are  ");
		for (int i : a) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		int n;
		
		System.out.println("Enter Size of an Array  ");
		n = sc.nextInt();
		new ArrayDemo2().show(n);
	}
}
