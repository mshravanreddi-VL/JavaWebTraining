<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP Elements</title>
</head>

<body>
	<%@ include file="header.jsp" %>
	<%@ page import = "java.util.*"%>

	<%!int a = 10;
	int b = 20;

	int c = Integer.max(a, b);%>

	<%
		out.println("Max of A & B is : "+c);	
	%>
	
	<%@ include file="footer.jsp" %>

</body>
</html>