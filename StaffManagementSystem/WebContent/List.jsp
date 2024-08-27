<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Staff</title>
<style>
table, th, td {
	border: 1px solid black;
}

td {
	background-color: Brown;
	border: 1px solid;
}

th {
	background-color: Brown;
	border: 1px solid;
}
</style>
</head>
<body>

	<h3 style="text-align: center;">
		<i>List Staff</i>
	</h3>

	<table style="width: 100%">
		<tr>
			<th>StaffId</th>
			<th>FirstName</th>
			<th>LastName</th>
			<th>Address</th>
			<th>PhoneNumber</th>
			<th>Location</th>
			<th>State</th>
			<th>View</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>

		<c:forEach items="${List}" var="Staff">
			<tr>
				<td>${Staff.staffId}</td>
				<td>${Staff.firstName}</td>
				<td>${Staff.lastName}</td>
				<td>${Staff.address}</td>
				<td>${Staff.phoneNumber}</td>
				<td>${Staff.location}</td>
				<td>${Staff.state}</td>
				<td><a href="view?StaffId=${Staff.staffId}"><i class="fa fa-eye" style="color: black"></i> view</a></td>
				<td><a href="edit?StaffId=${Staff.staffId}"><i class="fa fa-edit" style="color: black"></i> edit</a></td>
				<td><a href="delete?StaffId=${Staff.staffId}"><i class="fa fa-trash-o" style="color: black"></i> delete</a></td>
			</tr>
		</c:forEach>

	</table>

</body>
</html>
