<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Handle Login</title>
</head>
<body>
<jsp:useBean id="LoginBean" scope="session" class="com.example.demo.model.User"></jsp:useBean>

<jsp:setProperty name="LoginBean" property="*"/>
<c:set value="${LoginBean.validate()}" var="result"/>
Result is <c:out value="${result}"/>
<c:if test="${result}">
<jsp:forward page="showBooks.jsp"></jsp:forward>
</c:if>
<c:if test="${!result}">
<jsp:forward page="index.jsp">
<jsp:param value="Invalid userName or Password" name="errorMessage"/>
</jsp:forward>
</c:if>
</body>
</html>