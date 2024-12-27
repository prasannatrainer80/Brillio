package com.java.cols;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class MapEx1 {

	public static void main(String[] args) {
		Map<Integer, String> empData = new Hashtable<Integer, String>();
		empData.put(1, "Anoop");
		empData.put(2, "Satwik");
		empData.put(3, "Aakash");
		empData.put(4, "Srinija");
		empData.put(5, "Manish");
		int empno;
		String result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ No  ");
		empno = sc.nextInt();
		result = empData.getOrDefault(empno, "Not Found");
		System.out.println(result);
	}
}
