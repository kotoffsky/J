<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <div role="presentation">
    <img class="img-circle" src="<c:url value="/resources/img/avatars/adult_1_240x240.png" />" alt="64x64"
				style="height: 60px;"> ${user.name} ${user.firstName}</div>
			       <h3>Je fournis</h3>
			       	<ul class="list-group">
			       	<c:forEach var="service" items="${userServices}">
			            <li class="list-group-item">
				            <a class="btn btn-xs btn-warning pull-right" href="${pageContext.request.contextPath}/retirerAssociation/${service.id}">
				              <span class="glyphicon glyphicon-trash"></span>
				            </a>
			                <span>${service.title}</span>
			            </li>
					</c:forEach>
					</ul>
					<h3>Je demande</h3>
			       	<ul class="list-group">
			       	<c:forEach var="service" items="${userServices}">
			            <li class="list-group-item">
				            <button class="btn btn-xs btn-warning pull-right">
				              <span class="glyphicon glyphicon-trash"></span>
				            </button>
			                <span>${service.title}</span>
			            </li>
					</c:forEach>
					</ul>
			        <a type="button" class="btn btn-success" href="${pageContext.request.contextPath}/ajouterService"><span class="glyphicon glyphicon-plus"></span>&nbsp;Ajouter un service</a>