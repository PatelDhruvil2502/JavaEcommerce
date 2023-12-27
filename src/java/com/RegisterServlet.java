
package com;

import com.helper.FactoryProvider;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class RegisterServlet extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            String address=request.getParameter("address");
            String contactno = request.getParameter("phone");
            
//            out.println("Hello from servlet");
            System.out.println(contactno);
            Users user = new Users(name, email, password, contactno, "default.jpg", address,"user");
            
            SessionFactory sf = FactoryProvider.getFactory();
            Session s = sf.openSession();
            s.beginTransaction();
            int userid=(int)s.save(user);
            s.getTransaction().commit();
            s.close();
//            sf.close();
            
//            out.println("Succsessfully Registered");
//            out.println("User Id Registered"+userid);
//
//            out.println("<script>alert('hello world');</script>");
//            RequestDispatcher requestDispatcher = request.getRequestDispatcher("\\web\\index.jsp");
//            requestDispatcher.forward(request, response);

            HttpSession httpSession = request.getSession();
            httpSession.setAttribute("regitersuccmess", "Succsessfully Registered"+"User Id Registered"+userid);
                    
            response.sendRedirect("index.jsp");
                    
            
            
            
        }
        catch(Exception e){
            
            e.printStackTrace();
            
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
