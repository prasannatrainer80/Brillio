package com.java.day2;

public class ArrayDemo1 {

	public static void main(String[] args) {
		int[] a = new int[]{10,22,53,19,21};
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[i]);
//		}
		for (int i : a) {
			System.out.println(i);
		}
	}
}
