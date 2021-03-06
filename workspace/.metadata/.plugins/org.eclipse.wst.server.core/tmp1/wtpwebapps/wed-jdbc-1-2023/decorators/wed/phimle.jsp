<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lâu dài coder</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/js/bootstrap.min.js"></script>
<script
	src="<c:url value='/template/paging/jQuery-Bootstrap-Twbs-Pagination/jquery.twbsPagination.js' />"
	type="text/javascript"></script>
</head>
<body>
        	<style type="text/css">
				.pl{
					color: var(--color-orange);
				}
				
				.gh{
					padding: 10px;
				}
			</style>

	<!-- header -->
	<%@ include file="/common/wed/header.jsp"%>
	<!-- header -->

	<div class="col-xl-12 col-lg-12 col-sm-12 col-12">

		<!-- SECTION MOVE -->
		<section class="container p0 top-header">
			<div class="container-title">
				<h1>PHIM LẺ:</h1>
			</div>
			<form action="<c:url value='/phimle'/>" id="formSubmit" method="get">
				<div class="container-slider display-grid gh">
					<c:forEach var="item" items="${fims.listResultFim}">
					<c:if test="${item.sotap == 1}">
							<a href="<c:url value='/move-fim' />" class="product ml">
								<div class="status">
									<h1>Full ${item.sotap}/${item.sotap} vietsub</h1>
								</div> <img src="${item.poster}" alt="">

								<div class="movie-name">
									<h2>${item.tenFim}</h2>
								</div>

								<div class="icon-play">
									<i class="fas fa-play"></i>
								</div>
							</a>
					</c:if>
					</c:forEach>

				</div>
				<ul class="pagination" id="pagination"></ul>
				<input type="hidden" value="" id="page" name="page" /> 
				<input type="hidden" value="" id="maxPageItem" name="maxPageItem" />
			</form>
		</section>

	</div>
	<script type="text/javascript">
		var totalPages = ${fims.totalPage};
		var currentPage = ${fims.page};
		var limit = 10;
		$(function() {
			window.pagObj = $('#pagination').twbsPagination({
				totalPages : totalPages,
				visiblePages : 3,
				startPage : currentPage,
				onPageClick : function(event, page) {
					
					if (currentPage != page) {
					$('#page').val(page);
					$('#maxPageItem').val(limit);
					$('#formSubmit').submit();						
					}

				}
			});
		});
	</script>

	<!-- footer -->
	<%@ include file="/common/wed/footer.jsp"%>
	<!-- footer -->