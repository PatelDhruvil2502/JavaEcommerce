

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ShopSmart-Login</title>
        <%@include file="component/bootstrap.jsp" %>
        
    </head>
    <body>
         <%@include file="component/navbar.jsp" %>
         
         <% System.out.println("hello from login page"); %>
         
        <div class='container p-5'>
                <form class='form-signup' method="post" action="LoginServlet">
                    <div class="shadow p-3 mb-5 bg-body rounded">
                        <h2 class='text-center'>Login</h2>
                        <p class='text-center'>Login to ShopSmart</p>

                        
                        
                        <%@include file="component/formerrormessege.jsp" %>
                        <div class='form-group mt-2'>
                            <div class='row'>
                                <label for="uemail" >User Email</label>
                            </div>
                        </div>
                        <div class='form-group m-2'>
                            <div class='row'>
                                <input type="email" id="uemail" class='form-control' name="email" placeholder='E-MAIL' />
                            </div>
                        </div>
                        
                        
                        <div class='form-group mt-2'>
                            <div class='row'>
                                <label for="upassword" >User Password</label>
                            </div>
                        </div>
                        <div class='form-group m-2'>
                            <div class='row'>
                                <input type="password" id="upassword" class='form-control' name="password" placeholder='PASSWORD' required/>
                            </div>
                        </div>
                        
                        
                       
                        
                        

                        <div class="form-group m-2">

                            <div class='row'>
                                <input  style="background-color: #fc8019;"class="btn btn-success btn-block"type="submit" value="Login" />
                            </div>

                        </div>
                        
                    </div>
                </form>
                <div class='text-center'>

                    Don't Have Account? <a href="Register.jsp"> Create Account</a>

                 </div>


            </div>
            <script src="CartFunction.js" ></script>
    </body>
</html>
