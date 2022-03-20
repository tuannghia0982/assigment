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
        <title>Thêm Chapter</title>
        <!------ Include the above in your HEAD tag ---------->
    </head>
    

    <div class="container">
	<div class="row">
            <div class="col-md-12">
                <a href="serie?sid=${requestScope.sid}">Back</a>
		<div class="card">
		    <div class="card-body">
		        <div class="row">
		            <div class="col-md-12">
		                <h4></h4>
		                <hr>
		            </div>
		        </div>
		        <div class="row">
		            <div class="col-md-12">
                                <form action="addchapter" method="POST" enctype="multipart/form-data">
                                    <div class="form-group row">
                                        <label for="name" class="col-4 col-form-label">Tên Chapter</label> 
                                        <div class="col-8">
                                            <input id="name" name="chapname" placeholder="Tên chapter" class="form-control here" type="text">
                                        </div>
                                    </div>
                                    <div class="form-group row">
                                        <label for="image" class="col-4 col-form-label">Nội dung</label> 
                                        <div class="col-8">
                                            <input id="name" name="image" placeholder="Ảnh" class="form-control here" multiple type="file" value="">
                                        </div>
                                    </div>
                                    <input type="text" name ="sid" value="${requestScope.sid}" hidden>
                                    
                                    <div class="form-group row">
                                        <div class="offset-4 col-8">
                                            <button name="submit" type="submit" class="btn btn-primary">Thêm Chapter</button>
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
