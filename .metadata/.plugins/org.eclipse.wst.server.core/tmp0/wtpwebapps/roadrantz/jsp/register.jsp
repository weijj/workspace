<%@ page contentType="text/html" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<html>
<head><title>Add New Student</title></head>
<body>
	<h2 align = "center">Register</h2>
	<sf:form method = "POST" modelAttribute = "student">
		<fieldset>
			<table cellspacing = "0">
				<tr>
					<th><label for = "name">Name:</label></th>
					<td>
						<sf:input id = "name" path = "name" size = "20" /> <br/>
						<sf:errors path = "name" cssClass = "error" />
					</td>
				</tr>	
				
				<tr>
					<th><label for = "password">Password:</label></th>
					<td>
						<sf:password id = "password" path = "password" size = "20" /> <br/>
						<sf:errors path = "password" cssClass = "error" />
					</td>
				</tr>
				
				<tr>
					<th><label for = "email">Email:</label></th>
					<td>
						<sf:input id = "email" path="email" size = "30" /> <br/>
						<sf:errors path = "email" cssClass = "error" />
					</td>
				</tr>
				
				<tr>
					<th></th>
					<td><input name = "commit" type = "submit" value = "Commit" /></td>
				</tr>
			</table>
		</fieldset>
	</sf:form>
</body>
</html>