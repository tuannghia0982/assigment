<%-- 
    Document   : pageinside
    Created on : Mar 8, 2022, 4:07:21 PM
    Author     : tuann
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Truyện Tranh 88</title>
        <link rel="stylesheet" href="css/pageinside.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="css/base.css">
        <script src="https://kit.fontawesome.com/98df298cac.js" crossorigin="anonymous"></script>
    </head>
    <body>
        <header>
            <div class="grid">
                <div class="heading-bar">
                    <a href="#"><h1 style="color: blueviolet; font-size: 30px;">TruyenTranh<span style="color: #F18121;">88</span></h1></a>
                    <form action="search" method="POST" class="search-box">
                        <input type="text" name="txt" placeholder="Enter Searching..." style="width:100%" required>
                        <button type="submit" class="search-icon" style="background-color: #F18121; width: 35px;"><i class="fa fa-search"></i></button>
                    </form>
                    <p class="login"><a href="#">Đăng Nhập</a>/<a href="">Đăng Ký</a></p>
                </div>
            </div>
                <menu>
                    <div class="grid">
                        <ul class="menu-ul">
                            <li class="menu-li"><a href="#">Trang chủ</a></li>
                                <li class="menu-li dropdown">
                                    <a href="#">Thể loại</a>
                                    <div class="droplist droplist-normal">
                                        <a href="#">Lorem</a>
                                        <a href="#">Lorem, ipsum</a>
                                        <a href="#">Lorem</a>
                                        <a href="#">Lorem</a>
                                        <a href="#">Lorem, ipsum</a>
                                    </div>
                                </li>
                                <li class="menu-li dropdown">
                                    <a href="#">Quốc gia</a>
                                    <div class="droplist droplist-normal">
                                        <a href="#">Lorem</a>
                                        <a href="#">Lorem, ipsum</a>
                                        <a href="#">Lorem</a>
                                        <a href="#">Lorem</a>
                                        <a href="#">Lorem, ipsum</a>
                                    </div>
                                </li>
                                <li class="menu-li dropdown">
                                    <a href="#">Xem Nhiều Nhất</a>
                                </li>
                            <li class="menu-li"><a href="#">Group</a></li>
                        </ul>
                        <ul class="menu-ul-mb">
                            <li><i class="fa-solid fa-bars"></i></li>
                        </ul>

                </div>
                </menu>
        </header>

        <div class="container">
            <div class="intro" style="background-color: white; ">
                <h2 style="display: flex; justify-content: center;  padding: 20px 0; margin: 0 0; font-size: 30px;">Truyện Ô Long Viện</h2>
                <p style="display: flex; justify-content: center; margin: 0 0;">Tập 1</p>
                <div class="controller">
                    <div class="icon">
                        <a href=""><i class='fas fa-arrow-alt-circle-left' style='font-size:36px'></i></a>
                    </div>
                    <select name="" id="">
                        <option value="">chapter</option>
                        <option value="">chapter</option>
                        <option value="">chapter</option>
                        <option value="">chapter</option>
                        <option value="">chapter</option>
                    </select>
                    <div class="icon">
                        <a href=""><i class="fas fa-arrow-alt-circle-right" style="font-size:36px"></i></a>
                    </div>
                </div>
            </div>

            <div class="grid" >
                <div class="grid_row">
                    <div class="grid_column-12">
                        <img src="img/olongvien.jpg" alt="" style="width: 100%;">
                        <img src="img/olongvien.jpg" alt="" style="width: 100%;">
                        <img src="img/olongvien.jpg" alt="" style="width: 100%;">
                        <img src="img/olongvien.jpg" alt="" style="width: 100%;">
                        <img src="img/olongvien.jpg" alt="" style="width: 100%;">
                    </div>
                </div>
            </div>
        </div>
        <footer style="bottom: 0;">
            <div class="footer-container">
                <h4>Copyright By Truyentranh88 - Kho đọc truyện hàng đầu.</h4>
            </div>
        </footer>
    </body>
</html>
