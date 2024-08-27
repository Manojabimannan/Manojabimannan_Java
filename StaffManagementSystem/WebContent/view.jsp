<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Staff</title>
</head>
<Body style="text-align: center; background: DarkBlue">

	<h3 style="text-align: center;">
		<i><b>View Staff</b></i>
	</h3>
	<br>
	<b>StaffId : </b> ${Bo.getStaffId() }
	<br>
	<br>
	<b>FirstName : </b>${Bo.getFirstName() }
	<br>
	<br>
	<b>LastName : </b>${Bo.getLastName() }
	<br>
	<br>
	<b>PhoneNumber : </b>${Bo.getPhoneNumber() }
	<br>
	<br>
	<b>Address :</b>${Bo.getAddress() }
	<br>
	<br>
	<b>State :</b>${Bo.getState() }
	<br>
	<br>
	<b>Location :</b>${Bo.getLocation() }


	<br>
	<br>
	<h3 style="text-align: center;">
		<a href='list'>Back To List</a>
	</h3>
</Body>
</html>