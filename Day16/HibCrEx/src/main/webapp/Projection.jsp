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
	<c:set var="count" value="${beanEmployDao.totalRecords()}" />
	<c:set var="sumSalary" value="${beanEmployDao.totalSalary()}" />
	Total Records of Table are : <b> ${count} </b> <br/><br/>
	Total Salary is : <b>${sumSalary} </b>
</body>
</html>