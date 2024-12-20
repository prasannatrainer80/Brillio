package com.java.st;

public class Cricket {

	static int score;
	static {
		score = 0;
	}
	
	public void incr(int x) {
		score+=x;
	}
	
	public static void main(String[] args) {
		Cricket fb = new Cricket();
		Cricket sb = new Cricket();
		Cricket ext = new Cricket();
		fb.incr(12);
		sb.incr(23);
		ext.incr(7);
		System.out.println("Total Score  " +Cricket.score);
	}
}
