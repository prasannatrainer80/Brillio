package com.java.day2;

public class EmployTest {

	public static void main(String[] args) {
		Employ employ1 = new Employ();
		employ1.empno = 1;
		employ1.name = "Dinesh";
		employ1.basic = 88822;
		
		Employ employ2 = new Employ();
		employ2.empno = 2;
		employ2.name = "Mounika";
		employ2.basic = 88111;
		
		System.out.println(employ1);
		System.out.println(employ2);
	}
}
