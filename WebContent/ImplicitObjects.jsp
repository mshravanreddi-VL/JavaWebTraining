<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ImplictObjects</title>
</head>

<body>
	<form method="get">
		<input type="checkbox" name="check" value="Check1">Check1 <input
			type="checkbox" name="check" value="Check2">Check2 <input
			type="checkbox" name="check" value="Check3">Check3 <input
			type="submit" value="Query">
	</form>
	
	<%-- <%=out.println("Printing selected values")%> --%>

	<%
		String[] checkBoxes = request.getParameterValues("check");

		if (checkBoxes != null) {
			for (int i = 0; i < checkBoxes.length; i++) {

				out.println(checkBoxes[i]);
			}
		}
		
		out.println();
		out.println(request.getRequestURI());
	%>
	
</body>
</html>