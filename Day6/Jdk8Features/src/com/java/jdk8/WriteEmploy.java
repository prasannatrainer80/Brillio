package com.java.jdk8;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteEmploy {
	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("c:/files/empdata.txt");
			ObjectOutputStream objout = new ObjectOutputStream(fout);
			Employ employ = new Employ(1, "Aakash", 94234.22);
			objout.writeObject(employ);
			objout.close();
			fout.close();
			System.out.println("Employ Object Stored...");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
