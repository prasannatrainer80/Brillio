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
	<form method="post" action="SearchEmploy.jsp">
		Employ No : 
		<input type="number" name="empno" /> <br/><br/>
		<input type="submit" value="Search Employ" />
	</form>
	<c:if test="${param.empno !=null}">
		<jsp:useBean id="beanEmployDao" class="com.java.hib.dao.EmployDaoImpl" />
		<c:set var="employ" value="${beanEmployDao.searchEmployDao(param.empno)}" />
		<c:if test="${employ != null}">
			Employ Name : ${employ.name} <br/>
			<a href="EmployShow.jsp">Back</a>
		</c:if>
	</c:if>
</body>
</html>