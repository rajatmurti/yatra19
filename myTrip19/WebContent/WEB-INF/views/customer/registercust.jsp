<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Registration</title>
</head>
<body>
<sf:form method="post" modelAttribute="customer">
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
				<td>Enter Date Of Birth (yyyy-mm-dd)</td>
				<td><jsp:useBean id="date" class="java.util.Date"/>
				   <fmt:formatDate value="${date}" type="date" pattern="yyyy-MM-dd"/></td>
			</tr>
			<tr>
				<td>Enter Contact No</td>
				<td><sf:input  path="contact" /></td>
			</tr>
				<tr>
				<td>Enter Pan No</td>
				<td><sf:input  path="panno" /></td>
			</tr>
				<tr>
				<td>Enter Debit Card</td>
				<td><sf:input  path="debitcard" /></td>
			</tr>
			<tr>
				<td>Enter Credit Card</td>
				<td><sf:input  path="creditcard" /></td>
			</tr>
			<tr>
				<td>Role</td>
				<td><sf:radiobutton path="role" value="user" />User</td>
			</tr>
			<tr>
				<td><input type="submit" value="Register" /></td>
			</tr>
		</table>
	</sf:form>

</body>
</html>