package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Truyện Tranh 88</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/base.css\">\n");
      out.write("    <script src=\"https://kit.fontawesome.com/98df298cac.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <header>\n");
      out.write("        <div class=\"grid\">\n");
      out.write("            <div class=\"heading-bar\">\n");
      out.write("                <a href=\"#\"><h1 style=\"color: blueviolet; font-size: 30px;\">TruyenTranh<span style=\"color: #F18121;\">88</span></h1></a>\n");
      out.write("                <form action=\"#\" class=\"search-box\">\n");
      out.write("                    <input type=\"text\" placeholder=\"Enter Searching...\" style=\"width:100%\" required>\n");
      out.write("                    <button type=\"submit\" class=\"search-icon\" style=\"background-color: #F18121; width: 35px;\"><i class=\"fa fa-search\"></i></button>\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("                <p class=\"login\"><a href=\"#\">Đăng Nhập</a>/<a href=\"\">Đăng Ký</a></p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("            <menu>\n");
      out.write("                <div class=\"grid\">\n");
      out.write("                    <ul class=\"menu-ul\">\n");
      out.write("                        <li class=\"menu-li\"><a href=\"#\">Trang chủ</a></li>\n");
      out.write("                            <li class=\"menu-li dropdown\">\n");
      out.write("                                <a href=\"#\">Thể loại</a>\n");
      out.write("                                <div class=\"droplist droplist-normal\">\n");
      out.write("                                    <a href=\"#\">Lorem</a>\n");
      out.write("                                    <a href=\"#\">Lorem, ipsum</a>\n");
      out.write("                                    <a href=\"#\">Lorem</a>\n");
      out.write("                                    <a href=\"#\">Lorem</a>\n");
      out.write("                                    <a href=\"#\">Lorem, ipsum</a>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"menu-li dropdown\">\n");
      out.write("                                <a href=\"#\">Quốc gia</a>\n");
      out.write("                                <div class=\"droplist droplist-normal\">\n");
      out.write("                                    <a href=\"#\">Lorem</a>\n");
      out.write("                                    <a href=\"#\">Lorem</a>\n");
      out.write("                                    <a href=\"#\">Lorem</a>\n");
      out.write("                                    <a href=\"#\">Lorem</a>\n");
      out.write("                                    <a href=\"#\">Lorem</a>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"menu-li dropdown\">\n");
      out.write("                                <a href=\"#\">Xem Nhiều Nhất</a>\n");
      out.write("                            </li>\n");
      out.write("                        <li class=\"menu-li\"><a href=\"#\">Group</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <ul class=\"menu-ul-mb\">\n");
      out.write("                        <li class=\"menu-li-mb\"><i class=\"fa-solid fa-bars\"></i></li>\n");
      out.write("                    </ul>\n");
      out.write("            </div>\n");
      out.write("            </menu>\n");
      out.write("        \n");
      out.write("    </header>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"grid\" >\n");
      out.write("            <h2 class=\"top-list\" style=\"padding-top: 160px;\">Truyện Xem Nhiều Nhất</h2>\n");
      out.write("            <div class=\"grid_row\">\n");
      out.write("                <div class=\"grid_column-2\">\n");
      out.write("                    <div class=\"item\">\n");
      out.write("                        <img src=\"img/olongvien.jpg\" style=\"width:100%\">\n");
      out.write("                        <p style=\"text-align: center;\">Chàng Trai Năm ấy</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"grid_column-2\">\n");
      out.write("                    <div class=\"item\">\n");
      out.write("                        <img src=\"img/olongvien.jpg\" style=\"width:100%\">\n");
      out.write("                        <p style=\"text-align: center;\">Title 1</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"grid_column-2\">\n");
      out.write("                    <div class=\"item\">\n");
      out.write("                        <img src=\"img/olongvien.jpg\" style=\"width: 100%\">\n");
      out.write("                        <p style=\"text-align: center;\">Title 1</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"grid_column-2\">\n");
      out.write("                    <div class=\"item\">\n");
      out.write("                        <img src=\"img/olongvien.jpg\" style=\"width:100%\">\n");
      out.write("                        <p style=\"text-align: center;\">Title 1</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"grid_column-2\">\n");
      out.write("                    <div class=\"item\">\n");
      out.write("                        <img src=\"img/olongvien.jpg\" style=\"width:100%\">\n");
      out.write("                        <p style=\"text-align: center;\">Title 1</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"grid_column-2\">\n");
      out.write("                    <div class=\"item\">\n");
      out.write("                        <img src=\"img/olongvien.jpg\" style=\"width:100%\">\n");
      out.write("                        <p style=\"text-align: center;\">Title 1</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"moreinfo\">\n");
      out.write("                <a href=\"\">Xem Thêm</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    \n");
      out.write("        <div class=\"grid\">\n");
      out.write("            <h2 class=\"top-list\">Truyện Mới Cật Nhật</h2>\n");
      out.write("            <div class=\"grid_row\">\n");
      out.write("                <div class=\"grid_column-2\">\n");
      out.write("                    <div class=\"item\">\n");
      out.write("                        <img src=\"img/olongvien.jpg\" style=\"width:100%\">\n");
      out.write("                        <p style=\"text-align: center;\">Title 1</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"grid_column-2\">\n");
      out.write("                    <div class=\"item\">\n");
      out.write("                        <img src=\"img/olongvien.jpg\" style=\"width:100%\">\n");
      out.write("                        <p style=\"text-align: center;\">Title 1</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"grid_column-2\">\n");
      out.write("                    <div class=\"item\">\n");
      out.write("                        <img src=\"img/olongvien.jpg\" style=\"width:100%\">\n");
      out.write("                        <p style=\"text-align: center;\">Title 1</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"grid_column-2\">\n");
      out.write("                    <div class=\"item\">\n");
      out.write("                        <img src=\"img/olongvien.jpg\" style=\"width:100%\">\n");
      out.write("                        <p style=\"text-align: center;\">Title 1</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"grid_column-2\">\n");
      out.write("                    <div class=\"item\">\n");
      out.write("                        <img src=\"img/olongvien.jpg\" style=\"width:100%\">\n");
      out.write("                        <p style=\"text-align: center;\">Title 1</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"grid_column-2\">\n");
      out.write("                    <div class=\"item\">\n");
      out.write("                        <img src=\"img/olongvien.jpg\" style=\"width:100%\">\n");
      out.write("                        <p style=\"text-align: center;\">Title 1</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"grid_column-2\">\n");
      out.write("                    <div class=\"item\">\n");
      out.write("                        <img src=\"img/olongvien.jpg\" style=\"width:100%\">\n");
      out.write("                        <p style=\"text-align: center;\">Title 1</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"grid_column-2\">\n");
      out.write("                    <div class=\"item\">\n");
      out.write("                        <img src=\"img/olongvien.jpg\" style=\"width:100%\">\n");
      out.write("                        <p style=\"text-align: center;\">Title 1</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"grid_column-2\">\n");
      out.write("                    <div class=\"item\">\n");
      out.write("                        <img src=\"img/olongvien.jpg\" style=\"width:100%\">\n");
      out.write("                        <p style=\"text-align: center;\">Title 1</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"grid_column-2\">\n");
      out.write("                    <div class=\"item\">\n");
      out.write("                        <img src=\"img/olongvien.jpg\" style=\"width:100%\">\n");
      out.write("                        <p style=\"text-align: center;\">Title 1</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"grid_column-2\">\n");
      out.write("                    <div class=\"item\">\n");
      out.write("                        <img src=\"img/olongvien.jpg\" style=\"width:100%\">\n");
      out.write("                        <p style=\"text-align: center;\">Title 1</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"grid_column-2\">\n");
      out.write("                    <div class=\"item\">\n");
      out.write("                        <img src=\"img/olongvien.jpg\" style=\"width:100%\">\n");
      out.write("                        <p style=\"text-align: center;\">Title 1</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"grid_column-2\">\n");
      out.write("                    <div class=\"item\">\n");
      out.write("                        <img src=\"img/olongvien.jpg\" style=\"width:100%\">\n");
      out.write("                        <p style=\"text-align: center;\">Title 1</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"moreinfo\">\n");
      out.write("                <a href=\"\">Xem Thêm</a>\n");
      out.write("            </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("    <footer>\n");
      out.write("        <div class=\"footer-container\">\n");
      out.write("            <h4>Copyright By Truyentranh88 - Kho đọc truyện hàng đầu.</h4>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
