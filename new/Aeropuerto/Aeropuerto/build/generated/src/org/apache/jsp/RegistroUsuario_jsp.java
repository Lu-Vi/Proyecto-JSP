package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Air.utilidades.Conexion;
import Air.negocio.UsuarioNg;
import Air.entidades.UsuarioEn;

public final class RegistroUsuario_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Regístro JMC</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./bootstrap-4.3.1-dist/css/bootstrap.css\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");
 String usuario = "", clave = "", correo = "";
            int perfil = 1;
            boolean resultadoGuardar= true;
            UsuarioEn usuarioEn;
            UsuarioNg usuarioNg = new UsuarioNg();
            Conexion con = new Conexion();
            if (request.getParameter("botonGuardar") != null) {
                usuario = request.getParameter("usuario");
                clave = request.getParameter("clave");
                correo = request.getParameter("correo");
                usuarioEn = new UsuarioEn(usuario, clave, perfil, correo);
               resultadoGuardar = usuarioNg.guardarUsuario(con.getCon(), usuarioEn);
                if (resultadoGuardar) {
                    out.print("Usuario guardado con exito");
                    response.sendRedirect("/ProyectoAeropuerto/RegistroUsuario.jsp");
                    
                } else {
                    out.print("No se guardó usuario");
                }
            }
            
            
            
            if (request.getParameter("botonCancelar") != null) {
                response.sendRedirect("/ProyectoAeropuerto/index.jsp");
            }
        
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <ul class=\"nav nav-pills nav-fill bg-primary\">\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a style=\"color: white\" class=\"nav-link\" href=\"#\"></a>\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <h1 style=\"text-align: center\">Regístrate</h1>\n");
      out.write("\n");
      out.write("            <form action=\"/ProyectoAeropuerto/RegistroUsuario.jsp\"  name=\"registroForm\"  method=\"post\">\n");
      out.write("                <div style=\"width: 60%; margin: 0 auto;\">\n");
      out.write("                    <label>Usuario</label> \n");
      out.write("                    <input class=\"form-control\" id=\"tipouser\" required type=\"text\" maxlength=\"10\" name=\"usuario\"> \n");
      out.write("                    <label>Contraseña</label>\n");
      out.write("                    <input class=\"form-control\" id=\"numclave\" required type=\"text\" maxlength=\"10\" name=\"clave\">\n");
      out.write("                    <label>Correo electrónico</label>\n");
      out.write("                    <input class=\"form-control\" id=\"correouser\" required type=\"text\" maxlength=\"20\" name=\"correo\">\n");
      out.write("\n");
      out.write("                    <div align=\"center\"> <img src=\"./img/Avion pasajeros logo.jpg\" width=\"20%\" height=\"20%\"> </div>\n");
      out.write("                    <br>\n");
      out.write("                    <input class=\"btn btn-outline-primary\" id=\"guardarRegistro\" name=\"botonGuardar\" value=\"Guardar\" type=\"submit\">\n");
      out.write("                    <button class=\"btn btn-outline-success\" id=\"cancelarRegistro\" name=\"botonCancelar\" type=\"submit\">Cancelar</button>\n");
      out.write("                    <input class=\"btn btn-outline-secondary\" id=\"limpiarRegistro\" value=\"Limpiar\" type=\"reset\">\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <br><br><br>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
