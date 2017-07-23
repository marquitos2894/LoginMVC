<%-- 
    Document   : index
    Created on : 27/11/2016, 07:30:15 PM
    Author     : Marco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="CSS/login_css.css" rel="stylesheet" type="text/css"/>
        <title>Login</title>
    </head>
    <body>
        <h1>Login</h1>
        <div>
            <form name="frmLogin" method="POST" action="Autenticacion">
                <input type="text" name="user"  id="user"/>
                <input type="password" name="pass"  id="pass"/>
                <input type="submit" name="Entrar"  id="Entrar" value="Entrar"/>
            </form>
            
        </div>
        
        
    </body>
</html>
