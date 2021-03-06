<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ include file="/common/taglib.jsp"%>
<!-- Start menu -->
<section id="mu-menu">
	<nav class="navbar navbar-default" role="navigation">
		<div class="container">
			<div class="navbar-header">
				<!-- FOR MOBILE VIEW COLLAPSED BUTTON -->
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#navbar" aria-expanded="false"
					aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<!-- LOGO -->
				<!-- TEXT BASED LOGO -->
				<a class="navbar-brand" href="index.html"><i
					class="fa fa-university"></i><span>School</span></a>
				<!-- IMG BASED LOGO  -->
				<!-- <a class="navbar-brand" href="index.html"><img src="assets/img/logo.png" alt="logo"></a> -->
			</div>
			<div id="navbar" class="navbar-collapse collapse">
				<ul id="top-menu" class="nav navbar-nav navbar-right main-nav">
					<li class="active"><a href="index.html">Home</a></li>
					<li class="dropdown"><a
						href="<c:url value='dang-ky-mon-hoc'/>">Đăng ký học phần </a>
					<li><a href="gallery.html">Gallery</a></li>

					<li><a href="contact.html">Contact</a></li>

					<c:if test="${MODEL.fullName==null}" >
						<li><a href="<c:url value='/dang-nhap?action=login'/>">Login</a></li>
						<li><a href="<c:url value='/dang-nhap?action=logup'/>">logup</a></li>
					</c:if>

					<c:if test="${MODEL.fullName!=null}" >
						<li><a href="#">${MODEL.fullName}</a></li>
						<li><a href='<c:url value="/thoat?action=logout"/>'> 	
                            Thoát
                        </a></li>
					</c:if>
				</ul>
			</div>
			<!--/.nav-collapse -->
		</div>
	</nav>
</section>
<!-- End menu -->