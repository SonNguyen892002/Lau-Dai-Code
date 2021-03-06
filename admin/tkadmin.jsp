<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>

<form action="">

	<div class="black p1">
		<h4>Thông tin tài khoản admin:</h4>

		<div class="row mt">
			<div class="col-xl-4">
				<label for="admin">Loại tài khoản:</label>
			</div>

			<div class="col-xl-7 border">
				<select name="tkadmin" id="admin">
					<option value="1">Quản trị viên tối cao</option>
				</select>
			</div>
		</div>

		<div class="row mt">
			<div class="col-xl-4">
				<label for="user">Tên người dùng:</label>
			</div>

			<div class="col-xl-7 p0">
				<input type="text" name="" id="user" value="Admin">
			</div>
		</div>
		<div class="row mt">
			<div class="col-xl-4">
				<label for="username">Tài khoản:</label>
			</div>

			<div class="col-xl-7 p0">
				<input type="text" name="" id="username" value="Admin">
			</div>
		</div>
		<div class="row mt">
			<div class="col-xl-4">
				<label for="fullpass">Mật khẩu:</label>
			</div>

			<div class="col-xl-7 p0">
				<div class="row">
					<div class="col-xl-11">
						<input type="password" name="" id="fullpass" value="123456">
					</div>
					<div class="col-xl-1 p0" id="btnPassword">
						<i class="fas fa-eye a"></i>
					</div>
				</div>
			</div>
		</div>

		<div class="row mt">
			<div class="col-xl-4">
				<label for="ht">Hiển thị:</label>
			</div>

			<div class="col-xl-7 p0">
				<input type="checkbox" name="" id="ht" checked>
			</div>
		</div>

		<div class="row mt">
			<div class="col-xl-4">
				<label for="qh">Quyền hạn:</label>
			</div>

			<div class="col-xl-7 p0">
				<input id="qh" type="checkbox" name="" id="ht" checked> <label
					for="">Tất cả quyền hạn.</label>
			</div>
		</div>

		<div class="row center mt mb">
			<div class="col-xl-3 col-lg-3 col-sm-3 col-3 p0">
				<input type="button" value="Cập nhật">
			</div>

			<div class="col-xl-3 col-lg-3 col-sm-3 col-3 p0">
				<input type="reset" value="Đặt lại ban đầu">
			</div>
		</div>
	</div>

</form>

<script>
	const btnB = document.querySelector('#menu1 a');
	document.querySelector('#menu1').classList.remove('off');
	document.querySelector('.a1').classList.add('down');
	
	btnB.classList.add('active');

	const btnA = document.querySelector('.t');
	btnA.innerHTML = "Quản lý user >> tài khoản admin:";

	const ipnElement = document.querySelector('#fullpass');
	const btnElement = document.querySelector('#btnPassword');

	// step 2
	btnElement.addEventListener('click', function() {
		// step 3
		const currentType = ipnElement.getAttribute('type');
		// step 4
		ipnElement.setAttribute('type', currentType === 'password' ? 'text'
				: 'password');

		if (currentType === 'password') {
			btnElement.classList.add('b');
		} else {
			btnElement.classList.remove('b');
		}
	});
</script>

<%@ include file="footer.jsp"%>