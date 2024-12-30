package com.java.jdk8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FOutput {
	public static void main(String[] args) {
		try {
			FileInputStream src = 
					new FileInputStream("C:/JavaTraining/Day6/Jdk8Features/src/com/java/jdk8/Emp.java");
			FileOutputStream tar = new FileOutputStream("c:/files/EmpNew.txt");
			int ch;
			while((ch=src.read()) != -1) {
				tar.write((char)ch);
			}
			src.close();
			tar.close();
			System.out.println("*** File Copied ***");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
