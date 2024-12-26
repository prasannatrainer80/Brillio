package com.java.cols;

public class Test {

	public int lengthStr(String str) {
		char[] ch = str.toCharArray();
		int count=0;
		for (char c : ch) {
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		String str="Hello World";
		System.out.println(str.length());
		
		System.out.println(new Test().lengthStr(str));
	}
}
