package com.java.st;

public class Payroll {
	static double totalSalary;
	static {
		totalSalary =0;
	}
	public void salary(int empId, double salary) {
		System.out.println("For Employ " +empId + " Salary is " +salary);
		totalSalary +=salary;
	}
	public static void payment() {
		System.out.println("Mr/Mrs CEO needs to issue payment for total " +totalSalary);
	}
	public static void main(String[] args) {
		Payroll emp1 = new Payroll();
		Payroll emp2 = new Payroll();
		Payroll emp3 = new Payroll();
		emp1.salary(100, 88224.22);
		emp2.salary(101, 88811.22);
		emp3.salary(102, 99222.22);
		
		payment();
	}
}
