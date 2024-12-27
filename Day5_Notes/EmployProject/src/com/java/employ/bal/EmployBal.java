package com.java.employ.bal;

import java.util.Date;
import java.util.List;

import com.java.employ.dao.EmployDao;
import com.java.employ.dao.EmployDaoImpl;
import com.java.employ.exception.EmployException;
import com.java.employ.model.Employ;

public class EmployBal {

	static EmployDao employDao;
	StringBuilder sb;
	
	static {
		employDao = new EmployDaoImpl();
	}
	
	public boolean validateEmploy(Employ employ) {
		sb = new StringBuilder();
		boolean isValid = true;
		if (employ.getEmpno() <= 0) {
			sb.append("Employ No Cannot be Negative or Zero...\n");
			isValid = false;
		}
		if (employ.getName().length() < 5) {
			sb.append("Employ Name Contains Min 5 characters...\n");
			isValid = false;
		}
		if (employ.getBasic() < 10000 || employ.getBasic() > 80000) {
			sb.append("Basic Must be Between 10000 and 80000...\n");
			isValid = false;
		}
		Date today = new Date();
		long ms = today.getTime() - employ.getDob().getTime();
		long days = (ms / (1000 * 60 * 60 * 24));
		days++;
		if (days < 1) {
			sb.append("Dob Cannot be Tomorrow's Date...\n");
			isValid = false;
		}
		return isValid;
	}
	
	public List<Employ> showEmployBal() {
		return employDao.showEmployDao();
	}
	
	public Employ searchEmployBal(int empno) {
		return employDao.searchEmployDao(empno);
	}
	
	public String deleteEmployBal(int empno) {
		return employDao.deleteEmployDao(empno);
	}
	
	public String updateEmployBal(Employ employ) throws EmployException {
		if (validateEmploy(employ)) {
			return employDao.updateEmployDao(employ);
		}
		throw new EmployException(sb.toString());
	}

	
	public String addEmployBal(Employ employ) throws EmployException {
		if (validateEmploy(employ)) {
			return employDao.addEmployDao(employ);
		}
		throw new EmployException(sb.toString());
	}
}
