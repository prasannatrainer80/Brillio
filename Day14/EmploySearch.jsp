<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="EmploySearch.jsp">
		<center>
			Employ No : 
			<input type="number" name="empno" /> <br/><br/>
			<input type="submit" value="Search Employ" /> <br/><br/>
		</center>
	</form>
	<c:if test="${param.empno!=null}">
		<sql:setDataSource var="conn" driver="com.mysql.cj.jdbc.Driver"
			url="jdbc:mysql://localhost:3306/brillio" user="root" password="root"
			/>
		<sql:query var="employQuery" dataSource="${conn}">
			select * from Employ where empno = ?
			<sql:param value="${param.empno}" />
		</sql:query>
		<c:forEach var="e" items="${employQuery.rows}">
		Employ No : 
		<c:out value="${e.empno}" /> <br/>
		Name : 
		<c:out value="${e.name}" /> <br/> 
		Gender : 
		<c:out value="${e.gender}" /> <br/>
		Department : 
		<c:out value="${e.dept}" /> <br/> 
		Designation : 
		<c:out value="${e.desig}" /> <br/>
		Basic : 
		<c:out value="${e.basic}" /> <br/>
		<c:set var="flag" value="1" />
	</c:forEach>
	</c:if>
</body>
</html>