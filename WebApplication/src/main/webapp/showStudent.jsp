<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 style="text-align: center">${heading}</h1>
	<h4>Student List</h4>
	<table>
		<tr>
			<td>Roll Number</td>
			<td>Student Name</td>
			<td>Mark Scored</td>
		</tr>
		<tr>
			<td>${student.rollNumber}</td>
			<td>${student.studentName}</td>
			<td>${student.mark}</td>

		</tr>

	</table>

</body>
</html>