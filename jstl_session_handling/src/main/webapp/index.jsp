<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Session Handling</title>
</head>
<body>
<c:out value="${pageContext.session.id}"/>
<c:set value="Arun" scope="session" var="name">
</c:set>

<a  href="first.jsp">First</a>
<a href="welcome">Home</a>
</body>
</html>