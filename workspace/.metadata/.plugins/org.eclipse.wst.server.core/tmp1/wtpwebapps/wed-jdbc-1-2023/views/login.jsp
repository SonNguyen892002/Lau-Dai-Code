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
                    <a class="reply" href="./register.jsp"><i class="fas fa-sign-in-alt"></i>Đăng ký</a>
                </div>
            </div>

            <div class="box-content col-xl-8 col-lg-8 col-sm-10 col-12">
                <form action="" method="post" class="form" id="form-1">
                    <h1>Đăng nhập</h1>

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
                        <button class="button">Đăng nhập</button>
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
                Validator.isRequired('#username'),
                Validator.isRequired('#fullpass'),
                Validator.minLength('#fullpass', 6),
            ],
            onsubmit: function (data) {
                // call api
                console.log(data);
            }
        });
    </script>
</body>
</html>