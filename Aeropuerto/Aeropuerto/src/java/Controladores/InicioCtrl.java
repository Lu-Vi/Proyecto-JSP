package Controladores;

import Air.entidades.UsuarioEn;
import Air.negocio.UsuarioNg;
import Air.utilidades.Conexion;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//
//@WebServlet(name = "InicioCtrl", urlPatterns = {"/InicioCtrl"})
//public class InicioCtrl extends HttpServlet {
//
//    /**
//     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
//     * methods.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
////        Conexion con=new Conexion();
//        UsuarioEn usuarioEn = new UsuarioEn(request.getParameter("user"), request.getParameter("password"));
//        UsuarioNg usuarioNg = new UsuarioNg();
//
//        if (request.getParameter("btnRegistro") != null) {
//            response.sendRedirect("/ProyectoAeropuerto/RegistroUsuario.html");
//        }
//
////        usuarioEn=usuarioNg.buscarUsuario(con.getCon(), usuarioEn);      
//        if (usuarioEn.getPerfil() != 0) {//si existe me conecte ese formulario con el otro
//            response.sendRedirect("/ProyectoAeropuerto/Reparaciones.html");
//        } else {
//            try (PrintWriter out = response.getWriter()) {
//                /* TODO output your page here. You may use following sample code. */
//                out.println("<!DOCTYPE html>");
//                out.println("<html>");
//                out.println("<head>");
//                out.println("<title>Inicio Sesión</title>");
//                out.println("<link rel='stylesheet' href='/ProyectoAeropuerto/bootstrap-4.3.1-dist/css/bootstrap.css'>");
//                out.println("</head>");
//                out.println("<body>");
//                out.println("<div class='container'>");
//                out.print("<h1>INICIO SESIÓN</h1>");
//                out.print("<p>El usuario y/o clave no son correctos</p>");
//                out.println("<a href='/ProyectoAeropuerto' class='btn btn-info'>regresar</a>");//hago un lingk para que se dirija a login nuevamente, le digo que es un boton
//                out.println("</body>");
//                out.println("</html>");
//            }
//        }
//    }
//
//    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
//    /**
//     * Handles the HTTP <code>GET</code> method.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//    }
//
//    /**
//     * Handles the HTTP <code>POST</code> method.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//    }
//
//    /**
//     * Returns a short description of the servlet.
//     *
//     * @return a String containing servlet description
//     */
//    @Override
//    public String getServletInfo() {
//        return "Short description";
//    }// </editor-fold>
//
//}
