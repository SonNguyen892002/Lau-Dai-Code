<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<table class="mt mb ">
	<tr>
		<td>Id phim</td>
		<td>Tên phim</td>
		<td>Thể loại</td>
		<td>Tác vụ</td>
	</tr>

	<tr>
		<th>001</th>
		<th>Nơi Tuấn wibu đến</th>
		<th>Hành động</th>
		<th class="row m0 center"><a href="#"
			class="col-xl-4 col-lg-4 col-sm-4 col-4 backgr"><i
				class="far fa-edit"></i></a> <a href="#"
			class="col-xl-4 col-lg-4 col-sm-4 col-4 backgr"><i
				class="far fa-trash-alt"></i></a></th>
	</tr>

</table>

<script>
	const btnA = document.querySelector('.t');
	document.querySelector('#menu').classList.remove('off');
	document.querySelector('#menu .l').classList.add('active');
	document.querySelector('.a').classList.add('down');
	
	btnA.innerHTML = "Quản lý đăng tải >> quản lý phim:";
</script>

<%@ include file="footer.jsp" %>