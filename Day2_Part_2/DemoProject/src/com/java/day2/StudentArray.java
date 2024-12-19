package com.java.day2;
import java.util.Scanner;

public class StudentArray {

	static Scanner sc = new Scanner(System.in);
	public void readStudent(int n) {
		Student[] studArr = new Student[n];
		
		for(int i=0;i<studArr.length;i++) {
			System.out.println("Enter " +(i+1) +" Student details ");
			System.out.println("Enter Student Id, Name, City and Cgp ");
			studArr[i]=new Student();
			studArr[i].sid = sc.nextInt();
			studArr[i].name = sc.next();
			studArr[i].city = sc.next();
			studArr[i].cgpa = sc.nextDouble();
		}
		
		System.out.println("----------------------");
		for (Student student : studArr) {
			System.out.println(student);
		}
	}
	public static void main(String[] args) {
		int n;
		System.out.println("Enter No.of Students Objects  ");
		n = sc.nextInt();
		new StudentArray().readStudent(n);
	}
}
