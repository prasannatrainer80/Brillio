package com.java.cols;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExample2 {

	public static void main(String[] args) {
		List names = new ArrayList();
		names.add("Shivani");
		names.add("Harshit");
		names.add("Dinesh");
		names.add("Anoop");
		names.add("Srihari");
		names.add("Poojitha");
	
		System.out.println("Names are  ");
		for (Object object : names) {
			System.out.println(object);
		}
		
		Collections.sort(names);
		System.out.println("Sorted Data  ");
		for (Object object : names) {
			System.out.println(object);
		}
	}
}
