/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.36
 * Generated at: 2022-01-16 17:14:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.decorators.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class phanquyen_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(7);
    _jspx_dependants.put("jar:file:/E:/demo/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/wed-jdbc-1-2023/WEB-INF/lib/sitemesh-2.4.2.jar!/META-INF/sitemesh-decorator.tld", Long.valueOf(1123653092000L));
    _jspx_dependants.put("jar:file:/E:/demo/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/wed-jdbc-1-2023/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153359882000L));
    _jspx_dependants.put("/common/taglib.jsp", Long.valueOf(1641969670734L));
    _jspx_dependants.put("/common/admin/footer.jsp", Long.valueOf(1642308338682L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1641546461421L));
    _jspx_dependants.put("/common/admin/header.jsp", Long.valueOf(1642353274863L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;

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
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
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
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>admin</title>\r\n");
      out.write("    <link href=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("    <link href=\"");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container mb\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("        \t\r\n");
      out.write("        \t<div class=\"col-xl-12 p0\">\r\n");
      out.write("        \t\t<div class=\"black p2 ct\">\r\n");
      out.write("        \t\t\t<h1>Xin chào Admin.</h1>        \t\t\r\n");
      out.write("        \t\t</div>\r\n");
      out.write("        \t</div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-xl-4 p0\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"black p2 sz\">\r\n");
      out.write("                    <i class=\"fab fa-viadeo-square\"></i> \r\n");
      out.write("                    Administrator\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"black p2\">\r\n");
      out.write("                    <i class=\"fas fa-home\"></i> \r\n");
      out.write("                    Trang chủ\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!-- QUẢN LÝ ĐĂNG TẢI -->\r\n");
      out.write("                <div class=\"black p2\">\r\n");
      out.write("                    <div id=\"btn\" onclick=\"Button()\" class=\"row\">\r\n");
      out.write("                        <div class=\"col-xl-1\">\r\n");
      out.write("                            <i class=\"far fa-clock\"></i> \r\n");
      out.write("                        </div>\r\n");
      out.write("    \r\n");
      out.write("                        <div class=\"col-xl-9\">\r\n");
      out.write("                            <span>\r\n");
      out.write("                                Quản lý đăng tải \r\n");
      out.write("                            </span>\r\n");
      out.write("                        </div>\r\n");
      out.write("    \r\n");
      out.write("                        <div class=\"col-xl-2\">\r\n");
      out.write("                            <span class=\"a\">\r\n");
      out.write("                                <i class=\"fas fa-caret-right\"></i>\r\n");
      out.write("                            </span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div id=\"menu\" class=\"off\">\r\n");
      out.write("                        <a href=\"");
      if (_jspx_meth_c_005furl_005f2(_jspx_page_context))
        return;
      out.write("\" class=\"black p2\">\r\n");
      out.write("                            <i class=\"fas fa-angle-right\"></i>\r\n");
      out.write("                            <span>Đăng tải phim</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("\r\n");
      out.write("                        <a href=\"");
      if (_jspx_meth_c_005furl_005f3(_jspx_page_context))
        return;
      out.write("\" class=\"black p2 l\">\r\n");
      out.write("                            <i class=\"fas fa-angle-right\"></i>\r\n");
      out.write("                            <span>Quản lý phim</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!-- CẤU HÌNH USER -->\r\n");
      out.write("                <div class=\"black p2\">\r\n");
      out.write("                    <div id=\"btn\" onclick=\"Button1()\" class=\"row\">\r\n");
      out.write("                        <div class=\"col-xl-1 col-lg-1 col-sm-1 col-1\">\r\n");
      out.write("                            <i class=\"fas fa-users\"></i> \r\n");
      out.write("                        </div>\r\n");
      out.write("    \r\n");
      out.write("                        <div class=\"col-xl-9 col-lg-9 col-sm-9 col-9\">\r\n");
      out.write("                            <span>\r\n");
      out.write("                                Cấu hình user\r\n");
      out.write("                            </span>\r\n");
      out.write("                        </div>\r\n");
      out.write("    \r\n");
      out.write("                        <div class=\"col-xl-2 col-lg-2 col-sm-2 col-2\">\r\n");
      out.write("                            <span class=\"a1\">\r\n");
      out.write("                                <i class=\"fas fa-caret-right\"></i>\r\n");
      out.write("                            </span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div id=\"menu1\" class=\"off\">\r\n");
      out.write("                        <a href=\"");
      if (_jspx_meth_c_005furl_005f4(_jspx_page_context))
        return;
      out.write("\" class=\"black p2\">\r\n");
      out.write("                            <i class=\"fas fa-angle-right\"></i>\r\n");
      out.write("                            <span>Tài khoản admin</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("\r\n");
      out.write("                        <a href=\"");
      if (_jspx_meth_c_005furl_005f5(_jspx_page_context))
        return;
      out.write("\" class=\"black p2 k\">\r\n");
      out.write("                            <i class=\"fas fa-angle-right\"></i>\r\n");
      out.write("                            <span>Phân quyền</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        \r\n");
      out.write("                        <a href=\"");
      if (_jspx_meth_c_005furl_005f6(_jspx_page_context))
        return;
      out.write("\" class=\"black p2 j\">\r\n");
      out.write("                            <i class=\"fas fa-angle-right\"></i>\r\n");
      out.write("                            <span>Quản lý user</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-xl-8 p0\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"black p2\">\r\n");
      out.write("                    <a href=\"../wed/home.jsp\" target=\"_blank\">\r\n");
      out.write("                        <i class=\"fas fa-share-square\"></i> \r\n");
      out.write("                        Đến trang wedsite\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"black p2\">\r\n");
      out.write("                    <span class=\"t\"></span>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"black p2\">\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"row center\">\r\n");
      out.write("\t\t<div class=\"col-xl-6\">\r\n");
      out.write("\t\t\t<form action=\"#\" method=\"\">\r\n");
      out.write("\t\t\t\t<div class=\"row center\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-xl-9 p0\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" placeholder=\"search...\" class=\"p3\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-xl-2 p0 white ct\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"fas fa-search\"></i>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"col-xl-3\">\r\n");
      out.write("\t\t\t<a href=\"#\" class=\"backgr ct\">Xem tất cả</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"col-xl-3\">\r\n");
      out.write("\t\t\t<a href=\"#\" class=\"backgr ct\"><i class=\"fas fa-plus\"></i> Thêm\r\n");
      out.write("\t\t\t\tmới</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"black p2\">\r\n");
      out.write("\r\n");
      out.write("\t<table class=\"mt mb \">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>Id</td>\r\n");
      out.write("\t\t\t<td>Tên người dùng</td>\r\n");
      out.write("\t\t\t<td>Tài khoản</td>\r\n");
      out.write("\t\t\t<td>Mật khẩu</td>\r\n");
      out.write("\t\t\t<td>Quyền hạn</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th>001</th>\r\n");
      out.write("\t\t\t<th>Tuấn wibu</th>\r\n");
      out.write("\t\t\t<th>Tuanwibu</th>\r\n");
      out.write("\t\t\t<th>123456789</th>\r\n");
      out.write("\t\t\t<th class=\"row m0 center\"><select name=\"quyenhan\" id=\"\">\r\n");
      out.write("\t\t\t\t\t<option value=\"1\">Bình thường</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"2\">Quản lý user</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"3\">Quản lý đăng phim</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"4\">Quản lý phim</option>\r\n");
      out.write("\t\t\t</select></th>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th>001</th>\r\n");
      out.write("\t\t\t<th>Tuấn wibu</th>\r\n");
      out.write("\t\t\t<th>Tuanwibu</th>\r\n");
      out.write("\t\t\t<th>123456789</th>\r\n");
      out.write("\t\t\t<th class=\"row m0 center\"><select name=\"danhmuc\" id=\"\">\r\n");
      out.write("\t\t\t\t\t<option value=\"1\">Bình thường</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"2\">Quản lý user</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"3\">Quản lý đăng phim</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"4\">Quản lý phim</option>\r\n");
      out.write("\t\t\t</select></th>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th>001</th>\r\n");
      out.write("\t\t\t<th>Tuấn wibu</th>\r\n");
      out.write("\t\t\t<th>Tuanwibu</th>\r\n");
      out.write("\t\t\t<th>123456789</th>\r\n");
      out.write("\t\t\t<th class=\"row m0 center\"><select name=\"danhmuc\" id=\"\">\r\n");
      out.write("\t\t\t\t\t<option value=\"1\">Bình thường</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"2\">Quản lý user</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"3\">Quản lý đăng phim</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"4\">Quản lý phim</option>\r\n");
      out.write("\t\t\t</select></th>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t</table>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"row center mt mb\">\r\n");
      out.write("\t\t<div class=\"col-xl-4 col-lg-4 col-sm-4 col-4 p0\">\r\n");
      out.write("\t\t\t<input type=\"button\" value=\"Cập nhật\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</table>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\tconst btnA = document.querySelector('.t');\r\n");
      out.write("\tdocument.querySelector('#menu1').classList.remove('off');\r\n");
      out.write("\tdocument.querySelector('#menu1 .k').classList.add('active');\r\n");
      out.write("\tdocument.querySelector('.a1').classList.add('down');\r\n");
      out.write("\r\n");
      out.write("\tbtnA.innerHTML = \"Quản lý user >> phân quyền:\";\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <script>\r\n");
      out.write("        const navMenu = document.querySelector('#menu');\r\n");
      out.write("        const navMenu1 = document.querySelector('#menu1');\r\n");
      out.write("        const navDown = document.querySelector('.a');\r\n");
      out.write("        const navDown1 = document.querySelector('.a1');\r\n");
      out.write("\r\n");
      out.write("        function Button() {\r\n");
      out.write("            navMenu.classList.toggle('off');\r\n");
      out.write("            navDown.classList.toggle('down');\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        function Button1() {\r\n");
      out.write("            navMenu1.classList.toggle('off');\r\n");
      out.write("            navDown1.classList.toggle('down');\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent(null);
    // /common/admin/header.jsp(9,16) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue("/template/admin/css/style.css");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f1.setParent(null);
    // /common/admin/header.jsp(10,16) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f1.setValue("/template/icon/fontawesome-free-5.15.3-web/css/all.min.css");
    int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
    if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f2.setParent(null);
    // /common/admin/header.jsp(57,33) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f2.setValue("/decorators/admin/dangtaiphim.jsp");
    int _jspx_eval_c_005furl_005f2 = _jspx_th_c_005furl_005f2.doStartTag();
    if (_jspx_th_c_005furl_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f3 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f3.setParent(null);
    // /common/admin/header.jsp(62,33) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f3.setValue("/decorators/admin/qlphim.jsp");
    int _jspx_eval_c_005furl_005f3 = _jspx_th_c_005furl_005f3.doStartTag();
    if (_jspx_th_c_005furl_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f3);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f4(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f4 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f4.setParent(null);
    // /common/admin/header.jsp(90,33) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f4.setValue("/decorators/admin/tkadmin.jsp");
    int _jspx_eval_c_005furl_005f4 = _jspx_th_c_005furl_005f4.doStartTag();
    if (_jspx_th_c_005furl_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f4);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f5(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f5 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f5.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f5.setParent(null);
    // /common/admin/header.jsp(95,33) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f5.setValue("/decorators/admin/phanquyen.jsp");
    int _jspx_eval_c_005furl_005f5 = _jspx_th_c_005furl_005f5.doStartTag();
    if (_jspx_th_c_005furl_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f5);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f6(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f6 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f6.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f6.setParent(null);
    // /common/admin/header.jsp(100,33) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f6.setValue("/decorators/admin/qluser.jsp");
    int _jspx_eval_c_005furl_005f6 = _jspx_th_c_005furl_005f6.doStartTag();
    if (_jspx_th_c_005furl_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f6);
    return false;
  }
}
