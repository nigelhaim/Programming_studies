<%-- 
    Document   : index
    Created on : 02 10, 23, 11:11:53 AM
    Author     : nigel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import = "java.io.*,java.util.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <style>
        .textbox{
            display:flex;
        }
        input{
            margin-left: 10px;
        }
    </style>
    <body>
        <%
            response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
            response.setHeader("Expires", "0");
            session.invalidate();
        %>
        <%
            Integer attempts = (Integer)application.getAttribute("hitCounter");
            application.setAttribute("hitCounter", attempts);
        %>
        <form method="POST" action="LogSession">
            <h1>Login</h1>
            <div class="textbox">
                <h4>Username:</h4>
                <input type="text" name="username">
            </div>
            
            <div class="textbox">
                <h4>Password:</h4>
                <input type="text" name="password">
            </div>
            
            <input type="submit" value="Login">
        </form>
        
        
      <center>
         <p>Total number of attempts: <%= attempts%></p>
      </center>
    </body>
</html>
