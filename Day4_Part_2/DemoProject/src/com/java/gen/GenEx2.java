package com.java.gen;

import java.util.ArrayList;
import java.util.List;

public class GenEx2 {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Anoop");
		names.add("Subhash");
		names.add("Soniya");
		names.add("Manoj");
		names.add("Manjunath");
		names.add("Shivani");
		System.out.println("Names are ");
		for (String string : names) {
			System.out.println(string);
		}
	}
}
