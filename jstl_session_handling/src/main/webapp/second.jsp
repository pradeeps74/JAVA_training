<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:out value="${pageContext.session.id}"/>
Welcome <c:out value="${name}"/>welcome
<c:set var = "city" scope = "request" value = "chennai"/>
<% session.invalidate(); %>
<jsp:forward page="third.jsp" />
<%-- <a href="third.jsp">Third </a>--%>
</body>
</html>