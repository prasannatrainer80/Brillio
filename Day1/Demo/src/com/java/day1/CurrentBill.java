package com.java.day1;

public class CurrentBill {

	public void calculate(int units) {
		double billAmount=0;
		double rate;
		
		if (units <= 90) {
			rate = 1;
			billAmount =units * rate;
		}
		
		if (units > 90) {
			rate = 1;
			billAmount = 90 *rate;
			if (units - 150 >= 0) {
				rate = 1.5;
				billAmount = billAmount + (60 * rate);
			} else {
				rate = 1.5;
				billAmount = billAmount + (units -90) *rate;
			}
		}
		if (units > 150) {
			rate = 2;
			if (units - 200 >= 0) {
				billAmount = billAmount + (50 * rate);
			} else {
				billAmount = billAmount + (units - 150) * rate;
	
			}
		}
		System.out.println("Bill Amount  " +billAmount);
	}
	public static void main(String[] args) {
		int units = 151;
		CurrentBill obj = new CurrentBill();
		obj.calculate(units);
	}

}
