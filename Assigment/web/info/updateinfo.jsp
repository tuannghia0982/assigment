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
        <title>Cật nhật thông tin</title>
        <!------ Include the above in your HEAD tag ---------->
    </head>
    

    <div class="container">
	<div class="row">
            <div class="col-md-3 ">
                <a href="../home" style="padding-bottom: 100px">Trang chủ</a>
		<div class="list-group " style="margin-top: 45px">
                <a href="updateinfo" class="list-group-item list-group-item-action active">Thông tin</a>
                <a href="changepassword" class="list-group-item list-group-item-action">Đổi mật khẩu</a>
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
		                <h4>Thông tin cá nhân</h4>
		                <hr>
		            </div>
		        </div>
		        <div class="row">
		            <div class="col-md-12">
                                <form action="updateinfo" method="POST">
                                    <div class="form-group row">
                                        <label for="username" class="col-4 col-form-label">Tên đăng nhập</label> 
                                        <div class="col-8">
      <!--                                  <input id="username" name="username" placeholder="Username" class="form-control here" required="required" type="text">-->
                                            <p>${sessionScope.account.name}</p>
                                        </div>
                                    </div>
                                    <div class="form-group row">
                                        <label for="name" class="col-4 col-form-label">Họ và tên</label> 
                                        <div class="col-8">
                                            <input id="name" name="displayname" placeholder="First Name" class="form-control here" type="text" value="${sessionScope.account.displayname}">
                                        </div>
                                    </div>
                                    
                                    <div class="form-group row">
                                        <div class="offset-4 col-8">
                                            <button name="submit" type="submit" class="btn btn-primary">Cật nhật thông tin cá nhân</button>
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
