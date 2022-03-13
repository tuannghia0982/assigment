package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Roboto:400,700\" rel=\"stylesheet\">\n");
      out.write("<title>Bootstrap Sign up Form Horizontal</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script> \n");
      out.write("<style>\n");
      out.write("\tbody {\n");
      out.write("\t\tcolor: #999;\n");
      out.write("\t\tbackground: #f3f3f3;\n");
      out.write("\t\tfont-family: 'Roboto', sans-serif;\n");
      out.write("\t}\n");
      out.write("    .form-control {\n");
      out.write("\t\tborder-color: #eee;\n");
      out.write("        min-height: 41px;\n");
      out.write("\t\tbox-shadow: none !important;\n");
      out.write("\t}\n");
      out.write("    .form-control:focus {\n");
      out.write("\t\tborder-color: #5cd3b4;\n");
      out.write("\t}\n");
      out.write("    .form-control, .btn {        \n");
      out.write("        border-radius: 3px;\n");
      out.write("    }\n");
      out.write("\t.signup-form {\n");
      out.write("\t\twidth: 500px;\n");
      out.write("\t\tmargin: 0 auto;\n");
      out.write("\t\tpadding: 30px 0;\n");
      out.write("\t}\n");
      out.write("    .signup-form h2 {\n");
      out.write("\t\tcolor: #333;\n");
      out.write("        margin: 0 0 30px 0;\n");
      out.write("\t\tdisplay: inline-block;\n");
      out.write("\t\tpadding: 0 30px 10px 0;\n");
      out.write("\t\tborder-bottom: 3px solid #5cd3b4;\n");
      out.write("    }\n");
      out.write("    .signup-form form {\n");
      out.write("\t\tcolor: #999;\n");
      out.write("\t\tborder-radius: 3px;\n");
      out.write("    \tmargin-bottom: 15px;\n");
      out.write("        background: #fff;\n");
      out.write("        box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);\n");
      out.write("        padding: 30px;\n");
      out.write("    }\n");
      out.write("\t.signup-form .form-group {\n");
      out.write("\t\tmargin-bottom: 20px;\n");
      out.write("\t}\n");
      out.write("\t.signup-form label {\n");
      out.write("\t\tfont-weight: normal;\n");
      out.write("\t\tfont-size: 13px;\n");
      out.write("\t}\n");
      out.write("    .signup-form input[type=\"checkbox\"] {\n");
      out.write("\t\tmargin-top: 2px;\n");
      out.write("\t}\n");
      out.write("    .signup-form .btn {        \n");
      out.write("        font-size: 16px;\n");
      out.write("        font-weight: bold;\n");
      out.write("\t\tbackground: #5cd3b4;\n");
      out.write("\t\tborder: none;\n");
      out.write("\t\tmargin-top: 20px;\n");
      out.write("\t\tmin-width: 140px;\n");
      out.write("    }\n");
      out.write("\t.signup-form .btn:hover, .signup-form .btn:focus {\n");
      out.write("\t\tbackground: #41cba9;\n");
      out.write("        outline: none !important;\n");
      out.write("\t}\n");
      out.write("    .signup-form a {\n");
      out.write("\t\tcolor: #5cd3b4;\n");
      out.write("\t\ttext-decoration: underline;\n");
      out.write("\t}\n");
      out.write("\t.signup-form a:hover {\n");
      out.write("\t\ttext-decoration: none;\n");
      out.write("\t}\n");
      out.write("    .signup-form form a {\n");
      out.write("\t\tcolor: #5cd3b4;\n");
      out.write("\t\ttext-decoration: none;\n");
      out.write("\t}\t\n");
      out.write("\t.signup-form form a:hover {\n");
      out.write("\t\ttext-decoration: underline;\n");
      out.write("\t}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"signup-form\">\n");
      out.write("    <form action=\"/examples/actions/confirmation.php\" method=\"post\" class=\"form-horizontal\">\n");
      out.write("\t\t<div class=\"col-xs-8 col-xs-offset-4\">\n");
      out.write("\t\t\t<h2>Login</h2>\n");
      out.write("\t\t</div>\t\t\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("\t\t\t<label class=\"control-label col-xs-4\">Username</label>\n");
      out.write("\t\t\t<div class=\"col-xs-8\">\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"username\" required=\"required\">\n");
      out.write("            </div>        \t\n");
      out.write("        </div>\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t<label class=\"control-label col-xs-4\">Password</label>\n");
      out.write("\t\t\t<div class=\"col-xs-8\">\n");
      out.write("                <input type=\"password\" class=\"form-control\" name=\"password\" required=\"required\">\n");
      out.write("            </div>        \t\n");
      out.write("        </div>\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t<div class=\"col-xs-8 col-xs-offset-4\">\n");
      out.write("\t\t\t\t<p><label class=\"checkbox-inline\"><input type=\"checkbox\" required=\"required\"> I accept the <a href=\"#\">Terms of Use</a> &amp; <a href=\"#\">Privacy Policy</a>.</label></p>\n");
      out.write("\t\t\t\t<button type=\"submit\" class=\"btn btn-primary btn-lg\">Login Now</button>\n");
      out.write("\t\t\t</div>  \n");
      out.write("\t\t</div>\t\t      \n");
      out.write("    </form>\n");
      out.write("\t<div class=\"text-center\"><a href=\"#\">Create Account</a></div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
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
