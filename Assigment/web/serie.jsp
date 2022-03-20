<%-- 
    Document   : serie
    Created on : Mar 10, 2022, 11:50:04 PM
    Author     : tuann
--%>

<%@page import="model.Serie"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Truyện Tranh 88</title>
        <link rel="stylesheet" href="css/style.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="css/base.css">
        <script src="https://kit.fontawesome.com/98df298cac.js" crossorigin="anonymous"></script>
    </head>
    <body>
        <header>
            <div class="grid">
                <div class="heading-bar">
                    <a href="home"><h1 style="color: blueviolet; font-size: 30px;">TruyenTranh<span style="color: #F18121;">88</span></h1></a>
                    <form action="search" method="POST" class="search-box">
                        <input type="text" name="txt" placeholder="Enter Searching..." style="width:100%" required>
                        <button type="submit" class="search-icon" style="background-color: #F18121; width: 35px;"><i class="fa fa-search"></i></button>
                    </form>
                    <c:if test="${sessionScope.account!=null}">
                        <div class="person dropdown">
                            <div style="width: 100%; margin: 20px 0px;justify-content: center;">
                                <i class="fa-solid fa-circle-user"></i>
                            </div>
                            <div class="droplist droplist-normal" style="width: 15%; font-size: medium;">
                                <p>${sessionScope.account.displayname}</p>
                                <a href="info/updateinfo">Thông tin</a>
                                <a href="favourite">Yêu thích</a>
                                <a href="logout">Thoát   <i class="fa-solid fa-arrow-right-from-bracket"></i></a>
                            </div>  
                        </div>
                    </c:if>
                    <c:if test="${sessionScope.account==null}">
                        <p class="login"><a href="login">Đăng Nhập</a>/<a href="signup">Đăng Ký</a></p>
                    </c:if>
                </div>
            </div>
                <menu>
                    <div class="grid">
                        <ul class="menu-ul">
                            <li class="menu-li"><a href="home">Trang chủ</a></li>
                                <li class="menu-li dropdown">
                                    <a href="#">Thể loại</a>
                                        <div class="droplist droplist-normal">
                                            <c:forEach items="${requestScope.categories}" var="c">
                                                <a href="category?caid=${c.id}">${c.name}</a>
                                            </c:forEach>
                                        </div>
                                </li>
                                <li class="menu-li dropdown">
                                    <a href="#">Quốc gia</a>
                                        <div class="droplist droplist-normal">
                                            <c:forEach items="${requestScope.countries}" var="c">
                                                <a href="category?coid=${c.id}">${c.name}</a>
                                            </c:forEach>
                                        </div>
                                </li>
                                <li class="menu-li dropdown">
                                    <a href="#">Xem Nhiều Nhất</a>
                                </li>
                                <li class="menu-li"><a href="#">Group</a></li>
                        </ul>
                        <ul class="menu-ul-mb">
                            <li class="menu-li-mb"><i class="fa-solid fa-bars"></i></li>
                        </ul>
                    </div>
                </menu>

        </header>
        <div class="container">
            <div class="grid">
                <h1 class="top-list" style="padding-top: 160px;">${requestScope.serie.name}<a href="" style="font-size: medium;">(chỉnh sửa)</a><a href="" style="font-size: medium;">(xóa)</a></h1>
                <div class="grid_row">
                    <div class="grid_column-3 grid_column-12s" style="margin: 0 auto;">
                        <img src="img/${requestScope.serie.image}" alt="" style="width: 100%; ">
                        <c:if test="${sessionScope.account!=null}">
                            <c:if test="${requestScope.checkserie==null}">
                                <div class="moreinfo">
                                    <a href="addfavourite?sid=${requestScope.serie.id}">Yêu Thích</a>
                                </div>
                            </c:if>
                            <c:if test="${requestScope.checkserie!=null}">
                                <div class="moreinfo">
                                    <a href="DelFav?sid=${requestScope.serie.id}" style="background-color: red">Bỏ thích</a>
                                </div>
                            </c:if>
                        </c:if>
                        
                    </div>
                    <div class="grid_column-8 grid_column-12s">
                        <table>
                            <tbody>
                                <tr><td>Tên Truyện</td><td>${requestScope.serie.name}</td></tr>
                                <tr><td>Tác giả</td><td>${requestScope.serie.author}</td></tr>
                                <tr><td>Quốc Gia</td><td><a a href="category?coid=${requestScope.serie.country.id}">${requestScope.serie.country.name}</a></td></tr>
                                <tr><td>Thể Loại</td><td><a href="category?caid=${requestScope.serie.category.id}">${requestScope.serie.category.name}</a></td></tr>
                                <tr><td>Lượt xem</td><td>${requestScope.serie.quantity}</td></tr>
                            </tbody>
                        </table>
                        <div class="description">
                            <h2>Mô Tả</h2>
                            <p>${requestScope.serie.description}</p>
                        </div>
                    </div>
                </div>
                <div class="chapter"><h2>Danh Sách chương</h2></div>
                <div class="listchap">
                    <ul>
                        <li><a href="addchapter?sid=${requestScope.serie.id}">Thêm Chapter <i class="fa-solid fa-circle-plus" style="margin-left: 5px; color: green"></i></a></li>
                        <c:forEach items="${requestScope.chapters}" var="c">
                            <li>
                                <a href="chapter?chapid=${c.id}">${c.name}</a>
                                <div class="edit">
                                    <a href="updatechapter?chapid=${c.id}" style="background-color: rgb(0, 102, 255);">chỉnh sửa</a>
                                </div>
                                <div class="edit">
                                    <a href="deletechapter?chapid=${c.id}" style="background-color: red;">xóa</a>
                                </div>
                            </li>
                        </c:forEach>
                    </ul>
                </div>
            </div>
        </div>
        <footer>
            <div class="footer-container">
                <h4>Copyright By Truyentranh88 - Kho đọc truyện hàng đầu.</h4>
            </div>
        </footer>
    </body>
    
</html>
