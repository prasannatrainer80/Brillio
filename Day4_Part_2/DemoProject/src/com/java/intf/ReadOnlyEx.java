package com.java.intf;

public class ReadOnlyEx {

	private int cutstId;
	private String custName;
	
	public ReadOnlyEx() {

	}

	public ReadOnlyEx(int cutstId, String custName) {
		this.cutstId = cutstId;
		this.custName = custName;
	}

	@Override
	public String toString() {
		return "ReadOnlyEx [cutstId=" + cutstId + ", custName=" + custName + "]";
	}

	public int getCutstId() {
		return cutstId;
	}

	public String getCustName() {
		return custName;
	}
	
	public static void main(String[] args) {
		ReadOnlyEx obj1 = new ReadOnlyEx(1,"Anoop");
		System.out.println(obj1.getCutstId());
		System.out.println(obj1.getCustName());
	}
	
}
