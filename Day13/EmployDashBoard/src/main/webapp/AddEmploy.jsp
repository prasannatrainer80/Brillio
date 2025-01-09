<%@page import="com.java.jdbc.model.Gender"%>
<%@page import="com.java.jdbc.model.Employ"%>
<%@page import="com.java.jdbc.dao.EmployDaoImpl"%>
<%@page import="com.java.jdbc.dao.EmployDao"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="AddEmploy.jsp">
		<center>
			Employ No : 
			<input type="number" name="empno" /> <br/><br/>
			Employ Name : 
			<input type="text" name="name" /> <br/><br/>
			Gender : 
			<select name="gender">
				<option value="MALE">MALE</option>
				<option value="FEMALE">FEMALE</option>
			</select> <br/><br/>
			Department :
			<select name="dept">
				<option value="Java">Java</option>
				<option value="SQL">Sql</option>
				<option value="React">React</option>
			</select> <br/>
			Designation : 
			<select name="desig">
				<option value="ASE">Ase</option>
				<option value="SE">SE</option>
				<option value="TL">TL</option>
				<option value="Manager">Manager</option>
			</select> <br/>
			Basic : 
			<input type="number" name="basic" /> <br/><br/>
			<input type="submit" value="Add Employ" />
		</center>
	</form>
	<%
		if (request.getParameter("empno")!=null && request.getParameter("basic")!=null) {
			EmployDao dao = new EmployDaoImpl();
			Employ employ = new Employ();
			employ.setEmpno(Integer.parseInt(request.getParameter("empno")));
			employ.setName(request.getParameter("name"));
			employ.setGender(Gender.valueOf(request.getParameter("gender")));
			employ.setDept(request.getParameter("dept"));
			employ.setDesig(request.getParameter("desig"));
			employ.setBasic(Double.parseDouble(request.getParameter("basic")));
			dao.addEmploy(employ);
	%>
		<jsp:forward page="EmployTable.jsp" />
	<%
		}
	%>
</body>
</html>