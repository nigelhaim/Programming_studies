<%-- 
    Document   : displayresult
    Created on : Sep 15, 2016, 11:09:06 AM
    Author     : lawrence
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Team Decamora</title>
    </head>
<body>

	<h1 align="center">Team Decamora, version 1</h1>

	<table border="1" align="center">
		<tr>
			<th>Name</th>
			<th>Age</th>
		</tr>
		
		<%
                    ResultSet results = (ResultSet)request.getAttribute("results");
			while (results.next()) { %>
			<tr>
				<td><%=results.getString("name") %></td>
				<td><%=results.getString("age") %></td>
			</tr>	
		<%	}
		%>
	
	</table>
	
	
</body>
</html>
