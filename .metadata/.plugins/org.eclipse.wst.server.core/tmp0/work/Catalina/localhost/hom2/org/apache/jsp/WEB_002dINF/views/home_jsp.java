/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.97
 * Generated at: 2024-11-12 06:22:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1730098803747L));
    _jspx_dependants.put("jar:file:/D:/springwork/spring_WEB/src/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/www2/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
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
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("<title>It's me !</title>\n");
      out.write("<script src=\"https://kit.fontawesome.com/a18034e305.js\"\n");
      out.write("	crossorigin=\"anonymous\"></script>\n");
      out.write("<link\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\"\n");
      out.write("	rel=\"stylesheet\">\n");
      out.write("<script\n");
      out.write("	src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("<style>\n");
      out.write("body {\n");
      out.write("	margin: 0;\n");
      out.write("	background-color: rgb(167, 184, 206);\n");
      out.write("}\n");
      out.write("\n");
      out.write("header {\n");
      out.write("	position: fixed;\n");
      out.write("	width: 100%;\n");
      out.write("	top: 0;\n");
      out.write("	z-index: 1;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".navbar {\n");
      out.write("	width: 100%;\n");
      out.write("	padding-top: 25px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("main {\n");
      out.write("	position: sticky;\n");
      out.write("	width: 400px;\n");
      out.write("	height: auto;\n");
      out.write("	/* border: 1px solid; */\n");
      out.write("	margin: 60px auto;\n");
      out.write("	margin-top: 200px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("main div img {\n");
      out.write("	width: 100%;\n");
      out.write("	height: auto;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".img1 {\n");
      out.write("	border-radius: 25%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("section {\n");
      out.write("	text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".nav-item {\n");
      out.write("	font-size: 14px;\n");
      out.write("	text-align: center;\n");
      out.write("	align-items: center;\n");
      out.write("	margin-left: 100px;\n");
      out.write("	margin-right: 128px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".nav-item:hover {\n");
      out.write("	background-color: rgb(158, 194, 174);\n");
      out.write("	border-radius: 30%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".collapse {\n");
      out.write("	margin-left: 50px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".carousel-inner {\n");
      out.write("	border-radius: 25%;\n");
      out.write("	position: sticky;\n");
      out.write("}\n");
      out.write("\n");
      out.write("article button {\n");
      out.write("	background-color: rgb(167, 184, 206);;\n");
      out.write("	border-radius: 20%;\n");
      out.write("	border: 0px;\n");
      out.write("	/* margin-bottom: 10px; */\n");
      out.write("}\n");
      out.write("\n");
      out.write("footer {\n");
      out.write("	height: 70px;\n");
      out.write("	width: 100%;\n");
      out.write("	background-color: rgb(127, 111, 126);\n");
      out.write("	font-size: 30px;\n");
      out.write("	text-align: center;\n");
      out.write("	position: fixed;\n");
      out.write("	bottom: 0;\n");
      out.write("	justify-content: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write("footer div {\n");
      out.write("	width: 10%;\n");
      out.write("	display: inline-block;\n");
      out.write("	margin-top: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("footer button {\n");
      out.write("	background-color: rgb(127, 111, 126);;\n");
      out.write("	border: 0px;\n");
      out.write("	border-radius: 20%;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("	<header>\n");
      out.write("		<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("			<div class=\"container-fluid\">\n");
      out.write("				<button class=\"navbar-toggler\" type=\"button\"\n");
      out.write("					data-bs-toggle=\"collapse\" data-bs-target=\"#navbarNav\"\n");
      out.write("					aria-controls=\"navbarNav\" aria-expanded=\"false\"\n");
      out.write("					aria-label=\"Toggle navigation\">\n");
      out.write("					<span class=\"navbar-toggler-icon\"></span>\n");
      out.write("				</button>\n");
      out.write("				<div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n");
      out.write("					<ul class=\"navbar-nav ms-auto\">\n");
      out.write("						<li class=\"nav-item\"><i class=\"fa-solid fa-house\"></i><a\n");
      out.write("							class=\"nav-link\" href=\"\">HOME</a></li>\n");
      out.write("						<li class=\"nav-item\"><i class=\"fa-solid fa-user\"></i><a\n");
      out.write("							class=\"nav-link\" href=\"\">PROFILE</a></li>\n");
      out.write("						<li class=\"nav-item\"><i class=\"fa-solid fa-thumbs-up\"></i><a\n");
      out.write("							class=\"nav-link\" href=\"\">FAVORITE</a></li>\n");
      out.write("						<li class=\"nav-item\"><i class=\"fa-solid fa-address-card\"></i><a\n");
      out.write("							class=\"nav-link\" href=\"board\">게시판</a></li>\n");
      out.write("					</ul>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("		</nav>\n");
      out.write("	</header>\n");
      out.write("	<main>\n");
      out.write("		<div id=\"carouselExampleIndicators\" class=\"carousel slide\">\n");
      out.write("			<div class=\"carousel-indicators\">\n");
      out.write("				<button type=\"button\" data-bs-target=\"#carouselExampleIndicators\"\n");
      out.write("					data-bs-slide-to=\"0\" class=\"active\" aria-current=\"true\"\n");
      out.write("					aria-label=\"Slide 1\"></button>\n");
      out.write("				<button type=\"button\" data-bs-target=\"#carouselExampleIndicators\"\n");
      out.write("					data-bs-slide-to=\"1\" aria-label=\"Slide 2\"></button>\n");
      out.write("				<button type=\"button\" data-bs-target=\"#carouselExampleIndicators\"\n");
      out.write("					data-bs-slide-to=\"2\" aria-label=\"Slide 3\"></button>\n");
      out.write("			</div>\n");
      out.write("			<div class=\"carousel-inner\">\n");
      out.write("				<div class=\"carousel-item active\">\n");
      out.write("					<img src=\"");
      out.print(request.getContextPath());
      out.write("/resources/이미지/나.jpg\"\n");
      out.write("						class=\"d-block w-100\" alt=\"나\">\n");
      out.write("				</div>\n");
      out.write("				<div class=\"carousel-item\">\n");
      out.write("					<img src=\"");
      out.print(request.getContextPath());
      out.write("/resources/이미지/나1.jpg\"\n");
      out.write("						class=\"d-block w-100\" alt=\"나1\">\n");
      out.write("				</div>\n");
      out.write("				<div class=\"carousel-item\">\n");
      out.write("					<img src=\"");
      out.print(request.getContextPath());
      out.write("/resources/이미지/나3.jpg\"\n");
      out.write("						class=\"d-block w-100\" style=\"height: 533px;\" alt=\"나3\">\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("			<button class=\"carousel-control-prev\" type=\"button\"\n");
      out.write("				data-bs-target=\"#carouselExampleIndicators\" data-bs-slide=\"prev\">\n");
      out.write("				<span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("				<span class=\"visually-hidden\">Previous</span>\n");
      out.write("			</button>\n");
      out.write("			<button class=\"carousel-control-next\" type=\"button\"\n");
      out.write("				data-bs-target=\"#carouselExampleIndicators\" data-bs-slide=\"next\">\n");
      out.write("				<span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("				<span class=\"visually-hidden\">Next</span>\n");
      out.write("			</button>\n");
      out.write("		</div>\n");
      out.write("		<section>\n");
      out.write("			<hr>\n");
      out.write("			<p>\n");
      out.write("				<button class=\"btn btn-light\" type=\"button\"\n");
      out.write("					data-bs-toggle=\"collapse\" data-bs-target=\"#collapseWidthExample\"\n");
      out.write("					aria-expanded=\"false\" aria-controls=\"collapseWidthExample\">\n");
      out.write("					더보기</button>\n");
      out.write("			</p>\n");
      out.write("			<div style=\"min-height: 120px;\">\n");
      out.write("				<div class=\"collapse collapse-horizontal\" id=\"collapseWidthExample\">\n");
      out.write("					<div class=\"card card-body\" style=\"width: 300px;\">나는 이현건입니다.\n");
      out.write("					</div>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("		</section>\n");
      out.write("	</main>\n");
      out.write("\n");
      out.write("	<footer>\n");
      out.write("		<div>\n");
      out.write("			<button type=\"button\">\n");
      out.write("				<span><i class=\"fa-solid fa-phone\"></i></span>\n");
      out.write("			</button>\n");
      out.write("		</div>\n");
      out.write("		<div>\n");
      out.write("			<button type=\"button\">\n");
      out.write("				<span><i class=\"fa-brands fa-instagram\"></i></span>\n");
      out.write("			</button>\n");
      out.write("		</div>\n");
      out.write("		<div>\n");
      out.write("			<button type=\"button\">\n");
      out.write("				<span><i class=\"fa-brands fa-github\"></i></span>\n");
      out.write("			</button>\n");
      out.write("		</div>\n");
      out.write("	</footer>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
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
