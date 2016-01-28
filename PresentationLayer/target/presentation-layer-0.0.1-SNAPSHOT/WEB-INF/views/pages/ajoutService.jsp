<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../fragments/header.jsp" />
<div class="container col-lg-offset-0 voffset40">
	<div class="container">
		<div class="content">
			<div class="row">
				<section class="widget col-xs-12 col-sm-8 col-lg-offset-2 voffset80">
					<header>
					<fieldset>
								<legend class="section"> <h5>
							<i class="fa fa-plus-circle"></i> Ajouter une compétence
						</h5></legend>

							</fieldset>
						
					</header>
					
						

							
							<div class="body">
							<form:form id="user-form" modelAttribute="service" class="form-horizontal form-label-left"
							novalidate="novalidate" method="post">
							<fieldset>
								<div class="form-group">
									<label class="control-label col-sm-4" for="first-name">Prénom <span class="required">*</span>
									</label>
									<div class="col-sm-8">
										<form:input type="text" path="" id="first-name" name="first-name"
											required="required" class="form-control input-transparent"/>
									</div>
								</div>
								<div class="form-group">
									<label class="control-label col-sm-4" for="last-name">
										Nom <span class="required">*</span>
									</label>
									<div class="col-sm-8">
										<form:input type="text" path="" id="last-name" name="last-name"
											required="required" class="form-control input-transparent"/>
									</div>
								</div>
								<div class="form-group">
									<label class="control-label col-sm-4">Genre</label>
									<div class="col-sm-8">
										<div id="gender" class="btn-group" data-toggle="buttons">
											<label class="btn btn-default"
												data-toggle-class="btn-primary"
												data-toggle-passive-class="btn-default"> 
											<form:radiobutton path="" value="male" />Masculin 
												&nbsp;
											</label> 
											<label class="btn btn-primary active"
												data-toggle-class="btn-primary"
												data-toggle-passive-class="btn-default"> 
												<form:radiobutton path="" value="female" />Féminin
											</label>
										</div>
									</div>
								</div>
								<div class="form-group">
									<label for="date-of-birth" class="control-label col-sm-4">Date
										de naissance <span class="required">*</span>
									</label>
									<div class="col-sm-6">
										<form:input path="" id="date-of-birth"
											class="date-picker form-control input-transparent"
											required="required" type="text" name="date-of-birth" value=""/>
									</div>
								</div>
							</fieldset>
							</form:form>
						</section>
					</div>
				
			</div>
		</div>
	</div>
<script src="<c:url value="/resources/lib/jquery/dist/jquery.min.js"/>"></script>
<script src="<c:url value="/resources/lib/jquery-pjax/jquery.pjax.js"/>"></script>
<script
	src="<c:url value="/resources/lib/bootstrap-sass/assets/javascripts/bootstrap.min.js"/>"></script>
<script src="<c:url value="/resources/lib/widgster/widgster.js"/>"></script>
<script src="<c:url value="/resources/lib/underscore/underscore.js"/>"></script>
<script src="<c:url value="/resources/js/app.js"/>"></script>
<script src="<c:url value="/resources/js/settings.js"/>"></script>
<script
	src="<c:url value="/resources/lib/bootstrap-select/dist/js/bootstrap-select.min.js" />"></script>
<script src="<c:url value="/resources/js/lib/jquery-ui.js"/>"></script>
<script src="<c:url value="/resources/lib/select2/select2.min.js"/>"></script>
<script src="<c:url value="/resources/lib/moment/moment.js"/>"></script>
<script
	src="<c:url value="/resources/lib/eonasdan-bootstrap-datetimepicker/build/js/bootstrap-datetimepicker.min.js"/>"></script>
<script
	src="<c:url value="/resources/lib/parsleyjs/dist/parsley.min.js"/>"></script>
<script src="<c:url value="/resources/js/forms-account.js" />"></script>
<script src="<c:url value="/resources/lib/magnific-popup/dist/jquery.magnific-popup.min.js"/>"></script>
<script src="<c:url value="/resources/js/component-gallery.js"/>"></script>
<script src="<c:url value="/resources/js/auto-complete.js"/>"></script>
</body>
</html>