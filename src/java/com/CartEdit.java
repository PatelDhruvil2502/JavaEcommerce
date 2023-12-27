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
import org.hibernate.Session;

/**
 *
 * @author bhavi
 */
public class CartEdit extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            CartItemDAO cartItemDAO = new CartItemDAO(FactoryProvider.getFactory());

            int pid = Integer.parseInt(request.getParameter("pid"));
            int uid = Integer.parseInt(request.getParameter("uid"));
            CartItem cartItem = cartItemDAO.getCartItemByUuserIdAndProductId(uid, pid);
            System.out.println(request.getParameter("change"));

            if (request.getParameter("change").equals("inc")) {
                System.out.println("inc quantity");
                Session session = FactoryProvider.getFactory().openSession();
                session.beginTransaction();

                cartItem.setQuantity(cartItem.getQuantity() + 1);
                session.update(cartItem);
                session.getTransaction().commit();
                session.close();

            } 
            else if (request.getParameter("change").equals("dec")) {
                System.out.println("dec quantity");
                cartItem.setQuantity(cartItem.getQuantity() - 1);

                if (cartItem.getQuantity() == 0) {
                    Session session = FactoryProvider.getFactory().openSession();
                    session.beginTransaction();
                    session.delete(cartItem);
                    session.getTransaction().commit();
                    session.close();
                } else {
                    Session session = FactoryProvider.getFactory().openSession();
                    session.beginTransaction();
                    session.update(cartItem);
                    session.getTransaction().commit();
                    session.close();
                }
            } 
            else if (request.getParameter("change").equals("remove")) {
                
                Session session = FactoryProvider.getFactory().openSession();
                session.beginTransaction();
                session.delete(cartItem);
                session.getTransaction().commit();
                session.close();
            }
            else if(request.getParameter("change").equals("wishlist"))
            {
                WishListItemDAO wishListItemDAO = new WishListItemDAO(FactoryProvider.getFactory());
                wishListItemDAO.addToWistlist(uid, pid);
            }
            response.sendRedirect("MyCart.jsp");
            return;

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
