package com.java.cols;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.add("Dinesh");
		linkedList.add("Shivani");
		linkedList.add("Soniya");
		linkedList.add("Anoop");
		linkedList.add("Harshit");
		
		linkedList.addFirst("Manoj");
		linkedList.addLast("Srihari");
		
		System.out.println("Linked List Data  ");
		for (Object object : linkedList) {
			System.out.println(object);
		}
	}
}
