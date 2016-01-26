<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="fr">
<head>

<title>Exchange</title>
<link href="<c:url value="/resources/img/logo.png" />"
	rel="shortcut icon">

<meta charset="utf-8" />
<link
	href="<c:url value="/resources/lib/font-awesome/css/font-awesome.min.css" />"
	rel="stylesheet">
<link href="<c:url value="/resources/css/ie10mobile.css" />"
	rel="stylesheet">
<!--<link
	href="<c:url value="/resources/lib/bootstrap/css/bootstrap.min.css" />"
	rel="stylesheet">

-->
<link href="<c:url value="/resources/css/application.min.css" />"
	rel="stylesheet">
<!--<link href="<c:url value="/resources/css/hive.css" />" rel="stylesheet">
 <link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
<link href="<c:url value="/resources/css/reset.css" />" rel="stylesheet"> -->
</head>
<body class="">
	<div class="container">
		<header class="page-header">
			<div class="navbar">
				<div class="logo pull-left">

					<h4>
						<a href="${pageContext.request.contextPath}/"> <span class="fa fa-home"></span>&nbsp
							<strong>Echange de Services entre particuliers </strong><small>
								plateforme de rencontre et d'entraide à but non lucratif</small>
						</a>
					</h4>

				</div>
				<c:if test="${pageContext.request.userPrincipal.name != null}">
					<div class="pull-right">

						<ul class="nav navbar-nav navbar-right pull-right">
							<li class="dropdown"><a href="#" title="8 support tickets"
								class="dropdown-toggle" data-toggle="dropdown"> <i
									class="fa fa-group"></i> <span class="count">8</span>
							</a>
								<ul id="support-menu" class="dropdown-menu support" role="menu">
									<li role="presentation"><a href="#" class="support-ticket">
											<div class="picture">
												<span class="label label-important"><i
													class="fa fa-bell-o"></i></span>
											</div>
											<div class="details">Check out this awesome ticket</div>
									</a></li>
									<li role="presentation"><a href="#" class="support-ticket">
											<div class="picture">
												<span class="label label-warning"><i
													class="fa fa-question-circle"></i></span>
											</div>
											<div class="details">"What is the best way to get ...</div>
									</a></li>
									<li role="presentation"><a href="#" class="support-ticket">
											<div class="picture">
												<span class="label label-success"><i
													class="fa fa-tag"></i></span>
											</div>
											<div class="details">This is just a simple notification</div>
									</a></li>
									<li role="presentation"><a href="#" class="support-ticket">
											<div class="picture">
												<span class="label label-info"><i
													class="fa fa-info-circle"></i></span>
											</div>
											<div class="details">12 new orders has arrived today</div>
									</a></li>
									<li role="presentation"><a href="#" class="support-ticket">
											<div class="picture">
												<span class="label label-important"><i
													class="fa fa-plus"></i></span>
											</div>
											<div class="details">One more thing that just happened</div>
									</a></li>
									<li role="presentation"><a href="#"
										class="text-align-center see-all"> See all tickets <i
											class="fa fa-arrow-right"></i>
									</a></li>
								</ul></li>
							<li class="divider"></li>

							<li class="hidden-xs dropdown"><a href="#" title="Account"
								id="account" class="dropdown-toggle" data-toggle="dropdown">
									<i class="fa fa-user"></i>
							</a>
								<ul id="account-menu" class="dropdown-menu account" role="menu">
									<li role="presentation" class="account-picture"><img
										src="img/2.jpg" alt=""> Philip Daineka</li>
									<li role="presentation"><a href="form_account.html"
										class="link"> <i class="fa fa-user"></i> Profile
									</a></li>
									<li role="presentation"><a href="component_calendar.html"
										class="link"> <i class="fa fa-calendar"></i> Calendar
									</a></li>
									<li role="presentation"><a href="#" class="link"> <i
											class="fa fa-inbox"></i> Inbox
									</a></li>
								</ul></li>
							<li class="visible-xs"><a href="#" class="btn-navbar"
								data-toggle="collapse" data-target=".sidebar" title=""> <i
									class="fa fa-bars"></i>
							</a></li>
							<li class="hidden-xs"><a href="j_spring_security_logout"><i
									class="fa fa-sign-out"></i></a></li>
						</ul>

					</div>
				</c:if>
			</div>
		</header>
	</div>