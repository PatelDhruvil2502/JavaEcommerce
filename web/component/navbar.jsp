<%@page import="com.Users"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<nav  class="navbar navbar-expand-lg navbar-dark custom-bg">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">ShopSmart</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-targe aria-contro aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" >
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="/E-Commerce">Home</a>
                </li>

<!--                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                        Categories
                    </a>
                    <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <li><a class="dropdown-item" href="#">Action</a></li>
                        <li><a class="dropdown-item" href="#">Another action</a></li>
                        <li><hr class="dropdown-divider" ></li>
                        <li><a class="dropdown-item" href="#">Something else here</a></li>
                    </ul>
                </li>-->

            </ul>

            <ul class="navbar-nav ml-auto mb-2 mb-lg-0 mr-3">
<!--                <li class="nav-item">
                    <a class="nav-link active" href="WishList.jsp">
                        <span class="icon-text-container">
                            <i class="material-icons">shopping_cart</i>
                            <span class="text">WishList</span>
                        </span>

                    </a>
                </li>-->
                <li class="nav-item">
                    <a class="nav-link active" href="MyCart.jsp">
                        <span class="icon-text-container">
                            <i class="material-icons">shopping_cart</i>
                            <span class="text">My Cart</span>
                        </span>

                    </a>
                </li>

            </ul>

            <% Users user1 = (Users) session.getAttribute("curr-user");
                System.out.println("from navbbar : " + user1);

                if (user1 == null) {
            %>
            <ul class="navbar-nav ml-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link active" href="Login.jsp">Login</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active " href="Register.jsp">Register</a>
                </li>
            </ul>
            <%} else {%>
            <ul class="navbar-nav ml-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link active" href="Login.jsp"><%=user1.getUserName()%></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active " href="LogoutServlet">Logout</a>
                </li>
            </ul>
            <%}%>


            <!--                  <form class="d-flex">
                                <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                                <button class="btn btn-outline-success" type="submit">Search</button>
                              </form>-->
        </div>
    </div>
</nav>
