<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String sname = request.getParameter("sname");
		out.println("Student Name in First Page  " +sname + "<br/>");
		session.setAttribute("sname", sname);
	%>
	<a href="Second.jsp">Second Page</a>
</body>
</html>