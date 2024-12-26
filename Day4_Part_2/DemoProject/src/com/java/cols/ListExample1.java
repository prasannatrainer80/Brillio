package com.java.cols;

import java.util.ArrayList;
import java.util.List;

public class ListExample1 {

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
		
		names.add(3, "Harshitha");
		System.out.println("Names after Insert Operation  ");
		for (Object object : names) {
			System.out.println(object);
		}
		
		names.set(3, "Manjunath");
		System.out.println("Names after Updated Operation...");
		for (Object object : names) {
			System.out.println(object);
		}
		
		names.remove("Srihari");
		System.out.println("Names after Remove Operation  ");
		for (Object object : names) {
			System.out.println(object);
		}
	}
}
