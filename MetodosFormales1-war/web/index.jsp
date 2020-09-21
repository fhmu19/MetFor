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
    </head>
    <body>
        <h1>Metodos Formales</h1>
        <form name="name_input_form" method="POST" action="response.jsp">
    <section id="">
      
          <h2>Nombre</h2>
        
          <input class="campos" type="text" name="name" value="" id="nombres" placeholder="Ingrese su Nombre" required/>
        

      
          <h2>Apellido</h2>
        
          <input class="campos" type="text" name="apellidos" id="nombres" placeholder="Ingrese su Apellido" />
        

      
          <h2>Fecha de <br>nacimiento</h2>
        
            <input class="campos" type="date" name="fechaNac" id="nombres" placeholder="" />
        
           <h2>Documento</h2>
         
           <input class="campos" type="number" name="numDoc" id="nombres" placeholder="Ingrese numero de documento" />
         

   
           <h2>Telefono</h2>
         
             <input class="campos" type="tel" name="telefono" id="nombres" placeholder="Telefono" />
         

      
           <h2>E-mail</h2>
         
            <input class="campos" type="email" name="correo" id="nombres" placeholder="Ingrese su Correo" />
        

      </section>






        <p>  Después del pago por tu membresía, llegará a tú correo nuestra bienvenida y la<br>
             invitación para tu usuario e inicies tu agendamiento</p>

      


        <a href="https://asomuffaa.com/credibanco/"> <input class="boton10" type="submit" value="Acepto"  /></a>
      </div>
      </form>
    </body>
</html>
