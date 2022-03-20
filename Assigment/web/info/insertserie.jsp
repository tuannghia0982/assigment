<%-- 
    Document   : info
    Created on : Mar 14, 2022, 4:00:33 AM
    Author     : tuann
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <title>Thêm Truyện</title>
        <!------ Include the above in your HEAD tag ---------->
    </head>
    

    <div class="container">
	<div class="row">
            <div class="col-md-3 ">
                <a href="../home" style="padding-bottom: 100px">Trang chủ</a>
		<div class="list-group " style="margin-top: 45px">
                <a href="updateinfo" class="list-group-item list-group-item-action">Thông tin</a>
                <a href="changepassword" class="list-group-item list-group-item-action">Đổi mật khẩu</a>
                <a href="../favourite" class="list-group-item list-group-item-action">Yêu thích</a>
                <a href="insertserie" class="list-group-item list-group-item-action active">Thêm truyện</a>
                <a href="../logout" class="list-group-item list-group-item-action">Thoát</a>
                </div> 
            </div>
            <div class="col-md-9">
		<div class="card">
		    <div class="card-body">
		        <div class="row">
		            <div class="col-md-12">
		                <h4>Thêm Truyện</h4>
		                <hr>
		            </div>
		        </div>
		        <div class="row">
		            <div class="col-md-12">
                                <form action="insertserie" method="POST" enctype="multipart/form-data">
                                    <div class="form-group row">
                                        <label for="seriename" class="col-4 col-form-label">Tên ấn phẩm</label> 
                                        <div class="col-8">
      <!--                                  <input id="username" name="username" placeholder="Username" class="form-control here" required="required" type="text">-->
                                            <input id="name" name="seriename" placeholder="Tên Truyện" class="form-control here" type="text" value="">
                                        </div>
                                    </div>
                                    <div class="form-group row">
                                        <label for="author" class="col-4 col-form-label">Tác giả</label> 
                                        <div class="col-8">
                                            <input id="name" name="author" placeholder="Tên tác giả" class="form-control here" type="text" value="">
                                        </div>
                                    </div>
                                    <div class="form-group row">
                                        <label for="country" class="col-4 col-form-label">Quốc gia</label> 
                                        <div class="col-8">
<!--                                            <input  name="country" placeholder="Quốc gia" class="form-control here" type="text" value="">-->
                                            <select name="country">
                                                <c:forEach items="${requestScope.countries}" var="c">
                                                    <option value="${c.id}">${c.name}</option>   
                                                </c:forEach>
                                            </select>
                                            
                                        </div>
                                    </div>
                                    <div class="form-group row">
                                        <label for="category" class="col-4 col-form-label">Thể loại</label> 
                                        <div class="col-8">
                                            <select name="category">
                                                <c:forEach items="${requestScope.categories}" var="c">
                                                    <option value="${c.id}">${c.name}</option>   
                                                </c:forEach>
                                            </select>
                                        </div>
                                    </div> 
                                    <div class="form-group row">
                                        <label for="describle" class="col-4 col-form-label">Mô tả</label> 
                                        <div class="col-8">
                                            <input id="name" name="describle" placeholder="Nhập mô tả" class="form-control here" type="text" value="">
                                        </div>
                                    </div>
                                     <div class="form-group row">
                                        <label for="image" class="col-4 col-form-label">Ảnh</label> 
                                        <div class="col-8">
                                            <input id="name" name="image" placeholder="Ảnh" class="form-control here" multiple type="file" value="">
                                        </div>
                                    </div>
                                    <div class="form-group row">
                                        <div class="offset-4 col-8">
                                            <button name="submit" type="submit" class="btn btn-primary">Thêm Truyện</button>
                                        </div>
                                    </div>
                                </form>
		            </div>
		        </div>
		    </div>
		</div>
            </div>
	</div>
    </div>
</html>
