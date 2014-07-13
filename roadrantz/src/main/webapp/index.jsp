<%@ page contentType="text/html" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head><title>Rantz</title></head>
<body>
<h2>Welcome to RoadRantz!</h2>
<h3>Recent rantz:</h3>
<ul>
<c:forEach items="${ls}" var="rant">
<li><c:out value="${rant}"/></li>
</c:forEach>
</ul>

<a href = "/roadrantz/list?name=yipeng">more</a>
</body>
</html>