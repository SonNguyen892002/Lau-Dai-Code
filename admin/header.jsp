<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>admin</title>
    <link rel="stylesheet" href="./styleadmin.css">
    <link rel="stylesheet" href="../fontawesome-free-5.15.3-web/css/all.min.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
</head>
<body>

    <div class="container mb">
        <div class="row">

            <div class="col-xl-4 p0">

                <div class="black p2 sz">
                    <i class="fab fa-viadeo-square"></i> 
                    Administrator
                </div>

                <div class="black p2">
                    <i class="fas fa-home"></i> 
                    Trang chủ
                </div>

                <!-- QUẢN LÝ ĐĂNG TẢI -->
                <div class="black p2">
                    <div id="btn" onclick="Button()" class="row">
                        <div class="col-xl-1">
                            <i class="far fa-clock"></i> 
                        </div>
    
                        <div class="col-xl-9">
                            <span>
                                Quản lý đăng tải 
                            </span>
                        </div>
    
                        <div class="col-xl-2">
                            <span class="a">
                                <i class="fas fa-caret-right"></i>
                            </span>
                        </div>
                    </div>

                    <div id="menu" class="off">
                        <a href="./dangtaiphim.jsp" class="black p2">
                            <i class="fas fa-angle-right"></i>
                            <span>Đăng tải phim</span>
                        </a>

                        <a href="./qlphim.jsp" class="black p2 l">
                            <i class="fas fa-angle-right"></i>
                            <span>Quản lý phim</span>
                        </a>
                    </div>
                </div>

                <!-- CẤU HÌNH USER -->
                <div class="black p2">
                    <div id="btn" onclick="Button1()" class="row">
                        <div class="col-xl-1 col-lg-1 col-sm-1 col-1">
                            <i class="fas fa-users"></i> 
                        </div>
    
                        <div class="col-xl-9 col-lg-9 col-sm-9 col-9">
                            <span>
                                Cấu hình user
                            </span>
                        </div>
    
                        <div class="col-xl-2 col-lg-2 col-sm-2 col-2">
                            <span class="a1">
                                <i class="fas fa-caret-right"></i>
                            </span>
                        </div>
                    </div>

                    <div id="menu1" class="off">
                        <a href="./tkadmin.jsp" class="black p2">
                            <i class="fas fa-angle-right"></i>
                            <span>Tài khoản admin</span>
                        </a>

                        <a href="./phanquyen.jsp" class="black p2 k">
                            <i class="fas fa-angle-right"></i>
                            <span>Phân quyền</span>
                        </a>
                        
                        <a href="./qluser.jsp" class="black p2 j">
                            <i class="fas fa-angle-right"></i>
                            <span>Quản lý user</span>
                        </a>
                    </div>
                </div>

            </div>

            <div class="col-xl-8 p0">

                <div class="black p2">
                    <a href="../wed/home.jsp" target="_blank">
                        <i class="fas fa-share-square"></i> 
                        Đến trang wedsite
                    </a>
                </div>

                <div class="black p2">
                    <span class="t">Quản lý đăng tải >></span>
                </div>
                
                <div class="black p2">
