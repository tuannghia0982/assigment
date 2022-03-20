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
        <title>Đổi mật khẩu</title>
        <meta charset="utf-8">
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <!------ Include the above in your HEAD tag ---------->
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col-md-3 ">
                    <a href="../home" style="padding-bottom: 100px">Trang chủ</a>
                    
                    <div class="list-group " style="margin-top: 45px">
                        <a href="updateinfo" class="list-group-item list-group-item-action">Thông tin</a>
                        <a href="changepassword" class="list-group-item list-group-item-action active">Đổi mật khẩu</a>
                        <a href="../favourite" class="list-group-item list-group-item-action">Yêu thích</a>
                        <a href="insertserie" class="list-group-item list-group-item-action">Thêm truyện</a>
                        <a href="../logout" class="list-group-item list-group-item-action">Thoát</a>
                    </div> 
                </div>
		<div class="col-md-9">
		    <div class="card">
		        <div class="card-body">
		            <div class="row">
		                <div class="col-md-12">
		                    <h4>Đổi mật khẩu</h4>
		                    <hr>
		                </div>
		            </div>
		            <div class="row">
		                <div class="col-md-12">
                                    <form action="changepassword" method="POST">
                                        <div class="form-group row">
                                            <label for="username" class="col-4 col-form-label">Mật khẩu hiện tại</label> 
                                            <div class="col-8">
                                                <input id="oldpass" name="oldpass" placeholder="Nhập mật khẩu hiện tại" class="form-control here" required="required" type="password">
                                            </div>
                                        </div>
                                        <div class="form-group row">
                                            <label for="name" class="col-4 col-form-label">Mật khẩu mới</label> 
                                            <div class="col-8">
                                                <input id="newpass" name="newpass" placeholder="Nhập mật khẩu mới" class="form-control here" type="password">
                                            </div>
                                        </div>
                                        <div class="form-group row">
                                            <label for="name" class="col-4 col-form-label">Nhập lại mật khẩu mới</label> 
                                            <div class="col-8">
                                                <input id="renewpass" name="renewpass" placeholder="Nhập lại mật khẩu mới" class="form-control here" type="password">
                                            </div>
                                        </div>
                                        <div class="form-group row">
                                            <label for="name" class="col-4 col-form-label"></label> 
                                            <div class="col-8">
                                                <p style="color: red">${warning}</p>
                                                <p style="color: green">${confirm}</p>
                                            </div>
                                        </div>
                                        <div class="form-group row">
                                            <div class="offset-4 col-8">
                                                <button name="submit" type="submit" class="btn btn-primary">Cật nhật mật khẩu</button>
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
    </body>


</html>
