package com.java.day2;

import java.util.Scanner;

public class EnumEx1 {

	public static void main(String[] args) {
		WeekDays wd = WeekDays.MONDAY;
		System.out.println(wd);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Day Name (Capitals)  ");
		String dayName = sc.next();
		
		/* Convert String to Enum */
		
		WeekDays wd1 = WeekDays.valueOf(dayName);
		System.out.println(wd1);
	}
}
