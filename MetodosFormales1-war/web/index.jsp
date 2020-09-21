<%-- 
    Document   : index.jsp
    Created on : 17/09/2020, 03:34:40 PM
    Author     : ferch
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">        
        <title>Metodos Formales</title>
        <link href="estilo.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <h1>Metodos Formales</h1>
        <form name="name_input_form" method="POST" action="response.jsp">
    <section class="form-register" id="">
      
          <h2>Nombres</h2>        
          <input class="controls" type="text" name="name" value="" id="" placeholder="Ingrese su Nombre" required/>   
          <h2>Apellidos</h2>        
          <input class="controls" type="text" name="apellido" id="" placeholder="Ingrese su Apellido" />    
          <h2>Fecha de nacimiento</h2>        
          <input class="controls" type="text" name="fechaNac" id="" placeholder="dd/mm/aaaa" />        
          <h2>Año de ingreso a la universidad</h2>         
          <input class="controls" type="number" name="anioIn" id="" placeholder="Ingrese numero de documento" />          
          <h2>Semestre de Ingreso</h2>         
          <input class="controls" type="number" name="semestre" id="" placeholder="1 por ejemplo" />     <br>   
          <input class="boton" type="submit" value="Enviar"/>
    </section>
        
      </div>
      </form>
    </body>
</html>
