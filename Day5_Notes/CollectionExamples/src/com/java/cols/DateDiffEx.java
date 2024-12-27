package com.java.cols;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateDiffEx {

	public void diff(String startDate, String endDate) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d1 = sdf.parse(startDate);
		Date d2 = sdf.parse(endDate);
		long ms = d2.getTime() - d1.getTime();
		long days = (ms / (1000 * 60 * 60 * 24));
		days++;
		System.out.println(days);
	}
	public static void main(String[] args) {
		String startDate, endDate;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Start Date (yyyy-MM-dd) ");
		startDate = sc.next();
		System.out.println("Enter End Date (yyyy-MM-dd)  ");
		endDate  = sc.next();
		DateDiffEx obj = new DateDiffEx();
		try {
			obj.diff(startDate, endDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
