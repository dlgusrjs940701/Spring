/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.97
 * Generated at: 2024-11-14 03:33:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class modform_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"UTF-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("  <title>Document</title>\r\n");
      out.write("</head>\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\r\n");
      out.write("  integrity=\"sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9\" crossorigin=\"anonymous\">\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("  integrity=\"sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("  body {\r\n");
      out.write("    margin: 0px;\r\n");
      out.write("    width: 1920px;\r\n");
      out.write("    height: 1024px;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  #userinfo {\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("    width: 1000px;\r\n");
      out.write("    height: 50px;\r\n");
      out.write("    /*  background-color: aqua;*/\r\n");
      out.write("    top: 40px;\r\n");
      out.write("    left: 1700px;\r\n");
      out.write("    position: absolute;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  #header {\r\n");
      out.write("    width: 1920px;\r\n");
      out.write("    height: 100px;\r\n");
      out.write("    /* background-color: rgb(98, 139, 253);*/\r\n");
      out.write("    padding-top: 20px;\r\n");
      out.write("    box-sizing: border-box;\r\n");
      out.write("    float: left;\r\n");
      out.write("    /* display: flex;*/\r\n");
      out.write("\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  .header_20 input[type=text] {\r\n");
      out.write("    width: 500px;\r\n");
      out.write("    height: 32px;\r\n");
      out.write("    font-size: 15px;\r\n");
      out.write("    border: solid 1px gray;\r\n");
      out.write("    border-radius: 15px;\r\n");
      out.write("    outline: none;\r\n");
      out.write("    margin-bottom: 10px;\r\n");
      out.write("    background-color: rgb(233, 233, 233);\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  .header_10 {\r\n");
      out.write("    width: 400px;\r\n");
      out.write("    height: 40px;\r\n");
      out.write("    /* border: 1px solid;*/\r\n");
      out.write("    margin: 0px auto;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    float: left;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  .header_20 {\r\n");
      out.write("    padding-top: 5px;\r\n");
      out.write("    width: 1500px;\r\n");
      out.write("    height: 40px;\r\n");
      out.write("    /* border: 1px solid;*/\r\n");
      out.write("    margin: 0px auto;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    float: left;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  .header_10 h2 {\r\n");
      out.write("    display: inline;\r\n");
      out.write("    color: green;\r\n");
      out.write("    font-family: Impact, Haettenschweiler, 'Arial Narrow Bold', sans-serif;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  #nav {\r\n");
      out.write("    width: 1920px;\r\n");
      out.write("    height: 60px;\r\n");
      out.write("    float: left;\r\n");
      out.write("    border-bottom: 1px solid;\r\n");
      out.write("    font-size: larger;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  /*\r\n");
      out.write("    #nav ul li{\r\n");
      out.write("        color:black;\r\n");
      out.write("    }\r\n");
      out.write("     #nav ul li:hover{\r\n");
      out.write("        background-color: aqua;\r\n");
      out.write("    } */\r\n");
      out.write("  /*   ul {\r\n");
      out.write("*/\r\n");
      out.write("  /*   border: 1px solid;\r\n");
      out.write("        margin-top: 3px;\r\n");
      out.write("    }*/\r\n");
      out.write("  ul li {\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("    width: 120px;\r\n");
      out.write("    /*   border: 1px solid;*/\r\n");
      out.write("\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  #mainsection {\r\n");
      out.write("    width: 80%;\r\n");
      out.write("    height: 900px;\r\n");
      out.write("    /*  border: 1px dotted;*/\r\n");
      out.write("    float: left;\r\n");
      out.write("    box-sizing: border-box;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  #mainsection_01 {\r\n");
      out.write("    width: 80%;\r\n");
      out.write("    height: 300px;\r\n");
      out.write("    /*   border: 1px solid;\r\n");
      out.write("    /*    background-color: red;*/\r\n");
      out.write("    margin: 0px auto;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    float: left;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  #asidelogin {\r\n");
      out.write("    width: 20%;\r\n");
      out.write("    height: 500px;\r\n");
      out.write("    /* border: 1px solid;*/\r\n");
      out.write("    float: left;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  .subject {\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("    font-size: larger;\r\n");
      out.write("    margin-bottom: 5px;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  #login {\r\n");
      out.write("    background-color: darkcyan;\r\n");
      out.write("    padding-top: 15px;\r\n");
      out.write("    border-radius: 5px;\r\n");
      out.write("    box-sizing: border-box;\r\n");
      out.write("    color: white;\r\n");
      out.write("\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  #login,\r\n");
      out.write("  #loginup,\r\n");
      out.write("  #logindown {\r\n");
      out.write("    width: 250px;\r\n");
      out.write("    height: 50px;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    vertical-align: middle;\r\n");
      out.write("    margin: 0px auto;\r\n");
      out.write("\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  #loginbox {\r\n");
      out.write("    margin-top: 30px;\r\n");
      out.write("    box-sizing: border-box;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  #infosection {\r\n");
      out.write("    width: 1920px;\r\n");
      out.write("    height: 150px;\r\n");
      out.write("    /* border: 1px solid;*/\r\n");
      out.write("    float: left;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  .infosetion_card {\r\n");
      out.write("    width: 360px;\r\n");
      out.write("    height: 150px;\r\n");
      out.write("    margin-left: 20px;\r\n");
      out.write("    /* background-color: yellow;*/\r\n");
      out.write("    float: left;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  #footer {\r\n");
      out.write("    width: 1920px;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    font-size: larger;\r\n");
      out.write("    /* border: 1px solid;*/\r\n");
      out.write("    float: left;\r\n");
      out.write("  }\r\n");
      out.write("</style>\r\n");
      out.write("<style>\r\n");
      out.write("  .dropdown {\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("    position: relative;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  #btn01,\r\n");
      out.write("  #btn02,\r\n");
      out.write("  #btn03,\r\n");
      out.write("  #btn04,\r\n");
      out.write("  #btn05 {\r\n");
      out.write("    border: none;\r\n");
      out.write("    border-radius: 5px;\r\n");
      out.write("    padding: 3px 30px;\r\n");
      out.write("    font-size: 18px;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("    background-color: white;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  button:hover {\r\n");
      out.write("    background-color: #ddd;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  .dropdown-options {\r\n");
      out.write("    display: none;\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    overflow: auto;\r\n");
      out.write("    background-color: #fff;\r\n");
      out.write("    border-radius: 5px;\r\n");
      out.write("    box-shadow: 0px 10px 10px 0px rgba(0, 0, 0, 0.4);\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  .dropdown:hover .dropdown-options {\r\n");
      out.write("    display: block;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  .dropdown-options a {\r\n");
      out.write("    display: block;\r\n");
      out.write("    color: #000000;\r\n");
      out.write("    padding: 5px;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("    padding: 20px 40px;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  .dropdown-options a:hover {\r\n");
      out.write("    color: #0a0a23;\r\n");
      out.write("    background-color: #ddd;\r\n");
      out.write("    border-radius: 5px;\r\n");
      out.write("  }\r\n");
      out.write("</style>\r\n");
      out.write("<style>\r\n");
      out.write("  /*boot strap에서 마우스 올려 놓으면 메뉴 자동 펼치기 추가 코드 */\r\n");
      out.write("  nav li.dropdown:hover>ul.dropdown-menu {\r\n");
      out.write("    display: block;\r\n");
      out.write("    margin: 0;\r\n");
      out.write("  }\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("  <div id=\"header\">\r\n");
      out.write("    <div class=\"header_10\">\r\n");
      out.write("      <h2>KimTeacher Lap</h2>\r\n");
      out.write("      <h5>Programers</h5>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"header_20\">\r\n");
      out.write("      <!--<form>\r\n");
      out.write("                <input type=\"text\" name=\"searchword\" size=\"70\">\r\n");
      out.write("                <input type=\"submit\" value=\"Search\">\r\n");
      out.write("            </form>-->\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"userinfo\">\r\n");
      out.write("      <div>\r\n");
      out.write("        <p><svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"currentColor\" class=\"bi bi-bug\"\r\n");
      out.write("            viewBox=\"0 0 16 16\">\r\n");
      out.write("            <path\r\n");
      out.write("              d=\"M4.355.522a.5.5 0 0 1 .623.333l.291.956A4.979 4.979 0 0 1 8 1c1.007 0 1.946.298 2.731.811l.29-.956a.5.5 0 1 1 .957.29l-.41 1.352A4.985 4.985 0 0 1 13 6h.5a.5.5 0 0 0 .5-.5V5a.5.5 0 0 1 1 0v.5A1.5 1.5 0 0 1 13.5 7H13v1h1.5a.5.5 0 0 1 0 1H13v1h.5a1.5 1.5 0 0 1 1.5 1.5v.5a.5.5 0 1 1-1 0v-.5a.5.5 0 0 0-.5-.5H13a5 5 0 0 1-10 0h-.5a.5.5 0 0 0-.5.5v.5a.5.5 0 1 1-1 0v-.5A1.5 1.5 0 0 1 2.5 10H3V9H1.5a.5.5 0 0 1 0-1H3V7h-.5A1.5 1.5 0 0 1 1 5.5V5a.5.5 0 0 1 1 0v.5a.5.5 0 0 0 .5.5H3c0-1.364.547-2.601 1.432-3.503l-.41-1.352a.5.5 0 0 1 .333-.623zM4 7v4a4 4 0 0 0 3.5 3.97V7H4zm4.5 0v7.97A4 4 0 0 0 12 11V7H8.5zM12 6a3.989 3.989 0 0 0-1.334-2.982A3.983 3.983 0 0 0 8 2a3.983 3.983 0 0 0-2.667 1.018A3.989 3.989 0 0 0 4 6h8z\" />\r\n");
      out.write("          </svg> 현재사용자 : Guest</p>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <style>\r\n");
      out.write("      li {\r\n");
      out.write("        color: white;\r\n");
      out.write("      }\r\n");
      out.write("    </style>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div id=\"nav\">\r\n");
      out.write("    <nav class=\"navbar navbar-expand-lg \" style=\"background-color: #89bce6;\">\r\n");
      out.write("      <div class=\"container-fluid\">\r\n");
      out.write("        <a class=\"navbar-brand\" href=\"#\"></a>\r\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\"\r\n");
      out.write("          aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("          <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("        </button>\r\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("          <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("              <a class=\"nav-link active\" aria-current=\"page\" href=\"#\"> </a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("              <a class=\"nav-link\" href=\"./index.html\">Home</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("              <a class=\"nav-link\" href=\"#\">Lecture</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item dropdown\">\r\n");
      out.write("              <a class=\"nav-link dropdown-toggle\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\"\r\n");
      out.write("                aria-expanded=\"false\">\r\n");
      out.write("                Study\r\n");
      out.write("              </a>\r\n");
      out.write("              <ul class=\"dropdown-menu\">\r\n");
      out.write("                <li><a class=\"dropdown-item\" href=\"./java.html\">java</a></li>\r\n");
      out.write("                <li><a class=\"dropdown-item\" href=\"#\">Another action</a></li>\r\n");
      out.write("                <li>\r\n");
      out.write("                  <hr class=\"dropdown-divider\">\r\n");
      out.write("                </li>\r\n");
      out.write("                <li><a class=\"dropdown-item\" href=\"#\">Something else here</a></li>\r\n");
      out.write("              </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("              <a class=\"nav-link active\" aria-current=\"page\" href=\"./bbs.html\">게시판</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("              <a class=\"nav-link active\" aria-current=\"page\" href=\"#\">뉴스</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("              <a class=\"nav-link active\" aria-current=\"page\" href=\"#\">취업정보</a>\r\n");
      out.write("            </li>\r\n");
      out.write("          </ul>\r\n");
      out.write("          <form class=\"d-flex\" role=\"search\">\r\n");
      out.write("            <input class=\"form-control me-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\r\n");
      out.write("            <button class=\"btn btn-outline-success\" type=\"submit\">Search</button>\r\n");
      out.write("          </form>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("\r\n");
      out.write("    <!--      <ul>\r\n");
      out.write("            <li><div class=\"dropdown\">\r\n");
      out.write("                <button id=\"btn01\">Laps</button>\r\n");
      out.write("                <div class=\"dropdown-options\">\r\n");
      out.write("                  <a href=\"#\">Dashboard</a>\r\n");
      out.write("                  <a href=\"#\">Setting</a>\r\n");
      out.write("                  <a href=\"#\">Logout</a>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li><div class=\"dropdown\">\r\n");
      out.write("                <button id=\"btn02\">DataBase</button>\r\n");
      out.write("                <div class=\"dropdown-options\">\r\n");
      out.write("                  <a href=\"#\">Dashboar2d</a>\r\n");
      out.write("                  <a href=\"#\">Setting2</a>\r\n");
      out.write("                  <a href=\"#\">Logou2t</a>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li><div class=\"dropdown\">\r\n");
      out.write("                <button id=\"btn03\">FrontEnd</button>\r\n");
      out.write("                <div class=\"dropdown-options\">\r\n");
      out.write("                  <a href=\"#\">Dashboard</a>\r\n");
      out.write("                  <a href=\"#\">Setting</a>\r\n");
      out.write("                  <a href=\"#\">Logout</a>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li><div class=\"dropdown\">\r\n");
      out.write("                <button id=\"btn04\">BackEnd</button>\r\n");
      out.write("                <div class=\"dropdown-options\">\r\n");
      out.write("                  <a href=\"#\">Dashboard</a>\r\n");
      out.write("                  <a href=\"#\">Setting</a>\r\n");
      out.write("                  <a href=\"#\">Logout</a>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li><div class=\"dropdown\">\r\n");
      out.write("                <button id=\"btn05\">Lecture</button>\r\n");
      out.write("                <div class=\"dropdown-options\">\r\n");
      out.write("                  <a href=\"#\">Dashboard</a>\r\n");
      out.write("                  <a href=\"#\">Setting</a>\r\n");
      out.write("                  <a href=\"#\">Logouts</a>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    -->\r\n");
      out.write("  </div>\r\n");
      out.write("  <div id=\"mainsection\">\r\n");
      out.write("    <style>\r\n");
      out.write("      #mainsection_left {\r\n");
      out.write("        /*  display: inline-block;*/\r\n");
      out.write("        float: left;\r\n");
      out.write("        width: 300px;\r\n");
      out.write("        height: 500px;\r\n");
      out.write("        /*    border: 1px solid;*/\r\n");
      out.write("        padding: 20px 20px 20px 30px;\r\n");
      out.write("        box-sizing: border-box;\r\n");
      out.write("      }\r\n");
      out.write("    </style>\r\n");
      out.write("    <div id=\"mainsection_left\">\r\n");
      out.write("\r\n");
      out.write("      <div class=\"btn-group-vertical\" role=\"group\" aria-label=\"Vertical button group\">\r\n");
      out.write("        <button type=\"button\" class=\"btn btn-primary\">Button</button>\r\n");
      out.write("        <button type=\"button\" class=\"btn btn-primary\">Button</button>\r\n");
      out.write("        <div class=\"btn-group\" role=\"group\">\r\n");
      out.write("          <button type=\"button\" class=\"btn btn-primary dropdown-toggle\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("            Dropdown\r\n");
      out.write("          </button>\r\n");
      out.write("          <ul class=\"dropdown-menu\">\r\n");
      out.write("            <li><a class=\"dropdown-item\" href=\"#\">Dropdown link</a></li>\r\n");
      out.write("            <li><a class=\"dropdown-item\" href=\"#\">Dropdown link</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"btn-group dropstart\" role=\"group\">\r\n");
      out.write("          <button type=\"button\" class=\"btn btn-primary dropdown-toggle\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("            Dropdown\r\n");
      out.write("          </button>\r\n");
      out.write("          <ul class=\"dropdown-menu\">\r\n");
      out.write("            <li><a class=\"dropdown-item\" href=\"#\">Dropdown link</a></li>\r\n");
      out.write("            <li><a class=\"dropdown-item\" href=\"#\">Dropdown link</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"btn-group dropend\" role=\"group\">\r\n");
      out.write("          <button type=\"button\" class=\"btn btn-primary dropdown-toggle\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("            Dropdown\r\n");
      out.write("          </button>\r\n");
      out.write("          <ul class=\"dropdown-menu\">\r\n");
      out.write("            <li><a class=\"dropdown-item\" href=\"#\">Dropdown link</a></li>\r\n");
      out.write("            <li><a class=\"dropdown-item\" href=\"#\">Dropdown link</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"btn-group dropup\" role=\"group\">\r\n");
      out.write("          <button type=\"button\" class=\"btn btn-primary dropdown-toggle\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("            Dropdown\r\n");
      out.write("          </button>\r\n");
      out.write("          <ul class=\"dropdown-menu\">\r\n");
      out.write("            <li><a class=\"dropdown-item\" href=\"#\">Dropdown link</a></li>\r\n");
      out.write("            <li><a class=\"dropdown-item\" href=\"#\">Dropdown link</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"mainsection_01\">\r\n");
      out.write("      <br>\r\n");
      out.write("      <div>\r\n");
      out.write("        <div class=\"card text-center\">\r\n");
      out.write("          <div class=\"card-body\">\r\n");
      out.write("            <h5 class=\"card-title\">게시글 수정</h5>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <form class=\"row g-3\" action=\"mod\" method=\"post\">\r\n");
      out.write("        <div class=\"col-md-4\">\r\n");
      out.write("          <label for=\"inputState\" class=\"form-label\">놀이터 선택</label>\r\n");
      out.write("          <select id=\"inputState\" class=\"form-select\" name=\"type\">\r\n");
      out.write("            <option selected>Database</option>\r\n");
      out.write("            <option>Java</option>\r\n");
      out.write("          </select>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-md-3\">\r\n");
      out.write("          <label for=\"inputCity\" class=\"form-label\">작성자</label>\r\n");
      out.write("          <input type=\"text\" class=\"form-control\" id=\"inputCity\" name=\"username\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${boardvo.username }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-md-3\">\r\n");
      out.write("          <label for=\"inputPassword4\" class=\"form-label\">Password</label>\r\n");
      out.write("          <input type=\"password\" class=\"form-control\" id=\"inputPassword4\" name=\"pass\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${boardvo.pass }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-12\">\r\n");
      out.write("          <label for=\"inputAddress\" class=\"form-label\">제목</label>\r\n");
      out.write("          <input type=\"text\" class=\"form-control\" id=\"inputAddress\" placeholder=\"제목을 입력하세요\" name=\"title\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${boardvo.title }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"form-floating\">\r\n");
      out.write("          <textarea class=\"form-control\" placeholder=\"Leave a comment here\" id=\"floatingTextarea2\"\r\n");
      out.write("            style=\"height: 200px\" name=\"content\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${boardvo.content}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</textarea>\r\n");
      out.write("          <label for=\"floatingTextarea2\">Comments</label>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"mb-3\">\r\n");
      out.write("          <input class=\"form-control\" type=\"file\" id=\"formFile\">\r\n");
      out.write("          <input class=\"form-control\" type=\"file\" id=\"formFile\">\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"col-12\">\r\n");
      out.write("          <div class=\"form-check\">\r\n");
      out.write("            <input class=\"form-check-input\" type=\"checkbox\" id=\"gridCheck\" name=\"viewmember\" value=1>\r\n");
      out.write("            <label class=\"form-check-label\" for=\"gridCheck\">\r\n");
      out.write("              회원만 보기\r\n");
      out.write("            </label>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-12\">\r\n");
      out.write("        <input type=\"hidden\" name=\"num\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${boardvo.num }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("          <button type=\"submit\" class=\"btn btn-primary\">수정하기</button>\r\n");
      out.write("          <!--  submit 타입은 form action으로 지정된 곳으로 이동 -->\r\n");
      out.write("        </div>\r\n");
      out.write("      </form>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div id=\"asidelogin\">\r\n");
      out.write("    <div id=\"loginbox\">\r\n");
      out.write("      <div id=\"loginup\">\r\n");
      out.write("        KimTeacher Lap에 참여하세요\r\n");
      out.write("      </div>\r\n");
      out.write("      <div id=\"login\" data-bs-toggle=\"modal\" data-bs-target=\"#loginModal\">\r\n");
      out.write("        KimTeacher 로그인\r\n");
      out.write("      </div>\r\n");
      out.write("      <div id=\"logindown\">\r\n");
      out.write("        <br>\r\n");
      out.write("        <button type=\"button\" data-bs-toggle=\"modal\" data-bs-target=\"#exampleModal\">\r\n");
      out.write("          회원가입\r\n");
      out.write("        </button>\r\n");
      out.write("        <button type=\"button\">아이디/비빌번호찾기</button>\r\n");
      out.write("\r\n");
      out.write("      </div>\r\n");
      out.write("      <style>\r\n");
      out.write("        #news {\r\n");
      out.write("          border: 1px solid;\r\n");
      out.write("          display: inline-block;\r\n");
      out.write("          width: 100%;\r\n");
      out.write("          height: 300px;\r\n");
      out.write("          margin: 0px auto;\r\n");
      out.write("          border-radius: 5%;\r\n");
      out.write("          border-color: rgb(196, 193, 193);\r\n");
      out.write("          background-color: white;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #talks {\r\n");
      out.write("          border: 1px solid;\r\n");
      out.write("          display: inline-block;\r\n");
      out.write("          width: 100%;\r\n");
      out.write("          height: 150px;\r\n");
      out.write("          margin: 0px auto;\r\n");
      out.write("          border-radius: 5%;\r\n");
      out.write("          border-color: rgb(196, 193, 193);\r\n");
      out.write("          background-color: white;\r\n");
      out.write("        }\r\n");
      out.write("      </style>\r\n");
      out.write("      <br>\r\n");
      out.write("      <div id=\"news\">\r\n");
      out.write("        <img src=\"./img/we.PNG\">\r\n");
      out.write("      </div>\r\n");
      out.write("      <div id=\"talks\">\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div id=\"footer\">\r\n");
      out.write("    <hr>\r\n");
      out.write("    김티처 tel. 010-9407-8767\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- Modal -->\r\n");
      out.write("  <div class=\"modal fade\" id=\"exampleModal\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("    <div class=\"modal-dialog\">\r\n");
      out.write("      <div class=\"modal-content\">\r\n");
      out.write("        <div class=\"modal-header\">\r\n");
      out.write("          <h1 class=\"modal-title fs-5\" id=\"exampleModalLabel\">회원가입</h1>\r\n");
      out.write("          <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"modal-body\">\r\n");
      out.write("          <div class=\"input-group mb-3\">\r\n");
      out.write("            <span class=\"input-group-text\" id=\"basic-addon1\">ID</span>\r\n");
      out.write("            <input type=\"text\" class=\"form-control\" placeholder=\"Username\" aria-label=\"Username\"\r\n");
      out.write("              aria-describedby=\"basic-addon1\">\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"input-group mb-3\">\r\n");
      out.write("            <span class=\"input-group-text\" id=\"basic-addon1\">PASS</span>\r\n");
      out.write("            <input type=\"text\" class=\"form-control\" placeholder=\"Pass\" aria-label=\"Username\"\r\n");
      out.write("              aria-describedby=\"basic-addon1\">\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"input-group mb-3\">\r\n");
      out.write("            <span class=\"input-group-text\" id=\"basic-addon1\">TEL</span>\r\n");
      out.write("            <input type=\"text\" class=\"form-control\" placeholder=\"tel\" aria-label=\"Username\"\r\n");
      out.write("              aria-describedby=\"basic-addon1\">\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"input-group mb-3\">\r\n");
      out.write("            <span class=\"input-group-text\" id=\"basic-addon1\">EMAIL</span>\r\n");
      out.write("            <input type=\"text\" class=\"form-control\" placeholder=\"E-mail\" aria-label=\"Username\"\r\n");
      out.write("              aria-describedby=\"basic-addon1\">\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"modal-footer\">\r\n");
      out.write("          <button type=\"button\" class=\"btn btn-secondary\" data-bs-dismiss=\"modal\">Save</button>\r\n");
      out.write("          <button type=\"button\" class=\"btn btn-primary\" data-bs-dismiss=\"modal\">Cancel</button>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div>\r\n");
      out.write("    <!-- Modal -->\r\n");
      out.write("    <!-- Modal -->\r\n");
      out.write("    <div class=\"modal fade\" id=\"loginModal\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel1\" aria-hidden=\"true\">\r\n");
      out.write("      <div class=\"modal-dialog\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("          <div class=\"modal-header\">\r\n");
      out.write("            <h1 class=\"modal-title fs-5\" id=\"exampleModalLabel1\">로그인</h1>\r\n");
      out.write("            <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"modal-body\">\r\n");
      out.write("            <div class=\"input-group mb-3\">\r\n");
      out.write("              <span class=\"input-group-text\" id=\"basic-addon1\">ID</span>\r\n");
      out.write("              <input type=\"text\" class=\"form-control\" placeholder=\"Username\" aria-label=\"Username\"\r\n");
      out.write("                aria-describedby=\"basic-addon1\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"input-group mb-3\">\r\n");
      out.write("              <span class=\"input-group-text\" id=\"basic-addon1\">PASS</span>\r\n");
      out.write("              <input type=\"text\" class=\"form-control\" placeholder=\"Pass\" aria-label=\"Username\"\r\n");
      out.write("                aria-describedby=\"basic-addon1\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-footer\">\r\n");
      out.write("              <button type=\"button\" class=\"btn btn-secondary\" data-bs-dismiss=\"modal\">login</button>\r\n");
      out.write("              <button type=\"button\" class=\"btn btn-primary \" data-bs-dismiss=\"modal\">Cancel</button>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div>\r\n");
      out.write("        <!-- Modal -->\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
