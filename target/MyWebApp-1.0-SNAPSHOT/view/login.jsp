<%-- 
    Document   : login.jsp
    Created on : 17 Apr, 2018, 1:08:27 PM
    Author     : Santosh
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>PANCH_PAKSHI | Login</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
        
        <style>
            * {
                -webkit-box-sizing: border-box;
                -moz-box-sizing: border-box;
                 box-sizing: border-box;
                 outline: none;
              }

            .form-control {
                position: relative;
                font-size: 16px;
                height: auto;
                padding: 10px;
		@include box-sizing(border-box);

		&:focus {
		  z-index: 2;
		}
            }

            body {
                background: url(http://i.imgur.com/GHr12sH.jpg) no-repeat center center fixed;
                -webkit-background-size: cover;
                -moz-background-size: cover;
                -o-background-size: cover;
                background-size: cover;
            }

            .login-form {
                    margin-top: 60px;
            }

            form[role=login] {
                    color: #5d5d5d;
                    background: #f2f2f2;
                    padding: 26px;
                    border-radius: 10px;
                    -moz-border-radius: 10px;
                    -webkit-border-radius: 10px;
            }
            form[role=login] img {
                    display: block;
                    margin: 0 auto;
                    margin-bottom: 35px;
            }
            form[role=login] input,
            form[role=login] button {
                    font-size: 18px;
                    margin: 16px 0;
            }
            form[role=login] > div {
                    text-align: center;
            }
	
            .form-links {
                    text-align: center;
                    margin-top: 1em;
                    margin-bottom: 50px;
            }
            .form-links a {
                    color: #fff;
            }
            
        </style>
		
<!--	<script type="text/javascript" src="./scripts/index.js"></script>-->
	</head>
        <body>
            <div class="container">
            <div class="row" id="pwd-container">
            <div class="col-md-4"></div>
    
            <div class="col-md-4">
                <section class="login-form">
                    <form:form method="post" action="checkLogin" role="login" commandName="user">
                    <img src="http://i.imgur.com/RcmcLv4.png" class="img-responsive" alt="" />
                    <form:input type="text" name="USER_NAME" id="USER_NAME" path="USER_NAME" placeholder="Enter User Name" required="" class="form-control input-lg"/>
                    <form:input type="password" class="form-control input-lg" name="PASSWORD" path="PASSWORD" id="PASSWORD" placeholder="Password" required="" />
                    <form:button type="submit" name="submit" class="btn btn-lg btn-primary btn-block">Sign in</form:button>
                    <div>
                        <a href="#">Create account</a> or <a href="#">reset password</a>
                    </div>
                    <div style="text-align:left; padding: 2px;">
                        <a href="ForgetPassword.jsp">Forget password</a>
                    </div>
                </form:form>
        
                <div class="form-links">
                  <a href="#">Powered By: <em> TheOS Systems Pvt. Ltd</em></a>
                </div>
             </section>  
            </div>
      
      <div class="col-md-4"></div>
      
  </div>
</div>
            
</body>
</html>

