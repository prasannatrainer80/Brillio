package com.java.intf;

public class WriteOnly {

	private int custId;
	private String custName;
	
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	
	@Override
	public String toString() {
		return "WriteOnly [custId=" + custId + ", custName=" + custName + "]";
	}
	
	public static void main(String[] args) {
		WriteOnly obj = new WriteOnly();
		obj.setCustId(1);
		obj.setCustName("Raj");
		System.out.println(obj);
	}
}
