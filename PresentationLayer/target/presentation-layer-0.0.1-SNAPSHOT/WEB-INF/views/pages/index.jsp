<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="../fragments/header.jsp" />
<div class="container col-lg-offset-0 voffset40">
	<div class="content">
		<div class="row">
			<div class="col-md-10">
				<section class="widget">
					<header class="jumbotron hero-spacer">
						<h1>A Warm Welcome!</h1>
					</header>
					<div class="list-group">
						<a href="#" class="list-group-item">
							<h4 class="list-group-item-heading">List group item heading</h4>
							<p class="list-group-item-text">Lorem ipsum dolor sit amet,
								consectetur adipisicing elit. Minima non atque iusto maiores
								eveniet quidem iste inventore accusantium quo labore cumque
								excepturi fugiat sequi eaque error architecto ea nemo, obcaecati
								ducimus ad quae voluptatibus praesentium consequuntur. Nihil,
								accusamus placeat mollitia aut eum facere iure numquam quasi
								nulla praesentium magni rerum nobis provident voluptas ea et
								esse temporibus quo similique minima. Impedit nulla odio illo
								necessitatibus culpa, assumenda id, quo accusamus adipisci
								consectetur sint in ducimus fugiat qui nobis deleniti iste.
								Inventore natus magni corrupti repudiandae cumque? Molestias
								dignissimos dolore eos consequatur nulla sit? Libero placeat,
								aliquid accusamus delectus natus incidunt.</p>

						</a> <a href="#" class="list-group-item">
							<h4 class="list-group-item-heading">List group item heading</h4>
							<p class="list-group-item-text">Lorem ipsum dolor sit amet,
								consectetur adipisicing elit. Minima non atque iusto maiores
								eveniet quidem iste inventore accusantium quo labore cumque
								excepturi fugiat sequi eaque error architecto ea nemo, obcaecati
								ducimus ad quae voluptatibus praesentium consequuntur. Nihil,
								accusamus placeat mollitia aut eum facere iure numquam quasi
								nulla praesentium magni rerum nobis provident voluptas ea et
								esse temporibus quo similique minima. Impedit nulla odio illo
								necessitatibus culpa, assumenda id, quo accusamus adipisci
								consectetur sint in ducimus fugiat qui nobis deleniti iste.
								Inventore natus magni corrupti repudiandae cumque? Molestias
								dignissimos dolore eos consequatur nulla sit? Libero placeat,
								aliquid accusamus delectus natus incidunt.</p>
						</a>
					</div>
				</section>
			</div>
			<div class="col-md-2">
				<section class="widget login-widget">
					<c:choose>
						<c:when test="${pageContext.request.userPrincipal.name != null}">
							<jsp:include page="../fragments/userProfile.jsp" />
						</c:when>
						<c:otherwise>
							<jsp:include page="../fragments/login.jsp" />
						</c:otherwise>
					</c:choose>
				</section>
			</div>
		</div>
	</div>
</div>
<jsp:include page="../fragments/footer.jsp" />