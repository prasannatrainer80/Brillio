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
	<form method="post" action="Login1.jsp">
		<center>
			User Name : 
			<input type="text" name="userName" /> <br/><br/>
			Password : 
			<input type="password" name="passCode" /> <br/><br/>
			<input type="submit" value="Login" />
		</center>
	</form>
	<c:if test="${param.userName !=null && param.passCode != null}">
		<jsp:useBean id="beanEmployDao" class="com.java.hib.dao.EmployDaoImpl" />
		<jsp:useBean id="beanLogin" class="com.java.hib.model.Login" />
		<jsp:setProperty property="*" name="beanLogin"/>
		<c:set var="count" value="${beanEmployDao.authenticate(beanLogin)}" />
		<c:if test="${count == 1}">
			<jsp:forward page="Menu.jsp" />
		</c:if>
		<c:if test="${count == 0}">
			<c:out value="Invalid Credentials..." />
		</c:if>
	</c:if>
</body>
</html>