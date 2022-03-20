package org.apache.jsp.info;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class updateinfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <title>Cật nhật thông tin</title>\n");
      out.write("        <!------ Include the above in your HEAD tag ---------->\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("\t<div class=\"row\">\n");
      out.write("            <div class=\"col-md-3 \">\n");
      out.write("                <a href=\"../home\" style=\"padding-bottom: 100px\">Trang chủ</a>\n");
      out.write("\t\t<div class=\"list-group \" style=\"margin-top: 45px\">\n");
      out.write("                <a href=\"updateinfo\" class=\"list-group-item list-group-item-action active\">Thông tin</a>\n");
      out.write("                <a href=\"changepassword\" class=\"list-group-item list-group-item-action\">Đổi mật khẩu</a>\n");
      out.write("                <a href=\"\" class=\"list-group-item list-group-item-action\">Yêu thích</a>\n");
      out.write("                <a href=\"#\" class=\"list-group-item list-group-item-action\">Thêm truyện</a>\n");
      out.write("                <a href=\"../logout\" class=\"list-group-item list-group-item-action\">Thoát</a>\n");
      out.write("                </div> \n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-9\">\n");
      out.write("\t\t<div class=\"card\">\n");
      out.write("\t\t    <div class=\"card-body\">\n");
      out.write("\t\t        <div class=\"row\">\n");
      out.write("\t\t            <div class=\"col-md-12\">\n");
      out.write("\t\t                <h4>Thông tin cá nhân</h4>\n");
      out.write("\t\t                <hr>\n");
      out.write("\t\t            </div>\n");
      out.write("\t\t        </div>\n");
      out.write("\t\t        <div class=\"row\">\n");
      out.write("\t\t            <div class=\"col-md-12\">\n");
      out.write("                                <form action=\"updateinfo\" method=\"POST\">\n");
      out.write("                                    <div class=\"form-group row\">\n");
      out.write("                                        <label for=\"username\" class=\"col-4 col-form-label\">Tên đăng nhập</label> \n");
      out.write("                                        <div class=\"col-8\">\n");
      out.write("      <!--                                  <input id=\"username\" name=\"username\" placeholder=\"Username\" class=\"form-control here\" required=\"required\" type=\"text\">-->\n");
      out.write("                                            <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group row\">\n");
      out.write("                                        <label for=\"name\" class=\"col-4 col-form-label\">Họ và tên</label> \n");
      out.write("                                        <div class=\"col-8\">\n");
      out.write("                                            <input id=\"name\" name=\"displayname\" placeholder=\"First Name\" class=\"form-control here\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.displayname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    \n");
      out.write("                                    <div class=\"form-group row\">\n");
      out.write("                                        <div class=\"offset-4 col-8\">\n");
      out.write("                                            <button name=\"submit\" type=\"submit\" class=\"btn btn-primary\">Cật nhật thông tin cá nhân</button>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </form>\n");
      out.write("\t\t            </div>\n");
      out.write("\t\t        </div>\n");
      out.write("\t\t    </div>\n");
      out.write("\t\t</div>\n");
      out.write("            </div>\n");
      out.write("\t</div>\n");
      out.write("    </div>\n");
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
