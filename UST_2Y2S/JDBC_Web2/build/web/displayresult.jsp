<%-- 
    Document   : displayresult
    Created on : Sep 15, 2016, 11:45:17 AM
    Author     : lawrence
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>My Friends</title>
    </head>
<body>

	<h1 align="center">My Friends, version 2</h1>

	<table border="1" align="center">
		<tr>
			<th>Name</th>
			<th>Age</th>
                        <th>Country</th>
		</tr>
		
		<%
                    ResultSet results = (ResultSet)request.getAttribute("results");
			while (results.next()) { %>
			<tr>
				<td><%=results.getString("name") %></td>
				<td><%=results.getString("age") %></td>
                                <td><%=results.getString("country") %></td>
			</tr>	
		<%	}
		%>
	
	</table>
	
	
</body>
</html>
