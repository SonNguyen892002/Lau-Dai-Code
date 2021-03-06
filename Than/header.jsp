<%@ page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Lâu đài coder</title>
<link rel="stylesheet" href="./style.css">
<link rel="stylesheet" href="./media.css">
<link rel="stylesheet" href="../fontawesome-free-5.15.3-web/css/all.min.css">
<link rel="stylesheet" href="./media.css">
<link href="../paginationjs-master/dist/pagination.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/slick-carousel/1.9.0/slick-theme.min.css" integrity="sha512-17EgCFERpgZKcm0j0fEq1YCJuyAWdz9KUtv1EjVuaOz8pDnh/0nZxmU6BBXwaaxqoi9PQXnRWqlcDB027hgv9A==" crossorigin="anonymous" referrerpolicy="no-referrer" />
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/slick-carousel/1.9.0/slick.min.css" integrity="sha512-yHknP1/AwR+yx26cB1y0cjvQUMvEa2PFzt1c9LlS4pRQ5NOTZFWbhBig+X9G9eYW/8m0/4OXNx8pxJ6z57x0dw==" crossorigin="anonymous" referrerpolicy="no-referrer" />
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
</head>
<body>

	<div class="container">

		<div class="row">

			<div class="col-xl-12 col-lg-12 col-sm-12 col-12">
			    <header id="header" class="heading">
			
			        <!-- HEADING -->
			        <div class="logo-search row">
			
			            <div class="logo col-xl-3 col-lg-3 col-sm-3">
			                <img src="./images/logo.png" alt="">
			            </div>
			
			            <div class="input-search search-none col-xl-6 col-lg-5 col-sm-5">
			                <form id="input-search" action="" method="GET" class="bg">
			                    <div class="input-search__sub row">
			                        <input type="text" name="search" class="col-xl-10 col-lg-10 col-sm-10" placeholder="search...">
			
			                        <button class="icon-saearch col-xl-2 col-lg-2 col-sm-2">
			                            <i class="fas fa-search"></i>
			                        </button>
			
			                    </div>
			                </form>
			            </div>
			
			            <div class="z col-sm-4">
			                <i class="fas fa-bars" id="btn_menu"></i>
			            </div>
			
			            <div class="login-register col-xl-3 col-lg-4 col-sm-12 col-12 none" id="login">
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
			                        <a href="./login.jsp" class="display-flex">
			                            <h2>Đăng nhập</h2>
			                            <div class="iconlogin-register">
			                                <i class="fas fa-sign-in-alt"></i>
			                            </div>
			                        </a>
			                    </div>
			
			                    <div class="register">
			                        <a href="./register.jsp" class="display-flex">
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
			                <li><a href="./home.jsp" class="nav-link tc">Trang chủ</a></li>
			                <li class="tl">
			                    <a href="#" class="display-flex nav-link">
			                        Thể loại
			                        <i class="fas fa-chevron-down"></i>
			                    </a>
			
			                    <div class="tl-sub row">
			                        <ul class="display-grid display-grid___sub">
			                            <li><a href="#">Tâm lý - tình cảm</a></li>
			                            <li><a href="#">Khoa học - viễn tưởng</a></li>
			                            <li><a href="#">Hài hước</a></li>
			                            <li><a href="#">Gia đình</a></li>
			                            <li><a href="#">Cổ trang</a></li>
			                            <li><a href="#">Võ thuật</a></li>
			                            <li><a href="#">Phim thiếu nhi</a></li>
			                            <li><a href="#">Kinh dị</a></li>
			                        </ul>
			                    </div>
			                </li>
			                <li><a href="./phimhot.jsp" class="nav-link ph">Phim hót</a></li>
			                <li><a href="./phimmoi.jsp" class="nav-link pm">Phim mới</a></li>
			                <li><a href="./phimle.jsp" class="nav-link pl">Phim lẻ</a></li>
			                <li><a href="./phimbo.jsp" class="nav-link pb">Phim bộ</a></li>
			                <li><a href="./phimhoathinh.jsp" class="nav-link hh">Hoạt hình</a></li>
			                <li><a href="#" class="nav-link"></a></li>
			            </ul>
			
			
			        </nav>
			    </header>
			</div>
