package com.java.day1;

import java.util.Scanner;

public class SwitchCaseEx6 {

	public String show(int dayNo) {
		String result;
		result = 
		switch(dayNo) {
			case 1 : { yield "Its Sunday..."; }
			case 2 : { yield "Its Monday..."; }
			case 3 : { yield "Its Tuesday...";}
			case 4 : {yield "ITs Wednesday...";}
			case 5 : {yield "Its Thursday...";}
			case 6 : {yield "Its Friday...";}
			case 7 : {yield "Its Saturday...";}
			default : {
				yield "Invalid Value...";
			}

		};
		return result;
	}
	public static void main(String[] args) {
		int dayNo;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Day No   ");
		dayNo = sc.nextInt();
		SwitchCaseEx6 obj = new SwitchCaseEx6();
		System.out.println(obj.show(dayNo));
		int x=12;
		System.out.println(~x);
	}
}
