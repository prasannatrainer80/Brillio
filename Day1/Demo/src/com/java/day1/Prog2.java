package com.java.day1;

public class Prog2 {

	public static void main(String[] args) {
		int x=3;
		System.out.println(x++ + ++x);
		x = 3;
		System.out.println(x++ + ++x + ++x + x-- + --x + x++);
	}
}
