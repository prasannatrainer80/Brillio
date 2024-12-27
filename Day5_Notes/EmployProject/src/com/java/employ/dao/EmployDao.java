package com.java.employ.dao;

import java.util.List;

import com.java.employ.model.Employ;

public interface EmployDao {
	String addEmployDao(Employ employ);
	List<Employ> showEmployDao();
	Employ searchEmployDao(int empno);
	String deleteEmployDao(int empno);
	String updateEmployDao(Employ employUpdated);
}
