<%@ page contentType="text/html" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head><title>Student</title></head>
<body>
<h2 align = "center">Student</h2>
<table>
	<tr>
		<th>Name:</th>
		<td>${student.name}</td>
	</tr>
	
	<tr>
		<th>Password:</th>
		<td>${student.password}</td>
	</tr>
	
	<tr>
		<th>Email:</th>
		<td>${student.email}</td>
	</tr>
</table>
</body>
</html>