package com.java.spr.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.java.spr.model.Employ;

public class EmployDaoImpl implements EmployDao {
	
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<Employ> showEmployDao() {
		String cmd = "Select * From Employ";
		List<Employ> employList = jdbcTemplate.query(cmd, new RowMapper<Employ>() {

			@Override
			public Employ mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employ employ = new Employ();
				employ.setEmpno(rs.getInt("empno"));
				employ.setName(rs.getString("name"));
				employ.setGender(rs.getString("gender"));
				employ.setDept(rs.getString("dept"));
				employ.setDesig(rs.getString("desig"));
				employ.setBasic(rs.getDouble("basic"));
				return employ;
			}
		});
		return employList;
	}

	@Override
	public Employ searchEmployDao(int empno) {
		String cmd = "Select * From Employ Where empno = ?";
		List<Employ> employList = jdbcTemplate.query(cmd, new Object[] {empno}, new RowMapper<Employ>() {

			@Override
			public Employ mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employ employ = new Employ();
				employ.setEmpno(rs.getInt("empno"));
				employ.setName(rs.getString("name"));
				employ.setGender(rs.getString("gender"));
				employ.setDept(rs.getString("dept"));
				employ.setDesig(rs.getString("desig"));
				employ.setBasic(rs.getDouble("basic"));
				return employ;
			}
		});
		if (employList.size()==1) {
			return employList.get(0);
		}
		return null;
	}

	@Override
	public String addEmployDao(Employ employ) {
		String cmd = "Insert into Employ(empno,name,gender,dept,desig,basic) "
				+ " values(?,?,?,?,?,?)";
		jdbcTemplate.update(cmd, new Object[] {
				employ.getEmpno(), employ.getName(), employ.getGender(),
				employ.getDept(),employ.getDesig(),employ.getBasic()
		});
		return "Employ Record Inserted...";
	}

	@Override
	public String updateEmployDao(Employ employ) {
		String cmd = "Update Employ set Name = ?, Gender = ?, Dept = ?, Desig = ?, "
				+ " Basic = ? Where Empno = ?";
		jdbcTemplate.update(cmd, new Object[] {employ.getName(), employ.getGender(),
					employ.getDept(), employ.getDesig(), employ.getBasic(), 
					employ.getEmpno()
				});
		return "Employ Record Updated...";
	}

	@Override
	public String deleteEmployDao(int empno) {
		String cmd = "Delete From Employ where empno = ?";
		jdbcTemplate.update(cmd, new Object[] {empno});
		return "Employ Record Deleted...";
	}

}
