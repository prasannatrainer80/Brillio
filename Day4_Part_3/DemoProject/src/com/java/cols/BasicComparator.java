package com.java.cols;

import java.util.Comparator;

public class BasicComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Employ employ1 = (Employ)o1;
		Employ employ2 = (Employ)o2;
		if (employ1.getBasic() >= employ2.getBasic()) {
			return 1;
		}
		return -1;
	}

}
