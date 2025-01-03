package com.java.bank;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test {
	
	public static java.sql.Date convetUtilToSql(Date utilDate) {
		return new java.sql.Date(utilDate.getTime());
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ls, le;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("Enter Leave StartDate ");
		ls = sc.next();
		System.out.println("Enter Leave EndDate  ");
		le = sc.next();
		try {
			Date d1 = sdf.parse(ls);
			Date d2 = sdf.parse(le);
			// COnvert Util Date to Sql Date 
			java.sql.Date sqlDate1 = new java.sql.Date(d1.getTime());
			java.sql.Date sqlDate2 = convetUtilToSql(d2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
