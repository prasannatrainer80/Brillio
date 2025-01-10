package com.java.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.java.jdbc.model.Employ;
import com.java.jdbc.model.Gender;
import com.java.jdbc.util.ConnectionHelper;
import com.java.jdbc.util.EncryptPassword;

public class EmployDaoImpl implements EmployDao {

	Connection connection;
	PreparedStatement psmt;
	
	public int loginUser(String userName, String passCode) throws ClassNotFoundException, SQLException {
		String encr = EncryptPassword.getCode(passCode);
		connection = ConnectionHelper.getConnection();
		String cmd = "select count(*) cnt from UserDetails where UserName = ? AND PassCode = ?";
		psmt = connection.prepareStatement(cmd);
		psmt.setString(1, userName);
		psmt.setString(2, encr);
		ResultSet rs = psmt.executeQuery();
		rs.next();
		int count = rs.getInt("cnt");
		return count;
	}
	public String addUser(String userName, String passCode) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String encr = EncryptPassword.getCode(passCode);
		String cmd = "Insert into UserDetails(UserName, PassCode) values(?,?)";
		psmt = connection.prepareStatement(cmd);
		psmt.setString(1, userName);
		psmt.setString(2, encr);
		psmt.executeUpdate();
		return "User Created with Encrypted Password...";
	}
	
	@Override
	public List<Employ> showEmploy() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Employ";
		psmt = connection.prepareStatement(cmd);
		ResultSet rs = psmt.executeQuery();
		List<Employ> employList = new ArrayList<Employ>();
		Employ employ = null;
		while(rs.next()) {
			employ = new Employ();
			employ.setEmpno(rs.getInt("empno"));
			employ.setName(rs.getString("name"));
			employ.setGender(Gender.valueOf(rs.getString("gender")));
			employ.setDept(rs.getString("dept"));
			employ.setDesig(rs.getString("desig"));
			employ.setBasic(rs.getDouble("basic"));
			employList.add(employ);
		}
		return employList;
	}

	@Override
	public Employ searchEmploy(int empno) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Employ where empno = ?";
		psmt = connection.prepareStatement(cmd);
		psmt.setInt(1, empno);
		ResultSet rs = psmt.executeQuery();
		Employ employ = null;
		if (rs.next()) {
			employ = new Employ();
			employ.setEmpno(rs.getInt("empno"));
			employ.setName(rs.getString("name"));
			employ.setGender(Gender.valueOf(rs.getString("gender")));
			employ.setDept(rs.getString("dept"));
			employ.setDesig(rs.getString("desig"));
			employ.setBasic(rs.getDouble("basic"));
		}
		return employ;
	}

	@Override
	public String addEmploy(Employ employ) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "insert into Employ(empno, name, gender, dept, desig, basic) "
				+ " values(?,?,?,?,?,?)";
		psmt = connection.prepareStatement(cmd);
		psmt.setInt(1, employ.getEmpno());
		psmt.setString(2, employ.getName());
		psmt.setString(3, employ.getGender().toString());
		psmt.setString(4, employ.getDept());
		psmt.setString(5, employ.getDesig());
		psmt.setDouble(6, employ.getBasic());
		psmt.executeUpdate();
		return "Employ Record Inserted...";
	}

	@Override
	public String updateEmploy(Employ employUpdated) throws ClassNotFoundException, SQLException {
		Employ employFound = searchEmploy(employUpdated.getEmpno());
		if (employFound != null) {
			connection = ConnectionHelper.getConnection();
			String cmd = "Update Employ set Name = ?, Gender = ?, Dept = ?, Desig = ?, Basic = ? "
					+ " Where Empno = ?";
			psmt = connection.prepareStatement(cmd);
			psmt.setString(1, employUpdated.getName());
			psmt.setString(2, employUpdated.getGender().toString());
			psmt.setString(3, employUpdated.getDept());
			psmt.setString(4, employUpdated.getDesig());
			psmt.setDouble(5, employUpdated.getBasic());
			psmt.setInt(6, employUpdated.getEmpno());
			psmt.executeUpdate();
			return "Employ Record Updated...";
		}
		return "Employ Record Not Found...";
	}

	@Override
	public String deleteEmploy(int empno) throws ClassNotFoundException, SQLException {
		Employ employFound = searchEmploy(empno);
		if (employFound !=null) {
			String cmd = "Delete From Employ where empno = ?";
			connection = ConnectionHelper.getConnection();
			psmt = connection.prepareStatement(cmd);
			psmt.setInt(1, empno);
			psmt.executeUpdate();
			return "Employ Record Deleted...";
		}
		return "Employ Record Not Found...";
	}

}





