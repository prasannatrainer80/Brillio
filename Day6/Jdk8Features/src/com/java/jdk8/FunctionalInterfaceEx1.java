package com.java.jdk8;

@FunctionalInterface
interface IGreeting {
	String greet();
}

public class FunctionalInterfaceEx1 {

	public static void main(String[] args) {
		IGreeting obj1 = () -> {
			return "Welcome to Java Training...";
		};
		
		IGreeting obj2 = () -> {
			return "Testing Time...";
		};
		
		IGreeting obj3 = () -> {
			return "Hi Hello World...";
		};
		
		System.out.println(obj1.greet());
		System.out.println(obj2.greet());
		System.out.println(obj3.greet());
	}
}
