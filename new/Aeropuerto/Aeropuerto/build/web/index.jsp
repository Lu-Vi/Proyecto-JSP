
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
        <title>MyAirport JMC</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
          <link rel="stylesheet" href="./bootstrap-4.3.1-dist/css/bootstrap.css">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

    </head>
    <body>
        
         <% String usuario="",clave="";
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
                response.sendRedirect("/ProyectoAeropuerto/Reparaciones.jsp");
            }else{
                out.print("No existe usuario");
            }
        }  
        %>
        
        <div class="container">

            <!-- 
            
            -->
            
             <form class="form-inline justify-content-end"  name="inicioForm" action="index.jsp" method="post">
                <ul class="nav m-3">
                     <li class="nav-item">
                        Usuario:<input required class="form-control mr-sm-2 ml-1" type="text" name="user" placeholder="Nombre de usuario" value="<%=usuario%>">
                    </li>
                    <li class="nav-item">
                        Clave:<input required class="form-control mr-sm-2 ml-1" type="password" name="password" placeholder="Ingresa la clave" value="<%=clave%>">
                    </li>
                    <li class="nav-item">
                        <button class="btn btn-success my-2 my-sm-0" type="submit" name="botonIngreso">Ingresar</button>
                    </li>
                </ul>
            </form>
                    
                    
            <br />
            <font color="Navy" font="Courier">
            <h1 align="left"><i>Aeropuerto Internacional Jose Mar�a C�rdoba</i></h1>
            </font>
            <h2 style="text-align: left">Fallas t�cnicas</h2>

            <form class="form-inline justify-content-end"  name="registro" action="RegistroUsuario.jsp" method="post">
                <li class="nav-item">

                    <button class="btn btn-primary btn-lg active" name ="btnRegistro" type="submit">Reg�strate con nosotros</button>
                </li>
                </ul>
            </form>

           


            <ul class="nav nav-pills nav-fill bg-primary nav-tabs" id="myTab" role="tablist">
                <li class="nav-item">
                    <a id="vision-tab" data-toggle="tab" href="#vision" role="tab" aria-controls="vision" aria-selected="true" style="color: white" class="nav-link">Visi�n</a>
                </li>
                <li class="nav-item">
                    <a id="mision-tab" data-toggle="tab" href="#mision" role="tab" aria-controls="mision" aria-selected="false" style="color: white" class="nav-link">Misi�n</a>
                </li>
                <li class="nav-item">
                    <a id="servicios-tab" data-toggle="tab" href="#servicios" role="tab" aria-controls="servicios" aria-selected="false" style="color: white" class="nav-link">Servicios</a>
                </li>
                <li class="nav-item">
                    <a id="contactenos-tab" data-toggle="tab" href="#contactenos" role="tab" aria-controls="contactenos" aria-selected="false" style="color: white" class="nav-link">Cont�ctenos</a>
                </li>
            </ul>


            <div class="tab-content" id="myTabContent">
                <!-- 
                    aria-labelledby: permite especificar el id de otro elemento perteneciente a la plantilla (atributo  de relaci�n)
                    id: se coloca el nombre asignado en el aria-controls, ya que este tambi�n es un atributo de relaci�n que se enlazar� al id asignado
                -->
                <div class="tab-pane fade show active m-5" id="vision" role="tabpanel" aria-labelledby="vision-tab">
                    <div align="center"> <img src="./img/Avion pasajeros logo.jpg" width="20%" height="20%"> </div>
                    <p>Ser una entidad reconocida como l�der internacional con una cartera de concesiones para 
                        operar, mantener y desarrollar 16 aeropuertos en el continente Americano.</p>
                </div>

                <div class="tab-pane fade m-5" id="mision" role="tabpanel" aria-labelledby="mision-tab">
                    <div align="center"> <img src="./img/Avion pasajeros logo.jpg" width="20%" height="20%"> </div>
                    <p>El objetivo de la Empresa es la administraci�n, operaci�n, explotaci�n comercial, adecuaci�n, 
                        modernizaci�n y mantenimiento de las terminales a�reas Olaya Herrera de Medell�n, Jos� 
                        Mar�a C�rdova de Rionegro, Los Garzones de Monter�a,  Antonio Rold�n Betancur de Carepa, 
                        El Cara�o de Quibd� y Las Brujas de Corozal.</p>
                </div>

                <div class="tab-pane fade m-5" id="servicios" role="tabpanel" aria-labelledby="servicios-tab">
                    <div align="center"> <img src="./img/Avion pasajeros logo.jpg" width="20%" height="20%"> </div> 
                    <p>Brindamos ayuda para esclarecer el problema de los m�ltiples da�os y aver�as que se 
                        presentan en entorno de los aviones del aeropuerto.</p>
                </div>

                <div class="tab-pane fade m-5" id="contactenos" role="tabpanel" aria-labelledby="contactenos-tab">
                    <div align="center"> <img src="./img/Avion pasajeros logo.jpg" width="20%" height="20%"> </div>
                    <center>
                        <p>Ll�manos de lunes a viernes de 9:00 a 20:00h. S�bados de 9:00 a 14:00h.</p>
                    </center>
                    <div align='center'>
                        <font color="Navy" font="Courier">
                        <h4 align="center"><i>01-8000-912002. Tel�fono 597 83 00, extensiones: 2532 y 2605.</i></h4>
                        </font>
                    </div>
                    <center>
                        <p>O escr�benos, en cualquier horario. Nos daremos el gusto de comunicarnos con usted.</p>
                    </center>
                    <div align='center'>
                        <font color="Navy" font="Courier">
                        <h4 align="center"><i>fallastecnicas@AeropuertoJMC.com</i></h4>
                        </font>
                    </div>


                </div>
            </div>

        </div>
    </body>
</html>
