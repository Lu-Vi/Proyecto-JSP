package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Air.utilidades.Conexion;
import Air.negocio.UsuarioNg;
import Air.entidades.UsuarioEn;

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
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>MyAirport JMC</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("          <link rel=\"stylesheet\" href=\"./bootstrap-4.3.1-dist/css/bootstrap.css\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("         ");
 String usuario="",clave="";
        UsuarioEn usuarioEn;
        UsuarioNg usuarioNg= new UsuarioNg();
        Conexion con= new Conexion();
        if (request.getParameter("botonIngreso")!=null){
            usuario=request.getParameter("user");
            clave=request.getParameter("password"); 
            usuarioEn= new UsuarioEn(usuario,clave);
            usuarioEn=usuarioNg.seleccionarUsuario(con.getCon(), usuarioEn);
            if(usuarioEn.getPerfil()==1){
                session.setAttribute("usuario", usuarioEn);
                response.sendRedirect("/ProyectoAeropuerto/Reparaciones.html");
            }else{
                out.print("No existe usuario");
            }
        }  
        
      out.write("\n");
      out.write("        \n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("            <!-- \n");
      out.write("            \n");
      out.write("            -->\n");
      out.write("            \n");
      out.write("             <form class=\"form-inline justify-content-end\"  name=\"inicioForm\" action=\"index.jsp\" method=\"post\">\n");
      out.write("                <ul class=\"nav m-3\">\n");
      out.write("                     <li class=\"nav-item\">\n");
      out.write("                        Usuario:<input required class=\"form-control mr-sm-2 ml-1\" type=\"text\" name=\"user\" placeholder=\"Nombre de usuario\" value=\"");
      out.print(usuario);
      out.write("\">\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        Clave:<input required class=\"form-control mr-sm-2 ml-1\" type=\"password\" name=\"password\" placeholder=\"Ingresa la clave\" value=\"");
      out.print(clave);
      out.write("\">\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <button class=\"btn btn-success my-2 my-sm-0\" type=\"submit\" name=\"botonIngreso\">Ingresar</button>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </form>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("            <br />\n");
      out.write("            <font color=\"Navy\" font=\"Courier\">\n");
      out.write("            <h1 align=\"left\"><i>Aeropuerto Internacional Jose María Córdoba</i></h1>\n");
      out.write("            </font>\n");
      out.write("            <h2 style=\"text-align: left\">Fallas técnicas</h2>\n");
      out.write("\n");
      out.write("            <form class=\"form-inline justify-content-end\"  name=\"registro\" action=\"RegistroUsuario.jsp\" method=\"post\">\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("\n");
      out.write("                    <button class=\"btn btn-primary btn-lg active\" name =\"btnRegistro\" type=\"submit\">Regístrate con nosotros</button>\n");
      out.write("                </li>\n");
      out.write("                </ul>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("           \n");
      out.write("\n");
      out.write("\n");
      out.write("            <ul class=\"nav nav-pills nav-fill bg-primary nav-tabs\" id=\"myTab\" role=\"tablist\">\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a id=\"vision-tab\" data-toggle=\"tab\" href=\"#vision\" role=\"tab\" aria-controls=\"vision\" aria-selected=\"true\" style=\"color: white\" class=\"nav-link\">Visión</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a id=\"mision-tab\" data-toggle=\"tab\" href=\"#mision\" role=\"tab\" aria-controls=\"mision\" aria-selected=\"false\" style=\"color: white\" class=\"nav-link\">Misión</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a id=\"servicios-tab\" data-toggle=\"tab\" href=\"#servicios\" role=\"tab\" aria-controls=\"servicios\" aria-selected=\"false\" style=\"color: white\" class=\"nav-link\">Servicios</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a id=\"contactenos-tab\" data-toggle=\"tab\" href=\"#contactenos\" role=\"tab\" aria-controls=\"contactenos\" aria-selected=\"false\" style=\"color: white\" class=\"nav-link\">Contáctenos</a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"tab-content\" id=\"myTabContent\">\n");
      out.write("                <!-- \n");
      out.write("                    aria-labelledby: permite especificar el id de otro elemento perteneciente a la plantilla (atributo  de relación)\n");
      out.write("                    id: se coloca el nombre asignado en el aria-controls, ya que este también es un atributo de relación que se enlazará al id asignado\n");
      out.write("                -->\n");
      out.write("                <div class=\"tab-pane fade show active m-5\" id=\"vision\" role=\"tabpanel\" aria-labelledby=\"vision-tab\">\n");
      out.write("                    <div align=\"center\"> <img src=\"./img/Avion pasajeros logo.jpg\" width=\"20%\" height=\"20%\"> </div>\n");
      out.write("                    <p>Ser una entidad reconocida como líder internacional con una cartera de concesiones para \n");
      out.write("                        operar, mantener y desarrollar 16 aeropuertos en el continente Americano.</p>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"tab-pane fade m-5\" id=\"mision\" role=\"tabpanel\" aria-labelledby=\"mision-tab\">\n");
      out.write("                    <div align=\"center\"> <img src=\"./img/Avion pasajeros logo.jpg\" width=\"20%\" height=\"20%\"> </div>\n");
      out.write("                    <p>El objetivo de la Empresa es la administración, operación, explotación comercial, adecuación, \n");
      out.write("                        modernización y mantenimiento de las terminales aéreas Olaya Herrera de Medellín, José \n");
      out.write("                        María Córdova de Rionegro, Los Garzones de Montería,  Antonio Roldán Betancur de Carepa, \n");
      out.write("                        El Caraño de Quibdó y Las Brujas de Corozal.</p>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"tab-pane fade m-5\" id=\"servicios\" role=\"tabpanel\" aria-labelledby=\"servicios-tab\">\n");
      out.write("                    <div align=\"center\"> <img src=\"./img/Avion pasajeros logo.jpg\" width=\"20%\" height=\"20%\"> </div> \n");
      out.write("                    <p>Brindamos ayuda para esclarecer el problema de los múltiples daños y averías que se \n");
      out.write("                        presentan en entorno de los aviones del aeropuerto.</p>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"tab-pane fade m-5\" id=\"contactenos\" role=\"tabpanel\" aria-labelledby=\"contactenos-tab\">\n");
      out.write("                    <div align=\"center\"> <img src=\"./img/Avion pasajeros logo.jpg\" width=\"20%\" height=\"20%\"> </div>\n");
      out.write("                    <center>\n");
      out.write("                        <p>Llámanos de lunes a viernes de 9:00 a 20:00h. Sábados de 9:00 a 14:00h.</p>\n");
      out.write("                    </center>\n");
      out.write("                    <div align='center'>\n");
      out.write("                        <font color=\"Navy\" font=\"Courier\">\n");
      out.write("                        <h4 align=\"center\"><i>01-8000-912002. Teléfono 597 83 00, extensiones: 2532 y 2605.</i></h4>\n");
      out.write("                        </font>\n");
      out.write("                    </div>\n");
      out.write("                    <center>\n");
      out.write("                        <p>O escríbenos, en cualquier horario. Nos daremos el gusto de comunicarnos con usted.</p>\n");
      out.write("                    </center>\n");
      out.write("                    <div align='center'>\n");
      out.write("                        <font color=\"Navy\" font=\"Courier\">\n");
      out.write("                        <h4 align=\"center\"><i>fallastecnicas@AeropuertoJMC.com</i></h4>\n");
      out.write("                        </font>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
