package com.java.day2;

public class ArrayDemo3 {

	public void copy() {
		int[] a = {1,55,23,22,66};
		int[] b =a;
		for (int i : b) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		new ArrayDemo3().copy();
	}
}
