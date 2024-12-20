package com.java.p2;

import com.java.p1.Demo;

public class Test extends Demo {

	public void show() {
		Test test = new Test();
		System.out.println(test.protectedString);
		System.out.println(test.publicString);
	}
}
