package com.java.cols;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class UserAuth {

	public static void main(String[] args) {
		Map<String, String> userData = new Hashtable<String, String>();
		userData.put("Nitisha", "Sagar");
		userData.put("Subhash", "Rao");
		userData.put("Anoop", "Anoop");
		userData.put("Swetha", "Reddy");
		userData.put("Geethika", "Vuppala");
		String userName,passWord,result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter UserName and Password ");
		userName = sc.next();
		passWord = sc.next();
		result = userData.getOrDefault(userName, "Not Found");
		if (result.equals(passWord)) {
			System.out.println("Correct Credentials...");
		} else {
			System.out.println("Invalid Credentials...");
		}
	}
}
