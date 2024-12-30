package com.java.jdk8;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutEx {
	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("c:/files/dataout.txt");
			DataOutputStream dout = new DataOutputStream(fout);
			dout.writeInt(52);
			dout.writeUTF("Brillio");
			dout.writeDouble(88423.44);
			dout.writeBoolean(true);
			dout.close();
			fout.close();
			System.out.println("Data Saved...");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
