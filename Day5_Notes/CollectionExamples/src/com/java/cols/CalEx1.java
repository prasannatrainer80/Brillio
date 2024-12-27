package com.java.cols;

import java.util.Calendar;
import java.util.Date;

public class CalEx1 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		cal.add(Calendar.DECEMBER, 2);
		System.out.println("After 2 Tuesday  " +cal.getTime());
		cal.add(Calendar.DAY_OF_MONTH, 5);
		System.out.println(cal.getTime());
		cal.add(Calendar.MONTH, 2);
		System.out.println(cal.getTime());
//		cal.add(Calendar.YEAR, 10);
		cal.add(Calendar.TUESDAY, 1);
		System.out.println("After 2 Mondays " +cal.getTime());
		System.out.println(cal.getTime());
		/* Converting Date to Calendar */
		Date today = new Date();
		cal.setTime(today);
	}
}
