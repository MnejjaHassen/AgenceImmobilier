/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.53
 * Generated at: 2020-04-23 17:10:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class descriptifagent_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${agent.prenom}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${agent.nom}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"Style/MonStyle.css\">\r\n");
      out.write("<link rel=\"icon\" href=\"Images/icon4.ico\" />\r\n");
      out.write("<script src=\"1351.js\"></script>\r\n");
      out.write("<style>\r\n");
      out.write(".my-form {\r\n");
      out.write("\twidth: 700px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".profile {\r\n");
      out.write("\twidth: 130px;\r\n");
      out.write("\theight: 130px;\r\n");
      out.write("\tborder-radius: 50%;\r\n");
      out.write("\t-webkit-border-radius: 50%;\r\n");
      out.write("\tmargin-bottom: 20px;\r\n");
      out.write("\tmargin-left: 245px;\r\n");
      out.write("\tborder: 5px solid #00ACEE;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<body style=\"background: linear-gradient(to right, #5b7380 0%, #28829e 50%, #5b7380 99%);\">\r\n");
      out.write("\r\n");
      out.write("\t<header class=\"header black-bg\">\r\n");
      out.write("\t\t<i class=\"fas fa-bars toggle\" onclick=\"toggle()\" id=\"b\"></i>\r\n");
      out.write("\t\t<h3 style=\"color: white; text-align: center;\">AGENCE IMMOBILIER LUXE</h3>\r\n");
      out.write("\t\t<a class=\"log\" href=\"/backoffice/logout\" id=\"discon\">Logout</a>\r\n");
      out.write("\t</header>\r\n");
      out.write("\t<div id=\"contenu\">\r\n");
      out.write("\r\n");
      out.write("\t\t<form class=\"my-form\" action=\"modifieagent\" method=\"get\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- form header -->\r\n");
      out.write("\t\t\t<div class=\"form-header\">\r\n");
      out.write("\t\t\t\t<h1>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${agent.prenom}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${agent.nom}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" (ID=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${agent.idAgent}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(")</h1>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- form body -->\r\n");
      out.write("\t\t\t<div class=\"form-body\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<img src=\"Images/Agent/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${agent.idAgent}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write('/');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${agent.idAgent}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("-1.jpg\" alt=\"Pas de photo\" class=\"profile\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<!-- Nom et Prenom -->\r\n");
      out.write("\t\t\t\t<div class=\"horizontal-group\">\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group left\">\r\n");
      out.write("\t\t\t\t\t\t<label for=\"mod1\" class=\"label-title\">Nom :</label> <input type=\"text\" id=\"mod1\" name=\"nom\" class=\"form-input\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${agent.nom}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" style=\"display: none;\" /> <label id=\"af1\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"display: block; font-size: 20px; text-align :center;\"\r\n");
      out.write("\t\t\t\t\t\t>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${agent.nom}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</label>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group right\">\r\n");
      out.write("\t\t\t\t\t\t<label for=\"mod2\" class=\"label-title\">Prenom :</label> <input type=\"text\" id=\"mod2\" name=\"prenom\" class=\"form-input\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${agent.prenom}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" style=\"display: none;\" /> <label id=\"af2\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"display: block; font-size: 20px;text-align :center;\"\r\n");
      out.write("\t\t\t\t\t\t>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${agent.prenom}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</label>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- Num tel -->\r\n");
      out.write("\t\t\t\t<div class=\"horizontal-group\">\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group right\">\r\n");
      out.write("\t\t\t\t\t\t<label for=\"mod3\" class=\"label-title\">N?? t??l??phone:</label> <input type=\"tel\" id=\"mod3\" name=\"numtel\" class=\"form-input\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${agent.numTel}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" pattern=\"[0-9]{2} [0-9]{3} [0-9]{3}\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"display: none;\"\r\n");
      out.write("\t\t\t\t\t\t/> <span class=\"validity\"></span> <label id=\"af3\" style=\"display: block; font-size: 20px;text-align :center;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${agent.numTel}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</label>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group left\">\r\n");
      out.write("\t\t\t\t\t\t<label for=\"mod4\" class=\"label-title\">R??gion :</label> <select name=\"region\" id=\"mod4\" class=\"form-input\" required=\"required\" style=\"display: none\">\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${agent.adress}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" selected>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${agent.adress}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"Ariana\">Ariana</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"Beja\">B??ja</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"Ben Arous\">Ben Arous</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"Bizerte\">Bizerte</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"Gabes\">Gab??s</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"Gafsa\">Gafsa</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"Jendouba\">Jendouba</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"Kairouan\">Kairouan</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"El Kasserine\">El Kasserine</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"Kebili\">K??bili</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"Le Kef\">Le Kef</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"Mahdia\">Mahdia</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"La Manouba\">La Manouba</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"Mednine\">M??dnine</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"Monastir\">Monastir</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"Nabeul\">Nabeul</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"Sfax\">Sfax</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"Sidi Bouzid\">Sidi Bouzid</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"Siliana\">Siliana</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"Sousse\">Sousse</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"Tataouine\">Tataouine</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"Tozeur\">Tozeur</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"Tunis\">Tunis</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"Zaghouan\">Zaghouan</option>\r\n");
      out.write("\t\t\t\t\t\t</select> <span class=\"validity\"></span> <label id=\"af4\" style=\"display: block; font-size: 20px;text-align :center;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${agent.adress}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</label>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- Identifiant -->\r\n");
      out.write("\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"idagent\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${agent.idAgent}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"><br>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- Liste des visites -->\r\n");
      out.write("\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t<label for=\"mod5\" class=\"label-title\">Liste des visites programm??s :</label>\r\n");
      out.write("\t\t\t\t\t<table id=\"elements\">\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<th>IdBien</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>IdClient</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>Date</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>Heure</th>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- form-footer -->\r\n");
      out.write("\t\t\t<div class=\"form-footer\">\r\n");
      out.write("\t\t\t\t<div style=\"justify-content: left; display: flex;\">\r\n");
      out.write("\t\t\t\t\t<h style=\"margin-left:290px\" id=\"espace\"></h>\r\n");
      out.write("\t\t\t\t\t<a href=\"/backoffice/prive/chercheragent\">Retour</a>\r\n");
      out.write("\t\t\t\t\t<button type=\"submit\" class=\"btn\" style=\"display: none; margin: 0 10px;\" id=\"enreg\">Enregistrer</button>\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" onclick=\"fonction1()\" class=\"btn\" style=\"display: block; margin: 0 10px;\" id=\"mod\">Modifier</button>\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" onclick=\"fonction2()\" class=\"btn\">Supprimer</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"nav\" id=\"nav\" style=\"display: block\">\r\n");
      out.write("\t\t<div class=\"nav-item\">\r\n");
      out.write("\t\t\t<div class=\"main-item\">\r\n");
      out.write("\t\t\t\t<i class=\"fad fa-house-user fi\"></i> <span>Propri??taire</span>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"sub-items\">\r\n");
      out.write("\t\t\t\t<div class=\"sub-item\" onclick=\"window.location.href = '/backoffice/prive/ajouterprop';\">\r\n");
      out.write("\t\t\t\t\t<i class=\"fad fa-user-plus fi\"></i> <span>Ajouter</span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"sub-item\" onclick=\"window.location.href = '/backoffice/prive/chercheproprietaire.html';\">\r\n");
      out.write("\t\t\t\t\t<i class=\"fad fa-search fi\"></i> <span>Chercher</span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"nav-item\">\r\n");
      out.write("\t\t\t<div class=\"main-item\">\r\n");
      out.write("\t\t\t\t<i class=\"fad fa-user-headset fi\"></i> <span>Agent</span>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"sub-items\">\r\n");
      out.write("\t\t\t\t<div class=\"sub-item\" onclick=\"window.location.href = '/backoffice/prive/ajouteragent';\">\r\n");
      out.write("\t\t\t\t\t<i class=\"fad fa-user-plus fi\"></i> <span>Ajouter</span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"sub-item\" onclick=\"window.location.href = '/backoffice/prive/chercheragent';\">\r\n");
      out.write("\t\t\t\t\t<i class=\"fad fa-search fi\"></i> <span>Chercher</span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"nav-item\">\r\n");
      out.write("\t\t\t<div class=\"main-item\">\r\n");
      out.write("\t\t\t\t<i class=\"fad fa-house-return fi\"></i> <span>Visite</span>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"sub-items\">\r\n");
      out.write("\t\t\t\t<div class=\"sub-item\">\r\n");
      out.write("\t\t\t\t\t<i class=\"fad fa-calendar-plus fi\"></i> <span>Programmer</span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"sub-item\">\r\n");
      out.write("\t\t\t\t\t<i class=\"fad fa-search fi\"></i> <span>Chercher</span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"nav-item\">\r\n");
      out.write("\t\t\t<div class=\"main-item\">\r\n");
      out.write("\t\t\t\t<i class=\"fad fa-house fi\"></i> <span>Bien</span>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"sub-items\">\r\n");
      out.write("\t\t\t\t<div class=\"sub-item\">\r\n");
      out.write("\t\t\t\t\t<i class=\"fad fa-plus fi\"></i> <span>Ajouter</span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"sub-item\">\r\n");
      out.write("\t\t\t\t\t<i class=\"fad fa-search fi\"></i> <span>Chercher</span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"nav-item\">\r\n");
      out.write("\t\t\t<div class=\"main-item\">\r\n");
      out.write("\t\t\t\t<i class=\"fad fa-user fi\"></i> <span>client</span>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"sub-items\">\r\n");
      out.write("\t\t\t\t<div class=\"sub-item\">\r\n");
      out.write("\t\t\t\t\t<i class=\"fad fa-user-plus fi\"></i> <span>Ajouter</span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"sub-item\">\r\n");
      out.write("\t\t\t\t\t<i class=\"fad fa-search fi\"></i> <span>Chercher</span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"nav-item\">\r\n");
      out.write("\t\t\t<div class=\"main-item\">\r\n");
      out.write("\t\t\t\t<i class=\"fad fa-file fi\"></i> <span>contrat</span>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"sub-items\">\r\n");
      out.write("\t\t\t\t<div class=\"sub-item\">\r\n");
      out.write("\t\t\t\t\t<i class=\"fad fa-file-plus fi\"></i> <span>Ajouter</span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"sub-item\">\r\n");
      out.write("\t\t\t\t\t<i class=\"fad fa-file-search fi\"></i> <span>Chercher</span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"nav-item\">\r\n");
      out.write("\t\t\t<div class=\"main-item\">\r\n");
      out.write("\t\t\t\t<i class=\"fad fa-comments-alt fi\"></i> <span>Message</span>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"sub-items\">\r\n");
      out.write("\t\t\t\t<div class=\"sub-item\">\r\n");
      out.write("\t\t\t\t\t<i class=\"fad fa-file-plus fi\"></i> <span>Ajouter</span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"sub-item\">\r\n");
      out.write("\t\t\t\t\t<i class=\"fad fa-file-search fi\"></i> <span>Chercher</span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\tfunction toggle() {\r\n");
      out.write("\t\t\tdocument.getElementById(\"nav\").classList.toggle('active');\r\n");
      out.write("\t\t\tdocument.getElementById(\"contenu\").classList.toggle('active');\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<!-- JavaScript -->\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\tfunction fonction1() {\r\n");
      out.write("\t\t\tfor (var i = 1; i < 5; i++) {\r\n");
      out.write("\t\t\t\tdocument.getElementById(\"mod\" + i).style.display = \"block\";\r\n");
      out.write("\t\t\t\tdocument.getElementById(\"af\" + i).style.display = \"none\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tdocument.getElementById(\"enreg\").style.display = \"block\";\r\n");
      out.write("\t\t\tdocument.getElementById(\"mod\").style.display = \"none\";\r\n");
      out.write("\t\t\tdocument.getElementById(\"espace\").style.marginLeft = \"265px\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tfunction fonction2() {\r\n");
      out.write("\t\t\tif (confirm(\"Voulez-vous vraiment supprimer cet agent?\")) {\r\n");
      out.write("\t\t\t\twindow.alert(\"Cet agent a ??t?? supprim?? avec succ??s.\");\r\n");
      out.write("\t\t\t\tlocation.href = \"/backoffice/prive/supprimeagent?idagent=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${agent.idAgent}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
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
