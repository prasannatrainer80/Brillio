package com.java.jdk8;

import java.io.FileWriter;
import java.io.IOException;

public class Task1 {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("c:/files/test.txt");
			fw.write("Welcome Java true 12 44.23 2 66.2 3 66 Hi 42 Hello 11 true Hi");
			fw.close();
			System.out.println("File Created");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
