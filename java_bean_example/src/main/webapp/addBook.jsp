<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Book</title>
</head>

<div>
<p style="color:green"><c:out value="${message}" /></p>
</div>
<body>
<%@include file="header.html" %>
<div><c:out value="${bookToEdit}"/></div>
<c:if test="${message}"/>
<c:if test="${empty bookToEdit}">
	<form action="add" method=post>
		<div><label for="bookNumber">Book Number</label><input type="text"name="bookNumber" /></div>
		<div><label for="bookName">Book Name</label> <input type="text"name="bookName" /></div>
		<div><label for="authorName">Author Name</label> <input type="text"name="authorName" /></div>
		<div><label for="price">Book Price</label> <input type="text"name="price" /></div>
	<div><input type="submit" value="submit"></div>
	</form>
	<!-- <a href="findByName.jsp">Find Book</a>
<a href="findBooks">View All Books</a> -->
</c:if>
<c:if test="${!empty bookToEdit}">
<h1>Edit</h1>
<form action="update" method=post>
		<div><label for="bookNumber">Book Number</label><input type="text"name="bookNumber" value="${bookToEdit.bookNumber}"readonly="readonly"></div>
		<div><label for="bookName">Book Name</label> <input type="text"name="bookName" value="${bookToEdit.bookName}"></div>
		<div><label for="authorName">Author Name</label> <input type="text"name="authorName" value="${bookToEdit.authorName}"></div>
		<div><label for="price">Book Price</label> <input type="text"name="price"  value="${bookToEdit.price}"></div>
	<div><input type="submit" value="update"></div>
	</form>
</c:if>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>