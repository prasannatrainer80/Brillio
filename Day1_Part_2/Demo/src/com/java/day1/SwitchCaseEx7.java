package com.java.day1;
public class SwitchCaseEx7 {
	public double showTakeHome(String itr,int salary) {
		double result;
		double takeHome;
		result = 
		switch(itr) {
			case "ITR4" : {
				System.out.println("You Amount Will Be Refunded...");
				if (salary <= 20000) {
				takeHome = salary;
				yield takeHome; }
				if (salary >=20000) {
					takeHome = salary - (salary * 0.10);
					yield takeHome;
				}
			}
			case "ITR2" :
			case "ITR3" :
			case "ITR1" :
					{ takeHome = salary - (salary * 0.10);
						yield takeHome; }
			default : {
				yield 0;
			}
		};
		return result;
	}
	public static void main(String[] args) {
		double takeHome = new SwitchCaseEx7().showTakeHome("ITR4", 50000);
		System.out.println(takeHome);
	}
}
