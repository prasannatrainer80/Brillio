<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
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
	<c:if test="${param.empno !=null && param.basic != null}">
		<sql:setDataSource var="conn" driver="com.mysql.cj.jdbc.Driver"
			url="jdbc:mysql://localhost:3306/brillio" user="root" password="root"
			/>
		<sql:update var="sqlInsert" dataSource="${conn}">
			Insert into Employ(empno,name,gender,dept,desig,basic) values(?,?,?,?,?,?)
			<sql:param value="${param.empno}" />
			<sql:param value="${param.name}" />
			<sql:param value="${param.gender}" />
			<sql:param value="${param.dept}" />
			<sql:param value="${param.desig}" />
			<sql:param value="${param.basic}" />
		</sql:update>
		<c:out value="Record Inserted..." />
	</c:if>
</body>
</html>