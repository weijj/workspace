<%@ page contentType="text/html" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head><title>List</title></head>
<body>
<h1 align = "center">${name}</h1>

<h2>Welcome to RoadRantz!</h2>
<h3>Recent rantz:</h3>
<ul>
<c:forEach items="${ls}" var="rant">
<li><c:out value="${rant}"/></li>
</c:forEach>
</ul>
</body>
</html>