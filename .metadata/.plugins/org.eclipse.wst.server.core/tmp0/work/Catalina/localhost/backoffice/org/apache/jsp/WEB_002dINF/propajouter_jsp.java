/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.53
 * Generated at: 2020-05-13 02:03:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class propajouter_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<script src=\"../JS/1351.js\"></script>\r\n");
      out.write("<title>Ajouter un propriétaire</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../Style/MonStyle.css\">\r\n");
      out.write("<link rel=\"icon\" href=\"../Images/icon4.ico\" />\r\n");
      out.write("<script src=\"../JS/jquery-3.4.1.js\"></script>\r\n");
      out.write("<style>\r\n");
      out.write(".my-form {\r\n");
      out.write("\twidth: 650px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a.log {\r\n");
      out.write("\tposition: fixed;\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\tbackground: #222;\r\n");
      out.write("\tborder-radius: 3px 3px 3px 3px;\r\n");
      out.write("\theight: 20px;\r\n");
      out.write("\ttop: 10px;\r\n");
      out.write("\tright: 10px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<!-- navbar -->\r\n");
      out.write("\t<div id=\"nav-placeholder\"></div>\r\n");
      out.write("\r\n");
      out.write("\t<!-- contenu -->\r\n");
      out.write("\t<div id=\"contenu\">\r\n");
      out.write("\t\t<form class=\"my-form\" action=\"ajoutprop\" method=\"get\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- form header -->\r\n");
      out.write("\t\t\t<div class=\"form-header\">\r\n");
      out.write("\t\t\t\t<h1>Nouveau Propriétaire</h1>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- form body -->\r\n");
      out.write("\t\t\t<div class=\"form-body\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- Nom et Prenom -->\r\n");
      out.write("\t\t\t\t<div class=\"horizontal-group\">\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group left\">\r\n");
      out.write("\t\t\t\t\t\t<label for=\"nom\" class=\"label-title\">Nom *</label> <input type=\"text\" id=\"nom\" name=\"nom\" class=\"form-input\" placeholder=\"saisir votre nom\" required=\"required\" />\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group right\">\r\n");
      out.write("\t\t\t\t\t\t<label for=\"prenom\" class=\"label-title\">Prenom *</label> <input type=\"text\" id=\"prenom\" name=\"prenom\" class=\"form-input\" placeholder=\"saisir votre prenom \" required=\"required\" />\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- Num Tel -->\r\n");
      out.write("\t\t\t\t<div class=\"horizontal-group\">\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group left\">\r\n");
      out.write("\t\t\t\t\t\t<label for=\"numpriv\" class=\"label-title\">N° tel privé *</label> <input type=\"tel\" id=\"numpriv\" name=\"numpriv\" class=\"form-input\" placeholder=\"xx xxx xxx\" required=\"required\" pattern=\"[0-9]{2} [0-9]{3} [0-9]{3}\" /> <span class=\"validity\"></span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group right\">\r\n");
      out.write("\t\t\t\t\t\t<label for=\"numtrav\" class=\"label-title\">N° tel de travail *</label> <input type=\"tel\" id=\"numtrav\" name=\"numtrav\" class=\"form-input\" placeholder=\"xx xxx xxx\" required=\"required\" pattern=\"[0-9]{2} [0-9]{3} [0-9]{3}\" />\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- Numero de tarvail -->\r\n");
      out.write("\t\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t\t<legend> Le numero de travail est disponible : </legend>\r\n");
      out.write("\t\t\t\t\t<div class=\"horizontal-group\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group left\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"debutdispo\" class=\"label-title\">De *</label> <input type=\"time\" id=\"debutdispo\" name=\"debutdispo\" class=\"form-input\" required=\"required\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group right\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"findispo\" class=\"label-title\">Vers *</label> <input type=\"time\" id=\"findispo\" name=\"findispo\" class=\"form-input\" required=\"required\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</fieldset>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- Adresse -->\r\n");
      out.write("\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t<br> <label for=\"adress\" class=\"label-title\">Adresse *</label>\r\n");
      out.write("\t\t\t\t\t<textarea class=\"form-input\" name=\"adress\" rows=\"4\" cols=\"50\" style=\"height: auto\" required=\"required\"></textarea>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- form-footer -->\r\n");
      out.write("\t\t\t<div class=\"form-footer\">\r\n");
      out.write("\t\t\t\t<span>* obligatoire</span> <a href=\"home\">Retour</a>\r\n");
      out.write("\t\t\t\t<button type=\"submit\" class=\"btn\">Ajouter</button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<!-- javascript -->\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t$(function() {\r\n");
      out.write("\t\t\t$(\"#nav-placeholder\").load(\"../navbar.html\");\r\n");
      out.write("\t\t});\r\n");
      out.write("\t</script>\r\n");
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
