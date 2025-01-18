package com.java.spr.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.spr.dao.EmployDaoImpl;
import com.java.spr.model.Employ;

public class EmployShowMain {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/java/spr/jdbc.xml");
		EmployDaoImpl impl = (EmployDaoImpl)ctx.getBean("employDao");
		List<Employ> employList = impl.showEmployDao();
		for (Employ employ : employList) {
			System.out.println(employ);
		}
	}
}
