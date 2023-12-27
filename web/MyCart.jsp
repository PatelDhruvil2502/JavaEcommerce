
<%@page import="java.util.Date"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.time.LocalDate"%>
<%@page import="com.CartItem"%>
<%@page import="com.CartItemDAO"%>
<%@page import="com.Product"%>
<%@page import="com.ProductDAO"%>
<%@page import="java.util.List"%>
<%@page import="com.CategoryDAO"%>
<%@page import="com.Category"%>
<%@page import="com.helper.FactoryProvider"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.Users" %>
<%
    Users user = (Users) session.getAttribute("curr-user");
    if (user == null) {
        session.setAttribute("formerroemessege", "Please Login To Access Cart");
        response.sendRedirect("Login.jsp");
        return;
    }


%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ShopSmart-Cart</title>
        <%@include file="component/bootstrap.jsp" %>


    </head>
    <body>
        <%@include file="component/navbar.jsp" %>
        <%@include file="component/messege.jsp" %>
        <%            CartItemDAO cartItemDAO = new CartItemDAO(FactoryProvider.getFactory());
            List<CartItem> cartlist = cartItemDAO.getCartItemByUserId(user.getUserId());
            Long total = new Long(0);
            Long totalShpping = new Long(0);
            Date today = new Date();
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(today);
            calendar.add(Calendar.DAY_OF_YEAR, 4);
            Date dildate = calendar.getTime();
