

<%@page import="com.Product"%>
<%@page import="com.ProductDAO"%>
<%@page import="java.util.List"%>
<%@page import="com.CategoryDAO"%>
<%@page import="com.Category"%>
<%@page import="com.helper.FactoryProvider"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.Users" %>
<%
    System.out.println("hello index loaded");
    Users user = (Users) session.getAttribute("curr-user");
    if (user == null) {
        System.out.println("5 hello index loaded");
        session.setAttribute("formerroemessege", "Please Login To Access Home Page");
        System.out.println(request.getContextPath());
        response.sendRedirect("http://localhost:8080/E-Commerce/Login.jsp");
        return;

    }


%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ShopSmart-Home</title>
        <%@include file="component/bootstrap.jsp" %>


    </head>
    <body>
        <%@include file="component/navbar.jsp" %>
        <%@include file="component/messege.jsp" %>

        <div class="container-fluid mt-3 mb-2">
            <div class="row">
                <div class="col-md-2 mx-3">

                    <div class="list-group">
                        <%                            System.out.println("2 hello index loaded");
                            String categoryid = request.getParameter("categoryid");
                            Integer minn = null, maxx = null;
                            if (request.getParameter("minprice") != null) {
                                minn = Integer.parseInt(request.getParameter("minprice"));
                            }
                            if (request.getParameter("maxprice") != null) {
                                maxx = Integer.parseInt(request.getParameter("maxprice"));
                            }
                            if (categoryid == null) {
                        %>
                        <a href="index.jsp" class="list-group-item list-group-item-action active" aria-current="true">
                            All Category
                        </a>
                        <%} else {%>
                        <a href="index.jsp" class="list-group-item list-group-item-action " aria-current="true">
                            All Category
                        </a>
                        <%}
                            System.out.println("3 hello index loaded");
                            CategoryDAO categoryDAO = new CategoryDAO(FactoryProvider.getFactory());
                            List<Category> clist = categoryDAO.getAllCategory();
                            System.out.println("4 hello index loaded");
                            for (Category c : clist) {
                        %>
                        <% if (categoryid != null && c.getCategoryId() == Integer.parseInt(categoryid)) {%>
                        <a href="index.jsp?categoryid=<%=c.getCategoryId()%>" class="list-group-item list-group-item-action active " aria-current="true">
                            <%=c.getCategoryTitle()%>
                        </a>
                        <%} else {%>
                        <a href="index.jsp?categoryid=<%=c.getCategoryId()%>" class="list-group-item list-group-item-action " aria-current="true">
                            <%=c.getCategoryTitle()%>
                        </a>

                        <%}
                            }%>
                    </div>

                    

                </div>
                <div class="col-md-8 mx-4">

                    <div class="row-mt-4">
                        <div class="col-md-12">
                            <div class="row row-cols-1 row-cols-md-3 g-4">

                                <%

                                    ProductDAO productDAO = new ProductDAO(FactoryProvider.getFactory());
                                    List<Product> plist;

                                    if (categoryid == null) {
                                        plist = productDAO.getAllProducts();
                                    } else {
                                        plist = productDAO.getProductsByCategoryId(Integer.parseInt(categoryid));
                                    }
                                    if (minn != null || maxx != null) {
                                        if (minn == null) {
                                            minn = 0;
                                        }
                                        if (maxx == null) {
                                            maxx = Integer.MAX_VALUE;
                                        }
                                        for (int i = 0; i < plist.size(); i++) {
                                            Product p = plist.get(i);
                                            if (!(p.getDiscountedPrice() >= minn && p.getDiscountedPrice() <= maxx)) {
                                                plist.remove(i);
                                            }
                                        }
                                    }

                                    for (Product p : plist) {
                                %>
                                <div class="col">
                                    <div class="card  h-100 product-card">
                                        <img src="images/productpic/<%=p.getProductPic()%>" class="card-img-top" alt="...">
                                        <div class="card-body">
                                            <h5>&#8377; <%=p.getDiscountedPrice()%> <span style="font-size: 18px"> <small> &#8377; <span style="text-decoration: line-through;"><%=p.getProductPrice()%>/-</span>  <%=p.getProductDiscount()%>% off</small> </span></h5>
                                            <h5 class="card-title"><%=p.getProductName()%></h5>
<!--                                            <p class="card-text"><%=p.getProductDesc()%></p>
                                            --><div class="d-flex align-items-center card-text"><small class="text-muted align-items-center">Rating : <strong><%=p.getProductRating()%></strong> <i class="fas fa-star " style="color: goldenrod;"></i> </small></div>
                                        </div>
                                        <div class="card-footer" style="width: 100%">


                                            <div class="d-flex justify-content-between">
                                                <div class="text-left">
                                                    <a href="AddToCartServlet?pid=<%=p.getProductId()%>&uid=<%=user.getUserId()%>">
                                                        <button class="btn custom-bg text-white btn-sm me-1 mb-2" >Buy Now</button>
                                                    </a>


                                                </div>
                                                <div class="text-right">
                                                    <a href="AddToWishListServlet?pid=<%=p.getProductId()%>&uid=<%=user.getUserId()%>">
                                                        <button type="button" class="btn btn-danger btn-sm mb-2" data-mdb-toggle="tooltip" title="Move to the wish list">
                                                            <i class="fas fa-heart"></i>
                                                        </button>
                                                    </a>
                                                    <a href="AddToCartServlet?pid=<%=p.getProductId()%>&uid=<%=user.getUserId()%>">
                                                        <button type="button" class="btn btn-primary btn-sm me-1 mb-2" data-mdb-toggle="tooltip" title="Remove item">
                                                            <i class="fas fa-shopping-cart"></i>
                                                        </button>
                                                    </a>
                                                </div>
                                            </div>
                                            <!--<button class="btn custom-bg text-white mt-1">&#8377;<%=p.getDiscountedPrice()%>/-<span> <small><span style="text-decoration: line-through;"><%=p.getProductPrice()%>/-</span> <%=p.getProductDiscount()%>% off</small> </span></button>-->
                                        </div>
                                    </div>
                                </div>



                                <%}
                                    if (plist.size() == 0) {
                                        out.println("<div class='alert alert-danger container text-uppercase'>");
                                        out.println("No Products In This Category");
                                        out.println("</div>");

                                    }


                                %>



                            </div>

                        </div>
                    </div>





                </div>
            </div>
        </div>




    </body>
</html>
