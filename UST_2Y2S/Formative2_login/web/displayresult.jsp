<%-- 
    Document   : displayresult
    Created on : 02 16, 23, 1:23:20 PM
    Author     : nigel
--%>

<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
            response.setHeader("Pragma", "no-cache");
            response.setHeader("Expires", "0");
            if(session.getAttribute("username")==null){
                response.sendRedirect("index.jsp");
            }
        
        %>
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
        </table>
               <br> 
    <center>
        <form action ="Logout">
            <input type="submit" value="logout">
        </form>
       </center
    </body>
</html>
