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
	<form method="get" action="NameEx.jsp">
		<center>
			First Name : 
			<input type="text" name="firstName" /> <br/><br/>
			Last Name : 
			<input type="text" name="lastName" /> <br/><br/>
			<input type="submit" value="Show" />
		</center>
	</form>
	<c:if test="${param.firstName !=null && param.lastName !=null}">
		<c:set var="firstName" value="${param.firstName}" />
		<c:set var="lastName" value="${param.lastName}" />
		<jsp:useBean id="beanName" class="com.java.jstl.NameBean" />
		<c:set var="fullName" value="${beanName.fullName(firstName,lastName)}" />
		First Name : <b>
			<c:out value="${firstName}" />
		</b> <br/><br/>
		Last Name : <b>
			<c:out value="${lastName}" /> <br/><br/>
		</b>
		Full Name: <b>
			<c:out value="${fullName}" />
		</b>
	</c:if>
</body>
</html>