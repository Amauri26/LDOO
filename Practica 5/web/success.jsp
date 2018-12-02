<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio de sesion valido</title>
    </head>
    <body>
        <h1>Inicio de sesion valido</h1>
        <h2>Hola <%= request.getAttribute("username") %> </h2>
    </body>
</html>
