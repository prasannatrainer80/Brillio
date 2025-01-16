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
	<c:set var="namesList" value="${beanEmployDao.showName()}" />
	<table border="3" align="center">
		<tr>
			<th>Employ Name</th>
		</tr>
		<c:forEach var="name" items="${namesList}">
			<tr>
				<td>${name}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>