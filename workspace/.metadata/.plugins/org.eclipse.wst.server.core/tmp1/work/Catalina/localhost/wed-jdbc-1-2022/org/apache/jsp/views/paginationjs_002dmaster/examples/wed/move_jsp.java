/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.36
 * Generated at: 2022-01-12 17:03:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.paginationjs_002dmaster.examples.wed;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class move_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/views/paginationjs-master/examples/wed/footer.jsp", Long.valueOf(1642003284364L));
    _jspx_dependants.put("/views/paginationjs-master/examples/wed/header.jsp", Long.valueOf(1642004443522L));
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
      out.write("<title>L??u ????i coder</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"main\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<header id=\"header\" class=\"heading\">\r\n");
      out.write("\r\n");
      out.write("            <!-- HEADING -->\r\n");
      out.write("            <div class=\"logo-search display-flex\">\r\n");
      out.write("                <div class=\"logo\">\r\n");
      out.write("                    <img src=\"./images/logo.png\" alt=\"\">\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"input-search\">\r\n");
      out.write("                    <form id=\"input-search\" action=\"\" method=\"GET\" >\r\n");
      out.write("                        <div class=\"input-search__sub display-flex\">\r\n");
      out.write("                            <input type=\"text\" name=\"search\" placeholder=\"search...\">\r\n");
      out.write("\r\n");
      out.write("                            <button class=\"icon-saearch\">\r\n");
      out.write("                                <i class=\"fas fa-search\"></i>\r\n");
      out.write("                            </button>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"login-register\">\r\n");
      out.write("                    <!-- LOGIN R???I -->\r\n");
      out.write("                    <!--  <div class=\"logged\">\r\n");
      out.write("                            <div class=\"logged-name\">\r\n");
      out.write("                                <div class=\"name-sub display-flex\">\r\n");
      out.write("                                    <h1>?????c Tu???n</h1>\r\n");
      out.write("                                    <i class=\"fas fa-sort-down\"></i>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            \r\n");
      out.write("                                <ul class=\"logger-sub\">\r\n");
      out.write("                                    <li><a href=\"#\">Th??ng tin t??i kho???n</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">?????i m???t kh???u</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">????ng xu???t</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"avatar\">\r\n");
      out.write("                                <img src=\"./image/anime-???c s??n.jpg\" alt=\"\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                    </div>-->\r\n");
      out.write("\r\n");
      out.write("                    <!-- CH??A LOGIN -->\r\n");
      out.write("                    <div class=\"No-logged-in display-flex\">\r\n");
      out.write("                            <div class=\"login\">\r\n");
      out.write("                                <a href=\"./login.jsp\" class=\"display-flex\">\r\n");
      out.write("                                    <h2>????ng nh???p</h2>\r\n");
      out.write("                                    <div class=\"iconlogin-register\">\r\n");
      out.write("                                        <i class=\"fas fa-sign-in-alt\"></i>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"register\">\r\n");
      out.write("                                <a href=\"./register.jsp\" class=\"display-flex\">\r\n");
      out.write("                                    <h2>????ng k??</h2>\r\n");
      out.write("                                    <div class=\"iconlogin-register\">\r\n");
      out.write("                                        <i class=\"fas fa-user-plus\"></i>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <hr>\r\n");
      out.write("            <!-- MENU -->\r\n");
      out.write("            <nav class=\"menu\">\r\n");
      out.write("                \r\n");
      out.write("                <ul class=\"display-flex\">\r\n");
      out.write("                    <li><a href=\"./home.jsp\" class=\"nav-link\">Trang ch???</a></li>\r\n");
      out.write("                    <li class=\"tl\">\r\n");
      out.write("                        <a href=\"#\" class=\"display-flex nav-link\">\r\n");
      out.write("                            Th??? lo???i \r\n");
      out.write("                            <i class=\"fas fa-chevron-down\"></i>\r\n");
      out.write("                        </a>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"tl-sub\">\r\n");
      out.write("                            <ul class=\"display-grid\">\r\n");
      out.write("                                <li><a href=\"#\">T??m l?? - t??nh c???m</a></li>\r\n");
      out.write("                                <li><a href=\"#\">T??m l?? - t??nh c???m</a></li>\r\n");
      out.write("                                <li><a href=\"#\">T??m l?? - t??nh c???m</a></li>\r\n");
      out.write("                                <li><a href=\"#\">T??m l?? - t??nh c???m</a></li>\r\n");
      out.write("                                <li><a href=\"#\">T??m l?? - t??nh c???m</a></li>\r\n");
      out.write("                                <li><a href=\"#\">T??m l?? - t??nh c???m</a></li>\r\n");
      out.write("                                <li><a href=\"#\">T??m l?? - t??nh c???m</a></li>\r\n");
      out.write("                                <li><a href=\"#\">T??m l?? - t??nh c???m</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li><a href=\"#\" class=\"nav-link\">Phim h??t</a></li>\r\n");
      out.write("                    <li><a href=\"./phimmoi.jsp\" class=\"nav-link\">Phim m???i</a></li>\r\n");
      out.write("                    <li><a href=\"./phimle.jsp\"class=\"nav-link\">Phim l???</a></li>\r\n");
      out.write("                    <li><a href=\"./phimbo.jsp\" class=\"nav-link\">Phim b???</a></li>\r\n");
      out.write("                    <li><a href=\"./phimhoathinh.jsp\" class=\"nav-link\">Ho???t h??nh</a></li>\r\n");
      out.write("                    <li><a href=\"#\" class=\"nav-link\"></a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("\r\n");
      out.write("            \r\n");
      out.write("            </nav>\r\n");
      out.write("        </header>\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <!-- SECTION MOVE -->\r\n");
      out.write("        <section class=\"container\">\r\n");
      out.write("\r\n");
      out.write("\t        <!-- TEMPLATE LIST -->\r\n");
      out.write("\t        \r\n");
      out.write("\t        <div class=\"container-title\">\r\n");
      out.write("\t            <h1>PHIM L???:</h1>\r\n");
      out.write("\t        </div>\r\n");
      out.write("\t\r\n");
      out.write("\t        <!-- MOVIE IMAGE -->\r\n");
      out.write("\t        <div class=\"container-slider display-grid\">\r\n");
      out.write("\t\r\n");
      out.write("\t            <a href=\"#\" class=\"product\">\r\n");
      out.write("\t                    <div class=\"status\">\r\n");
      out.write("\t                        <h1>Full 20/20 vietsub</h1>\r\n");
      out.write("\t                    </div>\r\n");
      out.write("\t                    <img src=\"./image/poster-phim.jpg\" alt=\"\">\r\n");
      out.write("\t                    <div class=\"movie-name\">\r\n");
      out.write("\t                        <h2>phim l???</h2>\r\n");
      out.write("\t                    </div>\r\n");
      out.write("\t                    <div class=\"icon-play\">\r\n");
      out.write("\t                        <i class=\"fas fa-play\"></i>\r\n");
      out.write("\t                    </div>\r\n");
      out.write("\t             </a>\r\n");
      out.write("\t             \r\n");
      out.write("\t             <a href=\"#\" class=\"product\">\r\n");
      out.write("\t                    <div class=\"status\">\r\n");
      out.write("\t                        <h1>Full 20/20 vietsub</h1>\r\n");
      out.write("\t                    </div>\r\n");
      out.write("\t                    <img src=\"./image/poster-phim.jpg\" alt=\"\">\r\n");
      out.write("\t                    <div class=\"movie-name\">\r\n");
      out.write("\t                        <h2>phim l???</h2>\r\n");
      out.write("\t                    </div>\r\n");
      out.write("\t                    <div class=\"icon-play\">\r\n");
      out.write("\t                        <i class=\"fas fa-play\"></i>\r\n");
      out.write("\t                    </div>\r\n");
      out.write("\t             </a>\r\n");
      out.write("\t             \r\n");
      out.write("\t             <a href=\"#\" class=\"product\">\r\n");
      out.write("\t                    <div class=\"status\">\r\n");
      out.write("\t                        <h1>Full 20/20 vietsub</h1>\r\n");
      out.write("\t                    </div>\r\n");
      out.write("\t                    <img src=\"./image/poster-phim.jpg\" alt=\"\">\r\n");
      out.write("\t                    <div class=\"movie-name\">\r\n");
      out.write("\t                        <h2>phim l???</h2>\r\n");
      out.write("\t                    </div>\r\n");
      out.write("\t                    <div class=\"icon-play\">\r\n");
      out.write("\t                        <i class=\"fas fa-play\"></i>\r\n");
      out.write("\t                    </div>\r\n");
      out.write("\t             </a>\r\n");
      out.write("\t             \r\n");
      out.write("\t             <a href=\"#\" class=\"product\">\r\n");
      out.write("\t                    <div class=\"status\">\r\n");
      out.write("\t                        <h1>Full 20/20 vietsub</h1>\r\n");
      out.write("\t                    </div>\r\n");
      out.write("\t                    <img src=\"./image/poster-phim.jpg\" alt=\"\">\r\n");
      out.write("\t                    <div class=\"movie-name\">\r\n");
      out.write("\t                        <h2>phim l???</h2>\r\n");
      out.write("\t                    </div>\r\n");
      out.write("\t                    <div class=\"icon-play\">\r\n");
      out.write("\t                        <i class=\"fas fa-play\"></i>\r\n");
      out.write("\t                    </div>\r\n");
      out.write("\t             </a>\r\n");
      out.write("\t             \r\n");
      out.write("\t             <a href=\"#\" class=\"product\">\r\n");
      out.write("\t                    <div class=\"status\">\r\n");
      out.write("\t                        <h1>Full 20/20 vietsub</h1>\r\n");
      out.write("\t                    </div>\r\n");
      out.write("\t                    <img src=\"./image/poster-phim.jpg\" alt=\"\">\r\n");
      out.write("\t                    <div class=\"movie-name\">\r\n");
      out.write("\t                        <h2>phim l???</h2>\r\n");
      out.write("\t                    </div>\r\n");
      out.write("\t                    <div class=\"icon-play\">\r\n");
      out.write("\t                        <i class=\"fas fa-play\"></i>\r\n");
      out.write("\t                    </div>\r\n");
      out.write("\t             </a>\r\n");
      out.write("\t             \r\n");
      out.write("\t             <a href=\"#\" class=\"product\">\r\n");
      out.write("\t                    <div class=\"status\">\r\n");
      out.write("\t                        <h1>Full 20/20 vietsub</h1>\r\n");
      out.write("\t                    </div>\r\n");
      out.write("\t                    <img src=\"./image/poster-phim.jpg\" alt=\"\">\r\n");
      out.write("\t                    <div class=\"movie-name\">\r\n");
      out.write("\t                        <h2>phim l???</h2>\r\n");
      out.write("\t                    </div>\r\n");
      out.write("\t                    <div class=\"icon-play\">\r\n");
      out.write("\t                        <i class=\"fas fa-play\"></i>\r\n");
      out.write("\t                    </div>\r\n");
      out.write("\t             </a>\r\n");
      out.write("\t             \r\n");
      out.write("\t             <a href=\"#\" class=\"product\">\r\n");
      out.write("\t                    <div class=\"status\">\r\n");
      out.write("\t                        <h1>Full 20/20 vietsub</h1>\r\n");
      out.write("\t                    </div>\r\n");
      out.write("\t                    <img src=\"./image/poster-phim.jpg\" alt=\"\">\r\n");
      out.write("\t                    <div class=\"movie-name\">\r\n");
      out.write("\t                        <h2>phim l???</h2>\r\n");
      out.write("\t                    </div>\r\n");
      out.write("\t                    <div class=\"icon-play\">\r\n");
      out.write("\t                        <i class=\"fas fa-play\"></i>\r\n");
      out.write("\t                    </div>\r\n");
      out.write("\t             </a>\r\n");
      out.write("\t\r\n");
      out.write("\t        </div>\r\n");
      out.write("    \t\r\n");
      out.write("    \t</section>\r\n");
      out.write("\r\n");
      out.write("    \t\r\n");
      out.write("    \t\r\n");
      out.write("    \t<!-- FOOTER -->\r\n");
      out.write("    \t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- FOOTER -->\r\n");
      out.write("    \t<footer class=\"footer\">\r\n");
      out.write("    \t\t<div class=\"footer-top\">\r\n");
      out.write("               \t<div class=\"footer-top__left\">\r\n");
      out.write("                    <p>\r\n");
      out.write("                        Xem phim hay mi???n ph?? ch???t l?????ng cao v???i ph??? ????? ti???ng vi???t - thuy???t minh - l???ng ti???ng. Wedsite c?? nhi???u th??? lo???i phim phong ph??, ?????c s???c, nhi???u b??? phim hay nh???t - m???i nh???t. <br> <br>\r\n");
      out.write("                        Website v???i giao di???n tr???c quan, thu???n ti???n, t???c ????? t???i nhanh, v???i ????? tin c???y cao h???a h???n s??? ??em l???i nh???ng tr???i nghi???m t???t nh???t cho ng?????i d??ng.\r\n");
      out.write("                    </p>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"footer-top__right\">\r\n");
      out.write("                    <div class=\"footer-top__right--left\">\r\n");
      out.write("                        <p>\r\n");
      out.write("                            <a href=\"#\">Quy ?????nh</a>\r\n");
      out.write("                            <a href=\"#\">Ch??nh s??ch ri??ng t??</a>\r\n");
      out.write("                           <a href=\"#\">??i???u kho???n chung</a>\r\n");
      out.write("                        </p>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"footer-top__right--right\">\r\n");
      out.write("                        <p>\r\n");
      out.write("                            <a href=\"#\">Gi???i thi???u</a>\r\n");
      out.write("                            <a href=\"#\">Trang ch???</a>\r\n");
      out.write("                            <a href=\"#\">Facebook</a>\r\n");
      out.write("                        </p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"footer-down\">\r\n");
      out.write("                <h2>Wedsite ???????c th???c hi???n b???i nh??m code: L??U ????I CODER.</h2>\r\n");
      out.write("            </div>\r\n");
      out.write("        </footer>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
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
