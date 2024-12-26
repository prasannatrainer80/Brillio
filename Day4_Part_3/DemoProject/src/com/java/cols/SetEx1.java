package com.java.cols;

import java.util.HashSet;
import java.util.Set;

public class SetEx1 {

	public static void main(String[] args) {
		Set names = new HashSet();
		names.add("Anoop");
		names.add("Poojitha");
		names.add("Shivani");
		names.add("Srihari");
		names.add("Manoj");
		names.add("Anoop");
		names.add("Poojitha");
		names.add("Shivani");
		names.add("Srihari");
		names.add("Anoop");
		names.add("Poojitha");
		names.add("Shivani");
		names.add("Srihari");
		names.add("Anoop");
		names.add("Poojitha");
		names.add("Shivani");
		names.add("Srihari");
		names.add("Poojitha");
		names.add("Shivani");
		names.add("Srihari");
		names.add("Manoj");
		names.add("Poojitha");
		names.add("Shivani");
		names.add("Srihari");
		names.add("Manoj");
		System.out.println("Data  ");
		for (Object object : names) {
			System.out.println(object);
		}
	}
}
