package com.java.day2;

public class StrTest {

	public void show() {
		String str="Welcome to Java Programming...Trainer Prasanna...";
		System.out.println("Length of String is  " +str.length());
		System.out.println("Char at 5th position " +str.charAt(5));
		System.out.println("First Occurrence of char 'o' is  " +str.indexOf("o"));
		System.out.println("Lower Case String  " +str.toLowerCase());
		System.out.println("Upper Case String " +str.toUpperCase());
		String s1="Lewis",s2="Lee",s3="Lewis";
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s3));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println("Replaced String  " +str.replace("Java", "J2EE"));
	}
	public static void main(String[] args) {
		new StrTest().show();
	}
}
