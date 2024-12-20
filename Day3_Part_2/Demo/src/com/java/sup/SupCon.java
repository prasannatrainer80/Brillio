package com.java.sup;

class Employ {

	int empno;
	String name;
	double basic;
	
	public Employ(int empno, String name, double basic) {
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}
	
	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}
}

class Anoop extends Employ {

	public Anoop(int empno, String name, double basic) {
		super(empno, name, basic);
		// TODO Auto-generated constructor stub
	}
	
}

public class SupCon {
	public static void main(String[] args) {
		Employ employ1 = new Anoop(1, "Anoop", 82355.22);
		System.out.println(employ1);
	}
}
