<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="../fragments/header.jsp" />
	<a href="j_spring_security_logout">Logout</a>
	<h1>List of All Users</h1>
	<ul>
		<c:forEach var="service" items="${services}">
			<li>${service.title}- ${service.description} -
				${service.startDate} - ${service.endDate}</li>
		</c:forEach>
	</ul>
	<button>Click to fade in boxes</button>

	<br>
	<br>
	<div id="div1"
		style="width: 80px; height: 80px; display: none; background-color: red;"></div>