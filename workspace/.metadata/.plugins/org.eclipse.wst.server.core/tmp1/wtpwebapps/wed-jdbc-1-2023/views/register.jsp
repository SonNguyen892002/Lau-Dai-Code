<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Lâu đài coder</title>
<!-- css -->
<link href="<c:url value='/template/wed/css/style.css' />" rel="stylesheet" type="text/css" media="all" />
<link href="<c:url value='/template/icon/fontawesome-free-5.15.3-web/css/all.min.css' />" rel="stylesheet" type="text/css" media="all" />
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
</head>
<body>

	<div class="container">

		<div class="row">
            
            <div class="col-xl-12 col-lg-12 col-sm-12 col-12">
                <div class="conduct">
                    <a class="reply" href='<c:url value="/trang-chu" />'><i class="fas fa-reply"></i>Quay lại trang chủ</a>
                    <a class="reply" href="./login.jsp"><i class="fas fa-sign-in-alt"></i>Đăng nhập</a>
                </div>
            </div>

            <div class="box-content col-xl-8 col-lg-8 col-sm-12 col-12">
                <form action="" method="post" class="form" id="form-1">
                    <h1>Đăng ký</h1>

                    <div class="form-group">
                        <label for="fullname" class="from-lable">Tên đầy đủ:</label>
                        <div class="dad display-flex">
                            <i class="fas fa-user-edit"></i><input id="fullname" type="text" name="fullname"
                                placeholder="Nhập họ tên">
                        </div>
                        <span class="from-message"></span>
                    </div>

                    <div class="form-group">
                        <label for="username" class="from-lable">Tên tài khoản:</label>
                        <div class="dad display-flex">
                            <i class="fas fa-users"></i><input id="username" type="text" name="username"
                                placeholder="Nhập tài khoản của bạn">
                        </div>
                        <span class="from-message"></span>
                    </div>


                    <div class="form-group">
                        <label for="fullpass" class="from-lable">Nhập mật khẩu:</label>
                        <div class="dad display-flex">
                            <i class="fas fa-key"></i>
                            <input type="password" name="fullpass" id="fullpass" placeholder="*********">
                            <div id="btnPassword">
                                <i class="fas fa-eye a"></i>
                            </div>
                        </div>
                        <span class="from-message"></span>
                    </div>


                    <div class="form-group">
                        <label for="fullpasstwo" class="from-lable">Nhập lại mật khẩu:</label>
                        <div class="dad display-flex">
                            <i class="fas fa-key"></i>
                            <input type="password" name="fullpasstwo" id="fullpasstwo" placeholder="*********">
                        </div>
                        <span class="from-message"></span>
                    </div>

                    <div class="form-group">
                        <label for="fullemail" class="from-lable">Nhập email:</label>
                        <div class="dad display-flex">
                            <i class="fas fa-envelope"></i><input id="fullemail" type="email" name="fullemail"
                                placeholder="Nhập email">
                        </div>
                        <span class="from-message"></span>
                    </div>

                    <div class="form-group">
                        <button class="button">Đăng ký</button>
                    </div>

                    <div class="form-group display-flex">
                        <h2>
                            Bạn chưa có tài khoản google ?
                        </h2>
                        <a class="gg" target="_blank"
                            href="https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp">
                            Tạo ngay
                            <i class="fab fa-google-plus-g"></i>
                        </a>
                    </div>

                </form>
            </div>


        </div>

    </div>

    <script type="text/javascript" src="<c:url value='/template/wed/js/sub.js' />"></script>
    
    <script>
        // mong muốn
        Validator({
            form: '#form-1',
            formGroupSelector: '.form-group',
            errorSelector: '.from-message',
            relus: [
                Validator.isRequired('#fullname', 'Vui lòng nhập đầy đủ thông tin !!!'),
                Validator.isEmail('#fullemail'),
                // Validator.isRequired('#avatar'),
                Validator.minLength('#fullpass', 6),
                Validator.isRequired('#fullpass'),
                Validator.isRequired('#username'),
                // Validator.isRequired('input[name="gender"]'),
                // Validator.isRequired('#province'),
                Validator.isRequired('#fullpasstwo'),
                Validator.isConfirmed('#fullpasstwo', function () {
                    return document.querySelector('#form-1 #fullpass').value;
                }, 'mat khau nhap lai ko chinh xac'),
            ],
            onsubmit: function (data) {
                // call api
                console.log(data);
            }
        });
    </script>
</body>
</html>