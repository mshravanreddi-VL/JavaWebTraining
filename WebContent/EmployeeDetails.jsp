<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Please tell me about yourself</h1>

	<form action="EmployeeView.jsp" method="get">

		Name: <input type="text" name="firstName"> <input type="text"
			name="lastName"><br> Sex: <input type="radio" checked
			name="sex" value="male">Male <input type="radio" name="sex"
			value="female">Female
		<p>
			What Java framework you are comfortable with: <select
				name="javaType">
				<option value="Spring">Spring</option>
				<option value="Hibernate">Hibernate</option>
				<option value="Struts">Struts</option>				
			</select> <br> <input type="submit">
	</form>
	
</body>
</html>