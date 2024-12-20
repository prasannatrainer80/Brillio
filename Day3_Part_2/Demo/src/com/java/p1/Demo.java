package com.java.p1;

public class Demo {

	public String publicString = "Brillio";
	private String privateString = "Java";
	protected String protectedString = "Bangalore";
	String friendlyString = "FullStack";
	
	public void show() {
		System.out.println(privateString);
		System.out.println(publicString);
		System.out.println(protectedString);
		System.out.println(friendlyString);
	}
}
