package com.java.intf;

public class Test implements IOne, ITwo {

	@Override
	public void email() {
		System.out.println("Email is hr@brillio.com");
	}

	@Override
	public void name() {
		System.out.println("Name is Brillio");
	}
	
	public static void main(String[] args) {
		Test test = new Test();
		test.name();
		test.email();
	}

}
