<%-- 
    Document   : RegistroUsuario.jsp
    Created on : 15/11/2019, 10:11:53 PM
    Author     : Jessica y Luisa
--%>


<%@page import="Air.utilidades.Conexion"%>
<%@page import="Air.negocio.UsuarioNg"%>
<%@page import="Air.entidades.UsuarioEn"%>

<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Regístro JMC</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="./bootstrap-4.3.1-dist/css/bootstrap.css">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

    </head>
    <body>

        <% String usuario = "", clave = "", correo = "";
            int perfil = 1;
            boolean resultadoGuardar, resultadoActualizar;
            UsuarioEn usuarioEn;
            UsuarioNg usuarioNg = new UsuarioNg();
            Conexion con = new Conexion();
            if (request.getParameter("botonGuardar") != null) {
                usuario = request.getParameter("usuario");
                clave = request.getParameter("clave");
                correo = request.getParameter("correo");
                usuarioEn = new UsuarioEn(perfil, usuario, clave, correo);
                resultadoGuardar = usuarioNg.guardarUsuario(con.getCon(), usuarioEn);
                if (resultadoGuardar) {
                    out.print("Usuario guardado con éxito");

                } else {
                    out.print("No se guardó usuario");
                }
            }

            if (request.getParameter("botonBuscar") != null) {
                usuario = request.getParameter("usuario");
                usuarioEn = new UsuarioEn(usuario);
                usuarioEn = usuarioNg.buscarUsuario(con.getCon(), usuario);

                try {
                    usuarioEn = usuarioNg.buscarUsuario(con.getCon(), usuario);
                    clave = usuarioEn.getClave();
                    correo = usuarioEn.getCorreo();
                    usuario = usuarioEn.getUsuario();
                    request.setAttribute("usuario", usuario);
                    request.setAttribute("clave", clave);
                    request.setAttribute("correo", correo);

                } catch (Exception ex) {
                    out.println("No se encontró el usuario");
                }

            }
            if (request.getParameter("botonActualizar") != null) {
                clave = request.getParameter("clave");
                correo = request.getParameter("correo");
                usuarioEn = new UsuarioEn(usuario, clave, correo);
                resultadoActualizar = usuarioNg.actualizarUsuario(con.getCon(), usuarioEn);
                if (resultadoActualizar) {
                    out.print("Usuario actualizado con éxito");

                } else {
                    out.print("No se actualizó usuario");
                }
            }

            if (request.getParameter("botonCancelar") != null) {
                response.sendRedirect("/ProyectoAeropuerto/index.jsp");
            }
           
            
        %>

        <div class="container">
            <ul class="nav nav-pills nav-fill bg-primary">
                <li class="nav-item">
                    <a style="color: white" class="nav-link" href="#"></a>
            </ul>


            <h1 style="text-align: center">Regístrate</h1>

            <form action="/ProyectoAeropuerto/RegistroUsuario.jsp"  name="registroForm"  method="post">
                <div style="width: 60%; margin: 0 auto;">
                    <label>Usuario</label> 
                    <input class="form-control" id="tipouser" required type="text" maxlength="10" value='<%=usuario%>' name="usuario"> 
                    <label>Contraseña</label>
                    <input class="form-control" id="numclave" required type="text" maxlength="10" value='<%=clave%>' name="clave">
                    <label>Correo electrónico</label>
                    <input class="form-control" id="correouser" required type="text" maxlength="20" value='<%=correo%>'name="correo">

                    <div align="center"> <img src="./img/Avion pasajeros logo.jpg" width="20%" height="20%"> </div>
                    <br>

                    <button class="btn btn-outline-primary" id="guardarRegistro" name="botonGuardar" value="Guardar" type="submit">Guardar</button>
                    <button class="btn btn-outline-primary" id="ActualizarRegistro" name="botonActualizar" value="Actualizar" type="submit">Actualizar</button>
                    <button class="btn btn-outline-primary" id="buscarRegistro" name="botonBuscar" value="Buscar" type="submit">Buscar</button>
                    <button class="btn btn-outline-success" id="cancelarRegistro" name="botonCancelar" type="submit">Cancelar</button>
                    <input class="btn btn-outline-secondary" id="limpiarRegistro" value="Limpiar" type="reset">

                </div>

            </form>
        </div>

        <br><br><br>

    </body>
</html>

