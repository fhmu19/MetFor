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
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <jsp:useBean id="Mybean" scope="session" class="co.edu.unipiloto.hello.NameHandler" />
        <jsp:setProperty name="Mybean" property="name"  />
        <h2>Su nombre es: </h2>
        <jsp:getProperty name="Mybean" property="name" />
    </body>
</html>
