package com.java.day2;

public class Quiz3 {

	public static void main(String[] args) {
		Employ employ1 = new Employ();
		employ1.empno = 1;
		employ1.name = "Dinesh";
		employ1.basic = 88822;
		
		Employ employ2 = new Employ();
		employ2.empno = 2;
		employ2.name = "Mounika";
		employ2.basic = 88111;
		
		Employ employ3 = new Employ();
		employ3.empno = 1;
		employ3.name = "Dinesh";
		employ3.basic = 88822;
		
		System.out.println(employ1==employ3);
		System.out.println(employ1.equals(employ3));
	}
}
