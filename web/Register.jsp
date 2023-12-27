<%-- 
    Document   : register
    Created on : 17 May, 2023, 12:19:17 PM
    Author     : bhavi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ShopSmart-Register</title>
        <%@include file="component/bootstrap.jsp" %>
    </head>
    <body >

        <%@include file="component/navbar.jsp" %>
        
        
        
        <!--<div class="register-body">-->
            <div class='container p-5'>
                <form class='form-signup' method="post" action="RegisterServlet">
                    <div class="shadow p-3 mb-5 bg-body rounded">
                        <h2 class='text-center'>Sign-Up</h2>
                        <p class='text-center'>Register to ShopSmart</p>

                        
                        <div class='form-group mt-2'>
                            <div class='row'>
                                <label for="uname" >User Name</label>
                            </div>
                        </div>
                        <div class='form-group m-2'>
                            <div class='row'>
                                <input required type="text" id="uname" class='form-control' name="name" placeholder='NAME' />
                            </div>
                        </div>
                        
                        <div class='form-group mt-2'>
                            <div class='row'>
                                <label for="uemail" >User Email</label>
                            </div>
                        </div>
                        <div class='form-group m-2'>
                            <div class='row'>
                                <input required type="email" id="uemail" class='form-control' name="email" placeholder='E-MAIL' re />
                            </div>
                        </div>
                        
                        
                        <div class='form-group mt-2'>
                            <div class='row'>
                                <label for="upassword" >User Password</label>
                            </div>
                        </div>
                        <div class='form-group m-2'>
                            <div class='row'>
                                <input required type="password" id="upassword" class='form-control' name="password" placeholder='PASSWORD' />
                            </div>
                        </div>
                        
                        
                        <div class='form-group mt-2'>
                            <div class='row'>
                                <label for="ucontactno" >User Contact No</label>
                            </div>
                        </div>
                        <div class='form-group m-2'>
                            <div class='row'>
                                <input required type="number" id="ucontactno" class='form-control' name="phone" placeholder='CONTACT NO' />
                            </div>
                        </div>
                        
                        
                        <div class='form-group mt-2'>
                            <div class='row'>
                                <label for="uaddress" >User Address</label>
                            </div>
                        </div>
                        <div class='form-group m-2'>
                            <div class='row'>
                                <input required type="text"  id="uaddress" class='form-control' name="address" placeholder='ADDRESS' />
                            </div>
                        </div>


                        <div class="form-group m-2">

                            <div class='row'>
                                <input required  style="background-color: #fc8019;"class="btn btn-success btn-block" type="submit" value="Register" />
                            </div>

                        </div>
                    </div>
                </form>


            </div>
        <!--</div>-->
    </body>
</html>
