<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>

<table class="mt mb ">
	<tr>
		<td>Id</td>
		<td>Tên người dùng</td>
		<td>Tài khoản</td>
		<td>Mật khẩu</td>
		<td>Tác vụ</td>
	</tr>

	<tr>
		<th>001</th>
		<th>Tuấn wibu</th>
		<th>Tuanwibu</th>
		<th>123456789</th>
		<th class="row m0 center"><a href="#"
			class="col-xl-4 col-lg-4 col-lg-4 col-4 backgr"><i
				class="far fa-edit"></i></a> <a href="#"
			class="col-xl-4 col-lg-4 col-lg-4 col-4 backgr"><i
				class="far fa-trash-alt"></i></a></th>
	</tr>
	<tr>
		<th>001</th>
		<th>Tuấn wibu</th>
		<th>Tuanwibu</th>
		<th>123456789</th>
		<th class="row m0 center"><a href="#"
			class="col-xl-4 col-lg-4 col-lg-4 col-4 backgr"><i
				class="far fa-edit"></i></a> <a href="#"
			class="col-xl-4 col-lg-4 col-lg-4 col-4 backgr"><i
				class="far fa-trash-alt"></i></a></th>
	</tr>
	<tr>
		<th>001</th>
		<th>Tuấn wibu</th>
		<th>Tuanwibu</th>
		<th>123456789</th>
		<th class="row m0 center"><a href="#"
			class="col-xl-4 col-lg-4 col-lg-4 col-4 backgr"><i
				class="far fa-edit"></i></a> <a href="#"
			class="col-xl-4 col-lg-4 col-lg-4 col-4 backgr"><i
				class="far fa-trash-alt"></i></a></th>
	</tr>
	<tr>
		<th>001</th>
		<th>Tuấn wibu</th>
		<th>Tuanwibu</th>
		<th>123456789</th>
		<th class="row m0 center"><a href="#"
			class="col-xl-4 col-lg-4 col-lg-4 col-4 backgr"><i
				class="far fa-edit"></i></a> <a href="#"
			class="col-xl-4 col-lg-4 col-lg-4 col-4 backgr"><i
				class="far fa-trash-alt"></i></a></th>
	</tr>

</table>

<script>
	const btnA = document.querySelector('.t');
	document.querySelector('#menu1').classList.remove('off');
	document.querySelector('#menu1 .j').classList.add('active');
	document.querySelector('.a1').classList.add('down');
	
	btnA.innerHTML = "Quản lý user >> quản lý user:";
</script>

<%@ include file="footer.jsp"%>