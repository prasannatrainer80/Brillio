package com.java.intf;

public class MainProg {

	public static void main(String[] args) {
		ITraining[] arr = new ITraining[] {
			new Aakash(), new Anoop(), new Harshit()	
		};
		
		for (ITraining iTraining : arr) {
			iTraining.name();
			iTraining.email();
		}
	}
}
