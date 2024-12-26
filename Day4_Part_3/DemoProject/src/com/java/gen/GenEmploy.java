package com.java.gen;

import java.util.ArrayList;
import java.util.List;

public class GenEmploy {

	public static void main(String[] args) {
		List<Employ> employList = new ArrayList<Employ>();
		employList.add(new Employ(1, "Manjunath", 88823.33));
		employList.add(new Employ(2, "Srihari", 91144.33));
		employList.add(new Employ(3, "Shivani", 89900.33));
		employList.add(new Employ(4, "Dinesh", 98822.33));
		employList.add(new Employ(5, "Anoop", 98224.33));
		employList.add(new Employ(6, "Manoj", 98822.33));
		
		System.out.println("Employ Records are ");
		for (Employ employ : employList) {
			System.out.println(employ);
		}
	}
}
