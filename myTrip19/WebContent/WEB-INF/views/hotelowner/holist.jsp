<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hotel Owner Details</title>
</head>
<body>
<jsp:include page="/header.jsp" />
<h4>Last Action Status : ${requestScope.status}</h4>
	<h3>Hotel Owner Details</h3>
	<table style="background-color: cyan; margin: auto;">
		<c:forEach var="v" items="${requestScope.owner_list}">
			<tr>
				<td>${v.username}</td>
				<td>${v.address}</td>
				<td>${v.city}</td>
				<td><a href="<spring:url value='/hotelowner/updateowner?hoid=${v.hoid}'/>">Update</a></td>
				<td><a href="<spring:url value='/hotelowner/deleteowner?hoid=${v.hoid}'/>">Delete</a></td> 
			</tr>
		</c:forEach>
	</table>
	<h5>
		<a href="<spring:url value='/hotel/registerhotel'/>">Add Hotel</a>
	</h5>

</body>
</html>