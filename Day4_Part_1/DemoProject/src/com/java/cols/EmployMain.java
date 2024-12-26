package com.java.cols;

import java.util.ArrayList;
import java.util.List;

public class EmployMain {

	public static void main(String[] args) {
		List employList = new ArrayList();
		employList.add(new Employ(1, "Manjunath", 88823.33));
		employList.add(new Employ(2, "Srihari", 91144.33));
		employList.add(new Employ(3, "Shivani", 89900.33));
		employList.add(new Employ(4, "Dinesh", 98822.33));
		employList.add(new Employ(5, "Anoop", 98224.33));
		employList.add(new Employ(6, "Manoj", 98822.33));
		
		System.out.println("Employ List is ");
		for (Object object : employList) {
			Employ employ = (Employ)object;
			System.out.println(employ);
		}
	}
}
