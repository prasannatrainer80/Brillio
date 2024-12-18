package com.java.day1;

import java.util.Scanner;

public class SwitchCaseEx3 {

	public void show(int monthNo) {
		switch(monthNo) {
		case 1,3,5,7,8,10 -> System.out.println("Month Has 31 Days");
		case 2 -> System.out.println("Month may have 28 or 29 days...");
		case 4,6,9,11 -> System.out.println("Month Has 30 Days...");
		}
	}
	public static void main(String[] args) {
		int monthNo;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Month Number  ");
		monthNo = sc.nextInt();
		new SwitchCaseEx3().show(monthNo);
	}
}
