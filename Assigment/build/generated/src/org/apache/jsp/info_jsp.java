package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class info_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("<script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("<!------ Include the above in your HEAD tag ---------->\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("\t<div class=\"row\">\n");
      out.write("\t\t<div class=\"col-md-3 \">\n");
      out.write("\t\t     <div class=\"list-group \">\n");
      out.write("              <a href=\"#\" class=\"list-group-item list-group-item-action active\">Dashboard</a>\n");
      out.write("              <a href=\"#\" class=\"list-group-item list-group-item-action\">User Management</a>\n");
      out.write("              <a href=\"#\" class=\"list-group-item list-group-item-action\">Used</a>\n");
      out.write("              <a href=\"#\" class=\"list-group-item list-group-item-action\">Enquiry</a>\n");
      out.write("              <a href=\"#\" class=\"list-group-item list-group-item-action\">Dealer</a>\n");
      out.write("              <a href=\"#\" class=\"list-group-item list-group-item-action\">Media</a>\n");
      out.write("              <a href=\"#\" class=\"list-group-item list-group-item-action\">Post</a>\n");
      out.write("              <a href=\"#\" class=\"list-group-item list-group-item-action\">Category</a>\n");
      out.write("              <a href=\"#\" class=\"list-group-item list-group-item-action\">New</a>\n");
      out.write("              <a href=\"#\" class=\"list-group-item list-group-item-action\">Comments</a>\n");
      out.write("              <a href=\"#\" class=\"list-group-item list-group-item-action\">Appearance</a>\n");
      out.write("              <a href=\"#\" class=\"list-group-item list-group-item-action\">Reports</a>\n");
      out.write("              <a href=\"#\" class=\"list-group-item list-group-item-action\">Settings</a>\n");
      out.write("              \n");
      out.write("              \n");
      out.write("            </div> \n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-md-9\">\n");
      out.write("\t\t    <div class=\"card\">\n");
      out.write("\t\t        <div class=\"card-body\">\n");
      out.write("\t\t            <div class=\"row\">\n");
      out.write("\t\t                <div class=\"col-md-12\">\n");
      out.write("\t\t                    <h4>Your Profile</h4>\n");
      out.write("\t\t                    <hr>\n");
      out.write("\t\t                </div>\n");
      out.write("\t\t            </div>\n");
      out.write("\t\t            <div class=\"row\">\n");
      out.write("\t\t                <div class=\"col-md-12\">\n");
      out.write("\t\t                    <form>\n");
      out.write("                              <div class=\"form-group row\">\n");
      out.write("                                <label for=\"username\" class=\"col-4 col-form-label\">User Name*</label> \n");
      out.write("                                <div class=\"col-8\">\n");
      out.write("                                  <input id=\"username\" name=\"username\" placeholder=\"Username\" class=\"form-control here\" required=\"required\" type=\"text\">\n");
      out.write("                                </div>\n");
      out.write("                              </div>\n");
      out.write("                              <div class=\"form-group row\">\n");
      out.write("                                <label for=\"name\" class=\"col-4 col-form-label\">First Name</label> \n");
      out.write("                                <div class=\"col-8\">\n");
      out.write("                                  <input id=\"name\" name=\"name\" placeholder=\"First Name\" class=\"form-control here\" type=\"text\">\n");
      out.write("                                </div>\n");
      out.write("                              </div>\n");
      out.write("                              <div class=\"form-group row\">\n");
      out.write("                                <label for=\"lastname\" class=\"col-4 col-form-label\">Last Name</label> \n");
      out.write("                                <div class=\"col-8\">\n");
      out.write("                                  <input id=\"lastname\" name=\"lastname\" placeholder=\"Last Name\" class=\"form-control here\" type=\"text\">\n");
      out.write("                                </div>\n");
      out.write("                              </div>\n");
      out.write("                              <div class=\"form-group row\">\n");
      out.write("                                <label for=\"text\" class=\"col-4 col-form-label\">Nick Name*</label> \n");
      out.write("                                <div class=\"col-8\">\n");
      out.write("                                  <input id=\"text\" name=\"text\" placeholder=\"Nick Name\" class=\"form-control here\" required=\"required\" type=\"text\">\n");
      out.write("                                </div>\n");
      out.write("                              </div>\n");
      out.write("                              <div class=\"form-group row\">\n");
      out.write("                                <label for=\"select\" class=\"col-4 col-form-label\">Display Name public as</label> \n");
      out.write("                                <div class=\"col-8\">\n");
      out.write("                                  <select id=\"select\" name=\"select\" class=\"custom-select\">\n");
      out.write("                                    <option value=\"admin\">Admin</option>\n");
      out.write("                                  </select>\n");
      out.write("                                </div>\n");
      out.write("                              </div>\n");
      out.write("                              <div class=\"form-group row\">\n");
      out.write("                                <label for=\"email\" class=\"col-4 col-form-label\">Email*</label> \n");
      out.write("                                <div class=\"col-8\">\n");
      out.write("                                  <input id=\"email\" name=\"email\" placeholder=\"Email\" class=\"form-control here\" required=\"required\" type=\"text\">\n");
      out.write("                                </div>\n");
      out.write("                              </div>\n");
      out.write("                              <div class=\"form-group row\">\n");
      out.write("                                <label for=\"website\" class=\"col-4 col-form-label\">Website</label> \n");
      out.write("                                <div class=\"col-8\">\n");
      out.write("                                  <input id=\"website\" name=\"website\" placeholder=\"website\" class=\"form-control here\" type=\"text\">\n");
      out.write("                                </div>\n");
      out.write("                              </div>\n");
      out.write("                              <div class=\"form-group row\">\n");
      out.write("                                <label for=\"publicinfo\" class=\"col-4 col-form-label\">Public Info</label> \n");
      out.write("                                <div class=\"col-8\">\n");
      out.write("                                  <textarea id=\"publicinfo\" name=\"publicinfo\" cols=\"40\" rows=\"4\" class=\"form-control\"></textarea>\n");
      out.write("                                </div>\n");
      out.write("                              </div>\n");
      out.write("                              <div class=\"form-group row\">\n");
      out.write("                                <label for=\"newpass\" class=\"col-4 col-form-label\">New Password</label> \n");
      out.write("                                <div class=\"col-8\">\n");
      out.write("                                  <input id=\"newpass\" name=\"newpass\" placeholder=\"New Password\" class=\"form-control here\" type=\"text\">\n");
      out.write("                                </div>\n");
      out.write("                              </div> \n");
      out.write("                              <div class=\"form-group row\">\n");
      out.write("                                <div class=\"offset-4 col-8\">\n");
      out.write("                                  <button name=\"submit\" type=\"submit\" class=\"btn btn-primary\">Update My Profile</button>\n");
      out.write("                                </div>\n");
      out.write("                              </div>\n");
      out.write("                            </form>\n");
      out.write("\t\t                </div>\n");
      out.write("\t\t            </div>\n");
      out.write("\t\t            \n");
      out.write("\t\t        </div>\n");
      out.write("\t\t    </div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
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
