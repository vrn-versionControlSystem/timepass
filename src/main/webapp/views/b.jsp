<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>This is B page...</h1>
	
	<div>	
	<%!
		String name="Jath";
		int in=name.length();
		
		int square(int n)
		{
			return n*n;
		}
	%>
	<h1>
	village :<%= name  %> have <%= in %> character Length.
	and there Squre is <%= square(2) %>
	
	<%= square(10) %>
	 
	</h1>
    </div>

</body>
</html>