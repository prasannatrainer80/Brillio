package com.java.inh;

class First {
	void display() {
		System.out.println("Display From Class First...");
	}
}

class Second extends First {
	void show() {
		System.out.println("Show Method from Class Second...");
	}
}

public class Inh {
	public static void main(String[] args) {
		Second obj = new Second();
		obj.display();
		obj.show();
	}
}
