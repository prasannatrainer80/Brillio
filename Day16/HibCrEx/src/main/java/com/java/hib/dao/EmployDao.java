package com.java.hib.dao;

import java.util.List;

import com.java.hib.model.Employ;

public interface EmployDao {
	List<Employ> showEmployDao();
	Employ searchEmployDao(int empno);
}
