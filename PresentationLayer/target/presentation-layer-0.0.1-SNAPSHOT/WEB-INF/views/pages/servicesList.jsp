<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="../fragments/header.jsp" />
<div class="wrap">
	<header class="page-header">
		<div class="navbar"></div>
	</header>
	<div class="container">
		<section class="widget">
				<section class="widget">
</section></div>


<div class="row">
	<div class="col-md-10">
		<h3>${title}</h3>
		<div class="row text-center">
			<c:forEach var="service" items="${services}">
				<div class="col-md-6 col-sm-6 hero-feature">
					<div class="thumbnail">
						<div class="caption">
							<h3>${service.title}</h3>
							<p>${service.description}</p>
							<p>
								<a href="#" class="btn btn-default">Je fournis</a> <a href="#"
									class="btn btn-default">Je demande</a>
							</p>
						</div>
					</div>
				</div>
			</c:forEach>
		</div>
	</div>
	<div class="col-md-2">
		<jsp:include page="../fragments/userServices.jsp" />
	</div>
</div>
<jsp:include page="../fragments/footer.jsp" />