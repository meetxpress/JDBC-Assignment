package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdatePublisherServlet extends HttpServlet {   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try{            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectbook", "root", "");                        
            Statement st = con.createStatement(); 
            String id=request.getParameter("pu_id");  
            String name = request.getParameter("pu_name");
            int mob = Integer.parseInt(request.getParameter("pu_mobile"));
            String add = request.getParameter("pu_add");
            int aadhar = Integer.parseInt(request.getParameter("pu_aadharNo"));          
            
            String qry = "update publishermaster set Pub_name='"+name+"', Pub_Mobile="+mob+", Pub_Add='"+add+"', Pub_AadharNo="+aadhar+" where Pub_id="+id;
            int no=st.executeUpdate(qry);
            if(no>0){
                response.sendRedirect("ViewAllPublisher.jsp");
            }            
        } catch(Exception ex){
            System.out.println(ex);
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
