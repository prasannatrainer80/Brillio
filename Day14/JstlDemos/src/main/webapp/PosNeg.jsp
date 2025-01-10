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
	<form method="get" action="PosNeg.jsp">
		<center>
			Enter a Number : 
			<input type="number" name="sno" />  <br/><br/>
			<input type="submit" value="Show" />
		</center>
	</form>
	<c:if test="${param.sno!=null}">
		<c:set var="sno" value="${param.sno}" />
		<c:if test="${sno >= 0}">
			<c:out value="Positive Number..." />
		</c:if>
		<c:if test="${sno < 0}">
			<c:out value="Negative Number..." />
		</c:if>
	</c:if>
</body>
</html>