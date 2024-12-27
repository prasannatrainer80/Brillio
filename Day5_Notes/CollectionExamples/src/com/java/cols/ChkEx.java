package com.java.cols;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ChkEx {

	public void show(String strDate) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse(strDate);
		System.out.println(date);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Date (yyyy-MM-dd) format ");
		String strDate = sc.next();
		ChkEx obj =new ChkEx();
		try {
			obj.show(strDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
