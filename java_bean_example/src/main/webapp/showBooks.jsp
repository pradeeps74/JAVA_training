<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show Books</title>
<style type="text/css">
table{
border: 2px solid blue;}
tr,td{
border: 2px solid black;
border-collapse: collapse;
}
</style>
</head>
<body>
<!--<c:out value="${book}"/>-->
 <%@include file="header.html" %> 
<%-- <jsp:useBean id="service" class="com.demo.service.BookService" scope="request"></jsp:useBean> --%>
<table>
	<tr>
		<th>Book Number</th>
		<th>Book Name</th>
		<th>Author</th>
		<th>Price</th>
	</tr>
<%-- <c:set var="books" value="${service.findAll()}"/> --%>
<c:forEach items="${books}" var="eachBook">
<tr>
	<td><c:out value="${eachBook.bookNumber}"></c:out></td>
	<td><c:out value="${eachBook.bookName}"></c:out></td>
	<td><c:out value="${eachBook.authorName}"></c:out></td>
	<td><c:out value="${eachBook.price}"></c:out></td>
	<td><a href="edit?id=<c:out value='${eachBook.bookNumber}' />">Edit</a></td>
	<td><a href="delete?id=<c:out value='${eachBook.bookNumber}' />">Delete</a></td>
</tr>
</c:forEach>
</table>
<a href="addBook.jsp">Home</a>
 <jsp:include page="footer.jsp"></jsp:include>
</body>
</html>