//            LocatDate deliverydate = todaydate.plusD
%>
        <section class="h-100 gradient-custom">
            <div class="container py-5">
                <div class="row d-flex justify-content-center my-4">
                    <div class="col-md-8">
                        <div class="card mb-4">
                            <div class="card-header py-3">
                                <h5 class="mb-0">Cart - <%=cartlist.size()%> Items</h5>
                            </div>

                            <div class="card-body">
                                <!-- Single item -->
                                <%
                                    for (CartItem c : cartlist) {

                                        Product p = c.getCartItemProduct();
                                        total += p.getDiscountedPrice() * c.getQuantity();
                                        totalShpping += p.getShippingCost();

                                %>
                                <div class="row">
                                    <div class="col-lg-3 col-md-12 mb-4 mb-lg-0">
                                        <!-- Image -->
                                        <div class="bg-image hover-overlay hover-zoom ripple rounded" data-mdb-ripple-color="light">
                                            <img src="images/productpic/<%=p.getProductPic()%>" class="w-100" alt="Blue Jeans Jacket" />
                                            <a href="#!">
                                                <div class="mask" style="background-color: rgba(251, 251, 251, 0.2)"></div>
                                            </a>
                                        </div>
                                        <!-- Image -->
                                    </div>

                                    <div class="col-lg-5 col-md-6 mb-4 mb-lg-0 align-items-center">
                                        <!-- Data -->
                                        <p><strong><%=p.getProductName()%></strong></p>
                                        <p>Brand: <%=p.getProductBrand()%> </p>
                                        <p class="d-flex">
                                            Color: <%=p.getProductColor()%>
                                        <div class="d-flex align-items-center" >

                                            <a href="CartEdit?change=inc&pid=<%=p.getProductId()%>&uid=<%=user.getUserId()%>">
                                                <button type="button" class="btn btn-success btn-sm mb-2 " style="margin-right: 10px" data-mdb-toggle="tooltip"
                                                        title="Increse Quantity">
                                                    <i class="fas fa-plus"></i>
                                                </button>
                                            </a>
                                            <input class="mb-2 " type="text" value=<%=c.getQuantity()%> style="width: 30px; margin-right: 10px" readonly>
                                                   <a href="CartEdit?change=dec&pid=<%=p.getProductId()%>&uid=<%=user.getUserId()%>">
                                                <button type="button" class="btn btn-success btn-sm mb-2 "  style="margin-right: 10px" data-mdb-toggle="tooltip"
                                                        title="Decrese Quantity">
                                                    <i class="fas fa-minus"></i>
                                                </button>
                                            </a>  

                                            <!--       >                                     okokokokokokok-->
                                        </div>
                                        </p>
                                        <a href="CartEdit?change=remove&pid=<%=p.getProductId()%>&uid=<%=user.getUserId()%>">
                                            <button type="button" class="btn btn-primary btn-sm me-1 mb-2" data-mdb-toggle="tooltip"
                                                    title="Remove item">
                                                <i class="fas fa-trash"></i>
                                            </button>
                                        </a>
                                        <a href="CartEdit?change=wishlist&pid=<%=p.getProductId()%>&uid=<%=user.getUserId()%>">
                                            <button type="button" class="btn btn-danger btn-sm mb-2" data-mdb-toggle="tooltip"
                                                    title="Move to the wish list">
                                                <i class="fas fa-heart"></i>
                                            </button>
                                        </a>

                                        <!-- Data -->
                                    </div>

                                    <div class="col-lg-4 col-md-6 mb-4 mb-lg-0">
                                        <!-- Quantity -->

                                        <p class="  text-start text-md-center">
                                            <strong>&#8377 <%=p.getDiscountedPrice()%></strong>
                                        </p>
                                        <p class="my-20"></p>
                                        <p class="my-4"></p>
                                        <p >

                                        </p>



                                    </div>
                                </div>
                                <!-- Single item -->



                                <hr class="my-4" />
                                <% }%>

                            </div>
                        </div>
                        <div class="card mb-4">
                            <div class="card-body">
                                <p><strong>Expected shipping delivery</strong></p>
                                <p class="mb-0"><%=today %> - <%=dildate%></p>
                            </div>
                        </div>
                        <div class="card mb-4">
                            <div class="card-body">
                                <p><strong>We accept</strong></p>
                                <img class="me-2" width="45px"
                                     src="https://mdbcdn.b-cdn.net/wp-content/plugins/woocommerce-gateway-stripe/assets/images/visa.svg"
                                     alt="Visa" />
                                <img class="me-2" width="45px"
                                     src="https://mdbcdn.b-cdn.net/wp-content/plugins/woocommerce-gateway-stripe/assets/images/amex.svg"
                                     alt="American Express" />
                                <img class="me-2" width="45px"
                                     src="https://mdbcdn.b-cdn.net/wp-content/plugins/woocommerce-gateway-stripe/assets/images/mastercard.svg"
                                     alt="Mastercard" />
                                <img class="me-2" width="45px"
                                     src="https://mdbcdn.b-cdn.net/wp-content/plugins/woocommerce/includes/gateways/paypal/assets/images/paypal.webp"
                                     alt="PayPal acceptance mark" />
                            </div>
                        </div>
                    </div>
                    <div class="col-md-4">
                        <div class="card mb-4">
                            <div class="card-header py-3">
                                <h5 class="mb-0">Summary</h5>
                            </div>
                            <div class="card-body">
                                <ul class="list-group list-group-flush">
                                    <li
                                        class="list-group-item d-flex justify-content-between align-items-center border-0 px-0 pb-0">
                                        Products
                                        <span>&#8377 <%=total%></span>
                                    </li>
                                    <li class="list-group-item d-flex justify-content-between align-items-center px-0">
                                        Shipping
                                        <span>&#8377 <%=totalShpping%></span>
                                    </li>

                                    <li
                                        class="list-group-item d-flex justify-content-between align-items-center border-0 px-0 mb-3">
                                        <div>
                                            <strong>Total amount</strong>
                                            <strong>
                                                <p class="mb-0">(including GST)</p>
                                            </strong>
                                        </div>
                                        <span><strong>&#8377 <% Long x = total + totalShpping;%> <%=x%> </strong></span>
                                    </li>
                                </ul>

                                <button type="button" class="btn btn-primary btn-lg btn-block">
                                    Go to checkout
                                </button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>




    </body>
</html>
