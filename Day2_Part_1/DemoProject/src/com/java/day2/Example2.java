package com.java.day2;

public class Example2 {

	public void show() {
		String str="Welcome to Java Programming...Trainer Prasanna...";
		str=str.toUpperCase();
		char[] arr = str.toCharArray();
		System.out.println(arr);
		String result="";
		for(int i=0;i<arr.length;i++) {
			if (arr[i]!='A' && arr[i]!='E' && arr[i]!='I' && arr[i]!='O' && arr[i]!='U') {
				result+=arr[i];
			}
		}
		System.out.println(result);
	}
	public static void main(String[] args) {
		new Example2().show();
	}
}
