<%-- 
    Document   : response
    Created on : 21/09/2020, 12:34:18 PM
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
        <h1>Metodos Formales Laboratorio NameHandler</h1>
        <h2><jsp:useBean id="Mybean" scope="session" class="co.edu.unipiloto.hello.NameHandler" /></h2>
        <h2><jsp:setProperty name="Mybean" property="name"  /></h2>
        <h2>Su nombre es: </h2>
        <h2><jsp:getProperty name="Mybean" property="name" /></h2>
        <h2><jsp:setProperty name="Mybean" property="apellido"  /></h2>
        <h2>Su apellido es: </h2>
        <h2><jsp:getProperty name="Mybean" property="apellido" /></h2>
        <h2><jsp:setProperty name="Mybean" property="fechaNac"  /></h2>
        <h2>Su edad es: </h2>
        <h2><jsp:getProperty name="Mybean" property="fechaNac" /></h2>
        <h2><jsp:setProperty name="Mybean" property="anioIn"  /></h2>
        <h2>Usted ingresó a la universidad el año: </h2>
        <h2><jsp:getProperty name="Mybean" property="anioIn" /></h2>
        <h2><jsp:setProperty name="Mybean" property="semestre"  /></h2>
        <h2>Usted debería estar en: </h2>
        <h2><jsp:getProperty name="Mybean" property="semestre" /></h2>
    </body>
</html>
