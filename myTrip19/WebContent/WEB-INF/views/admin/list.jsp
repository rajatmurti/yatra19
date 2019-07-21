<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h4>Last Action Status : ${requestScope.status}</h4>
	<h3>Admin Details</h3>
	<table style="background-color: cyan; margin: auto;">
		<c:forEach var="v" items="${requestScope.user_list}">

			<tr>
				<td>${v.username}</td>
				<td>${v.password}</td>
				<td>${v.priviledge}</td>
				<td><a href="<spring:url value='/admin/update?vid=${v.loginId}'/>">Update</a></td>
				<td><a href="<spring:url value='/admin/delete?vid=${v.loginId}'/>">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
	<h5>
		<a href="<spring:url value='/admin/add'/>">Add New Vendor</a>
			<a href="<spring:url value='/hotelowner/registerhowner'/>">Add Hotel Owner</a>
	</h5>

</body>
</html>