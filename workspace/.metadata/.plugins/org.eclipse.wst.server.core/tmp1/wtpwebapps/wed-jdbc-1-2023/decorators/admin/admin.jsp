<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
				<div id="phanquyen" class="none">
                    <div class="black p2">

                        <div class="row center">
                            <div class="col-xl-6">
                                <form action="#" method="">
                                    <div class="row center">
                                        <div class="col-xl-9 p0">
                                            <input type="text" placeholder="search..." class="p3">
                                        </div>
                                        <div class="col-xl-2 p0 white ct">
                                            <i class="fas fa-search"></i>
                                        </div>
                                    </div>
                                </form>
                            </div>
    
                            <div class="col-xl-3">
                                <a href="#" class="backgr ct">Xem tất cả</a>
                            </div>
    
                            <div class="col-xl-3">
                                <a href="#" class="backgr ct"><i class="fas fa-plus"></i> Thêm
                                    mới</a>
                            </div>
                        </div>
    
                    </div>
    
                    <div class="black p2">
    
                        <table class="mt mb ">
                            <tr>
                                <td>Id</td>
                                <td>Tên người dùng</td>
                                <td>Tài khoản</td>
                                <td>Mật khẩu</td>
                                <td>Quyền hạn</td>
                            </tr>
                            
                            <c:forEach var="item" items="${model.listResult}">
                                <tr>
                                    <th>${item.id}</th>
                                    <th>${item.fullName}</th>
                                    <th>${item.userName}</th>
                                    <th>${item.password}</th>
                                    <th class="row m0 center"><select name="quyenhan" id="">
	                                    <c:if test="${item.roleid == 1}">
	                                        <option value="1" selected="selected">Admin</option>                               
	                                    </c:if>
	                                    <c:if test="${item.roleid == 2}">
	                                        <option value="2" selected="selected">Bình thường</option>
	                                        <option value="3">Quản lý đăng phim</option>   
	                                        <option value="2">Quản lý user</option>  
	                                        <option value="4">Quản lý phim</option>                     
	                                    </c:if>
	                                    <c:if test="${item.roleid == 3}">
	                                        <option value="3" selected="selected">Quản lý user</option>  
	                                        <option value="3">Quản lý đăng phim</option> 
	                                        <option value="4">Quản lý phim</option>  
	                                        <option value="2" >Bình thường</option>                    
	                                    </c:if>
	                                    <c:if test="${item.roleid == 4}">
	                                        <option value="4" selected="selected">Quản lý phim</option>   
	                                        <option value="3">Quản lý đăng phim</option>   
	                                        <option value="2">Quản lý user</option>  
	                                        <option value="2" >Bình thường</option>              
	                                    </c:if>
	                                    <c:if test="${item.roleid == 5}">
	                                        <option value="5" selected="selected">Quản lý đăng phim</option> 
	                                        <option value="2">Quản lý user</option>  
	                                        <option value="4">Quản lý phim</option>  
	                                        <option value="2" >Bình thường</option>                       
	                                    </c:if>
                                    </select></th>
                            	</tr>
                            </c:forEach>
    
                        </table>
    
                        <div class="row center mt mb">
                            <div class="col-xl-4 col-lg-4 col-sm-4 col-4 p0">
                                <input type="button" value="Cập nhật">
                            </div>
                        </div>
                    </div>
                </div>

                <div id="qlfim" class="none">
                    <div class="black p2">

                        <div class="row center">
                            <div class="col-xl-6">
                                <form action="#" method="">
                                    <div class="row center">
                                        <div class="col-xl-9 p0">
                                            <input type="text" placeholder="search..." class="p3">
                                        </div>
                                        <div class="col-xl-2 p0 white ct">
                                            <i class="fas fa-search"></i>
                                        </div>
                                    </div>
                                </form>
                            </div>
                    
                            <div class="col-xl-3">
                                <a href="#" class="backgr ct">Xem tất cả</a>
                            </div>
                    
                            <div class="col-xl-3">
                                <a href="#" class="backgr ct"><i class="fas fa-plus"></i> Thêm
                                    mới</a>
                            </div>
                        </div>
                    
                    </div>
                    
                    <div class="black p2 hidden">
                    
                        <table class="mt mb ">
                            	<tr>
	                                <td>Id phim</td>
	                                <td>Tên phim</td>
	                                <td>Thể loại</td>
	                                <td>Tác vụ</td>
	                            </tr>
	                            
                         	   <c:forEach var="item" items="${fims.listResultFim}">
                                <tr>
	                                <th>${item.id}</th>
	                                <th>${item.tenFim}</th>
	                                <c:if test="${item.theloaiId == 1}">
	                                	<th>Tâm lý - tình cảm</th>
	                                </c:if>
	                                <c:if test="${item.theloaiId == 2}">
	                                	<th>Khoa học - viễn tưởng</th>
	                                </c:if>
	                                <c:if test="${item.theloaiId == 3}">
	                                	<th>Kinh dị</th>
	                                </c:if>
	                                <c:if test="${item.theloaiId == 4}">
	                                	<th>Hài hước</th>
	                                </c:if>
	                                <c:if test="${item.theloaiId == 5}">
	                                	<th>Cổ trang</th>
	                                </c:if>
	                                <c:if test="${item.theloaiId == 6}">
	                                	<th>Võ thuật</th>
	                                </c:if>
	                                <c:if test="${item.theloaiId == 7}">
	                                	<th>Thiếu nhi</th>
	                                </c:if>
	                                
	                                <th class="row m0 center"><a href="#"
	                                    class="col-xl-4 col-lg-4 col-sm-4 col-4 backgr"><i
	                                        class="far fa-edit"></i></a> <a href="#"
	                                    class="col-xl-4 col-lg-4 col-sm-4 col-4 backgr"><i
	                                        class="far fa-trash-alt"></i></a></th>
                            	</tr>
                            </c:forEach>
                        </table>
                    
                    </div>
                </div>

                <div id="tkadmin" class="none">
                    <div class="black p2">

                        <form action="">
                    
                            <div class="black p1">
                                <h4>Thông tin tài khoản admin:</h4>
                    
                   			<c:forEach var="item" items="${model.listResult}">
                   			<c:if test="${item.roleid == 1}">
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
                                        <input type="text" name="" id="user" value="${item.fullName}">
                                    </div>
                                </div>
                                <div class="row mt">
                                    <div class="col-xl-4">
                                        <label for="username">Tài khoản:</label>
                                    </div>
                    
                                    <div class="col-xl-7 p0">
                                        <input type="text" name="" id="username" value="${item.userName}">
                                    </div>
                                </div>
                                <div class="row mt">
                                    <div class="col-xl-4">
                                        <label for="fullpass">Mật khẩu:</label>
                                    </div>
                    
                                    <div class="col-xl-7 p0">
                                        <div class="row">
                                            <div class="col-xl-11">
                                                <input type="password" name="" id="fullpass" value="${item.password}">
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
                            </c:if>
                            </c:forEach>
                            
                            </div>
                    
                        </form>
                    
                    </div>
                </div>

                <div id="qluser" class="none">
                    <div class="black p2">

                        <div class="row center">
                            <div class="col-xl-6">
                                <form action="#" method="">
                                    <div class="row center">
                                        <div class="col-xl-9 p0">
                                            <input type="text" placeholder="search..." class="p3">
                                        </div>
                                        <div class="col-xl-2 p0 white ct">
                                            <i class="fas fa-search"></i>
                                        </div>
                                    </div>
                                </form>
                            </div>
                    
                            <div class="col-xl-3">
                                <a href="#" class="backgr ct">Xem tất cả</a>
                            </div>
                    
                            <div class="col-xl-3">
                                <a href="#" class="backgr ct"><i class="fas fa-plus"></i> Thêm
                                    mới</a>
                            </div>
                        </div>
                    
                    </div>
                    
                    <div class="black p2">
                    
                        <table class="mt mb ">
                            <tr>
                                <td>Id</td>
                                <td>Tên người dùng</td>
                                <td>Tài khoản</td>
                                <td>Mật khẩu</td>
                                <td>Tác vụ</td>
                            </tr>
                            
                            <c:forEach var="item" items="${model.listResult}">
                            
                                <tr>
                                    <th>${item.id}</th>
                                    <th>${item.fullName}</th>
                                    <th>${item.userName}</th>
                                    <th>${item.password}</th>
                                    <th class="row m0 center"><a href="#"
                                        class="col-xl-4 col-lg-4 col-lg-4 col-4 backgr"><i
                                            class="far fa-edit"></i></a> <a href="#"
                                        class="col-xl-4 col-lg-4 col-lg-4 col-4 backgr"><i
                                            class="far fa-trash-alt"></i></a>
                                    </th>
                            	</tr>                            
                           
                            </c:forEach>
                            
                    
                        </table>
                    </div>
                </div>

                <div id="dtfim" class="">
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
                                    <select name="theloai" id="">
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
                                    <label for="st">Số tập:</label>
                                </div>
                    
                                <div class="col-xl-7 p0">
                                    <input type="text" name="" id="st" placeholder="Tổng số tập">
                                </div>
                            </div>
                    
                            <div class="row mt">
                                <div class="col-xl-4">
                                    <label for="dv">Diễn viên:</label>
                                </div>
                    
                                <div class="col-xl-7 p0">
                                    <input type="text" name="" id="dv" placeholder="Tên diễn viên trong bộ phim">
                                </div>
                            </div>
                            
                            <div class="row mt">
                                <div class="col-xl-4">
                                    <label for="qg">Quốc gia:</label>
                                </div>
                    
                                <div class="col-xl-7 p0">
                                    <input type="text" name="" id="qg" placeholder="Tên quốc gia">
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
                </div>