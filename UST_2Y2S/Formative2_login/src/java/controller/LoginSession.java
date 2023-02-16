/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author nigel
 */
public class LoginSession extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    Connection conn;
    
    int attempt = 0; 
     public void init(ServletConfig config) throws ServletException
    {
        try{
            Class.forName(config.getInitParameter("jdbcClassName"));
            String username = config.getInitParameter("dbUserName");
            String password = config.getInitParameter("dbPassword");
            
            StringBuffer url = new StringBuffer(config.getInitParameter("jdbcDriverURL"))
                    .append("://")
                    .append(config.getInitParameter("dbHostName"))
                    .append(":")
                    .append(config.getInitParameter("dbPort"))
                    .append("/")
                    .append(config.getInitParameter("databaseName"));
                           
            
            conn = DriverManager.getConnection(url.toString(), username, password);
            
        }catch(SQLException sqle){
            System.out.print("An SQL Exception occur" + sqle.getMessage());
        }catch(ClassNotFoundException cnfe){
            System.out.println("ClassNotFound Exception occured: " + cnfe.getMessage());
        }
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        /*response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code.
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LoginSession</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LoginSession at " + request.getContextPath() + "</h1>");
            out.println("<h1>Servlet LoginSession at " + request.getParameter("username") + "</h1>");
            out.println("<h1>Servlet LoginSession at " + request.getParameter("password") + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }*/
        String email = request.getParameter("username").trim();
        String pass = request.getParameter("password").trim();
        try{
            if(conn != null){
                String query = "SELECT EMAIL, PASSWORD FROM USERS WHERE EMAIL = " + "'" + email + "'";
                Statement stmt = conn.createStatement();
                ResultSet result = stmt.executeQuery(query);
                if(result == null){
                    attempt++;
                    System.out.print("Attempt: " + attempt);
                    if(attempt >= 3){
                        response.sendRedirect("3rdAttempt.jsp");
                    }   
                    response.sendRedirect("index.jsp");
                }
                while(result.next()){
                    String result_username = result.getString("EMAIL");
                    String result_password = result.getString("PASSWORD");
                    
                    if(email.equals(result_username) && pass.equals(result_password)){
                        HttpSession session = request.getSession();
                        session.setAttribute("username", email);
                        response.sendRedirect("./JDBCcontroller");
                    }
                    else{
                        attempt++;
                        System.out.print("Attempt: " + attempt);
                        if(attempt >= 3){
                            response.sendRedirect("3rdAttempt.jsp");
                        }   
                        else{
                            response.sendRedirect("index.jsp");
                        }
                    }
                }
            }
            else{
                response.sendRedirect("error.jsp");
            }
        }catch(SQLException sqle){
            attempt++;
            System.out.print("Attempt: " + attempt);
            if(attempt >= 3){
                response.sendRedirect("3rdAttempt.jsp");
            }   
            response.sendRedirect("index.jsp");
            System.out.print(sqle.getMessage());
        }
        
    }
    
    public void failedAttempt(int attempt){
    
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
