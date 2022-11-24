<%-- 
    Document   : index
    Created on : 09 19, 22, 6:10:00 PM
    Author     : lawrence
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>My Date JSP</h1>
        <h2>The date today is: </h2>
        <br>
        <%= new java.util.Date() %>       
    </body>
</html>
