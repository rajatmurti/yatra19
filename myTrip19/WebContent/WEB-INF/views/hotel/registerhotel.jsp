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
<sf:form method="post">
			<tr>
				<td>Enter Hotel Name</td>
				<td><input type="text" name="hname" /></td>
			</tr>
			<tr>
				<td>Enter Address</td>
				<td><input type="text" name="address" /></td>
			</tr>
			<tr>
				<td>Enter City</td>
				<td><input type="text" name="city" /></td>
			</tr>
			<tr>
				<td>Enter No of Rooms</td>
				<td><input type="text" name="noOfRooms" /></td>
			</tr>
			<tr>
				<td>Restaurant Facility</td>
				<td><input type="radio" radiobutton name="restoAvail" value="yes" />Yes</td>
				<td><input type="radio" name="restoAvail" value="no" />No</td>
			</tr>
			<tr>
				<td>Swimming pool Facility</td>
				<td><input type="radio" name="swim_pool" value="yes" />Yes</td>
				<td><input type="radio" name="swim_pool" value="no" />No</td>
			</tr>
			<tr>
				<td>Food Available </td>
				<td><input type="radio" name="type" value="veg" />Veg</td>
				<td><input type="radio" name="type" value="nonveg" />Non-Veg</td>
				<td><input type="radio" name="type" value="both" />Both</td>
			</tr>
				<tr>
				<td>Opening Date</td>
				<td><input type="text" name="openingDate" /></td>
			</tr>
			<tr>
				<td>Enter owner Id</td>
				<td><input type="text" name="hoid" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Add Hotel" /></td>
			</tr>
	</sf:form>
		</table>
	

</body>
</html>