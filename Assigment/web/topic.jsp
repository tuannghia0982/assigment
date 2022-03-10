<%-- 
    Document   : topic
    Created on : Mar 8, 2022, 4:02:44 PM
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
        <%
            ArrayList<Serie> newseries= (ArrayList<Serie>)request.getAttribute("newseries");    
        %>  String a ="";
    </head>
    <body>
        <header>
            <div class="grid">
                <div class="heading-bar">
                <a href="home"><h1 style="color: blueviolet; font-size: 30px;">TruyenTranh<span style="color: #F18121;">88</span></h1></a>
                <form action="#" class="search-box">
                    <input type="text" placeholder="Enter Searching..." style="width:100%" required>
                    <button type="submit" class="search-icon" style="background-color: #F18121; width: 35px;"><i class="fa fa-search"></i></button>

                </form>
                <p class="login"><a href="#">Đăng Nhập</a>/<a href="">Đăng Ký</a></p>
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
                                            <a href="#">${c.name}</a>
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
        <div class="grid" >
            
            <h2 class="top-list" style="padding-top: 160px;">${requestScope.category.name}</h2>
            <a href="#"class="grid_row">
                <c:forEach items="${requestScope.newseries}" var="s">
                    <div class="grid_column-2 grid_column-6">
                        <div class="item">
                            <img src="${s.image}" style="width:100%; height:250px">
                            <p style="text-align: center;">${s.name}</p>
                        </div>
                    </div>
                </c:forEach>
                
                
                
            </a>
            <div class="moreinfo">
                <a href="">Xem Thêm</a>
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
