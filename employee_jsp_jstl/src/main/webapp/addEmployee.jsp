<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Employee Form</title>
</head>
<body>
<h1>Employee Form</h1>
<form action="employee" method="post">
	<div><label for="id">Id</label><input type="text" name="id"/></div>
	<div><label for="employeeId">Employee Id No</label><input type="text" name="employeeId" /></div>
	<div><label for="employeeName">Name</label><input type="text" name="employeeName"/></div>
	<div><label for="employeeSalary"> Salary</label><input type="text" name="employeeSalary"/></div>
	<div><input type="submit" value="Submit"></div>
</form>

</body>
</html>