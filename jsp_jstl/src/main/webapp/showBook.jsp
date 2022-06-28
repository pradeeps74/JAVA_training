<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show Book</title>
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
<table>
	<tr>
		<th>Book NUmber</th>
		<th>Book Name</th>
		<th>Author</th>
		<th>Price</th>
	</tr>
	
	<tr>
	<td>${book.bookNumber}</td>
	<td>${book.bookName}</td>
	<td>${book.authorName}</td>
	<td>${book.price}"</td>
</tr>
</table>
</body>
</html>