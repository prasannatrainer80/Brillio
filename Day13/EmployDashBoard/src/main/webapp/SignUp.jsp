<%@page import="com.java.jdbc.dao.EmployDaoImpl"%>
<%@page import="com.java.jdbc.dao.EmployDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="SignUp.jsp">
	<center>
		User Name : 
		<input type="text" name="userName" /> <br/><br/>
		Password : 
		<input type="password" name="passCode" /> <br/><br/>
		ReType Password : 
		<input type="password" name="reType"/> <br/><br/>
		<input type="Submit" value="Create Account" />
	</center>
</form>
<%
	if (request.getParameter("userName")!=null && request.getParameter("passCode")!=null) {
		String passCode = request.getParameter("passCode");
		String reType = request.getParameter("reType");
		if (passCode.equals(reType)) {
			EmployDaoImpl employDao = new EmployDaoImpl();
			out.println(employDao.addUser(request.getParameter("userName").trim(), passCode));
		} else {
			out.println("Password Mismatch...");
		}
	}
%>
</body>
</html>