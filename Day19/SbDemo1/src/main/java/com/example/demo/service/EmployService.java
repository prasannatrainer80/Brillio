package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.example.demo.model.Employ;

@Service
public class EmployService {

	static List<Employ> employList;
	static {
		employList = new ArrayList<Employ>();
		employList.add(new Employ(1, "Geethika", 88423));
		employList.add(new Employ(2, "Dinesh", 90023));
		employList.add(new Employ(3, "Sathwik", 91145));
		employList.add(new Employ(4, "Poojitha", 93355));
		employList.add(new Employ(5, "Mounika", 90444));
		
	}
	public List<Employ> showEmploy() {
		return employList;
	}
	
	public Employ searchEmploy(int empno) {
		Employ employFound = null;
		if (empno==1) {
			employFound = employList.get(0);
		} else if (empno == 2) {
			employFound = employList.get(1);
		} else if (empno == 3) {
			employFound = employList.get(2);
		} else if (empno ==4) {
			employFound = employList.get(3);
		} else if (empno == 5) {
			employFound = employList.get(4);
		}
		return employFound;
	}
}
