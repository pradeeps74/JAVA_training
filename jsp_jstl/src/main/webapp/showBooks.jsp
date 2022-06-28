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
<table>
	<tr>
		<th>Book NUmber</th>
		<th>Book Name</th>
		<th>Author</th>
		<th>Price</th>
	</tr>

<c:forEach items="${books}" var="eachBook">
<tr>
	<td><c:out value="${eachBook.bookNumber}"></c:out></td>
	<td><c:out value="${eachBook.bookName}"></c:out></td>
	<td><c:out value="${eachBook.authorName}"></c:out></td>
	<td><c:out value="${eachBook.price}"></c:out></td>
</tr>
</c:forEach>
</table>
<a href="addBook.jsp">Home</a>
</body>
</html>