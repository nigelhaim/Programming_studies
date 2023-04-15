<%-- 
    Document   : index
    Created on : 02 18, 23, 2:14:11 PM
    Author     : nigel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
       <style>
           input{
               padding:5px;
               border-radius:5px;
           }
        </style>
    </head>
    <body>
        <center>
            <h1>Login</h1>
            <form action="LoginSession" method="POST">
                
                <input type="text" name="username" placeholder="Email">
                <br>
                <br>
                <input type="text" name="password" placeholder="Password">
                <br>
                <br>
                <input type="submit" value="login">
            </form> 
            
        </center>
    </body>
</html>
