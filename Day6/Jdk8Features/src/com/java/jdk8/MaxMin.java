package com.java.jdk8;

import java.util.ArrayList;
import java.util.List;

public class MaxMin {

	public static void main(String[] args) {
		List<Emp> employList = new ArrayList<Emp>();
		employList.add(new Emp(1, "Poojitha", 84823.44));
		employList.add(new Emp(2, "Satwik",90033.22));
		employList.add(new Emp(3, "Aakash",80033));
		employList.add(new Emp(4, "Rakshitha",95522));
		employList.add(new Emp(5, "Anoop",87733));
		employList.add(new Emp(6, "Manoj",95522));
		employList.add(new Emp(7, "Geethika",81111));
		
		Emp employ1 = employList.stream().max((m1,m2) -> 
			m1.getBasic() > m2.getBasic() ? 1 : -1).get();
		System.out.println(employ1);
	
		Emp employ2 = employList.stream().min((m1,m2) -> 
			m1.getBasic() > m2.getBasic() ? 1 : -1).get();
		System.out.println(employ2);
		
		System.out.println("Names in Upper Case ");
		employList.stream().map(x -> x.getName().toUpperCase()).forEach(System.out::println);
	}
}
