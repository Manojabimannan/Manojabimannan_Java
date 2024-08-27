<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>staff Page</title>
</head>
<body style="background-color: AliceBlue">

	<h1 style="text-align: center;">Staff Registration</h1>

	<h3 style="margin: auto; width: 350px;">Please Enter Your Details!</h3>
	<br />

	<form style="margin: auto; width: 350px;" action="staff"
		method="post">

		<div>
			FirstName:<input type="text" name="FirstName" placeholder="FirstName" />
		</div>
		<br>
		<div>
			LastName:<input type="text" name="LastName" placeholder="LastName" />
		</div>
		<br>
		<div>
			PhoneNumber:<input type="text" name="PhoneNumber"
				placeholder="PhoneNumber" />
		</div>
		<br>
		<div>
			Address:<input type="text" name="Address" placeholder="Address" />
		</div>
		<br>
		<div>
			Location:<input type="text" name="Location" placeholder="Location" />
		</div>
		<br>
		<div>
			State:<input type="text" name="State" placeholder="State" />
		</div>
		<br> <input type="submit" value="staffController">

	</form>
	<br>
	<br>
	<br>
	<br>
	<br>

</body>
</html>