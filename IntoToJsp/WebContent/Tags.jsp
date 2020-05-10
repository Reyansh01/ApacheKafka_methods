<! Directive Tags !>

<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html>
<head>
4 types of Tags.<br>
1. Declarative <br>
2. Scriplet<br>
3. Directive<br>
4.Expression<br>

<meta charset="ISO-8859-1">
<title>Tage in JSP</title>
</head>
<body bgcolor = "pink">
	
	
	<! Declarative Tags !>
	<%!
		int i = 9;
	%>
	<br>
	
	<!Scriplet Tags !>
	<%
		int j = 20;
		out.println(j);
	%>
	<br>
	
	This is for Expression Tag : <%= i %>
	<br>

</body>
</html>