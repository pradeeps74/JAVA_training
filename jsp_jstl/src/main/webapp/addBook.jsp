<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Book</title>
</head>
<body>
	<form action="findBooks" method="post">
		<div><label for="bookNumber">Book Number</label><input type="text"name="bookNumber" /></div>
		<div><label for="bookName">Book Name</label> <input type="text"name="bookName" /></div>
		<div><label for="authorName">Author Name</label> <input type="text"name="authorName" /></div>
		<div><label for="price">Book Price</label> <input type="text"name="price" /></div>
	<div><input type="submit" value="submit"></div>
	</form>
	<a href="findByName.jsp">Find Book</a>
<a href="findBooks">View All Books</a>
	
</body>
</html>