package com.java.gen;

class Test<T> {
	public void swap(T a, T b) {
		T t;
		t = a;
		a = b;
		b = t;
		System.out.println("A value " +a+  " B value " +b);
	}
}

public class GenEx1 {
	public static void main(String[] args) {
		Test test = new Test();
		int a = 5, b = 7;
		test.swap(a, b);
		String s1="Anoop", s2="Dinesh";
		test.swap(s1, s2);
		boolean b1=true, b2 = false;
		test.swap(b1, b2);
		Employ emp1 = new Employ(1, "Subhash Rao", 99923.33);
		Employ emp2 = new Employ(3, "Mounika", 97723.33);
		test.swap(emp1, emp2);
	}
}
