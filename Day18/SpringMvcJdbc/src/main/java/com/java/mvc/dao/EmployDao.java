package com.java.mvc.dao;

import java.util.List;

import com.java.mvc.model.Employ;

public interface EmployDao {
	List<Employ> showEmployDao();
	Employ searchEmployDao(int empno);
	String addEmployDao(Employ employ);
	String updateEmployDao(Employ employ);
	String deleteEmployDao(int empno);
}
