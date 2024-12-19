package com.java.day2;

public class EmployArray {

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
		employ3.empno =3;
		employ3.name = "Srinath";
		employ3.basic = 88233;
		
		Employ employ4 = new Employ();
		employ4.empno = 4;
		employ4.name = "Manoj";
		employ4.basic = 88212;
		
		Employ[] employArr = new Employ[] {employ1, employ2, employ3, employ4};
		
		for (Employ employ : employArr) {
			System.out.println(employ);
		}
	}
}
