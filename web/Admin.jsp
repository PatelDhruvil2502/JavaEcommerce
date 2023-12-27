<%@page import="com.ProductDAO"%>
<%@page import="com.Product"%>
<%@page import="com.UserDAO"%>
<%@page import="java.util.List"%>
<%@page import="com.Category"%>
<%@page import="com.helper.FactoryProvider"%>
<%@page import="com.CategoryDAO"%>
<%@page import="com.Users" %>
<%
    Users user = (Users) session.getAttribute("curr-user");
    if (user == null) {
        session.setAttribute("formerroemessege", "Please Login To Access Admin Panel Page");
        response.sendRedirect("Login.jsp");
        return;
    } else if (user.getUserType().equals("user")) {
        session.setAttribute("formerroemessege", "You are not Admin Please Login As Admin To Access This Page");
        response.sendRedirect("Login.jsp");
        return;
    }
    
    List<Users> UserList = new UserDAO(FactoryProvider.getFactory()).getAllUsers();
    List<Product> productList = new ProductDAO(FactoryProvider.getFactory()).getAllProducts();
    List<Category> categoryList = new CategoryDAO(FactoryProvider.getFactory()).getAllCategory();
    
    
    

%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ShopSmart-Admin Panel</title>
        <%@include file="component/bootstrap.jsp" %>
    </head>
    <body>
        <!--<h1>This is Admin page</h1>-->
        <%@include file="component/navbar.jsp" %>
        <%@include file="component/messege.jsp" %>
        <div class="container mt-5 admin">
            <div class="row">

                <div class="col-md-4">
                    <div class="card">
                        <div class="card-body text-center">
                            <div class="container">
                                <img style="max-height: 150px;min-width: 250px" class="img-fluid border-2" alt="" src="images/user_pic.jpg">
                            </div>
                            <h3 class="mt-2"><%=UserList.size()%></h3>
                            <h3 class="text-uppercase">Users</h3>
                        </div>
                    </div>

                </div>
                <div class="col-md-4">
                    <div class="card">
                        <div class="card-body text-center">
                            <div class="container">
                                <img style="max-height: 150px;max-width: 150px" class="img-fluid border-2" alt="" src="images/checklist.png">
                            </div>
                            <h3 class="mt-2"><%=categoryList.size()%></h3>
                            <h3 class="text-uppercase">Categories</h3>
                        </div>
                    </div>

                </div>
                <div class="col-md-4">
                    <div class="card">
                        <div class="card-body text-center">
                            <div class="container">
                                <img style="max-height: 150px;max-width: 150px" class="img-fluid border-2" alt="" src="images/products.png">
                            </div>
                            <h3 class="mt-2"><%=productList.size()%></h3>
                            <h3 class="text-uppercase">Products</h3>
                        </div>
                    </div>

                </div>
            </div>

            <div class="container mt-5 mb-5">
                <div class="row">

                    <div class="col-md-6">
                        <div class="card" data-bs-toggle="modal" data-bs-target="#add-category-modal">
                            <div class="card-body ">


                                <h3 class="mt-2 text-center align-items-center justify-content-center text-uppercase">
                                    <img style="max-height: 25px;min-width: 25px" class="img-fluid border-2 text-center" alt="" src="images/add.png"> 
                                    Add Categories
                                </h3>

                            </div>
                        </div>


                    </div>
                    <div class="col-md-6">
                        <div class="card"  data-bs-toggle="modal" data-bs-target="#add-product-modal">
                            <div class="card-body ">


                                <h3 class="mt-2 text-center align-items-center justify-content-center text-uppercase">
                                    <img style="max-height: 25px;min-width: 25px" class="img-fluid border-2 text-center" alt="" src="images/add.png"> 
                                    Add Products
                                </h3>

                            </div>
                        </div>


                    </div>
                </div>


            </div>

            <!--add category model-->

            <!-- Modal -->
            <div class="modal fade" id="add-category-modal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                <div class="modal-dialog ">
                    <div class="modal-content">
                        <div class="modal-header custom-bg text-white">
                            <h5 class="modal-title " id="exampleModalLabel">ADD CATEGORY</h5>
                            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                        </div>
                        <div class="modal-body">
                            <div class='container p-5'>
                                <form class='form-signup' method="post" action="ProductOperationServlet">
                                    <div class="shadow p-3 mb-5 bg-body rounded">

                                        <p class='text-center'>Add New Category To ShopSmart</p>
                                        <input type="hidden" name="productoperationtype" value="addcategory"/>
                                        <div class='form-group mt-2'>
                                            <div class='row'>
                                                <label for="uemail" >Category Name</label>
                                            </div>
                                        </div>
                                        <div class='form-group m-2'>
                                            <div class='row'>
                                                <input type="text" id="categorydesc" class='form-control' name="categoryname" placeholder='CATEGORY NAME' required />
                                            </div>
                                        </div>


                                        <div class='form-group mt-2'>
                                            <div class='row'>
                                                <label for="upassword" >Category Description</label>
                                            </div>
                                        </div>
                                        <div class='form-group m-2'>
                                            <div class='row'>
                                                <textarea style="height: 200px"  id="categorydesc" class='form-control' name="categorydesc" placeholder='CATEGORY DESCRIPTION' required ></textarea>
                                            </div>
                                        </div>


                                        <div class="form-group m-2">

                                            <div class='row'>
                                                <input  style="background-color: #fc8019;"class="btn btn-success btn-block"type="submit" value="Add Category" />
                                            </div>

                                        </div>

                                    </div>
                                </form>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>

                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <!--END add category model-->

            <!-- add Product model-->

            <!-- Button trigger modal -->
            <div class="modal fade" id="add-product-modal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                <div class="modal-dialog ">
                    <div class="modal-content">
                        <div class="modal-header custom-bg text-white">
                            <h5 class="modal-title " id="exampleModalLabel">ADD PRODUCT</h5>
                            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                        </div>
                        <div class="modal-body">
                            <div class='container p-5'>
                                <form class='form-signup' method="post" action="ProductOperationServlet" enctype="multipart/form-data">
                                    <div class="shadow p-3 mb-5 bg-body rounded">

                                        <p class='text-center'>Add New Product To ShopSmart</p>
                                        <input type="hidden" name="productoperationtype" value="addproduct"/>

                                        <div class='form-group mt-2'>
                                            <div class='row'>
                                                <label for="productname" >Product Name</label>
                                            </div>
                                        </div>
                                        <div class='form-group m-2'>
                                            <div class='row'>
                                                <input type="text" id="productname" class='form-control' name="productname" placeholder='PRODUCT NAME' required />
                                            </div>
                                        </div>
                                        <div class='form-group mt-2'>
                                            <div class='row'>
                                                <label for="productdesc" >Product Description</label>
                                            </div>
                                        </div>
                                        <div class='form-group m-2'>
                                            <div class='row'>
                                                <textarea style="height: 200px"  id="productdesc" class='form-control' name="productdesc" placeholder='PRODUCT DESCRIPTION' required ></textarea>
                                            </div>
                                        </div>

                                        <div class='form-group mt-2'>
                                            <div class='row'>
                                                <label for="productprice" >Product Price</label>
                                            </div>
                                        </div>
                                        <div class='form-group m-2'>
                                            <div class='row'>
                                                <input type="number" id="productprice" class='form-control' name="productprice" placeholder='PRODUCT PRICE' required />
                                            </div>
                                        </div>

                                        <div class='form-group mt-2'>
                                            <div class='row'>
                                                <label for="productdiscount" >Product Discount</label>
                                            </div>
                                        </div>
                                        <div class='form-group m-2'>
                                            <div class='row'>
                                                <input type="number" id="productdiscount" class='form-control' name="productdiscount" placeholder='PRODUCT DISCOUNT' required />
                                            </div>
                                        </div>


                                        <div class='form-group mt-2'>
                                            <div class='row'>
                                                <label for="productqty" >Product Quantity</label>
                                            </div>
                                        </div>
                                        <div class='form-group m-2'>
                                            <div class='row'>
                                                <input type="number" id="productqty" class='form-control' name="productqty" placeholder='PRODUCT QUANTITY' required />
                                            </div>
                                        </div>
                                        
                                        <div class='form-group mt-2'>
                                            <div class='row'>
                                                <label for="productqty" >Product Sold Count</label>
                                            </div>
                                        </div>
                                        <div class='form-group m-2'>
                                            <div class='row'>
                                                <input type="number" id="productsoldcount" class='form-control' name="productsoldcount" placeholder='PRODUCT SOLD COUNT' required />
                                            </div>
                                        </div>
                                        
                                        
                                        <div class='form-group mt-2'>
                                            <div class='row'>
                                                <label for="productqty" >Product Rating</label>
                                            </div>
                                        </div>
                                        <div class='form-group m-2'>
                                            <div class='row'>
                                                <input type="number" id="productrating" class='form-control' name="productrating" placeholder='PRODUCT RATING' required />
                                            </div>
                                        </div>
                                        
                                        
                                        <% 
                                            CategoryDAO categoryDAO = new CategoryDAO(FactoryProvider.getFactory());
                                            List<Category> categories = categoryDAO.getAllCategory();
                                            
                                        %>

                                        <div class='form-group mt-2'>
                                            <div class='row'>
                                                <label for="productcategory" >Product Category</label>
                                            </div>
                                        </div>
                                        <div class='form-group m-2'>
                                            <div class='row'>
                                                <select class="form-select" aria-label="Default select example" name='productcategory'>
                                                <% for(Category c : categories){ %>
                                                    <option  value=<%=c.getCategoryId()%> ><%=c.getCategoryTitle()%></option>
                                                <% } %>
                                                </select>
                                            </div>
                                        </div>


                                        <div class='form-group mt-2'>
                                            <div class='row'>
                                                <label for="productpic" >Product Picture</label>
                                            </div>
                                        </div>
                                        <div class='form-group m-2'>
                                            <div class='row'>
                                                <input type="file" id="productpic" class='form-control' name="productpic"  required />
                                            </div>
                                        </div>
                                                
                                        <div class='form-group mt-2'>
                                            <div class='row'>
                                                <label for="productbrand" >Product Brand</label>
                                            </div>
                                        </div>
                                        <div class='form-group m-2'>
                                            <div class='row'>
                                                <input type="text" id="productbrand" class='form-control' name="productbrand"  required />
                                            </div>
                                        </div>
                                        
                                        <div class='form-group mt-2'>
                                            <div class='row'>
                                                <label for="productcolor" >Product Color</label>
                                            </div>
                                        </div>
                                        <div class='form-group m-2'>
                                            <div class='row'>
                                                <input type="text" id="productcolor" class='form-control' name="productcolor"  required />
                                            </div>
                                        </div>
                                        
                                        <div class='form-group mt-2'>
                                            <div class='row'>
                                                <label for="productshippingcost" >Product Shipping Cost</label>
                                            </div>
                                        </div>
                                        <div class='form-group m-2'>
                                            <div class='row'>
                                                <input type="number" id="productshippingcost" class='form-control' name="productshippingcost"  required />
                                            </div>
                                        </div>
                                                
                                        




                                        <div class="form-group m-2">
                                            <div class='row'>
                                                <input  style="background-color: #fc8019;"class="btn btn-success btn-block"type="submit" value="Add Product" />
                                            </div>
                                        </div>
                                    </div>
                                </form>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>

                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <!--End add product modal-->



    </body>
</html>
