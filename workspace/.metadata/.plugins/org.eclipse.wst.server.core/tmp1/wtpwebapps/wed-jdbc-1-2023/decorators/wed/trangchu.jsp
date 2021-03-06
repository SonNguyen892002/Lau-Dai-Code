<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lâu dài coder</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/slick-carousel/1.9.0/slick-theme.min.css" integrity="sha512-17EgCFERpgZKcm0j0fEq1YCJuyAWdz9KUtv1EjVuaOz8pDnh/0nZxmU6BBXwaaxqoi9PQXnRWqlcDB027hgv9A==" crossorigin="anonymous" referrerpolicy="no-referrer" />
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/slick-carousel/1.9.0/slick.min.css" integrity="sha512-yHknP1/AwR+yx26cB1y0cjvQUMvEa2PFzt1c9LlS4pRQ5NOTZFWbhBig+X9G9eYW/8m0/4OXNx8pxJ6z57x0dw==" crossorigin="anonymous" referrerpolicy="no-referrer" />
</head>
<body>
	<div class="martop col-xl-12 col-lg-12 col-sm-12 col-12">
            <style type="text/css">
				.tc{
					color: var(--color-orange);
				}
				
				.gh1{
					max-height: 92vh;
    				overflow: hidden;
				}
				
				.gh{
				    max-height: 110vh;
    				overflow: hidden;
				}
			</style>

				<div class="home-heading row">
					<div class="col-xl-8 col-lg-7 border">

						<div class="home-image">
							<img width="100%" height="380px" id="img"
								src="http://1.bp.blogspot.com/-2RwonJp1_xI/VjYAxj7RDxI/AAAAAAAACfA/YiWdhL9DTb0/s1600/the-avenger-wallpaper-1920x1080%2B%25282%2529.jpg" alt="">
						</div>

						<div class="total-heading display-flex">
							<span class="circle action"></span> <span class="circle"></span>
							<span class="circle"></span> <span class="circle"></span>
						</div>
					</div>

					<div class="col-xl-3 col-lg-4 none">
						<div class="move-oc__one">
							<a href="<c:url value='/move-fim' />"> 
							<img width="100%" src="<c:url value='/template/images/anime-oc-sen.jpg' />" alt="">
								<div class="backgr"></div>
								<h1>Xem ngay</h1>
							</a>
						</div>
						<div class="move-oc__one">
							<a href="<c:url value='/move-fim' />"> 
							<img width="100%" src="<c:url value='/template/images/anime-oc-sen.jpg' />" alt="">
								<div class="backgr"></div>
								<h1>Xem ngay</h1>
							</a>
						</div>
					</div>
				</div>

			</div>

			<div class="col-xl-12 col-lg-12 col-sm-12 col-12 p0">

				<section class="section">

					<!-- TEMPLATE LIST -->

					<div class="container-title">
						<h1>PHIM HÓT:</h1>
					</div>

					<!-- MOVIE IMAGE -->
					<div class="move-new">
						<!-- <div class="icons">
                            <i class="fas fa-chevron-left"></i>
                        </div> -->

						<div class="container-slider container-slider__subport display-grid__for autoplay">

						<c:forEach var="item" items="${fims.listResultFim}">
							
							
							<a href="<c:url value='/move-fim' />" class="product ml">
								<div class="status">
									<h1>Full ${item.sotap}/${item.sotap} vietsub</h1>
								</div> 
								
								<img src="${item.poster}" alt="">

								<div class="movie-name">
									<h2>${item.tenFim}</h2>
								</div>

								<div class="icon-play">
									<i class="fas fa-play"></i>
								</div>
							</a> 
							
						</c:forEach>
							
						</div>

						<!-- <div class="icons">
                            <i class="fas fa-chevron-right"></i>
                        </div> -->
					</div>
				</section>

				<div class="moiandsc row">

					<div class="col-xl-8 col-lg-8">
						<section class="one">

							<!-- TEMPLATE LIST -->

							<div class="container-title row">
								<h1 class="col-xl-8 col-lg-8 col-sm-8 col-5">PHIM MỚI:</h1>

								<button
									class="button suport tranf col-xl-3 col-lg-3 col-sm-3 col-6">
									<a href="<c:url value='/decorators/wed/phimmoi.jsp'/>">Xem thêm</a>
								</button>
							</div>

							<!-- MOVIE IMAGE -->
							<div class="container-slider display-grid__for display-grid--sub gh1">

						<c:forEach var="item" items="${fims.listResultFim}">
							<a href="<c:url value='/move-fim' />" class="product ml">
								<div class="status">
									<h1>full ${item.sotap}/${item.sotap} tập</h1>
								</div> 
								
								<img src="${item.poster}" alt="">

								<div class="movie-name">
									<h2>${item.tenFim}</h2>
								</div>

								<div class="icon-play">
									<i class="fas fa-play"></i>
								</div>
							</a> 
						</c:forEach>
							</div>
						</section>
					</div>

					<div class="col-xl-4 col-lg-4 delete">
						<section class="two">

							<!-- TEMPLATE LIST -->

							<div class="container-title container-title__sub">
								<h1>PHIM SẮP CHIẾU:</h1>
							</div>

							<!-- MOVIE IMAGE -->
							<div class="container-slider container-slider__sub ">

							<c:forEach var="item" items="${fims.listResultFim}">
							<c:if test="${item.danhmucId == 4}">
								<a href="<c:url value='/move-fim' />" class="product-sub row">
									<div class="img-sub col-xl-5 col-lg-5 col-sm-4 col-4">
										<img src="${item.poster}" alt="">
									</div>

									<div class="text-sub col-xl-7 col-lg-7 col-sm-8 col-8">
											<h2>${item.tenFim}</h2>
											<h3>Công chiếu: ${item.fimday}</h3>

											<div class="text-sub__icon">
												<i class="fas fa-star"></i> 
												<i class="fas fa-star"></i>
												<i class="fas fa-star"></i> 
												<i class="fas fa-star"></i>
												<i class="fas fa-star"></i>
											</div>
									</div>
								</a> 
								</c:if>
								</c:forEach>

							</div>
						</section>
					</div>
				</div>

				<section class="container p0">

					<!-- TEMPLATE LIST -->

					<div class="container-title row">
						<h1 class="col-xl-9 col-lg-9 col-sm-5 col-12">PHIM HOẠT HÌNH:</h1>
						<button
							class="button suport tranf search-none col-xl-2 col-lg-2 col-sm-3 col-3">
							<a href="<c:url value='/decorators/wed/phimhoathinh.jsp'/>">Xem thêm</a>
						</button>
					</div>

					<!-- MOVIE IMAGE display-grid-->
					<div class="container-slider display-grid gh">

					<c:forEach var="item" items="${fims.listResultFim}">
					<c:if test="${item.danhmucId == 3}">
							<a href="<c:url value='/move-fim' />" class="product ml">
								<div class="status">
									<h1>Full ${item.sotap}/${item.sotap} vietsub</h1>
								</div> 
								
								<img src="${item.poster}" alt="">

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
				</section>

			</div>
			<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
			<script src="https://cdnjs.cloudflare.com/ajax/libs/slick-carousel/1.9.0/slick.min.js" integrity="sha512-HGOnQO9+SP1V92SrtZfjqxxtLmVzqZpjFFekvzZVWoiASSQgSr4cw9Kqd2+l8Llp4Gm0G8GIFJ4ddwZilcdb8A==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
			
				<script>
					$('.autoplay').slick({
						slidesToShow : 5,
						slidesToScroll : 1,
						autoplay : true,
						autoplaySpeed : 1000,
					});
				</script>			
</body>
</html>