<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>

<table class="mt mb ">
	<tr>
		<td>Id</td>
		<td>Tên người dùng</td>
		<td>Tài khoản</td>
		<td>Mật khẩu</td>
		<td>Quyền hạn</td>
	</tr>

	<tr>
		<th>001</th>
		<th>Tuấn wibu</th>
		<th>Tuanwibu</th>
		<th>123456789</th>
		<th class="row m0 center"><select name="quyenhan" id="">
				<option value="1">Bình thường</option>
				<option value="2">Quản lý user</option>
				<option value="3">Quản lý đăng phim</option>
				<option value="4">Quản lý phim</option>
		</select></th>
	</tr>
	<tr>
		<th>001</th>
		<th>Tuấn wibu</th>
		<th>Tuanwibu</th>
		<th>123456789</th>
		<th class="row m0 center"><select name="danhmuc" id="">
				<option value="1">Bình thường</option>
				<option value="2">Quản lý user</option>
				<option value="3">Quản lý đăng phim</option>
				<option value="4">Quản lý phim</option>
		</select></th>
	</tr>
	<tr>
		<th>001</th>
		<th>Tuấn wibu</th>
		<th>Tuanwibu</th>
		<th>123456789</th>
		<th class="row m0 center"><select name="danhmuc" id="">
				<option value="1">Bình thường</option>
				<option value="2">Quản lý user</option>
				<option value="3">Quản lý đăng phim</option>
				<option value="4">Quản lý phim</option>
		</select></th>
	</tr>

</table>

<div class="row center mt mb">
	<div class="col-xl-4 col-lg-4 col-sm-4 col-4 p0">
		<input type="button" value="Cập nhật">
	</div>
</div>
</table>

<script>
	const btnA = document.querySelector('.t');
	document.querySelector('#menu1').classList.remove('off');
	document.querySelector('#menu1 .k').classList.add('active');
	document.querySelector('.a1').classList.add('down');
	
	btnA.innerHTML = "Quản lý user >> phân quyền:";
	

</script>

<%@ include file="footer.jsp"%>