<%-- 
    Document   : Reparaciones.jsp
    Created on : 16/11/2019, 09:47:08 PM
    Author     : Jessica
--%>
<%@page import="Air.negocio.AvionNg"%>
<%@page import="Air.entidades.AvionEn"%>
<%@page import="Air.negocio.PilotoNg"%>
<%@page import="Air.entidades.PilotoEn"%>
<%@page import="Air.utilidades.Conexion"%>
<%@page import="Air.negocio.UsuarioNg"%>
<%@page import="Air.entidades.UsuarioEn"%>

<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <%

            String nombre = "", cedula = "", telefono = "", estadocivil = "";
            int anograduacion, numerohijos;
            boolean resultadoGuardar, resultadoActualizar;
            PilotoEn pilotoEn;
            PilotoNg pilotoNg = new PilotoNg();
            Conexion con = new Conexion();

            if (request.getParameter("botonGuardarPiloto") != null) {
                nombre = request.getParameter("nombre");
                cedula = request.getParameter("cedula");
                anograduacion = Integer.parseInt(request.getParameter("anoGraduacion"));
                numerohijos = Integer.parseInt(request.getParameter("numeroHijos"));
                estadocivil = request.getParameter("estadoCivil");
                telefono = request.getParameter("telefono");
                try {
                    pilotoEn = new PilotoEn(nombre, cedula, anograduacion, estadocivil, numerohijos, telefono);
                    resultadoGuardar = pilotoNg.guardarPiloto(con.getCon(), pilotoEn);
                    if (resultadoGuardar) {
                        out.print("Piloto guardado con éxito");

                    }
                } catch (Exception e) {
                    out.print("No se guardó piloto");
                }
            }

            if (request.getParameter("botonBuscarPiloto") != null) {
                cedula = request.getParameter("cedula");
                pilotoEn = new PilotoEn(cedula);
                try {
                    pilotoEn = pilotoNg.buscarPiloto(con.getCon(), cedula);
                    //String nombre, String cedula, String telefono, int anograduacion, st
                    out.println("Nombre: " + pilotoEn.getNombre()
                            + "\n Cédula: " + pilotoEn.getCedula()
                            + "\n Teléfono: " + pilotoEn.getTelefono()
                            + "\n Año de Graduación: " + pilotoEn.getAnograduacion()
                            + "\n Número de hijos: " + pilotoEn.getNumerohijos()
                            + "\n Estado civil: " + pilotoEn.getEstadocivil());

                } catch (Exception ex) {
                    out.println("No se encontró el piloto");
                }

            }
            if (request.getParameter("botonActualizarPiloto") != null) {
                nombre = request.getParameter("nombre");
                cedula = request.getParameter("cedula");
                anograduacion = Integer.parseInt(request.getParameter("anoGraduacion"));
                numerohijos = Integer.parseInt(request.getParameter("numeroHijos"));
                estadocivil = request.getParameter("estadoCivil");
                telefono = request.getParameter("telefono");
                pilotoEn = new PilotoEn(nombre, cedula, anograduacion, estadocivil, numerohijos, telefono);
                resultadoActualizar = pilotoNg.actualizarPiloto(con.getCon(), pilotoEn);
                if (resultadoActualizar) {
                    out.print("Piloto actualizado con éxito");

                } else {
                    out.print("No se actualizó piloto");
                }
            }

            if (request.getParameter("botonCancelarPiloto") != null) {
                response.sendRedirect("/ProyectoAeropuerto/index.jsp");
            }

