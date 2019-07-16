<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
<sf:form method="post" modelAttribute="hotelowner">
		<table style="background-color: cyan; margin: auto;">
			
			<tr>
				<td>Enter Name</td>
				<td><sf:input  path="name" /></td>
			</tr>
			
			<tr>
				<td>Enter User Email</td>
				<td><sf:input  path="username" /></td>
			</tr>
			<tr>
				<td>Enter Password</td>
				<td><sf:password path="password" /></td>
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
				<td>Enter Phone No</td>
				<td><sf:input  path="contact" /></td>
			</tr>
			
			<tr>
				<td>Choose Role</td>
				<td><sf:radiobutton path="role" value="admin" />Admin</td>
				<td><sf:radiobutton path="role" value="owner" />Hotel Owner</td>
				<td><sf:radiobutton path="role" value="agency" />Tourist Agency</td>
			</tr>

			<tr>
				<td><input type="submit" value="Register Me" /></td>


			</tr>
		</table>
	</sf:form>
</body>
</html>