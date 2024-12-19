package com.java.day2;

public class SplitEx {

	public static void main(String[] args) {
		String str="Poojitha Mounika Natraj Dinesh Srinath";
		String[] names = str.split(" ");
		for (String s : names) {
			System.out.println(s);
		}
	}
}
