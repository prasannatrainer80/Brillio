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
	String sname = (String)session.getAttribute("sname");
	out.println("Name from Second Jsp Page  " +sname + "<br/>");
%>
</body>
</html>