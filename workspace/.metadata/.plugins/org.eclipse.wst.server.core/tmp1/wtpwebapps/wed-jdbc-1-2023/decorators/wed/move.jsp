<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<%@ include file="/common/wed/header.jsp"%>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/slick-carousel/1.9.0/slick-theme.min.css" integrity="sha512-17EgCFERpgZKcm0j0fEq1YCJuyAWdz9KUtv1EjVuaOz8pDnh/0nZxmU6BBXwaaxqoi9PQXnRWqlcDB027hgv9A==" crossorigin="anonymous" referrerpolicy="no-referrer" />
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/slick-carousel/1.9.0/slick.min.css" integrity="sha512-yHknP1/AwR+yx26cB1y0cjvQUMvEa2PFzt1c9LlS4pRQ5NOTZFWbhBig+X9G9eYW/8m0/4OXNx8pxJ6z57x0dw==" crossorigin="anonymous" referrerpolicy="no-referrer" />


<div class="col-xl-12 col-lg-12 col-sm-12 col-12">
                

            <div class="col-xl-12 col-lg-10 col-sm-12 col-12 mt">

                <div class="row">
                    <div class="col-xl-8 black mart pt">
                        <nav class="Than_web_phim_va_noi_dung">
                            <!-- phim và nội dung -->

                            <div class="Than_web--phim_va_noi_dung-Phan_tren row  col-xl-12 col-lg-12 col-sm-12 m0">
                                <div
                                    class="Than_web--phim_va_noi_dung-Phan_tren--anh_phim col-xl-6 col-lg-6 col-sm-6 col-11">
                                    <img src="https://ss-images.saostar.vn/wp700/2019/05/19/5227233/2.jpg" alt=""
                                        class="img_phim ">

                                    <div class="row center">
                                        <div class="col-xl-5 ct blue">
                                            <a href="#"> Traler</a>
                                        </div>
                                        <div class="col-xl-5 ct cam">
                                            <a href="#"> Xem ngay</a>
                                        </div>

                                    </div>

                                </div>

                                <div class="Than_web--phim_va_noi_dung-Phan_tren--ten_phim col-xl-6 col-lg-6 col-sm-6">
                                    
                                    <ul class="thong_tin_chi_tiet xam">
                                        <li class="colcam">Nơi Tình Yêu dậy sóng</li>
                                        <li>Trạng Thái: tập 16 Vietsub</li>
                                        <li>Sắp Chiếu: tập 17 Vietsub</li>
                                        <li>Thời Lượng: 50 phút / tập</li>
                                        <li>Số Tập: 20 tập</li>
                                        <li>Tình trạng: Phim đang chiếu</li>
                                        <li>Ngôn Ngữ: Phụ đề Việt</li>
                                        <li>Năm sản xuất: 2021</li>
                                        <li>Quốc gia: Nhật</li>
                                        <li>Thể Loại: Hàng Động</li>
                                    </ul>

                                    <div class="danh_gia xam">
                                            <span class="dg">Đánh giá:</span>
                                            <span>5/5</span>
                                            <i class="fas fa-star sao_danh_gia"></i>
                                            <i class="fas fa-star sao_danh_gia"></i>
                                            <i class="fas fa-star sao_danh_gia"></i>
                                            <i class="fas fa-star sao_danh_gia"></i>
                                            <i class="fas fa-star sao_danh_gia"></i>
                                    </div>
                                </div>
                            </div>

                            <div class="Than_web-phim_va_noi_dung-Phan_duoi col-xl-12 col-lg-12 col-sm-12 ">

                                <h1 class="colcam">Nội Dung Phim: </h1>

                                <p>Nơi Tình Yêu Dậy Sóng xoay quanh mối tình của Panin và Arissara. Cả hai gặp nhau ở
                                    tỉnh
                                    Rayong khi cô giúp anh lúc bị bọn trộm tấn công. Panin bị ấn tượng bởi sự hào phóng
                                    của
                                    Arissara.
                                    Còn cô bị ấn tượng bởi sự chính trực của Panin. Khi họ trở về Bangkok, Arissara phát
                                    hiện ra
                                    rằng Panin đã lừa cô về hoàn cảnh thực sự của mình và Panin
                                    phát hiện ra rằng cô là 'người tình trong mộng' của em trai mình, Yoh. Vì vậy, cả
                                    hai
                                    đều
                                    tức giận. Những hiểu lầm càng thêm lớn cùng với tình yêu ám ảnh của Yoh dành cho
                                    Arissara,
                                    còn Panin đấu tranh với ý tưởng nhường
                                    người mình yêu cho em trai.</p>

                            </div>

                        </nav>
                    </div>

                    <!-- đây là phần phim sắp chiếu -->
                    <div class="col-xl-4 col-lg-4 delete">
                        <section class="two pr">

                            <!-- TEMPLATE LIST -->

                            <div class="container-title container-title__sub">
                                <h1>PHIM SẮP CHIẾU:</h1>
                            </div>

                            <!-- MOVIE IMAGE -->
                            <div class="container-slider container-slider__sub heigh">

                                <c:forEach var="item" items="${fims.listResultFim}">
                                    <a href="<c:url value='/move-fim' />" class="product-sub row">
                                        <div class="img-sub col-xl-5 col-lg-5 col-sm-4 col-4">
                                            <img src="https://ss-images.saostar.vn/wp700/2019/05/19/5227233/2.jpg"
                                                alt="">
                                        </div>

                                        <div class="text-sub col-xl-7 col-lg-7 col-sm-8 col-8">
                                            <h2>${item.tenFim} </h2>
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
                                </c:forEach>

                            </div>
                        </section>
                    </div>
                </div>
            </div>

            <nav class="col-xl-12 black commets">

                <div class="commets_binh_luan">
                    <h1>Bình Luận:</h1>
                </div>

                <form action="" class="mart">
                    <div class="row">
                        <div class="col-xl-10">
                            <input type="text" placeholder="Viết Bình Luận" class="w1">
                        </div>
    
                        <div class="col-xl-2">
                            <button class="w1 cam">Đăng</button>
                        </div>
                    </div>
                </form>

                <!-- đây là phần hiện người commets -->

                <div class="row mart">

                    <div class="col-xl-12">
                        <div class="row">
                            <div class="col-xl-1 p0">
                                <img src="https://ss-images.saostar.vn/wp700/2019/05/19/5227233/2.jpg" alt="Rem-Avatar" class="Rem_Avatar">
                            </div>

                            <div class="col-xl-2 p0">
                                <h3 class="ten_Nguoi_commets">Rem</h3>
                            </div>

                        </div>
                    </div>

                    <div class="col-xl-12">
                        <p class="cmt">Hóng ss2 của bộ này </p>
                    </div>

                </div>

            </nav>
            
            <div class="black mart ptb">
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
			
<%@ include file="/common/wed/footer.jsp"%>
			