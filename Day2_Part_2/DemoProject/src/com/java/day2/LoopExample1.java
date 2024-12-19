package com.java.day2;

public class LoopExample1 {

	public void show() {
		int i = 0;
		int counter = 10;
		while(i < counter) {
			System.out.println("Welcome to Java Training...");
			i++;
		}
	}
	public static void main(String[] args) {
		new LoopExample1().show();
	}
}
