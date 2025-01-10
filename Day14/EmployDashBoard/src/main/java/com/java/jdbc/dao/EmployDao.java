package com.java.jdbc.dao;

import java.sql.SQLException;
import java.util.List;

import com.java.jdbc.model.Employ;

public interface EmployDao {
	List<Employ> showEmploy() throws ClassNotFoundException, SQLException;
	Employ searchEmploy(int empno) throws ClassNotFoundException, SQLException;
	String addEmploy(Employ employ) throws ClassNotFoundException, SQLException;
	String updateEmploy(Employ employUpdated) throws ClassNotFoundException, SQLException;
	String deleteEmploy(int empno) throws ClassNotFoundException, SQLException;
}
