package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import com.Category;
import com.helper.FactoryProvider;
import com.CategoryDAO;
import com.Users;
import com.Users;

public final class Admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/component/bootstrap.jsp");
    _jspx_dependants.add("/component/navbar.jsp");
    _jspx_dependants.add("/component/messege.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    Users user = (Users) session.getAttribute("curr-user");
    if (user == null) {
        session.setAttribute("formerroemessege", "Please Login To Access Admin Panel Page");
        response.sendRedirect("Login.jsp");
    } else if (user.getUserType().equals("user")) {
        session.setAttribute("formerroemessege", "You are not Admin Please Login As Admin To Access This Page");
        response.sendRedirect("Login.jsp");

    }


      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>ShopSmart-Admin Panel</title>\n");
      out.write("        ");
      out.write("    <!--bootstrap css -->\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\n");
      out.write("        \n");
      out.write("    <!--bootstrap js-->\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js\" integrity=\"sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js\" integrity=\"sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF\" crossorigin=\"anonymous\"></script>\n");
      out.write("    \n");
      out.write("    <link href=\"style.css\" rel=\"stylesheet\"/>\n");
      out.write("    \n");
      out.write("    <script src=\"CartFunction.js\" ></script>");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!--<h1>This is Admin page</h1>-->\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<nav  class=\"navbar navbar-expand-lg navbar-dark custom-bg\">\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("        <a class=\"navbar-brand\" href=\"#\">ShopSmart</a>\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-targe aria-contro aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("        </button>\n");
      out.write("        <div class=\"collapse navbar-collapse\" >\n");
      out.write("            <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link active\" aria-current=\"page\" href=\"/E-Commerce\">Home</a>\n");
      out.write("                </li>\n");
      out.write("                \n");
      out.write("                <li class=\"nav-item dropdown\">\n");
      out.write("                    <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("                        Categories\n");
      out.write("                    </a>\n");
      out.write("                    <ul class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                        <li><a class=\"dropdown-item\" href=\"#\">Action</a></li>\n");
      out.write("                        <li><a class=\"dropdown-item\" href=\"#\">Another action</a></li>\n");
      out.write("                        <li><hr class=\"dropdown-divider\" ></li>\n");
      out.write("                        <li><a class=\"dropdown-item\" href=\"#\">Something else here</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                \n");
      out.write("            </ul>\n");
      out.write("            ");
 Users user1 = (Users)session.getAttribute("curr-user");
                System.out.println("from navbbar : "+user1);
            
                    if(user1==null){
            
      out.write("\n");
      out.write("                    <ul class=\"navbar-nav ml-auto mb-2 mb-lg-0\">\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link active\" href=\"Login.jsp\">Login</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link active \" href=\"Register.jsp\">Register</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("            ");
}else{
      out.write("\n");
      out.write("                    <ul class=\"navbar-nav ml-auto mb-2 mb-lg-0\">\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link active\" href=\"Login.jsp\">");
      out.print(user1.getUserName());
      out.write("</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link active \" href=\"LogoutServlet\">Logout</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("             ");
}
      out.write("\n");
      out.write("            \n");
      out.write("\n");
      out.write("<!--                  <form class=\"d-flex\">\n");
      out.write("                    <input class=\"form-control me-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("                    <button class=\"btn btn-outline-success\" type=\"submit\">Search</button>\n");
      out.write("                  </form>-->\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("        ");
if(session.getAttribute("regitersuccmess")!=null){
    out.println("<script>");
    out.println("alert(`"+(String)session.getAttribute("regitersuccmess")+"`);");
    out.println("</script>");
    session.removeAttribute("regitersuccmess");
}

      out.write('\n');
      out.write("\n");
      out.write("        <div class=\"container mt-5 admin\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <div class=\"card-body text-center\">\n");
      out.write("                            <div class=\"container\">\n");
      out.write("                                <img style=\"max-height: 150px;min-width: 250px\" class=\"img-fluid border-2\" alt=\"\" src=\"images/user_pic.jpg\">\n");
      out.write("                            </div>\n");
      out.write("                            <h3 class=\"mt-2\">1234</h3>\n");
      out.write("                            <h3 class=\"text-uppercase\">Users</h3>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <div class=\"card-body text-center\">\n");
      out.write("                            <div class=\"container\">\n");
      out.write("                                <img style=\"max-height: 150px;max-width: 150px\" class=\"img-fluid border-2\" alt=\"\" src=\"images/checklist.png\">\n");
      out.write("                            </div>\n");
      out.write("                            <h3 class=\"mt-2\">1234</h3>\n");
      out.write("                            <h3 class=\"text-uppercase\">Categories</h3>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <div class=\"card-body text-center\">\n");
      out.write("                            <div class=\"container\">\n");
      out.write("                                <img style=\"max-height: 150px;max-width: 150px\" class=\"img-fluid border-2\" alt=\"\" src=\"images/products.png\">\n");
      out.write("                            </div>\n");
      out.write("                            <h3 class=\"mt-2\">1234</h3>\n");
      out.write("                            <h3 class=\"text-uppercase\">Products</h3>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"container mt-5 mb-5\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <div class=\"card\" data-bs-toggle=\"modal\" data-bs-target=\"#add-category-modal\">\n");
      out.write("                            <div class=\"card-body \">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <h3 class=\"mt-2 text-center align-items-center justify-content-center text-uppercase\">\n");
      out.write("                                    <img style=\"max-height: 25px;min-width: 25px\" class=\"img-fluid border-2 text-center\" alt=\"\" src=\"images/add.png\"> \n");
      out.write("                                    Add Categories\n");
      out.write("                                </h3>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <div class=\"card\"  data-bs-toggle=\"modal\" data-bs-target=\"#add-product-modal\">\n");
      out.write("                            <div class=\"card-body \">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <h3 class=\"mt-2 text-center align-items-center justify-content-center text-uppercase\">\n");
      out.write("                                    <img style=\"max-height: 25px;min-width: 25px\" class=\"img-fluid border-2 text-center\" alt=\"\" src=\"images/add.png\"> \n");
      out.write("                                    Add Products\n");
      out.write("                                </h3>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!--add category model-->\n");
      out.write("\n");
      out.write("            <!-- Modal -->\n");
      out.write("            <div class=\"modal fade\" id=\"add-category-modal\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("                <div class=\"modal-dialog \">\n");
      out.write("                    <div class=\"modal-content\">\n");
      out.write("                        <div class=\"modal-header custom-bg text-white\">\n");
      out.write("                            <h5 class=\"modal-title \" id=\"exampleModalLabel\">ADD CATEGORY</h5>\n");
      out.write("                            <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-body\">\n");
      out.write("                            <div class='container p-5'>\n");
      out.write("                                <form class='form-signup' method=\"post\" action=\"ProductOperationServlet\">\n");
      out.write("                                    <div class=\"shadow p-3 mb-5 bg-body rounded\">\n");
      out.write("\n");
      out.write("                                        <p class='text-center'>Add New Category To ShopSmart</p>\n");
      out.write("                                        <input type=\"hidden\" name=\"productoperationtype\" value=\"addcategory\"/>\n");
      out.write("                                        <div class='form-group mt-2'>\n");
      out.write("                                            <div class='row'>\n");
      out.write("                                                <label for=\"uemail\" >Category Name</label>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class='form-group m-2'>\n");
      out.write("                                            <div class='row'>\n");
      out.write("                                                <input type=\"text\" id=\"categorydesc\" class='form-control' name=\"categoryname\" placeholder='CATEGORY NAME' required />\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                        <div class='form-group mt-2'>\n");
      out.write("                                            <div class='row'>\n");
      out.write("                                                <label for=\"upassword\" >Category Description</label>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class='form-group m-2'>\n");
      out.write("                                            <div class='row'>\n");
      out.write("                                                <textarea style=\"height: 200px\"  id=\"categorydesc\" class='form-control' name=\"categorydesc\" placeholder='CATEGORY DESCRIPTION' required ></textarea>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                        <div class=\"form-group m-2\">\n");
      out.write("\n");
      out.write("                                            <div class='row'>\n");
      out.write("                                                <input  style=\"background-color: #fc8019;\"class=\"btn btn-success btn-block\"type=\"submit\" value=\"Add Category\" />\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"modal-footer\">\n");
      out.write("                                <button type=\"button\" class=\"btn btn-secondary\" data-bs-dismiss=\"modal\">Close</button>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!--END add category model-->\n");
      out.write("\n");
      out.write("            <!-- add Product model-->\n");
      out.write("\n");
      out.write("            <!-- Button trigger modal -->\n");
      out.write("            <div class=\"modal fade\" id=\"add-product-modal\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("                <div class=\"modal-dialog \">\n");
      out.write("                    <div class=\"modal-content\">\n");
      out.write("                        <div class=\"modal-header custom-bg text-white\">\n");
      out.write("                            <h5 class=\"modal-title \" id=\"exampleModalLabel\">ADD PRODUCT</h5>\n");
      out.write("                            <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-body\">\n");
      out.write("                            <div class='container p-5'>\n");
      out.write("                                <form class='form-signup' method=\"post\" action=\"ProductOperationServlet\" enctype=\"multipart/form-data\">\n");
      out.write("                                    <div class=\"shadow p-3 mb-5 bg-body rounded\">\n");
      out.write("\n");
      out.write("                                        <p class='text-center'>Add New Product To ShopSmart</p>\n");
      out.write("                                        <input type=\"hidden\" name=\"productoperationtype\" value=\"addproduct\"/>\n");
      out.write("\n");
      out.write("                                        <div class='form-group mt-2'>\n");
      out.write("                                            <div class='row'>\n");
      out.write("                                                <label for=\"productname\" >Product Name</label>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class='form-group m-2'>\n");
      out.write("                                            <div class='row'>\n");
      out.write("                                                <input type=\"text\" id=\"productname\" class='form-control' name=\"productname\" placeholder='PRODUCT NAME' required />\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class='form-group mt-2'>\n");
      out.write("                                            <div class='row'>\n");
      out.write("                                                <label for=\"productdesc\" >Product Description</label>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class='form-group m-2'>\n");
      out.write("                                            <div class='row'>\n");
      out.write("                                                <textarea style=\"height: 200px\"  id=\"productdesc\" class='form-control' name=\"productdesc\" placeholder='PRODUCT DESCRIPTION' required ></textarea>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class='form-group mt-2'>\n");
      out.write("                                            <div class='row'>\n");
      out.write("                                                <label for=\"productprice\" >Product Price</label>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class='form-group m-2'>\n");
      out.write("                                            <div class='row'>\n");
      out.write("                                                <input type=\"number\" id=\"productprice\" class='form-control' name=\"productprice\" placeholder='PRODUCT PRICE' required />\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class='form-group mt-2'>\n");
      out.write("                                            <div class='row'>\n");
      out.write("                                                <label for=\"productdiscount\" >Product Discount</label>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class='form-group m-2'>\n");
      out.write("                                            <div class='row'>\n");
      out.write("                                                <input type=\"number\" id=\"productdiscount\" class='form-control' name=\"productdiscount\" placeholder='PRODUCT DISCOUNT' required />\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                        <div class='form-group mt-2'>\n");
      out.write("                                            <div class='row'>\n");
      out.write("                                                <label for=\"productqty\" >Product Quantity</label>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class='form-group m-2'>\n");
      out.write("                                            <div class='row'>\n");
      out.write("                                                <input type=\"number\" id=\"productqty\" class='form-control' name=\"productqty\" placeholder='PRODUCT QUANTITY' required />\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        \n");
      out.write("                                        ");
 
                                            CategoryDAO categoryDAO = new CategoryDAO(FactoryProvider.getFactory());
                                            List<Category> categories = categoryDAO.getAllCategory();
                                            
                                        
      out.write("\n");
      out.write("\n");
      out.write("                                        <div class='form-group mt-2'>\n");
      out.write("                                            <div class='row'>\n");
      out.write("                                                <label for=\"productcategory\" >Product Category</label>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class='form-group m-2'>\n");
      out.write("                                            <div class='row'>\n");
      out.write("                                                <select class=\"form-select\" aria-label=\"Default select example\" name='productcategory'>\n");
      out.write("                                                ");
 for(Category c : categories){ 
      out.write("\n");
      out.write("                                                    <option  value=");
      out.print(c.getCategoryId());
      out.write(' ');
      out.write('>');
      out.print(c.getCategoryTitle());
      out.write("</option>\n");
      out.write("                                                ");
 } 
      out.write("\n");
      out.write("                                                </select>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                        <div class='form-group mt-2'>\n");
      out.write("                                            <div class='row'>\n");
      out.write("                                                <label for=\"productpic\" >Product Picture</label>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class='form-group m-2'>\n");
      out.write("                                            <div class='row'>\n");
      out.write("                                                <input type=\"file\" id=\"productpic\" class='form-control' name=\"productpic\"  required />\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                        <div class=\"form-group m-2\">\n");
      out.write("                                            <div class='row'>\n");
      out.write("                                                <input  style=\"background-color: #fc8019;\"class=\"btn btn-success btn-block\"type=\"submit\" value=\"Add Product\" />\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"modal-footer\">\n");
      out.write("                                <button type=\"button\" class=\"btn btn-secondary\" data-bs-dismiss=\"modal\">Close</button>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!--End add product modal-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
