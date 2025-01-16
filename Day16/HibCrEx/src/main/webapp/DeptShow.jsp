<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="beanEmployDao" class="com.java.hib.dao.EmployDaoImpl" />
	<c:set var="depts" value="${beanEmployDao.showDept()}" />
	<form method="get" action="DeptShow.jsp">
	Department : 
	<select name="dept" onchange="this.form.submit()">
		<option value="Select">Select Department</option>
		<c:forEach var="dpt" items="${depts}">
			<option value=${dpt}>${dpt}</option>
		</c:forEach>
	</select>
	</form> <br/><hr/>
	<table border="3" align="center">
		<tr>
			<th>Employ No</th>
			<th>Employ Name</th>
			<th>Gender</th>
			<th>Department</th>
			<th>Designation</th>
			<th>Basic</th>
		</tr>
		<c:set var="employList" value="${beanEmployDao.showDeptDetails(param.dept)}" />
			<c:forEach var="employ" items="${employList}">
				<tr>
					<td>${employ.empno}</td>
					<td>${employ.name}</td>
					<td>${employ.gender}</td>	
					<td>${employ.dept}</td>
					<td>${employ.desig}</td>
					<td>${employ.basic}</td>
				</tr>
			</c:forEach>
	</table>
</body>
</html>