<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="3" align="center">
	<tr>
		<th>Employ No</th>
		<th>Employ Name</th>
		<th>Gender</th>
		<th>Department</th>
		<th>Designation</th>
		<th>Basic</th>
	</tr>
<%
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/brillio","root","root");
	PreparedStatement pst = connection.prepareStatement("select * from Employ");
	ResultSet rs = pst.executeQuery();
	while(rs.next()) {
%>
	<tr>
		<td><%=rs.getInt("empno") %></td>
		<td><%=rs.getString("name") %> </td>
		<td><%=rs.getString("gender") %> </td>
		<td><%=rs.getString("dept") %> </td>
		<td><%=rs.getString("desig") %> </td>
		<td><%=rs.getDouble("basic") %> </td>
	</tr>
<%
	}
%>
</table>
</body>
</html>