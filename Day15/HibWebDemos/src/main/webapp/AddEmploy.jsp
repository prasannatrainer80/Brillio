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
	<form method="get" action="AddEmploy.jsp">
		<center>
			Employ No : 
			<input type="number" name="empno" /> <br/><br/>
			Employ Name : 
			<input type="text" name="name" /> <br/><br/>
			Gender : 
			<select name="gender">
				<option value="MALE">MALE</option>
				<option value="FEMALE">FEMALE</option>
			</select> <br/><br/>
			Department :
			<select name="dept">
				<option value="Java">Java</option>
				<option value="SQL">Sql</option>
				<option value="React">React</option>
			</select> <br/>
			Designation : 
			<select name="desig">
				<option value="ASE">Ase</option>
				<option value="SE">SE</option>
				<option value="TL">TL</option>
				<option value="Manager">Manager</option>
			</select> <br/>
			Basic : 
			<input type="number" name="basic" /> <br/><br/>
			<input type="submit" value="Add Employ" />
		</center>
	</form>
	<c:if test="${param.empno !=null && param.basic !=null}">
		<jsp:useBean id="beanEmploy" class="com.java.hib.model.Employ" />
		<jsp:setProperty property="*" name="beanEmploy"/>
		<jsp:useBean id="beanEmployDao" class="com.java.hib.dao.EmployDaoImpl" />
		<c:out value="${beanEmployDao.addEmployDao(beanEmploy)}" />
		<jsp:forward page="EmployShow.jsp" />
	</c:if>
</body>
</html>