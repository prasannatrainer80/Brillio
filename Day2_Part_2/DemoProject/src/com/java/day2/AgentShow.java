package com.java.day2;

import java.util.Scanner;

public class AgentShow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Agent agent = new Agent();
		System.out.println("Enter Agent Id  ");
		agent.agentId = sc.nextInt();
		System.out.println("Enter Agent Name  ");
		agent.agentName = sc.next();
		System.out.println("Enter Premium  ");
		agent.premium = sc.nextDouble();
		System.out.println("Enter Gender (MALE/FEMALE)  ");
		agent.gender = Gender.valueOf(sc.next());
		
		System.out.println(agent);
	}
}
