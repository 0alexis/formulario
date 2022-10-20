<%-- 
    Document   : Respuesta
    Created on : 13/10/2022, 10:50:40 PM
    Author     : Alexis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
        <link href="https://getbootstrap.com/docs/5.2/assets/css/docs.css" rel="stylesheet" />
    </head>
    <body>

        <%
            String n_nombre, n_apellido, n_fecha, n_place, n_direccion, n_barrio, n_telefono, n_alergia,
                    n_medicamento, n_discapacidad, n_peso, n_sangre, n_institucion, n_representante, n_cedula, n_parentesco,
                    n_parentesco1, n_otro, n_estracto, n_vivienda, n_ocupacion0, n_academico,
                    n_factura, n_ruc, n_correo;

            n_nombre = request.getParameter("nombre");
            n_apellido = request.getParameter("apellido");
            n_fecha = request.getParameter("fecha");
            n_place = request.getParameter("placena");
            n_direccion = request.getParameter("direccion");
            n_barrio = request.getParameter("barrio");
            n_telefono = request.getParameter("telefono");
            n_alergia = request.getParameter("alergia");
            n_medicamento = request.getParameter("medicamento");
            n_discapacidad = request.getParameter("discapacidad");
            n_peso = request.getParameter("peso");
            n_sangre = request.getParameter("sangre");
            n_institucion = request.getParameter("institucion");
            n_representante = request.getParameter("Representante");
            n_cedula = request.getParameter("Cedula");
            n_parentesco = request.getParameter("parentesco");
            n_parentesco1 = request.getParameter("parentesco1");
            n_otro = request.getParameter("otro");
            n_estracto = request.getParameter("estracto");
            n_vivienda = request.getParameter("vivienda");
            n_ocupacion0 = request.getParameter("ocuapcion0");
            n_academico = request.getParameter("academico");
            n_factura = request.getParameter("factura");
            n_ruc = request.getParameter("Ruc");
            n_correo = request.getParameter("Correo");

        %>

        <div class="card text-center">
            <div class="card-header">
                FORMULARIO DE MATRICULA
            </div>
            <div class="card-body">

                <div  class="mx-auto" style="width: 700px;"   > 

                    <div class="media border p-3">


                        <h4>UNIVERSIDAD MIT <small><i> </i></small></h4>
                        <h6> fundador: Alexis guaza</h6>
                        <p> fundada el 11/july/1942</p>

                        <div class="media-body">


                        </div>
                    </div>
                    <table class="table table-striped table-hover" border="solid">
                        <div class="media border p-3">
                            <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTz0DnVgk-2qQYe-4MgFmbMfeZfk8qqkb0yhg&usqp=CAU" 
                                 alt="" class="mr-3 mt-3 rounded-circle" style="width:60px;">
                            <div class="media-body">
                                <p > </p>
                                <h6 center >Datos del estudiante</h6>
                                <tr> 

                                <div class="input-group mb-3">
                                    <td>nombre</td>
                                    <td ><input  value=" <%=n_nombre%>" disabled  class="form-control" aria-label="Username" aria-describedby="basic-addon1"/> </td>
                                    <td> apellidos</td>
                                    <td><input  value=" <%=n_apellido%>" disabled  class="form-control" aria-label="Username" aria-describedby="basic-addon1"/> </td>
                                </div>
                                </tr>  
                                <tr>

                                    <td>Fecha:DD/MM/AAAA</td>
                                    <td><input value=" <%=n_fecha%>" disabled   class="form-control" aria-label="Username" aria-describedby="basic-addon1"/> </td>

                                    <td>Lugar de nacimiento</td>
                                    <td><input  value=" <%=n_place%>" disabled  class="form-control" aria-label="Username" aria-describedby="basic-addon1"/> </td>
                                </tr>
                                <tr  >
                                    <td>Dirección </td>
                                    <td><input value=" <%=n_direccion%>" disabled class="form-control" aria-label="Username" aria-describedby="basic-addon1"/> </td>
                                </tr>
                                <tr >
                                    <td>Barrio</td>
                                    <td><input value=" <%=n_barrio%>" disabled class="form-control" aria-label="Username" aria-describedby="basic-addon1"/> </td>
                                </tr> 
                                <td>Número de telefono</td>
                                <td><input required  value=" <%=n_telefono%>" disabled  class="form-control" aria-label="Username" aria-describedby="basic-addon1"/> </td>

                                </tr> 
                                <tr>
                                    <td>Alergias</td>
                                    <td><input value=" <%=n_alergia%>" disabled     class="form-control" aria-label="Username" aria-describedby="basic-addon1"/> </td>
                                </tr>
                                <tr>
                                    <td>Medicamentos</td>
                                    <td><input value=" <%=n_medicamento%>" disabled     class="form-control" aria-label="Username" aria-describedby="basic-addon1"/> </td>
                                </tr>
                                <tr>
                                    <td>Discapacidad</td>
                                    <td><input value=" <%=n_discapacidad%>" disabled     class="form-control" aria-label="Username" aria-describedby="basic-addon1"/> </td>
                                </tr>
                                <tr>
                                    <td>Peso</td>
                                    <td><input value=" <%=n_peso%>" disabled     class="form-control" aria-label="Username" aria-describedby="basic-addon1"/> </td>
                                </tr>
                                <tr>
                                    <td>Sangre</td>
                                    <td><input value=" <%=n_sangre%>" disabled     class="form-control" aria-label="Username" aria-describedby="basic-addon1"/> </td>
                                </tr>
                                <tr>
                                    <td>Institución</td>
                                    <td><input value=" <%=n_institucion%>" disabled     class="form-control" aria-label="Username" aria-describedby="basic-addon1"/> </td>
                                </tr>
                                <table class="table table-striped table-hover" border="solid">
                                    <div class="media border p-3">
                                        <img src="https://i.pinimg.com/originals/19/50/f4/1950f4dcc2fb63cd5a84c9b24657dd4e.png" 
                                             alt="" class="mr-3 mt-3 rounded-circle" style="width:60px;">
                                        <div class="media-body">
                                            <p > </p>
                                            <h6 center >Datos Familiares</h6>
                                            <tr> 

                                            <div class="input-group mb-3">
                                                <td>nombre de respresentante</td>
                                                <td ><input value=" <%=n_representante%>" disabled   class="form-control" aria-label="Username" aria-describedby="basic-addon1"/> </td>


                                                </tr>
                                                <tr>


                                                    <td>N°Cedula</td>
                                                    <td><input  value=" <%=n_cedula%>" disabled  class="form-control" aria-label="Username" aria-describedby="basic-addon1"/> </td>
                                                </tr>
                                                <td>Parentesco con el estudiante</td>
                                                <td><input value="<%=n_parentesco%>" disabled   class="form-control" aria-label="Username" aria-describedby="basic-addon1"/> </td>
                                                <tr>
                                                    <td>El estudiante vive con</td>
                                                    <td><in<input value="<%=n_parentesco1%>" disabled   class="form-control" aria-label="Username" aria-describedby="basic-addon1"/> </td>
                                                </tr>
                                                <tr>
                                                    <td>Si es otro familir escriba cual</td>
                                                    <td><input value="<%=n_otro%>" disabled   class="form-control" aria-label="Username" aria-describedby="basic-addon1"/> </td>
                                                </tr>
                                                <td>Estracto:</td>
                                                

                                                <td><input value="<%= n_estracto%>" disabled   class="form-control" aria-label="Username" aria-describedby="basic-addon1"/> </td>
                                                <tr>
                                                <td>Vivienda:</td>
                                                <td><input value="<%= n_vivienda%>" disabled   class="form-control" aria-label="Username" aria-describedby="basic-addon1"/> </td>
                                                </tr>
                                                <tr>
                                                    <td>Ocupacion del representante:</td>
                                                    <td><input value="<%= n_ocupacion0%>"  style="width:300px;" disabled   class="form-control" aria-label="Username" aria-describedby="basic-addon1"/> </td>
                                                </tr>
                                                <tr>
                                                    <td>Nivel academico:</td>
                                                    <td><input value="<%= n_academico%>" disabled   class="form-control" aria-label="Username" aria-describedby="basic-addon1"/> </td>
                                                </tr>
                                                <table  class="table table-striped table-hover" border="solid">
                                                    <div class="media border p-3">
                                                        <img src="https://previews.123rf.com/images/yupiramos/yupiramos1709/yupiramos170920002/86159724-mano-humana-con-l%C3%A1piz-escribiendo-en-dise%C3%B1o-de-ilustraci%C3%B3n-de-vector-de-documento.jpg" 
                                                             alt="" class="mr-3 mt-3  rounded-circle" style="width:60px;">
                                                        <div class="media-body">
                                                            <h6 center >Datos de la matricula</h6>



                                                            </tr>  
                                                            <tr>
                                                                <td>N° Cédula de identidad o RUC</td>
                                                                <td><input value="<%= n_ruc%>" disabled class="form-control" aria-label="Username" aria-describedby="basic-addon1"/> </td>
                                                               
                                                                <td> Correo:</td> 
                                                                <td>
                                                                   
                                                                       
                                                                        <td><input value="<%= n_correo%>" disabled class="form-control" aria-label="Username" aria-describedby="basic-addon1"/> </td>
                                                                    
                                                                          
                                                                            </td></tr>



                                                                            </table>



                                                                            <a href="index.jsp" class="btn btn-outline-danger">BACK</a>

                                                                            </body>
                                                                            </html>
