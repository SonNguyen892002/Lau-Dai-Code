/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.36
 * Generated at: 2022-01-16 14:56:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.wed;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class trangchu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("jar:file:/E:/demo/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/wed-jdbc-1-2023/WEB-INF/lib/sitemesh-2.4.2.jar!/META-INF/sitemesh-decorator.tld", Long.valueOf(1123653092000L));
    _jspx_dependants.put("jar:file:/E:/demo/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/wed-jdbc-1-2023/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153359882000L));
    _jspx_dependants.put("/common/taglib.jsp", Long.valueOf(1641969670734L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1641546461421L));
    _jspx_dependants.put("/WEB-INF/lib/sitemesh-2.4.2.jar", Long.valueOf(1641713910048L));
  }

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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Trang ch???</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"martop col-xl-12 col-lg-12 col-sm-12 col-12\">\r\n");
      out.write("            <style type=\"text/css\">\r\n");
      out.write("\t\t\t\t.tc{\r\n");
      out.write("\t\t\t\t\tcolor: var(--color-orange);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t</style>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"home-heading row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-xl-8 col-lg-7 border\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"home-image\">\r\n");
      out.write("\t\t\t\t\t\t\t<img width=\"100%\" height=\"380px\" id=\"img\"\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"./images/anime-???c s??n.jpg\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"total-heading display-flex\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"circle action\"></span> <span class=\"circle\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"circle\"></span> <span class=\"circle\"></span>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"col-xl-3 col-lg-4 none\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"move-oc__one\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"> <img width=\"100%\"\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"./images/anime-???c s??n.jpg\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"backgr\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h1>Xem ngay</h1>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"move-oc__one\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"> <img width=\"100%\"\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"./images/anime-???c s??n.jpg\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"backgr\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h1>Xem ngay</h1>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"col-xl-12 col-lg-12 col-sm-12 col-12 p0\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<section class=\"section\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- TEMPLATE LIST -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"container-title\">\r\n");
      out.write("\t\t\t\t\t\t<h1>PHIM H??T:</h1>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- MOVIE IMAGE -->\r\n");
      out.write("\t\t\t\t\t<div class=\"move-new\">\r\n");
      out.write("\t\t\t\t\t\t<!-- <div class=\"icons\">\r\n");
      out.write("                            <i class=\"fas fa-chevron-left\"></i>\r\n");
      out.write("                        </div> -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"container-slider container-slider__subport display-grid__for autoplay\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"product ml\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"status\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h1>Full 20/20 vietsub</h1>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div> <img src=\"./images/img-avengers.jpg\" alt=\"\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"movie-name\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h2>Avengers</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"icon-play\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fas fa-play\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</a> <a href=\"#\" class=\"product ml\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"status\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h1>Full 20/20 vietsub</h1>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div> <img src=\"./images/img-avengers.jpg\" alt=\"\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"movie-name\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h2>Avengers</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"icon-play\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fas fa-play\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</a> <a href=\"#\" class=\"product ml\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"status\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h1>Full 20/20 vietsub</h1>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div> <img src=\"./images/img-avengers.jpg\" alt=\"\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"movie-name\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h2>Avengers</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"icon-play\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fas fa-play\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</a> <a href=\"#\" class=\"product ml\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"status\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h1>Full 20/20 vietsub</h1>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div> <img src=\"./images/img-avengers.jpg\" alt=\"\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"movie-name\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h2>Avengers</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"icon-play\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fas fa-play\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</a> <a href=\"#\" class=\"product ml\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"status\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h1>Full 20/20 vietsub</h1>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div> <img src=\"./images/img-avengers.jpg\" alt=\"\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"movie-name\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h2>Avengers</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"icon-play\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fas fa-play\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</a> <a href=\"#\" class=\"product ml\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"status\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h1>Full 20/20 vietsub</h1>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div> <img src=\"./images/img-avengers.jpg\" alt=\"\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"movie-name\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h2>Avengers</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"icon-play\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fas fa-play\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</a> <a href=\"#\" class=\"product ml\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"status\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h1>Full 20/20 vietsub</h1>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div> <img src=\"./images/img-avengers.jpg\" alt=\"\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"movie-name\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h2>Avengers</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"icon-play\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fas fa-play\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</a> <a href=\"#\" class=\"product ml\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"status\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h1>Full 20/20 vietsub</h1>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div> <img src=\"./images/img-avengers.jpg\" alt=\"\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"movie-name\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h2>Avengers</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"icon-play\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fas fa-play\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- <div class=\"icons\">\r\n");
      out.write("                            <i class=\"fas fa-chevron-right\"></i>\r\n");
      out.write("                        </div> -->\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</section>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"moiandsc row\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"col-xl-8 col-lg-8\">\r\n");
      out.write("\t\t\t\t\t\t<section class=\"one\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<!-- TEMPLATE LIST -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"container-title row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h1 class=\"col-xl-8 col-lg-8 col-sm-8 col-5\">PHIM M???I:</h1>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<button\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"button suport tranf col-xl-3 col-lg-3 col-sm-3 col-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"./phimmoi.jsp\">Xem th??m</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<!-- MOVIE IMAGE -->\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"container-slider display-grid__for display-grid--sub\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"product\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"status\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h1>Full 20/20 vietsub</h1>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div> <img src=\"./images/img-avengers.jpg\" alt=\"\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"movie-name\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h2>Avengers</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"icon-play\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"fas fa-play\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a> <a href=\"#\" class=\"product\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"status\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h1>Full 20/20 vietsub</h1>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div> <img src=\"./images/img-avengers.jpg\" alt=\"\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"movie-name\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h2>Avengers</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"icon-play\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"fas fa-play\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a> <a href=\"#\" class=\"product\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"status\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h1>Full 20/20 vietsub</h1>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div> <img src=\"./images/img-avengers.jpg\" alt=\"\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"movie-name\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h2>Avengers</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"icon-play\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"fas fa-play\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a> <a href=\"#\" class=\"product\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"status\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h1>Full 20/20 vietsub</h1>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div> <img src=\"./images/img-avengers.jpg\" alt=\"\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"movie-name\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h2>Avengers</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"icon-play\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"fas fa-play\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a> <a href=\"#\" class=\"product\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"status\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h1>Full 20/20 vietsub</h1>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div> <img src=\"./images/img-avengers.jpg\" alt=\"\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"movie-name\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h2>Avengers</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"icon-play\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"fas fa-play\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a> <a href=\"#\" class=\"product\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"status\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h1>Full 20/20 vietsub</h1>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div> <img src=\"./images/img-avengers.jpg\" alt=\"\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"movie-name\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h2>Avengers</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"icon-play\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"fas fa-play\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a> <a href=\"#\" class=\"product\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"status\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h1>Full 20/20 vietsub</h1>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div> <img src=\"./images/img-avengers.jpg\" alt=\"\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"movie-name\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h2>Avengers</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"icon-play\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"fas fa-play\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a> <a href=\"#\" class=\"product\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"status\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h1>Full 20/20 vietsub</h1>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div> <img src=\"./images/img-avengers.jpg\" alt=\"\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"movie-name\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h2>Avengers</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"icon-play\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"fas fa-play\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</section>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"col-xl-4 col-lg-4 delete\">\r\n");
      out.write("\t\t\t\t\t\t<section class=\"two\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<!-- TEMPLATE LIST -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"container-title container-title__sub\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h1>PHIM S???P CHI???U:</h1>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<!-- MOVIE IMAGE -->\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"container-slider container-slider__sub \">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"product-sub row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"img-sub col-xl-5 col-lg-5 col-sm-4 col-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"./images/img-avengers.jpg\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"text-sub col-xl-7 col-lg-7 col-sm-8 col-8\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h1>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tAvenger Endgame\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</h2>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h3>C??ng chi???u: 1/1/2021</h3>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"text-sub__icon\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"fas fa-star\"></i> <i class=\"fas fa-star\"></i> <i\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"fas fa-star\"></i> <i class=\"fas fa-star\"></i> <i\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"fas fa-star\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a> <a href=\"#\" class=\"product-sub row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"img-sub col-xl-5 col-lg-5 col-sm-4 col-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"./images/img-avengers.jpg\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"text-sub col-xl-7 col-lg-7 col-sm-8 col-8\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h1>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tAvenger Endgame\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</h2>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h3>C??ng chi???u: 1/1/2021</h3>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"text-sub__icon\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"fas fa-star\"></i> <i class=\"fas fa-star\"></i> <i\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"fas fa-star\"></i> <i class=\"fas fa-star\"></i> <i\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"fas fa-star\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a> <a href=\"#\" class=\"product-sub row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"img-sub col-xl-5 col-lg-5 col-sm-4 col-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"./images/img-avengers.jpg\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"text-sub col-xl-7 col-lg-7 col-sm-8 col-8\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h1>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tAvenger Endgame\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</h2>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h3>C??ng chi???u: 1/1/2021</h3>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"text-sub__icon\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"fas fa-star\"></i> <i class=\"fas fa-star\"></i> <i\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"fas fa-star\"></i> <i class=\"fas fa-star\"></i> <i\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"fas fa-star\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a> <a href=\"#\" class=\"product-sub row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"img-sub col-xl-5 col-lg-5 col-sm-4 col-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"./images/img-avengers.jpg\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"text-sub col-xl-7 col-lg-7 col-sm-8 col-8\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h1>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tAvenger Endgame\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</h2>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h3>C??ng chi???u: 1/1/2021</h3>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"text-sub__icon\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"fas fa-star\"></i> <i class=\"fas fa-star\"></i> <i\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"fas fa-star\"></i> <i class=\"fas fa-star\"></i> <i\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"fas fa-star\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a> <a href=\"#\" class=\"product-sub row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"img-sub col-xl-5 col-lg-5 col-sm-4 col-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"./images/img-avengers.jpg\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"text-sub col-xl-7 col-lg-7 col-sm-8 col-8\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h1>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tAvenger Endgame\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</h2>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h3>C??ng chi???u: 1/1/2021</h3>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"text-sub__icon\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"fas fa-star\"></i> <i class=\"fas fa-star\"></i> <i\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"fas fa-star\"></i> <i class=\"fas fa-star\"></i> <i\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"fas fa-star\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</section>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<section class=\"container p0\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- TEMPLATE LIST -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"container-title row\">\r\n");
      out.write("\t\t\t\t\t\t<h1 class=\"col-xl-9 col-lg-9 col-sm-5 col-12\">PHIM HO???T H??NH:</h1>\r\n");
      out.write("\t\t\t\t\t\t<button\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"button suport tranf search-none col-xl-2 col-lg-2 col-sm-3 col-3\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"./phimhoathinh.jsp\">Xem th??m</a>\r\n");
      out.write("\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- MOVIE IMAGE display-grid-->\r\n");
      out.write("\t\t\t\t\t<div class=\"container-slider display-grid\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"product\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"status\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h1>Full 20/20 vietsub</h1>\r\n");
      out.write("\t\t\t\t\t\t\t</div> <img src=\"./images/img-avengers.jpg\" alt=\"\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"movie-name\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h2>Avengers</h2>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"icon-play\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fas fa-play\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</a> <a href=\"#\" class=\"product\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"status\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h1>Full 20/20 vietsub</h1>\r\n");
      out.write("\t\t\t\t\t\t\t</div> <img src=\"./images/img-avengers.jpg\" alt=\"\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"movie-name\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h2>Avengers</h2>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"icon-play\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fas fa-play\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</a> <a href=\"#\" class=\"product\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"status\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h1>Full 20/20 vietsub</h1>\r\n");
      out.write("\t\t\t\t\t\t\t</div> <img src=\"./images/img-avengers.jpg\" alt=\"\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"movie-name\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h2>Avengers</h2>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"icon-play\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fas fa-play\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</a> <a href=\"#\" class=\"product\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"status\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h1>Full 20/20 vietsub</h1>\r\n");
      out.write("\t\t\t\t\t\t\t</div> <img src=\"./images/img-avengers.jpg\" alt=\"\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"movie-name\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h2>Avengers</h2>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"icon-play\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fas fa-play\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</a> <a href=\"#\" class=\"product\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"status\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h1>Full 20/20 vietsub</h1>\r\n");
      out.write("\t\t\t\t\t\t\t</div> <img src=\"./images/img-avengers.jpg\" alt=\"\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"movie-name\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h2>Avengers</h2>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"icon-play\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fas fa-play\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</a> <a href=\"#\" class=\"product\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"status\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h1>Full 20/20 vietsub</h1>\r\n");
      out.write("\t\t\t\t\t\t\t</div> <img src=\"./images/img-avengers.jpg\" alt=\"\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"movie-name\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h2>Avengers</h2>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"icon-play\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fas fa-play\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</a> <a href=\"#\" class=\"product\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"status\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h1>Full 20/20 vietsub</h1>\r\n");
      out.write("\t\t\t\t\t\t\t</div> <img src=\"./images/img-avengers.jpg\" alt=\"\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"movie-name\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h2>Avengers</h2>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"icon-play\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fas fa-play\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</a> <a href=\"#\" class=\"product\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"status\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h1>Full 20/20 vietsub</h1>\r\n");
      out.write("\t\t\t\t\t\t\t</div> <img src=\"./images/img-avengers.jpg\" alt=\"\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"movie-name\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h2>Avengers</h2>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"icon-play\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fas fa-play\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</a> <a href=\"#\" class=\"product\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"status\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h1>Full 20/20 vietsub</h1>\r\n");
      out.write("\t\t\t\t\t\t\t</div> <img src=\"./images/img-avengers.jpg\" alt=\"\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"movie-name\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h2>Avengers</h2>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"icon-play\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fas fa-play\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</a> <a href=\"#\" class=\"product\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"status\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h1>Full 20/20 vietsub</h1>\r\n");
      out.write("\t\t\t\t\t\t\t</div> <img src=\"./images/img-avengers.jpg\" alt=\"\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"movie-name\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h2>Avengers</h2>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"icon-play\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fas fa-play\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</section>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
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
