<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="row">
	<div class="col-sm-4">
		<div class="text-align-center">
			<img class="img-circle" src="<c:url value="/resources/img/avatars/adult_1_240x240.png" />"
				style="height: 105px;">
		</div>
	</div>
	<div class="col-sm-8">
		<h3 class="mt-sm mb-xs">${user.name} ${user.firstName}</h3>
		<address>
			<strong>${age} , </strong>${user.gender}<br> <abbr title="Work email">e-mail:</abbr> <a
				href="mailto:#">${user.email}</a><br> <abbr
				title="Work Phone">phone:</abbr> ${user.phone}
		</address>
	</div>
</div>