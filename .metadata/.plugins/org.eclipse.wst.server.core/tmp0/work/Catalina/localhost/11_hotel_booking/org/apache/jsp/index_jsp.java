/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.63
 * Generated at: 2022-05-31 06:54:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/footer.jsp", Long.valueOf(1653958934596L));
    _jspx_dependants.put("/WEB-INF/lib/standard.jar", Long.valueOf(1653275274509L));
    _jspx_dependants.put("jar:file:/D:/JspWorkspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/11_hotel_booking/WEB-INF/lib/standard.jar!/META-INF/fmt.tld", Long.valueOf(1098678690000L));
    _jspx_dependants.put("jar:file:/D:/JspWorkspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/11_hotel_booking/WEB-INF/lib/standard.jar!/META-INF/c.tld", Long.valueOf(1098678690000L));
    _jspx_dependants.put("/header.jsp", Long.valueOf(1653961292769L));
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"UTF-8\">\r\n");
      out.write("  <title>호텔 예약</title> \r\n");
      out.write("  <link href=\"css/booking.css\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!--헤더파일 들어가는 곳 시작 -->\r\n");
      out.write("  <header>\r\n");
      out.write("    <!--로고 들어가는 곳 시작--->  \r\n");
      out.write("    <div id=\"logo\">\r\n");
      out.write("      <a href=\"BookingServlet?command=index\">\r\n");
      out.write("        <img src=\"images/hotel_logo.png\" width=\"100\" height=\"100\" alt=\"oceanhill hotel\">\r\n");
      out.write("      </a>  \r\n");
      out.write("    </div>\r\n");
      out.write("    <!--로고 들어가는 곳 끝--> \r\n");
      out.write("    <nav id=\"main_title\">\r\n");
      out.write("     <ul>    \r\n");
      out.write("       <li>\r\n");
      out.write("         <a href=\"BookingServlet?command=index\">오션힐 호텔</a>\r\n");
      out.write("       </li>\r\n");
      out.write("     </ul>\r\n");
      out.write("    </nav>\r\n");
      out.write("    \r\n");
      out.write("    <nav id=\"top_menu\">\r\n");
      out.write("      <ul>\r\n");
      out.write("        <li>\r\n");
      out.write("          <a href=\"BookingServlet?command=booking_form\">예약 하기</a>\r\n");
      out.write("        </li>  \r\n");
      out.write("        <li>\r\n");
      out.write("          <a href=\"BookingServlet?command=booking_list\">객실 예약현황</a>\r\n");
      out.write("        </li>  \r\n");
      out.write("      </ul>\r\n");
      out.write("    </nav>\r\n");
      out.write("    <div class=\"clear\"></div>\r\n");
      out.write("    \r\n");
      out.write("  </header>\r\n");
      out.write("  <!--헤더파일 들어가는 곳 끝 -->\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("  <!--메인 이미지 들어가는 곳 시작 --->\r\n");
      out.write("  <div class=\"clear\"></div>\r\n");
      out.write("  <div id=\"main_img\">\r\n");
      out.write("    <img src=\"images/hotel_main.jpg\" >    \r\n");
      out.write("  </div>\r\n");
      out.write("  <!--메인 이미지 들어가는 곳 끝--->\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("  <div class=\"clear\"></div>\r\n");
      out.write("    \r\n");
      out.write("  <footer>  \r\n");
      out.write("    <hr>\r\n");
      out.write("    <div id=\"copy\">\r\n");
      out.write("     All contents Copyright 2013 OceanHill Hotel Inc. all rights reserved<br>\r\n");
      out.write("     Contact mail : admin@ocean_hill.com Tel: +82 64 123 4315 \r\n");
      out.write("     Fax +82 64 123 4321\r\n");
      out.write("    </div>         \r\n");
      out.write("  </footer>\r\n");
      out.write("</div>\r\n");
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