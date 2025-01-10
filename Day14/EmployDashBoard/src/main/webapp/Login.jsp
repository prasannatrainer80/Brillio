<%@page import="com.java.jdbc.dao.EmployDaoImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="Login.jsp">
		<center>
			User Name : 
			<input type="text" name="userName" /> <br/><br/>
			Password : 
			<input type="password" name="passCode" /> <br/><br/>
			<input type="submit" value="Login" /> 
		</center>
	</form>
	<%
		if (request.getParameter("userName")!=null && request.getParameter("passCode")!=null) {
			String userName, passCode;
			userName = request.getParameter("userName");
			passCode = request.getParameter("passCode");
			EmployDaoImpl impl = new EmployDaoImpl();
			int count =impl.loginUser(userName, passCode);
			if (count==1) {
	%>
		<jsp:forward page="EmployTable.jsp" />
	<%
			} else {
				out.println("Invalid Credentials...");
			}
		}
	%>
</body>
</html>