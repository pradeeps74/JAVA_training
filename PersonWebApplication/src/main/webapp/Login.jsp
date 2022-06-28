<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<form action="show" style="align-content: center;" method="post">

		<label>FirstName</label> <input type="text" name="firstName"><br>
		<label>LastName</label> <input type="text" name="lastName"><br>

		<label>Hobbies</label><br>
		<div>
			<input type="checkbox" id="check1" name="Hobbies" value="chess">Chess<br>
			<input type="checkbox" id="check2" name="Hobbies" value="carrom">Carrom<br>
			<input type="checkbox" id="check3" name="Hobbies" value="footBall">Foot ball<br>
		</div>
		<div>
			<label>Qualification</label><br> 
			<input type="radio"name="qualification" value="Engineering">Engineering<br> 
			<input type="radio" name="qualification" value="Arts">Arts<br> 
			<input type="radio" name="qualification" value="Others">Others<br>
		</div>
		<input type="submit" value="submit">
	</form>
</body>
</html>