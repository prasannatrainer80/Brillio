package com.java.jdk8;

import java.io.File;

public class FileExample1 {

	public static void main(String[] args) {
		File file = new File("C:/JavaTraining/Day6/Jdk8Features/src/com/java/jdk8/Emp.java");
		System.out.println("File Name  " +file.getName());
		System.out.println("Parent  " +file.getParent());
		System.out.println("Path of File  " +file.getPath());
	}
}
