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
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author nigel
 */
public class LogSession extends HttpServlet {

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
        /*response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            //TODO output your page here. You may use following sample code.
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LogSession</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LogSession at " + request.getContextPath() + "</h1>");
            out.println("<h1>Servlet LogSession at " + email + "</h1>");
            out.println("<h1>Servlet LogSession at " + password + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }*/
        String email = request.getParameter("username").trim();
        String password = request.getParameter("password").trim();
        try{ 
            if(conn != null){
                System.out.println("WORKING DATABASE");
                Statement stmt = conn.createStatement();
                ResultSet user = stmt.executeQuery("SELECT Email, Password FROM USERS WHERE Email=" + "'" + email + "'");
                while(user.next()){
                    String Remail = user.getString("EMAIL").trim();
                    String Rpass = user.getString("PASSWORD").trim();
                    System.out.println("Email : " + Remail);
                    System.out.println("Password: " + Rpass);
                    System.out.println();
                    if((Remail.equals(email.trim())) && (Rpass.equals(password.trim()))){
                        response.sendRedirect("./JdbcController");
                    }
                    else{
                        
                    }
                }
            }
        }
        catch(SQLException sqle){
            response.sendRedirect("error.jsp");
        }
        
        
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
