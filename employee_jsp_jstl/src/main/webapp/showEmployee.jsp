<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Details</title>
</head>
<body>
<!--<c:out value="${employee}"/>-->

<table>
<tr>
	<th>Id nO</th>
	<th>Employee Id</th>
	<th>Employee Name</th>
	<th>Employee Salary</th>
	</tr>
	<c:forEach items="${employee}" var="eachEmployee">
	<tr>
		<td>${eachEmployee.id}</td>
		<td>${eachEmployee.employeeId}</td>
		<td>${eachEmployee.employeeName}</td>
		<td>${eachEmployee.employeeSalary}</td>
	</tr>
</c:forEach>
</table>
</body>
</html>