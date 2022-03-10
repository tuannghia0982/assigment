package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class serie_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Truyện Tranh 88</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/base.css\">\n");
      out.write("        <script src=\"https://kit.fontawesome.com/98df298cac.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <div class=\"grid\">\n");
      out.write("                <div class=\"heading-bar\">\n");
      out.write("                    <a href=\"home\"><h1 style=\"color: blueviolet; font-size: 30px;\">TruyenTranh<span style=\"color: #F18121;\">88</span></h1></a>\n");
      out.write("                    <form action=\"#\" class=\"search-box\">\n");
      out.write("                        <input type=\"text\" placeholder=\"Enter Searching...\" style=\"width:100%\" required>\n");
      out.write("                        <button type=\"submit\" class=\"search-icon\" style=\"background-color: #F18121; width: 35px;\"><i class=\"fa fa-search\"></i></button>\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("                    <p class=\"login\"><a href=\"#\">Đăng Nhập</a>/<a href=\"\">Đăng Ký</a></p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("                <menu>\n");
      out.write("                    <div class=\"grid\">\n");
      out.write("                        <ul class=\"menu-ul\">\n");
      out.write("                            <li class=\"menu-li\"><a href=\"home\">Trang chủ</a></li>\n");
      out.write("                                <li class=\"menu-li dropdown\">\n");
      out.write("                                    <a href=\"#\">Thể loại</a>\n");
      out.write("                                        <div class=\"droplist droplist-normal\">\n");
      out.write("                                            <c:forEach items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.categories}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" var=\"c\">\n");
      out.write("                                                <a href=\"category?caid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('"');
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a>\n");
      out.write("                                            </c:forEach>\n");
      out.write("                                        </div>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"menu-li dropdown\">\n");
      out.write("                                    <a href=\"#\">Quốc gia</a>\n");
      out.write("                                        <div class=\"droplist droplist-normal\">\n");
      out.write("                                            <c:forEach items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.countries}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" var=\"c\">\n");
      out.write("                                                <a href=\"#\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a>\n");
      out.write("                                            </c:forEach>\n");
      out.write("                                        </div>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"menu-li dropdown\">\n");
      out.write("                                    <a href=\"#\">Xem Nhiều Nhất</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"menu-li\"><a href=\"#\">Group</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                        <ul class=\"menu-ul-mb\">\n");
      out.write("                            <li class=\"menu-li-mb\"><i class=\"fa-solid fa-bars\"></i></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </menu>\n");
      out.write("\n");
      out.write("        </header>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"grid\">\n");
      out.write("                <h1 class=\"top-list\" style=\"padding-top: 160px;\">Tên Truyện</h1>\n");
      out.write("                <div class=\"grid_row\">\n");
      out.write("                    <div class=\"grid_column-3 grid_column-12s\" style=\"margin: 0 auto;\">\n");
      out.write("                        <img src=\"img/olongvien.jpg\" alt=\"\" style=\"width: 100%; \">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"grid_column-8 grid_column-12s\">\n");
      out.write("                        <table>\n");
      out.write("                            <tbody>\n");
      out.write("                                <tr><td>Tên Truyện</td><td>Ô long viện</td></tr>\n");
      out.write("                                <tr><td>Tác giả</td><td>ntn vlog</td></tr>\n");
      out.write("                                <tr><td>Thể Loại</td><td>hài</td></tr>\n");
      out.write("                                <tr><td>Lượt xem</td><td>chưa biết</td></tr>\n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("                        <div class=\"description\">\n");
      out.write("                            <h2>Mô Tả</h2>\n");
      out.write("                            <p>Một bộ truyệsdsfffahiafhufifuiefuefehosoidsoidsoidsiojsdfiofdhodsfohusfhuodfhusouhfduhosohsfohusfhuon hài kinh điển mà cả thế giới đều phải ngả nghiêng cười</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"chapter\"><h2>Danh Sách chương</h2></div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <footer>\n");
      out.write("            <div class=\"footer-container\">\n");
      out.write("                <h4>Copyright By Truyentranh88 - Kho đọc truyện hàng đầu.</h4>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("    </body>\n");
      out.write("    \n");
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
