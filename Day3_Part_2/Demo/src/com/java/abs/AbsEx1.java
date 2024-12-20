package com.java.abs;

public class AbsEx1 {

	public static void main(String[] args) {
//		Flight obj1 = new Subhash();
//		Flight obj2 = new Shwetha();
//		Flight obj3 = new Venkatesh();
		Flight[] arr = new Flight[] {
			new Subhash(),
			new Shwetha(),
			new Venkatesh()
		};
		
		for (Flight flight : arr) {
			flight.idProof();
			flight.ticket();
		}
	}
}
