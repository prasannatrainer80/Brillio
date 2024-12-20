package com.java.project;

public class Employ {

	int empId;
	String empName;
	String city;
	double salary;
	
	public Employ() {

	}

	public Employ(int empId, String empName, String city, double salary) {
		this.empId = empId;
		this.empName = empName;
		this.city = city;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employ [empId=" + empId + ", empName=" + empName + ", city=" + city + ", salary=" + salary + "]";
	}
	
	
}
