<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hotel Registration</title>
</head>
<body>


		<table style="background-color: cyan; margin: auto;">
<sf:form method="post" modelAttribute="hotel">
			<tr>
				<td>Enter Hotel Name</td>
				<td><sf:input path="hname" /></td>
			</tr>
			<tr>
				<td>Enter Address</td>
				<td><sf:input path="address" /></td>
			</tr>
			<tr>
				<td>Enter City</td>
				<td><sf:input path="city" /></td>
			</tr>
			<tr>
				<td>Enter No of Rooms</td>
				<td><sf:input path="noOfRooms" /></td>
			</tr>
			<tr>
				<td>Restaurant Facility</td>
				<td><sf:radiobutton path="restoAvail" value="yes" />Yes</td>
				<td><sf:radiobutton path="restoAvail" value="no" />No</td>
			</tr>
			<tr>
				<td>Swimming pool Facility</td>
				<td><sf:radiobutton path="swim_pool" value="yes" />Yes</td>
				<td><sf:radiobutton path="swim_pool" value="no" />No</td>
			</tr>
			<tr>
				<td>Food Available </td>
				<td><sf:radiobutton  path="type" value="veg" />Veg</td>
				<td><sf:radiobutton  path="type" value="nonveg" />Non-Veg</td>
				<td><sf:radiobutton  path="type" value="both" />Both</td>
			</tr>
				<tr>
				<td>Opening Date</td>
				<td><sf:input path="openingDate" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Update" /></td>
			</tr>
	</sf:form>
		</table>
	

</body>
</html>