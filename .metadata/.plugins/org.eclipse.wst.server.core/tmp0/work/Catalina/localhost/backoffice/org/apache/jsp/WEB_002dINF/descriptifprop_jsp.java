/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.53
 * Generated at: 2020-04-23 15:47:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class descriptifprop_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"ISO-8859-1\">\r\n");
      out.write("    <title>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${prop.prenom}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${prop.nom}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</title>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"Style/MonStyle.css\">\r\n");
      out.write("    <link rel=\"icon\" href=\"Images/icon4.ico\" />\r\n");
      out.write("    <style>\r\n");
      out.write("      .my-form {\r\n");
      out.write("        width:700px;\r\n");
      out.write("      }\r\n");
      out.write("    </style>\r\n");
      out.write("  </head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body style = \"background:linear-gradient(to right, #5b7380 0%, #28829e 50%, #5b7380 99%);\">\r\n");
      out.write("\r\n");
      out.write("  \t<div style=\" height : 120px; color : white;text-align: center; font-family: 'Titillium Web', sans-serif;\">\r\n");
      out.write("\t  <div style=\"padding : 10px 0;\">\r\n");
      out.write(" \t    <h1>AGENCE IMMOBILIER LUXE</h1>\r\n");
      out.write("\t    <h2>Votre projet immobilier mérite l'expertise d'un professionnel </h2>  \r\n");
      out.write(" \t  </div>\r\n");
      out.write("\t</div>  \r\n");
      out.write("\t\r\n");
      out.write("    <form class=\"my-form\" action=\"modifieprop\" method=\"get\">\r\n");
      out.write("\r\n");
      out.write("      <!-- form header -->\r\n");
      out.write("      <div class=\"form-header\">\r\n");
      out.write("        <h1> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${prop.prenom}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${prop.nom}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" (ID=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${prop.idProp}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(")</h1>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <!-- form body -->\r\n");
      out.write("      <div class=\"form-body\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Nom et Prenom -->\r\n");
      out.write("        <div class=\"horizontal-group\">\r\n");
      out.write("          <div class=\"form-group left\">\r\n");
      out.write("            <label for=\"mod1\" class=\"label-title\">Nom :</label>\r\n");
      out.write("            <input type=\"text\" id=\"mod1\"  name=\"nom\" class=\"form-input\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${prop.nom}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" style=\"display : none;\" />\r\n");
      out.write("            <label id=\"af1\" style=\"display : block; font-size : 20px;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${prop.nom}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</label>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"form-group right\">\r\n");
      out.write("            <label for=\"mod2\" class=\"label-title\">Prenom :</label>\r\n");
      out.write("            <input type=\"text\" id=\"mod2\" name=\"prenom\" class=\"form-input\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${prop.prenom}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" style=\"display : none;\" />\r\n");
      out.write("            <label id=\"af2\" style=\"display : block; font-size : 20px;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${prop.prenom}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</label>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("         \r\n");
      out.write("        <!-- Num tel -->\r\n");
      out.write("        <div class=\"horizontal-group\">\r\n");
      out.write("          <div class=\"form-group left\">\r\n");
      out.write("            <label for=\"mod3\" class=\"label-title\">N° tel privé :</label>\r\n");
      out.write("            <input type=\"tel\" id=\"mod3\" name=\"numpriv\" class=\"form-input\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${prop.numPriv}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" pattern=\"[0-9]{2} [0-9]{3} [0-9]{3}\" style=\"display : none;\"/>\r\n");
      out.write("            <span class=\"validity\"></span>\r\n");
      out.write("            <label id=\"af3\" style=\"display : block; font-size : 20px;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${prop.numPriv}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</label>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"form-group right\">\r\n");
      out.write("            <label for=\"mod4\" class=\"label-title\" >N° tel de travail :</label>\r\n");
      out.write("            <input type=\"tel\" id=\"mod4\" name=\"numtrav\" class=\"form-input\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${prop.numTrav}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" pattern=\"[0-9]{2} [0-9]{3} [0-9]{3}\" style=\"display : none;\"/>\r\n");
      out.write("            <span class=\"validity\"></span>\r\n");
      out.write("            <label id=\"af4\" style=\"display : block; font-size : 20px;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${prop.numTrav}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</label>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Numero de tarvail -->\r\n");
      out.write("        <fieldset>\r\n");
      out.write("          <legend style=\"font-size : 17px;font-weight:bold;\"> Le numéro de travail est disponible : </legend>\r\n");
      out.write("          <div class=\"horizontal-group\">\r\n");
      out.write("            <div class=\"form-group left\">\r\n");
      out.write("              <label for=\"mod5\" class=\"label-title\">De :</label>\r\n");
      out.write("              <input type=\"time\" id=\"mod5\" name=\"debutdispo\" class=\"form-input\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${prop.debutDispo}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" style=\"display : none;\">\r\n");
      out.write("              <label id=\"af5\" style=\"display : block; font-size : 20px;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${prop.debutDispo}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</label>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group right\">\r\n");
      out.write("              <label for=\"mod6\" class=\"label-title\">Vers :</label>\r\n");
      out.write("              <input type=\"time\" id=\"mod6\" name=\"findispo\" class=\"form-input\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${prop.finDispo}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" style=\"display : none;\">\r\n");
      out.write("              <label id=\"af6\" style=\"display : block; font-size : 20px;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${prop.finDispo}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</label>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </fieldset>\r\n");
      out.write("        \r\n");
      out.write("        <!-- Identifiant -->\r\n");
      out.write("        <div>\r\n");
      out.write("          <input type=\"hidden\" name=\"idprop\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${prop.idProp}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"><br>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <!-- Adresse -->\r\n");
      out.write("        <div class=\"form-group\">\r\n");
      out.write("          <div class=\"horizontal-group\">\r\n");
      out.write("            <label for=\"mod7\" class=\"label-title\">Adresse :</label>\r\n");
      out.write("            <textarea class=\"form-input\" id=\"mod7\" name=\"adress\" rows=\"4\" cols=\"25\" style=\"height:auto; display : none;\" >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${prop.adress}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</textarea>\r\n");
      out.write("            <label id=\"af7\" style=\"display : block; font-size : 20px;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${prop.adress}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</label>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <!-- Liste des biens -->\r\n");
      out.write("        <div class=\"form-group\">\r\n");
      out.write("          <label for=\"mod5\" class=\"label-title\">Liste des biens qu'il possède :</label>\r\n");
      out.write("          <table id=\"elements\">\r\n");
      out.write("            <tr>\r\n");
      out.write("              <th>IdBien</th>\r\n");
      out.write("              <th>ModeOffre</th>\r\n");
      out.write("              <th>TypeBien</th>\r\n");
      out.write("    \t\t  <th>PrixMax</th>\r\n");
      out.write("    \t\t  <th>SuperficieMin</th>\r\n");
      out.write("    \t\t  <th>Adresse</th>\r\n");
      out.write("  \t \t    </tr>\r\n");
      out.write("\t\t  </table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <!-- form-footer -->\r\n");
      out.write("      <div class=\"form-footer\">\r\n");
      out.write("        <div style=\"justify-content: center; display: flex;\">\r\n");
      out.write("          <a href=\"home\">Retour</a>\r\n");
      out.write("          <button type=\"submit\" class=\"btn\" style=\"display : none; margin : 0 10px;\" id=\"enreg\">Enregistrer</button>      \r\n");
      out.write("          <button type=\"button\" onclick=\"fonction1()\"  class=\"btn\" style=\"display : block; margin : 0 10px;\" id=\"mod\">Modifier</button>\r\n");
      out.write("          <button type=\"button\" onclick=\"fonction2()\" class=\"btn\" >Supprimer</button>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("        \r\n");
      out.write("    </form>\r\n");
      out.write("    \r\n");
      out.write("    <!-- JavaScript -->\r\n");
      out.write("\t<script>\r\n");
      out.write("\tfunction fonction1(){\r\n");
      out.write("\t\tfor (var i =1; i<8;i++){\r\n");
      out.write("\t\t\tdocument.getElementById(\"mod\"+i).style.display = \"block\";\r\n");
      out.write("\t\t\tdocument.getElementById(\"af\"+i).style.display = \"none\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tdocument.getElementById(\"enreg\").style.display = \"block\";\r\n");
      out.write("\t\tdocument.getElementById(\"mod\").style.display = \"none\";\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction fonction2(){\r\n");
      out.write("\t\tif (confirm(\"Voulez-vous vraiment supprimer ce propriétaire?\")) {\r\n");
      out.write("\t\t\twindow.alert(\"Ce propriétaire a été supprimé avec succès.\");\r\n");
      out.write("\t\t\tlocation.href = \"/backoffice/prive/supprimeproprietaire?idprop=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${prop.idProp}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("  </body>\r\n");
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
