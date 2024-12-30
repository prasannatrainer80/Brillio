package com.java.jdk8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample1 {

	public static void main(String[] args) {
		List<Emp> employList = new ArrayList<Emp>();
		employList.add(new Emp(1, "Poojitha", 84823.44));
		employList.add(new Emp(2, "Satwik",90033.22));
		employList.add(new Emp(3, "Aakash",80033));
		employList.add(new Emp(4, "Rakshitha",95522));
		employList.add(new Emp(5, "Anoop",87733));
		employList.add(new Emp(6, "Manoj",95522));
		employList.add(new Emp(7, "Geethika",81111));
		
		Stream<Emp> filter1 = employList.stream().filter(x -> x.getBasic() >= 90000);
		System.out.println("Filtered Data  ");
		filter1.forEach(x -> {
			System.out.println(x);
		});
		
		Stream<Emp> filter2 = employList.stream().filter(x -> x.getName().startsWith("A"));
		
		System.out.println("Filtered Data 2  ");
		filter2.forEach(x -> {
			System.out.println(x);
		});
	}
}
