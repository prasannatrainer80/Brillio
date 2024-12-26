package com.java.cols;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortEx1 {

	public static void main(String[] args) {
		SortedSet names = new TreeSet();
		names.add("Shivani");
		names.add("Harshit");
		names.add("Dinesh");
		names.add("Anoop");
		names.add("Srihari");
		names.add("Poojitha");
		
		System.out.println("Sorted Data  ");
		for (Object object : names) {
			System.out.println(object);
		}
	}
}
