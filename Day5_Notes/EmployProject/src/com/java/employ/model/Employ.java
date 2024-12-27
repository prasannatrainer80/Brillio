package com.java.employ.model;

import java.util.Date;

public class Employ {

	private int empno;
	private String name;
	private Gender gender;
	private Date dob;
	private String dept;
	private String desig;
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
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	public Employ() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employ(int empno, String name, Gender gender, Date dob, String dept, String desig, double basic) {
		super();
		this.empno = empno;
		this.name = name;
		this.gender = gender;
		this.dob = dob;
		this.dept = dept;
		this.desig = desig;
		this.basic = basic;
	}
	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", gender=" + gender + ", dob=" + dob + ", dept=" + dept
				+ ", desig=" + desig + ", basic=" + basic + "]";
	}
	
	
}
