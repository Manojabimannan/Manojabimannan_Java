<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Staff</title>
</head>
<body>
<form action="Edit" method="post">

    <!-- Hidden field to pass the StaffId -->
    <input type='hidden' name='StaffId' value="${Bo.staffId}"/>
 
    <!-- Form fields -->
    FirstName: <input type="text" name="FirstName" value="${Bo.firstName}"/>
    <br>
    LastName: <input type="text" name="LastName" value="${Bo.lastName}"/> 
    <br>
    Address: <input type="text" name="Address" value="${Bo.address}"/>
    <br>
    Location: <input type="text" name="Location" value="${Bo.location}"/> 
    <br>
    State: <input type="text" name="State" value="${Bo.state}"/>
    <br>
    PhoneNumber: <input type="text" name="PhoneNumber" value="${Bo.phoneNumber}"/>
    <br>
    <br>
    <!-- Submit button -->
    <input type="submit" value="Edit">
</form>
</body>
</html>
