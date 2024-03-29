/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
 * @author lawrence
 */
public class JdbcController extends HttpServlet {
    
    Connection conn;
    
    public void init() throws ServletException
    {
    	try {	
			Class.forName("org.apache.derby.jdbc.ClientDriver");
			String username = "app";
			String password = "app";
			String url = 
			  "jdbc:derby://localhost:1527/PersonDB"; 
			conn = DriverManager.getConnection(url,username,password);
		} catch (SQLException sqle){
			System.out.println("SQLException error occured - " 
				+ sqle.getMessage());
		} catch (ClassNotFoundException nfe){
			System.out.println("ClassNotFoundException error occured - " 
		        + nfe.getMessage());
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
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        PrintWriter out = response.getWriter();
//        try {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet JdbcController</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet JdbcController at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        } finally {
//            out.close();
//        }
        try {	

                if (conn != null) {
                        Statement stmt = conn.createStatement();
                        ResultSet records = stmt.executeQuery("SELECT * FROM PERSON_INFO ORDER BY NAME");
                        request.setAttribute("results", records);
                        request.getRequestDispatcher("displayresult.jsp").forward(request,response);
                } else {
                        response.sendRedirect("error.jsp");
                }
        } catch (SQLException sqle){
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
