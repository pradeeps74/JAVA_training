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
	<table border="1":>
		<tr>
		<th><td>First Name</td></th>
		<th><td>Last Name</td></th>
		<th><td>Hobbies</td></th>
		<th><td>Qualification</td></th>
		</tr>
		<tr>
		<th><td>${person.firstName}</td></th>
		<th><td>${person.lastName}</td></th>
		<th><td>${person.hobbies[0]} ${person.hobbies[1]} ${person.hobbies[2]}</td></th>
		<th><td>${person.qualification}</td></th>

		</tr>

	</table>

</body>
</html>