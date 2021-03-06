<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%@ include file="header.jsp" %>

<form action="">

	<div class="black p2">
		<h3>Thông tin chung:</h3>

		<div class="row mt">
			<div class="col-xl-4">
				<h5>Poster phim:</h5>
			</div>

			<div class="col-xl-7 border">
				<input class="p2" type="file" name="" id="">
			</div>
		</div>

		<div class="row mt">
			<div class="col-xl-4">
				<h5>Up video phim:</h5>
			</div>

			<div class="col-xl-7 border">
				<input class="p2" type="file" name="" id="">
			</div>
		</div>

		<div class="row mt">
			<div class="col-xl-4">
				<h5>Up video trailer:</h5>
			</div>

			<div class="col-xl-7 border">
				<input class="p2" type="file" name="" id="">
			</div>
		</div>

		<div class="row mt mb">
			<div class="col-xl-4">
				<h5>Danh mục phim:</h5>
			</div>

			<div class="col-xl-7 border">
				<select name="danhmuc" id="">
					<option value="1">Phim bộ</option>
					<option value="2">Phim lẻ</option>
					<option value="3">Phim hoạt hình</option>
					<option value="4">Phim sắp chiếu</option>
				</select>
			</div>
		</div>
	</div>

	<div class="black p2">
		<h3>Ngôn ngữ Tiếng việt:</h3>

		<div class="row mt">
			<div class="col-xl-4">
				<label for="userfim">Tên phim:</label>
			</div>

			<div class="col-xl-7 p0">
				<input type="text" name="" id="userfim" placeholder="Tên phim">
			</div>
		</div>

		<div class="row mt">
			<div class="col-xl-4">
				<h5>Thể loại phim:</h5>
			</div>

			<div class="col-xl-7 border">
				<select name="danhmuc" id="">
					<option value="1">Tâm lý - tình cảm</option>
					<option value="2">Võ thuật</option>
					<option value="3">Phim Thiếu nhi</option>
					<option value="4">Khoa học - viễn tưởng</option>
					<option value="5">Cổ trang</option>
					<option value="6">Kinh dị</option>
					<option value="7">Hài hước</option>
				</select>
			</div>
		</div>

		<div class="row mt">
			<div class="col-xl-4">
				<label for="loock">Thời gian ra mắt:</label>
			</div>

			<div class="col-xl-7 p0">
				<input type="text" name="" id="loock"
					placeholder="Thời gian ra mắt phim">
			</div>
		</div>

		<div class="row mt">
			<div class="col-xl-4">
				<label for="episode">Số tập:</label>
			</div>

			<div class="col-xl-7 p0">
				<input type="text" name="" id="episode" placeholder="Tổng số tập">
			</div>
		</div>

		<div class="row mt mb">
			<div class="col-xl-4">
				<label for="textar">Nột dung:</label>
			</div>

			<div class="col-xl-7 p0">
				<textarea name="" id="textar" rows="4" placeholder="Nội dung phim"></textarea>
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
	const btnA = document.querySelector('.t');
	document.querySelector('#menu').classList.remove('off');
	document.querySelector('#menu a').classList.add('active');
	document.querySelector('.a').classList.add('down');
	
	btnA.innerHTML = "Quản lý đăng tải >> đăng tải phim:";
</script>

<%@ include file="footer.jsp" %>
