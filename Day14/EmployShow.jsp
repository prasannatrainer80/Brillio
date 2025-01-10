<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<sql:setDataSource var="conn" driver="com.mysql.cj.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/brillio" user="root" password="root"
		/>
	<sql:query var="employQuery" dataSource="${conn}">
		select * from Employ
	</sql:query>
	<table border="3" align="center">
		<tr>
			<th>Employ No</th>
			<th>Employ Name</th>
			<th>Gender</th>
			<th>Department</th>
			<th>Designation</th>
			<th>Basic</th>
		</tr>
		<c:forEach var="employ" items="${employQuery.rows}">
			<tr>
				<td>${employ.empno} </td>
				<td>${employ.name} </td>
				<td>${employ.gender} </td>
				<td>${employ.dept} </td>
				<td>${employ.desig} </td>	
				<td>${employ.basic} </td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>