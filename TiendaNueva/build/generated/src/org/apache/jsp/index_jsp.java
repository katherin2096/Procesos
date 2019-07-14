package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"ccs/estilo.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("   \n");
      out.write(" \n");
      out.write("<body>\n");
      out.write("\t<div id=\"cabecera\">\n");
      out.write("\t\t<!-- Logo -->\n");
      out.write("\t\t<div id=\"logo\">\n");
      out.write("\t\t\t<a href=\"inicio.html\"></a>\n");
      out.write("\t\t</div>\t\n");
      out.write("\t\t<!-- Slogan -->\n");
      out.write("\t\t<p class=\"htit\">GIFT - SHOP</p>\n");
      out.write("\t\t<!-- Main Menu -->\n");
      out.write("\t\t<div id=\"menu\">\n");
      out.write("\t\t\t<a class=\"menu_login\" href=\"login.jsp\">Login</a>\n");
      out.write("\t\t\t<a class=\"menu_inicio\" href=\"index.jsp\">Inicio</a>\n");
      out.write("\t\t\t<a class=\"menu_historial\" href=\"historial.html\">Historial</a>\n");
      out.write("\t\t\t<a class=\"menu_directorio\" href=\"#\">Lista de deseos</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("<!-- Menu -->\n");
      out.write("<div id=\"cnt2\">\n");
      out.write("\t\n");
      out.write("\t<div id=\"contenedor\">\n");
      out.write("\t\t<input id=\"tab-1\" type=\"radio\" name=\"radio-set\" class=\"tab-selector-1\" checked=\"checked\" />\n");
      out.write("\t\t<label for=\"tab-1\" class=\"tab-label-1\">Usuario</label>\n");
      out.write("   \n");
      out.write("\t\t<input id=\"tab-2\" type=\"radio\" name=\"radio-set\" class=\"tab-selector-2\" />\n");
      out.write("\t\t<label for=\"tab-2\" class=\"tab-label-2\">Ultimas compras</label>\n");
      out.write("                           \n");
      out.write("\t\t<input id=\"tab-3\" type=\"radio\" name=\"radio-set\" class=\"tab-selector-3\" />\n");
      out.write("\t\t<label for=\"tab-3\" class=\"tab-label-3\">acualizar Dat</label>\n");
      out.write("\t</div>   \n");
      out.write("\n");
      out.write("\t<div class=\"left_content\">\n");
      out.write("\t\t<div class=\"title_box\">PRODUCTOS</div>\n");
      out.write("\t\t\t<ul class=\"left_menu\">\n");
      out.write("\t\t\t\t<li class=\"odd\"><a href=\"#\">DAMAS</a></li>\n");
      out.write("\t\t\t\t<li class=\"even\"><a href=\"#\">VARONES</a></li>\n");
      out.write("\t\t\t\t<li class=\"odd\"><a href=\"#\">NIÑOS</a></li>\n");
      out.write("\t\t\t\t<li class=\"even\"><a href=\"#\">OTROS</a></li>\n");
      out.write("\t\t\t</ul> \n");
      out.write("\t\t<div class=\"title_box\">CARRITO</div>\n");
      out.write("\t\t\t<ul class=\"left_menu\">\n");
      out.write("\t\t\t\t<li class=\"odd\"><a href=\"#\">Agregar PRODUCTO</a></li>\n");
      out.write("\t\t\t\t<li class=\"even\"><a href=\"#\">Modificar COMPRA</a></li>\n");
      out.write("\t\t\t\t<li class=\"odd\"><a href=\"#\">Eliminar PRODUCTO</a></li>\n");
      out.write("\t\t\t</ul> \n");
      out.write("        <div class=\"title_box\">Cerrar Cesion</div> \n");
      out.write("\t</div>\n");
      out.write("\t<br><br><br><br><br><br><br>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- Footer -->\n");
      out.write("\t<div id=\"foo\">\n");
      out.write("\t\t<div id=\"foot_menu\">\n");
      out.write("\t\t\t<br><br><br>\n");
      out.write("\t\t\t<span class=\"f_left\">&copy; 2019 LuckyCat. Derechos reservados.</span>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("  \n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
