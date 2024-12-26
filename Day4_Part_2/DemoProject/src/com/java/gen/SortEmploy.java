package com.java.gen;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmploy {

	public static void main(String[] args) {
//		Comparator<Employ> c = new NameComparator();
		Comparator<Employ> c = new BasicComparator();
		SortedSet<Employ> employs = new TreeSet<Employ>(c);
		
		employs.add(new Employ(1, "Manjunath", 88823.33));
		employs.add(new Employ(2, "Srihari", 91144.33));
		employs.add(new Employ(3, "Shivani", 89900.33));
		employs.add(new Employ(4, "Dinesh", 98822.33));
		employs.add(new Employ(5, "Anoop", 98224.33));
		employs.add(new Employ(6, "Manoj", 98822.33));
		
		System.out.println("Employ Records are  ");
		for (Employ employ : employs) {
			System.out.println(employ);
		}
	}
}
