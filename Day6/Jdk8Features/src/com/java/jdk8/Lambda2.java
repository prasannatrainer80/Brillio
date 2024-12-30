package com.java.jdk8;

interface ICalc {
	int calc(int a, int b);
}

public class Lambda2 {

	public static void main(String[] args) {
		ICalc obj1 = (a, b) -> {
			return a + b;
		};
		
		ICalc obj2 = (a, b) -> {
			return a - b;
		};
		
		ICalc obj3 = (a, b) -> {
			return a * b;
		};
		
		System.out.println("Sum  " +obj1.calc(12, 5));
		System.out.println("Sub  " +obj2.calc(12, 5));
		System.out.println("Mult  " +obj3.calc(12, 5));
	}
}
