package com.java.day2;

public class ArrayDemo1 {

	 public void check(Object ob) {
			if (ob=="ABC") {
			  System.out.println("Hi");
			} else {
			  System.out.println("Bye");
			}
		   }
		 
		   public static void main(String[] args) {
			   new ArrayDemo1().check("ABC");
		   }

}
