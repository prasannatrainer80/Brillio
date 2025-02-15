<%@page import="com.java.lib.ConnectionHelper"%>
<%@page import="java.sql.Date"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="Menu.jsp"/>
	<%
String user=(String)session.getAttribute("user");
	Connection connection = ConnectionHelper.getConnection();
	if(request.getParameterValues("bookId") != null)
	{
		String str[] = request.getParameterValues("bookId");
		

			for(String s : str)
			{
			String sql = "SELECT * FROM TranBook WHERE Username = ? ";
			PreparedStatement ps = connection.prepareStatement(sql,
			ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			ps.setString(1,user);
			ResultSet rs =ps.executeQuery();
			String uname = null;
			Date fromdate;
			Date todate = new Date(session.getLastAccessedTime());
			
			if(rs.next()) 
			{
				uname = rs.getString("Username");
				fromdate = rs.getDate("Fromdate");
			
				if(user.equals(uname))
				{
					
					String sql1 = "DELETE FROM TranBook WHERE BookId = ? AND Username = ? " ;
					PreparedStatement ps1 = connection.prepareStatement(sql1);
					ps1.setString(1,s);
					ps1.setString(2,user);
					ps1.executeUpdate();
											
					String sql2 = " INSERT INTO TransReturn VALUES (?,?,?,?)" ;
					PreparedStatement ps2 = connection.prepareStatement(sql2);
					ps2.setString(1,user);
					ps2.setString(2,s);
					ps2.setDate(3,fromdate);
					ps2.setDate(4,todate);
					ps2.executeUpdate();
																	
					String sql3 = "SELECT TotalBooks FROM Books WHERE Id = ?";
					PreparedStatement ps3 = connection.prepareStatement(sql3);
					ps3.setString(1,s);
					ResultSet rs3 =ps3.executeQuery();
					rs3.next();
					String btotal = rs3.getString("TotalBooks");
					int bt = Integer.parseInt(btotal);
					bt = bt+1;
					
					String sql4 = "UPDATE Books SET TotalBooks = ? WHERE Id = ?" ;
					PreparedStatement ps4 = connection.prepareStatement(sql4);
					ps4.setInt(1,bt);
					ps4.setString(2,s);
					ps4.executeUpdate();
					
					out.write("<br/><br/>The book with Id ("+s+") is returned !...");	
				}
			}
			}				
		
				
	}
	else
	{
		out.write("<br/><br/>Please select book to return ....... ");			
	}
	%>
</body>
</html>