<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hotel Owner Registration</title>
</head>
<body>
<sf:form method="post" modelAttribute="hotelOwner">
		<table style="background-color: cyan; margin: auto;">
			<tr>
				<td>Enter User Email</td>
				<td><sf:input  path="username" /></td>
			</tr>
			<tr>
				<td>Enter User Name</td>
				<td><sf:input  path="name" /></td>
			</tr>	
			<tr>
				<td>Enter Address</td>
				<td><sf:input  path="address" /></td>
			</tr>
			<tr>
				<td>Enter City</td>
				<td><sf:input  path="city" /></td>
			</tr>
			<tr>
				<td>Enter Contact No</td>
				<td><sf:input  path="contact" /></td>
			</tr>
			<tr>
				<td>Enter Password</td>
				<td><sf:password path="password" /></td>
			</tr>
			<tr>
				<td>Role</td>
				<td><sf:radiobutton path="role" value="hotelowner" />Hotel Owner</td>
			</tr>
			<tr>
				<td><input type="submit" value="Register" /></td>
			</tr>
		</table>
	</sf:form>

</body>
</html>