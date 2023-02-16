
/*package controller;

import java.io.IOException;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JDBCController extends HttpServlet {
    
    Connection conn;
    
    public void init() throws ServletException {
        // 1. Load Driver
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            String username = "app";
            String password = "app";
            // 2. Establish Connection
            String url = "jdbc:derby://localhost:1527/LoginDB";
            conn = DriverManager.getConnection(url, username, password);
        } catch (SQLException sqle) {
            System.out.println("SQLException error occured - " + sqle.getMessage());
        } catch (ClassNotFoundException nfe) {
            System.out.println("ClassNotFoundException error occured - " + nfe.getMessage());
        }
    }
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
 /*   protected void processRequest(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
        try {	
            if (conn != null) {
                Statement stmt = conn.createStatement();
                ResultSet records = stmt.executeQuery("SELECT EMAIL, PASSWORD, USERROLE AS ROLE FROM USERS ORDER BY EMAIL ASC");
                request.setAttribute("results", records);
                request.getRequestDispatcher("displayResult.jsp").forward(request,response);
            } else {
                response.sendRedirect("error.jsp");
            }
        } catch (SQLException sqle){
            response.sendRedirect("error.jsp");
        } 
    }
    
}*/

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author nigel
 */
public class JDBCController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    Connection conn; 
    
    public void init() throws ServletException{
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            String username = "app";
            String password = "app";
            String url = "jdbc:derby://localhost:1527/LoginDB";
            conn = DriverManager.getConnection(url, username, password);
        }
        catch(SQLException sqle){
            System.out.println("SQLException error occured - " + sqle.getMessage());
        }
        catch(ClassNotFoundException nfe){
            System.out.println("ClassNotFoundException error occured - " + nfe.getMessage());
        }
    }
    

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 /*       response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
             TODO output your page here. You may use following sample code. 
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet JdbcController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet JdbcController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
        */
        try{ 
            if(conn != null){
                Statement stmt = conn.createStatement();
                ResultSet records = stmt.executeQuery("SELECT * FROM USERS ORDER BY EMAIL ASC");
                request.setAttribute("results", records);
                request.getRequestDispatcher("displayResult.jsp").forward(request,response);
            }
        }
        catch(SQLException sqle){
            response.sendRedirect("error.jsp");
        }
    }
}
