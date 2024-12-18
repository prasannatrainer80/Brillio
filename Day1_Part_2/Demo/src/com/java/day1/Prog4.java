package com.java.day1;

public class Prog4 {

	public static void main(String[] args) {
		boolean flag;
		int x=3;
		int y=5;
		flag = (x < y && y==5);
		System.out.println(flag);
		flag = (x < y && y < 5);
		System.out.println(flag);
		flag = (x < y || y < 5);
		System.out.println(flag);
		
	}
}
