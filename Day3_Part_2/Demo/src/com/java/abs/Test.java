package com.java.abs;

public class Test {

	public static String revStr(String word) {
		char[] arr = word.toCharArray();
		String res="";
		for(int i=arr.length-1; i>=0;i--) {
			res+=arr[i];
		}
		return res;
	}
	public static void main(String[] args) {
		String str="Welcome to Java MalayalaM MadaM Soap LiriL Thank You";
		String rev="";
		String[] org = str.split(" ");
		for (String s : org) {
			rev+=revStr(s) + " ";
		}
		System.out.println(rev);
	}
}
