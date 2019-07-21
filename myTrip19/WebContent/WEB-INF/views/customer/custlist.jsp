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
		<c:forEach var="v" items="${requestScope.customer_list}">
			<tr>
				<td>${v.username}</td>
				<td>${v.address}</td>
				<td>${v.city}</td>
				<td>${v.contact}</td>
			</tr>
		</c:forEach>
	</table>
	<h5>
		<a href="<spring:url value='/customer/registercust'/>">Register</a>
	</h5>

</body>
</html>