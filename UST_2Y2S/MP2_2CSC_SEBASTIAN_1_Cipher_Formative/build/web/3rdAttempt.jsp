<%-- 
    Document   : 3rdAttempt
    Created on : 02 18, 23, 2:17:39 PM
    Author     : nigel
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>DENIED</title>
    </head>
    <style>
        h1, h2{
            color:red;
        }
    </style>
    <body>
        <center>
            <h1>Failed!</h1>
            <h2>You have already reached the maximum amount of attempts!</h2>
            <h1>Goodbye!</h1>
            <form>
                <input type="button" onclick="history.back()" value="Go back!">
            </form>
        </center>
    </body>
</html>

