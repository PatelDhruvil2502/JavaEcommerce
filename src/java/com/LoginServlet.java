/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import com.helper.FactoryProvider;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            // Fetching data
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            
            //gettingg user detals using userDAO
            
            UserDAO userDAO = new UserDAO(FactoryProvider.getFactory());
            Users user = userDAO.getUserByEmailAndPassword(email, password);
            HttpSession httpSession = request.getSession();
            
            
            if(user==null)
            {
//                out.println("Inavalid User");  
                httpSession.setAttribute("formerroemessege","Invalid Credentials");
                
                response.sendRedirect("Login.jsp");
                
            }
            else
            {
                System.out.println(user);
//                out.println("Login successfull "+user.getUserName());
                httpSession.setAttribute("curr-user", user);
                
                
                if(user.getUserType().equals("admin"))
                {
                    httpSession.setAttribute("regitersuccmess", "Welcome..!! "+user.getUserName()+"\nLogged in as Admin :)");
                    response.sendRedirect("Admin.jsp");
                }
                else if(user.getUserType().equals("user"))
                {
                    httpSession.setAttribute("regitersuccmess", "Welcome..!! "+user.getUserName()+"\nHappy Shopping..!! ");
                    response.sendRedirect("index.jsp");
                }
                else
                {
                    out.println("User Type not found");
                    response.sendRedirect("Login.jsp");
                }
                
            }
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
