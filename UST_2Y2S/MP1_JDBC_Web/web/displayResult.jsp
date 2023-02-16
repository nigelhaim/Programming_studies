<%-- 
    Document   : displayResult
    Created on : 02 10, 23, 4:49:52 PM
    Author     : Dani
--%>

<%@ page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Table Results</title>
    </head>
<body>

	<h1 align="center">Login Database</h1>

	<table border="1" align="center">
		<tr>
			<th>Email</th>
			<th>Password</th>
                        <th>Role</th>
		</tr>
		
		<%
                    // 4. Retrieve the ResultSet
                    ResultSet results = (ResultSet)request.getAttribute("results");
			while (results.next()) { %>
			<tr>
				<td><%=results.getString("EMAIL").trim()%></td>
				<td><%=results.getString("PASSWORD").trim()%></td>
                                <td><%=results.getString("ROLE").trim()%></td>
			</tr>	
		<%	}
		%>
	
	</table>
	
	
</body>
</html>
