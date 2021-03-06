<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>admin</title>
    <link href="<c:url value='/template/admin/css/style.css'/>" rel="stylesheet" type="text/css" media="all" />
    <link href="<c:url value='/template/icon/fontawesome-free-5.15.3-web/css/all.min.css'/>" rel="stylesheet" type="text/css" media="all" />
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
    <style>
        .none{
            display: none;
        }
    </style>
</head>

<body>

    <div class="container mb">
        <div class="row">

            <div class="col-xl-12 p0">
                <div class="black p2 ct">
                    <h1>Xin chào "Admin".</h1>
                </div>
            </div>

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
                            <span class="a down">
                                <i class="fas fa-caret-right"></i>
                            </span>
                        </div>
                    </div>

                    <div id="menu" class="">
                        <a href="#" onclick="dtfim()" class="black p2 active">
                            <i class="fas fa-angle-right"></i>
                            <span>Đăng tải phim</span>
                        </a>

                        <a href="#" onclick="qlfim()" class="black p2 l">
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
                        <a href="#" onclick="tkadmin()" class="black p2">
                            <i class="fas fa-angle-right"></i>
                            <span>Tài khoản admin</span>
                        </a>

                        <a href="#" onclick="phanquyen()" class="black p2 k">
                            <i class="fas fa-angle-right"></i>
                            <span>Phân quyền</span>
                        </a>

                        <a href="#" onclick="qluser()" class="black p2 j">
                            <i class="fas fa-angle-right"></i>
                            <span>Quản lý user</span>
                        </a>
                    </div>
                </div>

            </div>

            <div class="col-xl-8 p0">

                <div class="black p2">
                    <a href='<c:url value="/trang-chu"/>' target="_blank">
                        <i class="fas fa-share-square"></i>
                        Đến trang wedsite
                    </a>
                </div>

                <div class="black p2">
                    <span class="t"></span>
                </div>
