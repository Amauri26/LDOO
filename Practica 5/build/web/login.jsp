<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <h1>Hola Bienvenido</h1>
    <form action="LoginController" method="post">
        Usuario
        <input type="text" name="nombre">
        <br>
        Contraseña
        <input type="password" name="contra">
        <br>
        <input type="submit" name="iniciar" value="Iniciar Sesion">
    </form>
    </body>
</html>
