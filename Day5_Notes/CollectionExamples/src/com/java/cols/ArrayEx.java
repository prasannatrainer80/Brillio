package com.java.cols;

public class ArrayEx {

	public static void main(String[] args) {
		int[] a = {12,5};
		try {
			a[10]=42;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Array Size is Small...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
