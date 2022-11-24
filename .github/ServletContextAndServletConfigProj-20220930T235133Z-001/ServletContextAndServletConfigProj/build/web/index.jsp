<%-- 
    Document   : index
    Created on : Oct 14, 2019, 1:20:58 PM
    Author     : Lawrence
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>This is a Web App that shows the difference between a ServletContext and a ServletConfig!</h1>
        <br>
        <h2><a href="/ServletContextAndServletConfigProj/ServletOne">Servlet One</a> </h2>
        <h2><a href="/ServletContextAndServletConfigProj/ServletTwo">Servlet Two</a> </h2> 

        <h3>My Global Message: <% out.print(getServletContext().getInitParameter("myMessage")); %> </h3>
        <h3>My Email Address:  <% out.print(getServletContext().getInitParameter("myEmail")); %> </h3>
    </body>
</html>
