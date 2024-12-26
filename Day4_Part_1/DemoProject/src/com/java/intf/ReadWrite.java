package com.java.intf;

public class ReadWrite {
	private int empno;
	private String name;
	private double basic;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	
	public static void main(String[] args) {
		ReadWrite obj = new ReadWrite();
		obj.setEmpno(1);
		obj.setName("Raj");
		obj.setBasic(88882.23);
		System.out.println("Employ No  " +obj.getEmpno());
		System.out.println("Employ Name  " +obj.getName());
		System.out.println("Salary  " +obj.getBasic());
	}
}
