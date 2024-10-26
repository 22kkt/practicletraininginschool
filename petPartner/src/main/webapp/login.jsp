<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录</title>
<link rel="stylesheet" href="bootstrap-5.3.0-alpha1-dist/css/bootstrap.min.css">
<link rel="stylesheet" href="css/login.css">
</head>
<style>
  body{
	background-image:url("image/login.jpg");
	background-repeat: no-repeat;
    background-size: cover;
    background-attachment: fixed;
  }
</style>
<body>
  <div class="login">
	  <div class="container">
	    <div class='hlogin'>
	    <img alt="" src="./iconfront/icon_jkqjaqrih7r/keji-.png">
	    <h3>Sign In</h3>
	    </div>

		<form class="form-horizontal" action="login" method="post">
		  	<div class="form-floating mb-3">
		  		<input type="tel" name="tel" class="form-control" id="floatingInput" placeholder="name">
		  		<label for="floatingInput">帐号</label>
			</div>
			<div class="form-floating">
		  		<input type="password" name="password" class="form-control" id="floatingPassword" placeholder="Password">
		  		<label for="floatingPassword">密码</label>
			</div>
			<div style="display: flex; justify-content: center;">
	            <button class="btn" type="submit">登录</button>
	        </div>
	   </form>      
	        
        <span style="color: #f00;">${info }</span>
		<div class="msg">
		  <small>
		    还没有账户？
            <a href="Register.html" target="_self">点击注册>></a>
          </small>
        </div>
	  </div>
  </div> 
  <script src="bootstrap-5.3.0-alpha1-dist/js/bootstrap.min.js"></script>
</body>
</html>