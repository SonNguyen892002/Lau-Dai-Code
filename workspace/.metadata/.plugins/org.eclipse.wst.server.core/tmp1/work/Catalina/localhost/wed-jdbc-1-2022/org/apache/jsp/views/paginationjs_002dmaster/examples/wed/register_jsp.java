/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.36
 * Generated at: 2022-01-12 17:53:22 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.paginationjs_002dmaster.examples.wed;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<title>Lâu đài coder</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"./style.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"./fontawesome-free-5.15.3-web/css/all.min.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<a class=\"reply\" href=\"./phimmoi.jsp\"><i class=\"fas fa-reply\"></i>Quay lại trang chủ</a>\r\n");
      out.write("        <a class=\"reply\" href=\"./login.jsp\"><i class=\"fas fa-sign-in-alt\"></i>Đăng nhập</a>\r\n");
      out.write("        <div id=\"user_register\" class=\"box-content\">\r\n");
      out.write("            <h1>Đăng ký</h1>\r\n");
      out.write("            <form action=\"./register.php?action=reg\" method=\"post\" autocomplete=\"off\">\r\n");
      out.write("                \r\n");
      out.write("                <label for=\"a\">Họ tên:</label>\r\n");
      out.write("                <div class=\"dad display-flex\">\r\n");
      out.write("                    <i class=\"fas fa-user-edit\"></i><input id=\"a\" type=\"text\" name=\"fullname\" value=\"\" placeholder=\"Nhập họ tên\">\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <label for=\"b\">Tài khoản:</label>\r\n");
      out.write("                <div class=\"dad display-flex\">\r\n");
      out.write("                    <i class=\"fas fa-users\"></i><input id=\"b\" type=\"text\" name=\"username\" value=\"\" placeholder=\"Nhập tài khoản của bạn\">\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <label for=\"\">Password:</label>\r\n");
      out.write("                <div class=\"dad display-flex\">\r\n");
      out.write("                    <i class=\"fas fa-key\"></i>\r\n");
      out.write("                    <input type=\"password\" name=\"password\" value=\"\" id=\"ipnPassword\" placeholder=\"*********\">\r\n");
      out.write("                    <i class=\"fas fa-eye\" id=\"btnPassword\" ></i>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <label for=\"\">Nhập lại password:</label>\r\n");
      out.write("                <div class=\"dad display-flex\">\r\n");
      out.write("                    <i class=\"fas fa-key\"></i>\r\n");
      out.write("                    <input type=\"password\" name=\"password\" value=\"\" placeholder=\"*********\">\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <label for=\"c\">Email:</label>\r\n");
      out.write("                <div class=\"dad display-flex\">\r\n");
      out.write("                    <i class=\"fas fa-envelope\"></i><input id=\"c\" type=\"email\" name=\"email\" value=\"\" placeholder=\"Nhập email\">\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <label for=\"d\">Ngày sinh (DD/MM/YYYY):</label>\r\n");
      out.write("                <div class=\"dad\">\r\n");
      out.write("                    <input id=\"d\" type=\"text\" name=\"birthday\" value=\"\" placeholder=\"eg:01-02-2002\">\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <button class=\"button\">Đăng ký</button>\r\n");
      out.write("                \r\n");
      out.write("                <label class=\"tkgg\" for=\"\">Bạn chưa có tài khoản google ?<a class=\"gg\" target=\"_blank\" href=\"https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp\">Tạo ngay <i class=\"fab fa-google-plus-g\"></i></a></label> <br>\r\n");
      out.write("                \r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <script src=\"./sub.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
