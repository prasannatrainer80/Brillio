package com.java.day2;

import java.util.Scanner;

public class BoxInstance {

	public void show(Object ob) {
		if (ob instanceof Integer) {
			int x = (Integer)ob;
			System.out.println("Integer Casting  " +x);
		}
		if (ob instanceof String) {
			String x = (String)ob;
			System.out.println("String Casting  " +x);
		}
		if (ob instanceof Double) {
			double x = (Double)ob;
			System.out.println("Double Casting  " +x);
		}
		if (ob instanceof Customer) {
			Customer x = (Customer)ob;
			System.out.println(x.custId + " " +x.custName + "  " +x.premium);
		}
	}
	
	public static void main(String[] args) {
		Object[] arr = new Object[4];
		Scanner sc = new Scanner(System.in);
//		int a=12;
//		double b=12.5;
//		String str="Hello";
		Customer customer = new Customer();
		customer.custId =1;
		customer.custName = "Satwik";
		customer.premium = 88283.44;
		System.out.println("Enter a Number  ");
		arr[0]=sc.nextInt();
		System.out.println("Enter Double Value  ");
		arr[1]=sc.nextDouble();
		System.out.println("Enter Name ");
		arr[2]=sc.next();
		arr[3]=customer;
		BoxInstance obj = new BoxInstance();
		for (Object ob : arr) {
			obj.show(ob);
		}
	}
}
