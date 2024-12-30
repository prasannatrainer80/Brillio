package com.java.jdk8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortEmploy {

	public static void main(String[] args) {
		List<Emp> employList = new ArrayList<Emp>();
		employList.add(new Emp(1, "Poojitha", 84823.44));
		employList.add(new Emp(2, "Satwik",90033.22));
		employList.add(new Emp(3, "Aakash",80033));
		employList.add(new Emp(4, "Rakshitha",95522));
		employList.add(new Emp(5, "Anoop",87733));
		employList.add(new Emp(6, "Manoj",95522));
		employList.add(new Emp(7, "Geethika",81111));
		
		System.out.println("Sort By Name  ");
		Collections.sort(employList, (e1, e2) -> {
			return e1.getName().compareTo(e2.getName());
		});
		
		employList.forEach(x -> {
			System.out.println(x);
		});
		
		Collections.sort(employList, (e1, e2) -> {
			return (int) (e1.getBasic() - e2.getBasic());
		});
		System.out.println("Sort By Basic-Wise  ");
		employList.forEach(System.out::println);
	}
}
