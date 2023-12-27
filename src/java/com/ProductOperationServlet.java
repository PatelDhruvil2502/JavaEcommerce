package com;

import com.helper.FactoryProvider;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

@MultipartConfig
public class ProductOperationServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            if (request.getParameter("productoperationtype").equals("addcategory")) {
                //add category
                String name = request.getParameter("categoryname");
                String desc = request.getParameter("categorydesc");
                Category category = new Category(name, desc);

                SessionFactory sessionFactory = FactoryProvider.getFactory();
                CategoryDAO categoryDAO = new CategoryDAO(sessionFactory);
                int catid = categoryDAO.addCategory(category);

                if (catid == -1) {
                    out.println("CAN NOT ADD CAT");
                    HttpSession httpSession = request.getSession();
                    httpSession.setAttribute("regitersuccmess", "Can not Add Category..II Category Already Exsist");
                    response.sendRedirect("Admin.jsp");
                } else {
                    out.println(" ADDED CAT");
                    HttpSession httpSession = request.getSession();
                    httpSession.setAttribute("regitersuccmess", "Category Added Succssfully");
                    response.sendRedirect("Admin.jsp");
                }

            }
            else if(request.getParameter("productoperationtype").equals("addproduct"))
            {
                String name = request.getParameter("productname");
                String desc = request.getParameter("productdesc");
                int categoryid=Integer.parseInt(request.getParameter("productcategory"));
                int price = Integer.parseInt(request.getParameter("productprice"));
                int qty = Integer.parseInt(request.getParameter("productqty"));
                int discount = Integer.parseInt(request.getParameter("productdiscount"));
                int soldcount = Integer.parseInt(request.getParameter("productsoldcount"));
                double rating = Double.parseDouble(request.getParameter("productrating"));
                String color= request.getParameter("productcolor");
                String brand = request.getParameter("productbrand");
                int shippingcharge = Integer.parseInt(request.getParameter("productshippingcost"));
                Part pic = request.getPart("productpic");
                
                Product product = new Product();
                product.setProductName(name);
                product.setProductDesc(desc);
                product.setProductPrice(price);
                product.setProductQuantity(qty);
                product.setProductDiscount(discount);
                product.setProductRating(rating);
                product.setProductSoldCount(soldcount);
                product.setShippingCost(shippingcharge);
                product.setProductBrand(brand);
                product.setProductColor(color);
//                product.setProductCategory();
                product.setProductPic(pic.getSubmittedFileName());
                
               CategoryDAO categoryDAO=new CategoryDAO(FactoryProvider.getFactory());
               Category category = categoryDAO.getCategoryById(categoryid);
               product.setProductCategory(category);
               
               ProductDAO productDAO = new ProductDAO(FactoryProvider.getFactory());
               boolean status = productDAO.addProduct(product);
               
               HttpSession httpSession = request.getSession();
               
               
                String path ="C://Users//bhavi//OneDrive//Documents//NetBeansProjects//E-Commerce//web//images"+File.separator+"productpic"+File.separator+pic.getSubmittedFileName();
                System.out.println("kkk : "+path);
                
                FileOutputStream fos = new FileOutputStream(path);
                InputStream fis =  pic.getInputStream();
                byte[] data = new byte[fis.available()];
                fis.read(data);
                fos.write(data);
                fos.close();
               if(status)
               {
                   httpSession.setAttribute("regitersuccmess", "Product added Succssesfully ");
               }
               else
                   httpSession.setAttribute("regitersuccmess", "Can not add Product ");
               
               response.sendRedirect("Admin.jsp");
                
            }

        }
        catch(Exception e)
        {
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
