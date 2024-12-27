package com.java.cols;

interface IOne {
	  default void show() {
		  System.out.println("Show From IOne...");
	  }
	}
	interface ITwo {
	  default void show() {
		  System.out.println("Show From ITwo...");
	  }
	}
	interface IThree {
	  default void show() {
		  System.out.println("Show From IThree...");
	  }
	}

public class Test implements IOne, ITwo, IThree {

	@Override
	public void show() {
		IOne.super.show();
		ITwo.super.show();
		IThree.super.show();
	}

	public static void main(String[] args) {
		new Test().show();
	}
}
