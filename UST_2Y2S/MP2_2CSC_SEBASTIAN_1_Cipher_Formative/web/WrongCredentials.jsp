<%-- 
    Document   : WronCredentials
    Created on : 02 18, 23, 2:15:55 PM
    Author     : nigel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error</title>
    </head>
    <style>
        h1{
            color:red;
        }
    </style>
    <body>
        <center>
            <h1>Wrong credentials try again</h1>
            <form>
                <input type="button" value="Go back!" onclick="history.back()">
            </form>
        </center>
    </body>
</html>