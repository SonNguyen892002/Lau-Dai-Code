<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Lâu dài coder</title>

<!-- css -->
<link href="<c:url value='/template/wed/css/media.css' />"
	rel="stylesheet" type="text/css" media="all" />
<link href="<c:url value='/template/wed/css/style.css' />"
	rel="stylesheet" type="text/css" media="all" />
<link href="<c:url value='/template/wed/css/index_phim.css' />"
	rel="stylesheet" type="text/css" media="all" />
<link
	href="<c:url value='/template/icon/fontawesome-free-5.15.3-web/css/all.min.css' />"
	rel="stylesheet" type="text/css" media="all" />
<link
	href="<c:url value='/template/paging/paginationjs-master/dist/pagination.css' />"
	rel="stylesheet" type="text/css" media="all" />
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">

</head>
<body>

	<div class="container">

		<div class="row">

<div class="col-xl-12 col-lg-12 col-sm-12 col-12">
	<header id="header" class="heading">

		<!-- HEADING -->
		<div class="logo-search row">

			<div class="logo col-xl-3 col-lg-3 col-sm-3 col-7">
				<img src="<c:url value='/template/images/logo.png' />" alt="">
			</div>

			<div class="input-search search-none col-xl-6 col-lg-5 col-sm-5">
				<form id="input-search" action="" method="GET" class="bg">
					<div class="input-search__sub row">
						<input type="text" name="search"
							class="col-xl-10 col-lg-10 col-sm-10" placeholder="search...">

						<button class="icon-saearch col-xl-2 col-lg-2 col-sm-2">
							<i class="fas fa-search"></i>
						</button>

					</div>
				</form>
			</div>

			<div class="z col-sm-4 col-4">
				<i class="fas fa-bars" id="btn_menu"></i>
			</div>

			<div class="login-register col-xl-3 col-lg-4 col-sm-12 col-12 none"
				id="login">
				<!-- LOGIN RỒI -->
				<!-- <div class="logged">
			                        <div class="logged-name">
			                            <div class="name-sub row">
			                                <h1>Đức Tuấn</h1>
			                                <i class="fas fa-sort-down"></i>
			                            </div>
			                        
			                            <ul class="logger-sub">
			                                <li><a href="#">Thông tin tài khoản</a></li>
			                                <li><a href="#">Đổi mật khẩu</a></li>
			                                <li><a href="#">Đăng xuất</a></li>
			                            </ul>
			                        </div>
			
			                        <div class="avatar">
			                            <img src="./image/anime-ốc sên.jpg" alt="">
			                        </div>
			                </div> -->

				<!-- CHƯA LOGIN -->
				<div class="No-logged-in row">
					<div class="login">
						<a href="<c:url value='/decorators/wed/login.jsp'/>" class="display-flex">
							<h2>Đăng nhập</h2>
							<div class="iconlogin-register">
								<i class="fas fa-sign-in-alt"></i>
							</div>
						</a>
					</div>

					<div class="register">
						<a href="<c:url value='/decorators/wed/register.jsp'/>" class="display-flex">
							<h2>Đăng ký</h2>
							<div class="iconlogin-register">
								<i class="fas fa-user-plus"></i>
							</div>
						</a>
					</div>
				</div>

			</div>
		</div>

		<!-- MENU -->
		<nav class="menu none" id="menu">

			<ul class="display-flex">
				<li><a href="http://localhost:8888/wed-jdbc-1-2022/trang-chu" class="nav-link tc">Trang chủ</a></li>
				<li class="tl"><a href="#" class="display-flex nav-link">
						Thể loại <i class="fas fa-chevron-down"></i>
				</a>

					<div class="tl-sub row">
						<ul class="display-grid display-grid___sub">
							<c:forEach var="item" items="${theloai.listResultTheloai}">
								<li><a href="#">${item.theLoai}</a></li>
							</c:forEach>
						</ul>
					</div></li>
				<li><a href='<c:url value="/phimhot?page=1&maxPageItem=10" />' class="nav-link ph">Phim hót</a></li>
				<li><a href='<c:url value="/phimmoi?page=1&maxPageItem=10" />' class="nav-link pm">Phim mới</a></li>
				<li><a href='<c:url value="/phimle?page=1&maxPageItem=10" />' class="nav-link pl">Phim lẻ</a></li>
				<li><a href='<c:url value="/phimbo?page=3&maxPageItem=10" />' class="nav-link pb">Phim bộ</a></li>
				<li><a href='<c:url value="/phimhoathinh?page=1&maxPageItem=10" />' class="nav-link hh">Hoạt
						hình</a></li>
				<li><a href="#" class="nav-link"></a></li>
			</ul>
		</nav>
	</header>
</div>
