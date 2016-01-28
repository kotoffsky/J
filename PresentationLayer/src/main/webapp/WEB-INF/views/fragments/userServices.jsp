<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:if test="${!empty userServicesOffert}">
<div class="row">
	<div class="col-md-12">
		<section class="widget">
			<header>
				<h4>
					Je <span class="fw-semi-bold">fournis</span>
				</h4>

			</header>
			<div class="body">
				<table class="table table-striped">
					<tbody>
						<c:forEach var="userService" items="${userServicesOffert}">
						
							<tr>
								<td>${userService.service.title}<a href="${pageContext.request.contextPath}/remove/${userService.id}"><i
										class="glyphicon glyphicon-remove pull-right"></i></a>
								</td>

							</tr>
						</c:forEach>
					</tbody>

				</table>
			</div>
		</section>
	</div>
</div>
</c:if>
<c:if test="${!empty userServicesDemande}">
<div class="row">
	<div class="col-md-12">
		<section class="widget">
			<header>
				<h4>
					Je <span class="fw-semi-bold">demande</span>
				</h4>

			</header>
			<div class="body">
				<table class="table table-striped">
					<tbody>
					
						<c:forEach var="userService" items="${userServicesDemande}">
							<tr>
								<td>${userService.service.title}<a href="${pageContext.request.contextPath}/remove/${userService.id}"><i
										class="glyphicon glyphicon-remove pull-right"></i></a>
								</td>

							</tr>
						</c:forEach>
					</tbody>

				</table>
			</div>
		</section>
	</div>
</div>
</c:if>
<a type="button" class="btn btn-success"
	href="${pageContext.request.contextPath}/ajouterService"><span
	class="glyphicon glyphicon-plus"></span>&nbsp;Ajouter un service</a>