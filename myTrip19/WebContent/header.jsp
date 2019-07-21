<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="/myTrip19/index.jsp">Yatra</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Transport <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="#">Bus</a></li>
          <li><a href="#">Train</a></li>
          <li><a href="#">Flight</a></li>
        </ul>
      </li>
      <li><a class="dropdown-toggle" data-toggle="dropdown" href="#">Hotels<span class="caret"></span></a>
      <ul class="dropdown-menu">
          <li><a href="hotel/list">List</a></li>
          <li><a href="hotel/registerhotel">Add Hotel</a></li>
          <li><a href="hotelowner/registerhowner">Register Owner</a></li>
      </ul>
        </li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="customer/registercust"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li><a href="user/login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
    </ul>
  </div>
</nav>

