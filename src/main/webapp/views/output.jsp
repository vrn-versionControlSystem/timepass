<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<%
		String name=request.getParameter("nam1");
		out.println("You are entered name is:"+name);
		
		session.setAttribute("user", name);
	%>
	
	<br>
	<p>This name is send to second page by using session method</p>
	<a href="session1">Send to Session JSP page</a>
	
	<%@ page import="java.util.Date" %>
	Today is: <%= new Date()  %>
	
	
</body>
</html>