<%-- 
    Document   : info
    Created on : Mar 14, 2022, 4:00:33 AM
    Author     : tuann
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <!------ Include the above in your HEAD tag ---------->

<div class="container">
	<div class="row">
            <div class="col-md-3 ">
                <a href="#" style="padding-bottom: 100px">Trang chủ</a>
		<div class="list-group " style="margin-top: 45px">
                <a href="#" class="list-group-item list-group-item-action active">Thông tin</a>
                <a href="#" class="list-group-item list-group-item-action">Đổi mật khẩu</a>
                <a href="#" class="list-group-item list-group-item-action">Thêm truyện</a>
                <a href="#" class="list-group-item list-group-item-action">Thoát</a>
              
              
            </div> 
		</div>
		<div class="col-md-9">
		    <div class="card">
		        <div class="card-body">
		            <div class="row">
		                <div class="col-md-12">
		                    <h4>Your Profile</h4>
		                    <hr>
		                </div>
		            </div>
		            <div class="row">
		                <div class="col-md-12">
		                    <form>
                              <div class="form-group row">
                                <label for="username" class="col-4 col-form-label">User Name*</label> 
                                <div class="col-8">
                                  <input id="username" name="username" placeholder="Username" class="form-control here" required="required" type="text">
                                </div>
                              </div>
                              <div class="form-group row">
                                <label for="name" class="col-4 col-form-label">FullName</label> 
                                <div class="col-8">
                                  <input id="name" name="displayname" placeholder="First Name" class="form-control here" type="text">
                                </div>
                              </div>
                              
                              <div class="form-group row">
                                <div class="offset-4 col-8">
                                  <button name="submit" type="submit" class="btn btn-primary">Update My Profile</button>
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
