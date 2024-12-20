package com.java.cons;

public class EmployArray {

	public static void main(String[] args) {
		Employ[] arr = new Employ[] {
				new Employ(1, "Anoop", 99234.22),
				new Employ(2, "Manjunath", 88662.22),
				new Employ(3,"Rakshitha",99999)
		};
		
		for (Employ employ : arr) {
			System.out.println(employ);
		}
	}
}