//--------------------------------------------------------------------------------
            //String matricula, String marca, String nitaerolinea, int codhangar
            String matricula = "", marca = "", nitaerolinea = "", nombreaerolinea = "";
            int codhangar;
            AvionEn avionEn;
            AvionNg avionNg = new AvionNg();

            if (request.getParameter("botonGuardarAvion") != null) {
                matricula = request.getParameter("matricula ");
                marca = request.getParameter("marca");
                nitaerolinea = request.getParameter("nitAerolinea");
                nombreaerolinea = request.getParameter("nombreAerolinea");
                codhangar = Integer.parseInt(request.getParameter("hangar"));
                try {
                    avionEn = new AvionEn(matricula, marca, nitaerolinea, nombreaerolinea, codhangar);
                    resultadoGuardar = avionNg.guardarAvion(con.getCon(), avionEn);
                    if (resultadoGuardar) {
                        out.print("Avión guardado con éxito");
                    }
                } catch (Exception e) {
                    out.print("No se guardó Avión");
                }
            }

            if (request.getParameter("botonBuscarAvion") != null) {
                cedula = request.getParameter("matricula");
                avionEn = new AvionEn(matricula);
                try {
                    avionEn = avionNg.buscarAvion(con.getCon(), cedula);

                    out.println("matricula" + avionEn.getMatricula()
                            + "\nmarca" + avionEn.getMarca()
                            + "\nnitaerolinea" + avionEn.getNitaerolinea()
                            + "\nnombreaerolinea" + avionEn.getNombreaerolinea()
                            + "\ncodhangar" + avionEn.getCodhangar());

                } catch (Exception ex) {
                    out.println("No se encontró el Avión");
                }

            }
            if (request.getParameter("botonActualizarAvion") != null) {
                matricula = request.getParameter("matricula ");
                marca = request.getParameter("marca");
                nitaerolinea = request.getParameter("nitAerolinea");
                nombreaerolinea = request.getParameter("nombreAerolinea");
                codhangar = Integer.parseInt(request.getParameter("hangar"));
                try {
                    avionEn = new AvionEn(matricula, marca, nitaerolinea, nombreaerolinea, codhangar);
                    resultadoActualizar = avionNg.guardarAvion(con.getCon(), avionEn);
                    if (resultadoActualizar) {
                        out.print("Avión Actualizado con éxito");
                    }
                } catch (Exception e) {
                    out.print("No se Actualizó Avión");
                }
            }

            if (request.getParameter("botonCancelarAvion") != null) {
                response.sendRedirect("/ProyectoAeropuerto/index.jsp");
            }
        %>
        <title>ZONA DE REPARACIÓN</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="./bootstrap-4.3.1-dist/css/bootstrap.css">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

    </head>
    <body>
        <div class="container">

            <!-- 
            
            -->



            <ul class="nav nav-pills nav-fill bg-primary nav-tabs" id="myTab" role="tablist">
                <li class="nav-item">
                    <a id="avion-tab" data-toggle="tab" href="#avion" role="tab" aria-controls="Avion" aria-selected="true" style="color: white" class="nav-link">Avión</a>
                </li>
                <li class="nav-item">
                    <a id="piloto-tab" data-toggle="tab" href="#piloto" role="tab" aria-controls="Piloto" aria-selected="false" style="color: white" class="nav-link">Piloto</a>
                </li>
                <li class="nav-item">
                    <a id="falla-tab" data-toggle="tab" href="#Vuelo" role="tab" aria-controls="Vuelo" aria-selected="false" style="color: white" class="nav-link">Vuelo</a>
                </li>
                <li class="nav-item">
                    <a id="falla-tab" data-toggle="tab" href="#fallastecnicas" role="tab" aria-controls="FallasTecnicas" aria-selected="false" style="color: white" class="nav-link">Fallas Técnicas</a>
                </li>
            </ul>



            <div class="tab-content" id="myTabContent">
                <!-- 
                    aria-labelledby: permite especificar el id de otro elemento perteneciente a la plantilla (atributo  de relación)
                    id: se coloca el nombre asignado en el aria-controls, ya que este también es un atributo de relación que se enlazará al id asignado
                -->
                <div class="tab-pane fade show active m-5" id="avion" role="tabpanel" aria-labelledby="avion-tab">

                    <h1 style="text-align: center">AVIÓN</h1>
                    <h3 style="text-align: center">Regístro de Aviones</h3>
                    <form action="/ProyectoAeropuerto/Reparaciones.jsp" name="avionesForm" method="post">
                        <div style="width: 60%; margin: 0 auto;">
                            <label>Matrícula:</label> 
                            <input class="form-control" id="matricula" required type="text" maxlength="7" name="matricula"> 
                            <label>Marca:</label>
                            <input class="form-control" id="marca" required type="text" maxlength="30" name="marca">
                            <label>Nit Aerolínea:</label>
                            <input class="form-control" id="nitAerolinea" required type="text" maxlength="30" name="nitAerolinea">
                            <label>Nombre Aerolínea:</label>
                            <input class="form-control" id="nombreAerolinea" required type="text" maxlength="30" name="nombreAerolinea">

                            <br />
                            <label>Hangar:</label>
                            <select id="hangar" name="hangar">

                                <option> 1</option>
                                <option> 2</option>
                                <option> 3</option>
                                <option> 4</option>
                                <option> 5</option>
                                <option> 6</option>
                                <option> 7</option>
                                <option> 8</option>
                                <option> 9</option>
                                <option>10</option>

                            </select>
                            <br />
                            <br>
                            <button class="btn btn-outline-primary" id="guardarAvion" name="botonGuardarAvion" value="Guardar" type="submit">Guardar</button>
                            <button class="btn btn-outline-primary" id="ActualizarAvion" name="botonActualizarAvion" value="Actualizar" type="submit">Actualizar</button>
                            <button class="btn btn-outline-primary" id="buscarAvion" name="botonBuscarAvion" value="Buscar" type="submit">Buscar</button>
                            <button class="btn btn-outline-success" id="cancelarAvion" name="botonCancelarAvion" type="submit">Cancelar</button>
                            <input class="btn btn-outline-secondary" id="limpiarAvion" value="Limpiar" type="reset">

                        </div>

                    </form>

                </div>

                <div class="tab-pane fade m-5" id="piloto" role="tabpanel" aria-labelledby="piloto-tab">
                    <h1 style="text-align: center">PILOTO</h1>
                    <h3 style="text-align: center">Regístro de Pilotos</h3>
                    <form action="/ProyectoAeropuerto/Reparaciones.jsp" name="pilotosForm" method="post">
                        <div style="width: 60%; margin: 0 auto;">

                            <label>Cédula:</label>
                            <input class="form-control" id="cedulaEx" required type="text" maxlength="10" name="cedula">
                            <label>Nombre:</label>
                            <input class="form-control" id="nombreExperto" required type="text" maxlength="30" name="nombre">
                            <label>Año de Graduación:</label>
                            <input class="form-control" id="anoGraduacionEx" required type="text" maxlength="5" name="anoGraduacion">
                            <br />  


                            <label>Escoja Tipo de Piloto:</label>
                            <select name="tipoPiloto" id="tipoPiloto" onchange="Seleccionar(this.value)">
                                <option> Seleccionar...</option>
                                <option value="Experto"> Experto</option>
                                <option value="Senior"> Senior</option>
                                <option value="Junior"> Junior</option>
                            </select>
                            <br />

                            <div id="tipoExperto" style="display:none;"><br />
                                <label>Estado civil:</label>
                                <input class="form-control" id="estadoCivilPiloto" required type="text" maxlength="30" name="estadoCivil">
                                <br />
                            </div>

                            <div id="tipoSenior" style="display:none;"><br />
                                <label>Número de hijos:</label>
                                <input class="form-control" id="numeroHijosPiloto" required type="text" maxlength="30" name="numeroHijos">                           
                                <br />
                            </div>

                            <div id="tipoJunior" style="display:none;"><br />
                                <label>Telefono:</label>
                                <input class="form-control" id="edadPiloto" required type="text" maxlength="30" name="telefono">
                                <br />
                            </div>


                            <br>
                            <button class="btn btn-outline-primary" id="guardarPiloto" name="botonGuardarPiloto" value="Guardar" type="submit">Guardar</button>
                            <button class="btn btn-outline-primary" id="ActualizarPiloto" name="botonActualizarPiloto" value="Actualizar" type="submit">Actualizar</button>
                            <button class="btn btn-outline-primary" id="buscarPiloto" name="botonBuscarPiloto" value="Buscar" type="submit">Buscar</button>
                            <button class="btn btn-outline-success" id="cancelarPiloto" name="botonCancelarPiloto" type="submit">Cancelar</button>
                            <input class="btn btn-outline-secondary" id="limpiarPiloto" value="Limpiar" type="reset">

                        </div>

                    </form>
                </div>


                <div class="tab-pane fade m-5" id="vuelo" role="tabpanel" aria-labelledby="vuelo-tab">
                    <h1 style="text-align: center">VUELO</h1>
                    <h3 style="text-align: center">Detalles de Vuelo</h3>
                    <form action="/ProyectoAeropuerto/Reparaciones.jsp" name="vueloForm" method="post">
                        <div style="width: 60%; margin: 0 auto;">

                            <label>Cédula de piloto:</label>
                            <input class="form-control" id="cedulaP" required type="text" maxlength="10" name="cedula">
                            <label>Matrícula de avión:</label>
                            <input class="form-control" id="matAvion" required type="text" maxlength="30" name="nombre">
                            <label>Hora de inicio de vuelo:</label>
                            <input class="form-control" id="HinicioVuelo" required type="text" maxlength="5" name="HinicioVuelo">
                            <label>Hora de fin de vuelo:</label>
                            <input class="form-control" id="HfinVuelo" required type="text" maxlength="5" name="HfinVuelo">
                            <br />  
                            <br>
                            <input class="btn btn-outline-primary" id="botonGuar" name="botonGuar" value="Guardar" type="submit">
                            <input class="btn btn-outline-success" id="botonBus" name="botonBus" value="Buscar" type="submit">
                            <input class="btn btn-outline-secondary" id="limpiar" value="Limpiar" type="reset">

                        </div>

                    </form>
                </div>

                <div class="tab-pane fade m-5" id="fallastecnicas" role="tabpanel" aria-labelledby="fallas-tab">
                    <h1 style="text-align: center">FALLAS TÉCNICAS</h1>
                    <h3 style="text-align: center">Regístro de Fallas Técnicas</h3>
                    <form action="/ProyectoAeropuerto/Reparaciones.jsp" name="fallasForm" method="post">
                        <div style="width: 60%; margin: 0 auto;">
                            <label>Matrícula de Avión </label> 
                            <input class="form-control" id="tipo" required type="text" maxlength="7" name="matricula"> 
                            <label>Descripción del daño: </label>
                            <br />
                            <textarea cols="50" rows="2"></textarea>
                            <br />
                            <label>MECÁNICO:</label>
                            <br />
                            <label>Cédula:</label>
                            <input class="form-control" id="cedulaMe" required type="text" maxlength="10" name="cedula">
                            <label>Nombre:</label>
                            <input class="form-control" id="nombreMe" required type="text" maxlength="30" name="nombre">
                            <label>Especialidad:</label>
                            <input class="form-control" id="nombreEspecialidadMec" required type="text" maxlength="30" name="nombreEspecialidad">

                            <br />
                            <label>Categoría de la especialidad: </label>
                            <select>

                                <option> A</option>
                                <option> B</option>
                                <option> C</option>

                            </select>
                            <br />
                            <br>
                            <input class="btn btn-outline-primary" id="boton" name="boton" value="Guardar" type="submit">
                            <input class="btn btn-outline-success" id="boton" name="boton" value="Buscar" type="submit">
                            <input class="btn btn-outline-secondary" id="limpiar" value="Limpiar" type="reset">

                        </div>

                    </form>
                </div>
            </div>
        </div>
    </body>

    <script>
        function Seleccionar(tipoPiloto) {
            switch (tipoPiloto)
            {
                case "Experto":
                    div = document.getElementById('tipoExperto');
                    div.style.display = 'block';
                    div = document.getElementById('tipoSenior');
                    div.style.display = 'none';
                    div = document.getElementById('tipoJunior');
                    div.style.display = 'none';
                    break;
                case "Senior":
                    div = document.getElementById('tipoExperto');
                    div.style.display = 'none';
                    div = document.getElementById('tipoSenior');
                    div.style.display = 'block';
                    div = document.getElementById('tipoJunior');
                    div.style.display = 'none';
                    break;
                case "Junior":
                    div = document.getElementById('tipoExperto');
                    div.style.display = 'none';
                    div = document.getElementById('tipoSenior');
                    div.style.display = 'none';
                    div = document.getElementById('tipoJunior');
                    div.style.display = 'block';
                    break;
                default:
                    div = document.getElementById('tipoExperto');
                    div.style.display = 'none';
                    div = document.getElementById('tipoSenior');
                    div.style.display = 'none';
                    div = document.getElementById('tipoJunior');
                    div.style.display = 'none';
                    break;
            }
        }
    </script>
</html>