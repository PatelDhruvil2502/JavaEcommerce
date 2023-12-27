package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.Product;
import com.ProductDAO;
import java.util.List;
import com.CategoryDAO;
import com.Category;
import com.helper.FactoryProvider;
import com.Users;
import com.Users;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    System.out.println("hello index loaded");
    Users user = (Users) session.getAttribute("curr-user");
    if (user == null) {
        System.out.println("5 hello index loaded");
        session.setAttribute("formerroemessege", "Please Login To Access Home Page");
        System.out.println(request.getContextPath());
        response.sendRedirect("http://localhost:8080/E-Commerce/Login.jsp");
        return;
        
        
    }



      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>ShopSmart-Home</title>\n");
      out.write("        ");
      out.write("<!--bootstrap css -->\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("<!--bootstrap js-->\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js\" integrity=\"sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js\" integrity=\"sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF\" crossorigin=\"anonymous\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/@fortawesome/fontawesome-free@6.2.1/css/fontawesome.min.css\" integrity=\"sha384-QYIZto+st3yW+o8+5OHfT6S482Zsvz2WfOzpFSXMF9zqeLcFV0/wlZpMtyFcZALm\" crossorigin=\"anonymous\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css\" integrity=\"sha384-...insert integrity hash here...\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("<link href=\"style.css\" rel=\"stylesheet\"/>\n");
      out.write("\n");
      out.write("<script >\n");
      out.write("//            alert('script added');\n");
      out.write("//            function add_to_cart(pid, pname, pqty, pprice)\n");
      out.write("//            {\n");
      out.write("\n");
      out.write("//                console.log(\"ok ji\");\n");
      out.write("//                let cart = localStorage.getItem(\"cart\");\n");
      out.write("//                if (cart == null)\n");
      out.write("//                {\n");
      out.write("//                    let products = [];\n");
      out.write("//                    let product = {productId: pid, productName: pname, productQty: 1, productPrice: pprice};\n");
      out.write("//                    products.push(product);\n");
      out.write("////                    console.log(product);\n");
      out.write("//                    localStorage.setItem(\"cart\", JSON.stringify(products));\n");
      out.write("//                \n");
      out.write("//                } else\n");
      out.write("//                {\n");
      out.write("//                    let pcart =JSON.parse(cart);\n");
      out.write("//                    let oldItem = pcart.find((item)=>item.productId==pid);\n");
      out.write("//                    \n");
      out.write("//                        let flag=false;\n");
      out.write("//                        pcart.map((item) => {\n");
      out.write("//\n");
      out.write("//                            if (item.productId == pid)\n");
      out.write("//                            {\n");
      out.write("//                                flag=true;\n");
      out.write("//                                item.productQty++;\n");
      out.write("//                            }\n");
      out.write("//\n");
      out.write("//                        });\n");
      out.write("//                        if(flag===false)\n");
      out.write("//                        {\n");
      out.write("//                            let product = {productId: pid, productName: pname, productQty: 1, productPrice: pprice};\n");
      out.write("//                            cart.push(product);\n");
      out.write("//                        }\n");
      out.write("//                        localStorage.setItem(\"cart\", JSON.stringify(cart));\n");
      out.write("//                    \n");
      out.write("//                }\n");
      out.write("//            }\n");
      out.write("//    localStorage.clear();\n");
      out.write("    function add_to_cart(pid, pname, price)\n");
      out.write("    {\n");
      out.write("        let cart = localStorage.getItem(\"cart\");\n");
      out.write("        if (cart === null)\n");
      out.write("        {\n");
      out.write("            let products = [];\n");
      out.write("            let product = {productId: pid, productName: pname, productQuantity: 1, productPrice: price};\n");
      out.write("            products.push(product);\n");
      out.write("            localStorage.setItem(\"cart\", JSON.stringify(products));\n");
      out.write("        } else\n");
      out.write("        {\n");
      out.write("            //cart is already present\n");
      out.write("            let pcart = JSON.parse(cart);\n");
      out.write("            let oldProduct = pcart.find((item) => item.productId === pid);\n");
      out.write("\n");
      out.write("            if (oldProduct)\n");
      out.write("            {\n");
      out.write("                //we have to increase the quantity\n");
      out.write("                oldProduct.productQuantity = oldProduct.productQuantity+1;\n");
      out.write("                pcart.map((item) => {\n");
      out.write("                    if (item.productId === oldProduct.productId){\n");
      out.write("                        item.productQuantity = oldProduct.productQuantity;\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("                localStorage.setItem(\"cart\", JSON.stringify(pcart));\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            } else\n");
      out.write("            {\n");
      out.write("                //we have add the product\n");
      out.write("                console.log(pcart);\n");
      out.write("                let product = {productId: pid, productName: pname, productQuantity: 1, productPrice: price};\n");
      out.write("                pcart.push(product);\n");
      out.write("                localStorage.setItem(\"cart\", JSON.stringify(pcart));\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        console.log(localStorage);\n");
      out.write("    }\n");
      out.write("\n");
      out.write("</script>");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
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
      out.write("\n");
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
      out.write("\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("            <ul class=\"navbar-nav ml-auto mb-2 mb-lg-0 mr-3\">\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link active\" href=\"MyCart.jsp\">\n");
      out.write("                        <span class=\"icon-text-container\">\n");
      out.write("                            <i class=\"material-icons\">shopping_cart</i>\n");
      out.write("                            <span class=\"text\">My Cart</span>\n");
      out.write("                        </span>\n");
      out.write("\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("            ");
 Users user1 = (Users) session.getAttribute("curr-user");
                System.out.println("from navbbar : " + user1);

                if (user1 == null) {
            
      out.write("\n");
      out.write("            <ul class=\"navbar-nav ml-auto mb-2 mb-lg-0\">\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link active\" href=\"Login.jsp\">Login</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link active \" href=\"Register.jsp\">Register</a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("            ");
} else {
      out.write("\n");
      out.write("            <ul class=\"navbar-nav ml-auto mb-2 mb-lg-0\">\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link active\" href=\"Login.jsp\">");
      out.print(user1.getUserName());
      out.write("</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link active \" href=\"LogoutServlet\">Logout</a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!--                  <form class=\"d-flex\">\n");
      out.write("                                <input class=\"form-control me-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("                                <button class=\"btn btn-outline-success\" type=\"submit\">Search</button>\n");
      out.write("                              </form>-->\n");
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
      out.write("\n");
      out.write("        <div class=\"container-fluid mt-3 mb-2\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-2 mx-3\">\n");
      out.write("\n");
      out.write("                    <div class=\"list-group\">\n");
      out.write("                        ");
                 
                            System.out.println("2 hello index loaded");
                            String categoryid = request.getParameter("categoryid");
                            if (categoryid == null) {
                        
      out.write("\n");
      out.write("                        <a href=\"index.jsp\" class=\"list-group-item list-group-item-action active\" aria-current=\"true\">\n");
      out.write("                            All Category\n");
      out.write("                        </a>\n");
      out.write("                        ");
} else {
      out.write("\n");
      out.write("                        <a href=\"index.jsp\" class=\"list-group-item list-group-item-action \" aria-current=\"true\">\n");
      out.write("                            All Category\n");
      out.write("                        </a>\n");
      out.write("                        ");
}
                            System.out.println("3 hello index loaded");
                            CategoryDAO categoryDAO = new CategoryDAO(FactoryProvider.getFactory());
                            List<Category> clist = categoryDAO.getAllCategory();
                            System.out.println("4 hello index loaded");
                            for (Category c : clist) {
                        
      out.write("\n");
      out.write("                        ");
 if (categoryid != null && c.getCategoryId() == Integer.parseInt(categoryid)) {
      out.write("\n");
      out.write("                        <a href=\"index.jsp?categoryid=");
      out.print(c.getCategoryId());
      out.write("\" class=\"list-group-item list-group-item-action active \" aria-current=\"true\">\n");
      out.write("                            ");
      out.print(c.getCategoryTitle());
      out.write("\n");
      out.write("                        </a>\n");
      out.write("                        ");
} else {
      out.write("\n");
      out.write("                        <a href=\"index.jsp?categoryid=");
      out.print(c.getCategoryId());
      out.write("\" class=\"list-group-item list-group-item-action \" aria-current=\"true\">\n");
      out.write("                            ");
      out.print(c.getCategoryTitle());
      out.write("\n");
      out.write("                        </a>\n");
      out.write("\n");
      out.write("                        ");
}
                            }
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-8 mx-4\">\n");
      out.write("\n");
      out.write("                    <div class=\"row-mt-4\">\n");
      out.write("                        <div class=\"col-md-12\">\n");
      out.write("                            <div class=\"row row-cols-1 row-cols-md-3 g-4\">\n");
      out.write("\n");
      out.write("                                ");


                                    ProductDAO productDAO = new ProductDAO(FactoryProvider.getFactory());
                                    List<Product> plist;

                                    if (categoryid == null) {
                                        plist = productDAO.getAllProducts();
                                    } else {
                                        plist = productDAO.getProductsByCategoryId(Integer.parseInt(categoryid));
                                    }
                                    for (Product p : plist) {
                                
      out.write("\n");
      out.write("                                <div class=\"col\">\n");
      out.write("                                    <div class=\"card  h-100 product-card\">\n");
      out.write("                                        <img src=\"images/productpic/");
      out.print(p.getProductPic());
      out.write("\" class=\"card-img-top\" alt=\"...\">\n");
      out.write("                                        <div class=\"card-body\">\n");
      out.write("                                            <h5 class=\"card-title\">");
      out.print(p.getProductName());
      out.write("</h5>\n");
      out.write("                                            <p class=\"card-text\">");
      out.print(p.getProductDesc());
      out.write("</p>\n");
      out.write("                                            <p class=\"card-text\"><small class=\"text-muted\">Last updated 3 mins ago</small></p>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"card-footer\" style=\"width: 100%\">\n");
      out.write("                                            <a href=\"AddToCartServlet?pid=");
      out.print(p.getProductId());
      out.write("&uid=");
      out.print(user.getUserId());
      out.write("\"><button class=\"btn btn-primary\" onclick=\"add_to_cart('");
      out.print(p.getProductId());
      out.write("','");
      out.print(p.getProductName());
      out.write('\'');
      out.write(',');
      out.print(p.getDiscountedPrice());
      out.write(")\">Add to Cart</button></a>\n");
      out.write("                                            <button class=\"btn custom-bg text-white mt-1\">&#8377;");
      out.print(p.getDiscountedPrice());
      out.write("/-<span> <small><span style=\"text-decoration: line-through;\">");
      out.print(p.getProductPrice());
      out.write("/-</span> ");
      out.print(p.getProductDiscount());
      out.write("% off</small> </span></button>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                ");
}
                                    if (plist.size() == 0) {
                                        out.println("<div class='alert alert-danger container text-uppercase'>");
                                        out.println("No Products In This Category");
                                        out.println("</div>");

                                    }


                                
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
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
