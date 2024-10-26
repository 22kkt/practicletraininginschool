<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>注册</title>
<link rel="stylesheet" href="bootstrap-5.3.0-alpha1-dist/css/bootstrap.min.css">
<link rel="stylesheet" href="css/Register.css">
<style>
  body{
	background-image:url("image/login.jpg");
	background-repeat: no-repeat;
    background-size: cover;
    background-attachment: fixed;
  }
</style>
</head>
<body>
  <div class="container">
    <div class="login">
      <div class='hlogin'>
	    <img alt="" src="././iconfront/icon_jkqjaqrih7r/keji-.png">
        <div>
          <div>
            <h3>请确保填写真实信息</h3>
            <button class="warning">我们将保护您的隐私</button>
          </div>
        </div>
      </div>
      <div class="information">
		<form class="row g-3" action="register" method="post">
		  <div class="col-md-6">
			<label for="inputUserName4" class="form-label">真实姓名</label>
			<input type="text" name="name" class="form-control" id="inputUserName4">
		  </div>
		  <div class="col-md-6">
			<label for="inputTel4" class="form-label">电话号码</label>
			<input type="tel" name="tel" class="form-control" id="inputTel4">
		  </div>
		  <div class="col-md-6">
		    <label for="inputEmail4" class="form-label">邮箱</label>
		    <input type="email" name="email" class="form-control" id="inputEmail4">
		  </div>
		  <div class="col-md-6">
		    <label for="inputPassword4" class="form-label">密码</label>
		    <input type="password" name="password" class="form-control" id="inputPassword4">
		  </div>
		  <div class="col-12">
		    <label for="inputIDnumber" class="form-label">身份证号</label>
		    <input type="text" name="idno" class="form-control" id="inputIDnumber" placeholder="本网站要求实名制">
		  </div>
		  <div class="col-12">
		    <label for="inputAddress" class="form-label">地址</label>
		    <input type="text" name="city" class="form-control" id="inputAddress" placeholder="按照省份市(直辖市)填写">
		  </div>
		  <div class="col-12">
		    <div class="form-check">
		      <input class="form-check-input" type="checkbox" id="gridCheck">
		      <label class="form-check-label" for="gridCheck">
		        确认所填信息准确无误
		      </label>
		    </div>
		  </div>
		  <div class="col-12">
		    <button type="submit" class="btn btn-primary">注册</button>
		  </div>
		</form>
	  </div>
    </div>
  </div> 
</body>
</html>