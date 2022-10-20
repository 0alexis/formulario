package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Respuesta_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\n");
      out.write("              integrity=\"sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"https://getbootstrap.com/docs/5.2/assets/css/docs.css\" rel=\"stylesheet\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");

            String n_nombre, n_apellido, n_fecha, n_place, n_direccion, n_barrio, n_telefono, n_alergia,
                    n_medicamento, n_discapacidad, n_peso, n_sangre, n_institucion, n_representante, n_cedula, n_parentesco,
                    n_parentesco1, n_otro, n_estracto, n_vivienda, n_ocupacion0, n_academico,
                    n_factura, n_ruc, n_correo;

            n_nombre = request.getParameter("nombre");
            n_apellido = request.getParameter("apellido");
            n_fecha = request.getParameter("fecha");
            n_place = request.getParameter("place");
            n_direccion = request.getParameter("direccion");
            n_barrio = request.getParameter("barrio");
            n_telefono = request.getParameter("telefono");
            n_alergia = request.getParameter("alergia");
            n_medicamento = request.getParameter("medicamento");
            n_discapacidad = request.getParameter("discapacidad");
            n_peso = request.getParameter("peso");
            n_sangre = request.getParameter("sangre");
            n_institucion = request.getParameter("institucion");
            n_representante = request.getParameter("representante");
            n_cedula = request.getParameter("cedula");
            n_parentesco = request.getParameter("parentesco");
            n_parentesco1 = request.getParameter("parentesco1");
            n_otro = request.getParameter("otro");
            n_estracto = request.getParameter("estracto");
            n_vivienda = request.getParameter("vivienda");
            n_ocupacion0 = request.getParameter("ocupacion0");
            n_academico = request.getParameter("academico");
            n_factura = request.getParameter("factura");
            n_ruc = request.getParameter("ruc");
            n_correo = request.getParameter("correo");

        
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"card text-center\">\n");
      out.write("            <div class=\"card-header\">\n");
      out.write("                FORMULARIO DE MATRICULA\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card-body\">\n");
      out.write("\n");
      out.write("                <div  class=\"mx-auto\" style=\"width: 700px;\"   > \n");
      out.write("                    <form  class=\"bg-success p-2 text-dark bg-opacity-10 border border-dark      \"action=\"\" method=\"get\" >\n");
      out.write("\n");
      out.write("                        <div class=\"media border p-3\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <h4>UNIVERSIDAD MIT <small><i> </i></small></h4>\n");
      out.write("                            <h6> fundador: Alexis guaza</h6>\n");
      out.write("                            <p> fundada el 11/july/1942</p>\n");
      out.write("\n");
      out.write("                            <div class=\"media-body\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <table class=\"table table-striped table-hover\" border=\"solid\">\n");
      out.write("                            <div class=\"media border p-3\">\n");
      out.write("                                <img src=\"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTz0DnVgk-2qQYe-4MgFmbMfeZfk8qqkb0yhg&usqp=CAU\" \n");
      out.write("                                     alt=\"\" class=\"mr-3 mt-3 rounded-circle\" style=\"width:60px;\">\n");
      out.write("                                <div class=\"media-body\">\n");
      out.write("                                    <p > </p>\n");
      out.write("                                    <h6 center >Datos del estudiante</h6>\n");
      out.write("                                    <tr> \n");
      out.write("\n");
      out.write("                                    <div class=\"input-group mb-3\">\n");
      out.write("                                        <td>nombre</td>\n");
      out.write("                                        <td ><input  value=\" ");
      out.print(n_nombre);
      out.write("\" disabled  class=\"form-control\" aria-label=\"Username\" aria-describedby=\"basic-addon1\"/> </td>\n");
      out.write("                                        <td> apellidos</td>\n");
      out.write("                                        <td><input  value=\" ");
      out.print(n_apellido);
      out.write("\" disabled  class=\"form-control\" aria-label=\"Username\" aria-describedby=\"basic-addon1\"/> </td>\n");
      out.write("                                    </div>\n");
      out.write("                                    </tr>  \n");
      out.write("                                    <tr>\n");
      out.write("\n");
      out.write("                                        <td>Fecha:DD/MM/AAAA</td>\n");
      out.write("                                        <td><input value=\" ");
      out.print(n_fecha);
      out.write("\" disabled   class=\"form-control\" aria-label=\"Username\" aria-describedby=\"basic-addon1\"/> </td>\n");
      out.write("\n");
      out.write("                                        <td>Lugar de nacimiento</td>\n");
      out.write("                                        <td><input  value=\" ");
      out.print(n_place);
      out.write("\" disabled  class=\"form-control\" aria-label=\"Username\" aria-describedby=\"basic-addon1\"/> </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr  >\n");
      out.write("                                        <td>Dirección </td>\n");
      out.write("                                        <td><input value=\" ");
      out.print(n_direccion);
      out.write("\" disabled class=\"form-control\" aria-label=\"Username\" aria-describedby=\"basic-addon1\"/> </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr >\n");
      out.write("                                        <td>Barrio</td>\n");
      out.write("                                        <td><input value=\" ");
      out.print(n_barrio);
      out.write("\" disabled class=\"form-control\" aria-label=\"Username\" aria-describedby=\"basic-addon1\"/> </td>\n");
      out.write("                                    </tr> \n");
      out.write("                                    <td>Número de telefono</td>\n");
      out.write("                                    <td><input required  value=\" ");
      out.print(n_telefono);
      out.write("\" disabled  class=\"form-control\" aria-label=\"Username\" aria-describedby=\"basic-addon1\"/> </td>\n");
      out.write("\n");
      out.write("                                    </tr> \n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>Alergias</td>\n");
      out.write("                                        <td><input value=\" ");
      out.print(n_alergia);
      out.write("\" disabled     class=\"form-control\" aria-label=\"Username\" aria-describedby=\"basic-addon1\"/> </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>Medicamentos</td>\n");
      out.write("                                        <td><input value=\" ");
      out.print(n_medicamento);
      out.write("\" disabled     class=\"form-control\" aria-label=\"Username\" aria-describedby=\"basic-addon1\"/> </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>Discapacidad</td>\n");
      out.write("                                        <td><input value=\" ");
      out.print(n_discapacidad);
      out.write("\" disabled     class=\"form-control\" aria-label=\"Username\" aria-describedby=\"basic-addon1\"/> </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>Peso</td>\n");
      out.write("                                        <td><input value=\" ");
      out.print(n_peso);
      out.write("\" disabled     class=\"form-control\" aria-label=\"Username\" aria-describedby=\"basic-addon1\"/> </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>Sangre</td>\n");
      out.write("                                        <td><input value=\" ");
      out.print(n_sangre);
      out.write("\" disabled     class=\"form-control\" aria-label=\"Username\" aria-describedby=\"basic-addon1\"/> </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>Institución</td>\n");
      out.write("                                        <td><input value=\" ");
      out.print(n_institucion);
      out.write("\" disabled     class=\"form-control\" aria-label=\"Username\" aria-describedby=\"basic-addon1\"/> </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <table class=\"table table-striped table-hover\" border=\"solid\">\n");
      out.write("                                        <div class=\"media border p-3\">\n");
      out.write("                                            <img src=\"https://i.pinimg.com/originals/19/50/f4/1950f4dcc2fb63cd5a84c9b24657dd4e.png\" \n");
      out.write("                                                 alt=\"\" class=\"mr-3 mt-3 rounded-circle\" style=\"width:60px;\">\n");
      out.write("                                            <div class=\"media-body\">\n");
      out.write("                                                <p > </p>\n");
      out.write("                                                <h6 center >Datos Familiares</h6>\n");
      out.write("                                                <tr> \n");
      out.write("\n");
      out.write("                                                <div class=\"input-group mb-3\">\n");
      out.write("                                                    <td>nombre de respresentante</td>\n");
      out.write("                                                    <td ><input value=\" ");
      out.print(n_representante);
      out.write("\" disabled   class=\"form-control\" aria-label=\"Username\" aria-describedby=\"basic-addon1\"/> </td>\n");
      out.write("\n");
      out.write("                                                </div>\n");
      out.write("                                                </tr>  \n");
      out.write("                                                <tr>\n");
      out.write("\n");
      out.write("                                                    <td>N°Cedula</td>\n");
      out.write("                                                    <td><input  value=\" ");
      out.print(n_cedula);
      out.write("\" disabled  class=\"form-control\" aria-label=\"Username\" aria-describedby=\"basic-addon1\"/> </td>\n");
      out.write("                                                    <td>Parentesco con el estudiante</td>\n");
      out.write("                                                    <td><input value=\"");
      out.print(n_parentesco);
      out.write("\" disabled   class=\"form-control\" aria-label=\"Username\" aria-describedby=\"basic-addon1\"/> </td>\n");
      out.write("                                                    <td>El estudiante vive con</td>\n");
      out.write("                                                    <td><input value=\"");
      out.print(n_parentesco1);
      out.write("\" disabled   class=\"form-control\" aria-label=\"Username\" aria-describedby=\"basic-addon1\"/> </td>\n");
      out.write("                                                    <td>Si es otro familir escriba cual</td>\n");
      out.write("                                                    <td><input value=\"");
      out.print(n_otro);
      out.write("\" disabled   class=\"form-control\" aria-label=\"Username\" aria-describedby=\"basic-addon1\"/> </td>\n");
      out.write("                                                </tr>\n");
      out.write("                                                <td>Estracto:</td>\n");
      out.write("                                                <td>\n");
      out.write("\n");
      out.write("                                                <td><input value=\"");
      out.print( n_estracto);
      out.write("\" disabled   class=\"form-control\" aria-label=\"Username\" aria-describedby=\"basic-addon1\"/> </td>\n");
      out.write("                                                <td>Vivienda:</td>\n");
      out.write("                                                <td><input value=\"");
      out.print( n_vivienda);
      out.write("\" disabled   class=\"form-control\" aria-label=\"Username\" aria-describedby=\"basic-addon1\"/> </td>\n");
      out.write("\n");
      out.write("                                                <td>Ocupacion del representante:</td>\n");
      out.write("                                                <td><input value=\"");
      out.print( n_ocupacion0);
      out.write("\" disabled   class=\"form-control\" aria-label=\"Username\" aria-describedby=\"basic-addon1\"/> </td>\n");
      out.write("                                                <td>Nivel academico:</td>\n");
      out.write("                                                <td><input value=\"");
      out.print( n_academico);
      out.write("\" disabled   class=\"form-control\" aria-label=\"Username\" aria-describedby=\"basic-addon1\"/> </td>\n");
      out.write("\n");
      out.write("                                                <table  class=\"table table-striped table-hover\" border=\"solid\">\n");
      out.write("                                                    <div class=\"media border p-3\">\n");
      out.write("                                                        <img src=\"https://previews.123rf.com/images/yupiramos/yupiramos1709/yupiramos170920002/86159724-mano-humana-con-l%C3%A1piz-escribiendo-en-dise%C3%B1o-de-ilustraci%C3%B3n-de-vector-de-documento.jpg\" \n");
      out.write("                                                             alt=\"\" class=\"mr-3 mt-3  rounded-circle\" style=\"width:60px;\">\n");
      out.write("                                                        <div class=\"media-body\">\n");
      out.write("                                                            <h6 center >Datos de la matricula</h6>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                            </tr>  \n");
      out.write("                                                            <tr>\n");
      out.write("                                                                <td>N° Cédula de identidad o RUC</td>\n");
      out.write("                                                                <td><input value=\"");
      out.print( n_ruc);
      out.write("\" disabled class=\"form-control\" aria-label=\"Username\" aria-describedby=\"basic-addon1\"/> </td>\n");
      out.write("                                                                <td> Correo:</td> \n");
      out.write("                                                                <td>\n");
      out.write("                                                                    <div class=\"input-group has-validation\">\n");
      out.write("                                                                        <span class=\"input-group-text\" id=\"inputGroupPrepend\">@</span>\n");
      out.write("                                                                        <td><input value=\"");
      out.print( n_correo);
      out.write("\" disabled class=\"form-control\" aria-label=\"Username\" aria-describedby=\"basic-addon1\"/> </td>\n");
      out.write("                                                                        <div class=\"invalid-feedback\">\n");
      out.write("                                                                            Please choose a username.\n");
      out.write("                                                                            </td></tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                                            </table>\n");
      out.write("\n");
      out.write("                                                                            </form>\n");
      out.write("                                                                            <form action=\"index.jsp\" method=\"post\">\n");
      out.write("                                                                                <input type=\"submit\" value=\"Retornar\">\n");
      out.write("                                                                            </form>\n");
      out.write("                                                                            </body>\n");
      out.write("                                                                            </html>\n");
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
