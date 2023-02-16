<%-- 
    Document   : displayresult
    Created on : 02 10, 23, 11:25:26 AM
    Author     : nigel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List of users</title>
    </head>
    <body>
        <h1 align="center">List of users</h1>
        
        <table border="1" align="center">
            <tr>
                <th>Email</th>
                <th>Password</th>
                <th>Role</th>
            </tr>
            
            <%
              ResultSet r = (ResultSet)request.getAttribute("results");
              while(r.next())
            { %>
              <tr>
                  <td><%=r.getString("EMAIL") %> </td>
                  <td><%=r.getString("PASSWORD") %></td>
                  <td><%=r.getString("USERROLE") %></td>
              </tr>
            <% }
               %>
    </body>
</html>
