<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="bootstrap-5.3.0-alpha1-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="css/User3.css">
    <link rel="stylesheet" href="css/base.css">

    <title>个人中心</title>
  </head>
  <body>
	  <nav class="navbar navbar-expand-lg bg-body-tertiary fixed-top" style="margin-top:30px">
	    <div class="container">
	      <a class="navbar-brand" href="index.jsp">
	        <img src="iconfront/icon_jkqjaqrih7r/keji-.png" alt="">
	        <h3>宠物伴侣</h3>
	      </a>
	      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
	        <span class="navbar-toggler-icon"></span>
	      </button>
	      <div class="collapse navbar-collapse" id="navbarNav">
	        <ul class="navbar-nav">
	          <li class="nav-item">
	            <img src="iconfront/icon_jkqjaqrih7r/aixinlingyanghover.png" alt="">
	            <a class="nav-link active" aria-current="page" href="adopt">
	              <span>领养</span>
	            </a>
	          </li>
	          <li class="nav-item">
	            <img src="iconfront/icon_jkqjaqrih7r/chongwujiyang1.png" alt="">
	            <a class="nav-link" href="foster.jsp">
	              <span>寄养</span>
	            </a>
	          </li>
	          <li class="nav-item">
	            <img src="iconfront/icon_jkqjaqrih7r/mianshizhong-.png" alt="">
	           <a class="nav-link" href="know.jsp">
              <span>技巧</span>
            </a>
	          </li>
	          <li class="nav-item">
	            <img src="iconfront/icon_jkqjaqrih7r/yonghu.png" alt="">
	            <a class="nav-link" href="myadopt?uid=${user.getId()}">
	              <span>用户</span>
	            </a>
	          </li>
	        </ul>
	      </div>
	    </div>
	  </nav>
    <div class="container-fluid">
      <div class="bgimage" style="background-image:url(image/user1.jpg)">
        <div class="avatar">
          <img alt=""  src="image/user2.png" class=avatar>
        </div>
        <div class="nickname">
          <span>${user.getName() }</span>
        </div>
      </div>
      <nav >
        <ul>
         <li>
           <a href="myadopt?uid=${id}" >我的领养</a>
         </li>
         <li>
           <a href="myfoster?uid=${id}" >我的寄养</a>
         </li>
         <li>
           <a href="myinfo?uid=${id}" >个人资料</a>
         </li>
        </ul>
      </nav>
      
      
      
      <div class="frame">
        <form class="row g-3">
          <div class="col-md-6">
            <label class="form-label">真实姓名</label>
            <output>${user.getName() }</output>
          </div>
          <div class="col-md-6">
			<label for="inputTel4" class="form-label">电话号码</label>
			<output>${user.getTel()}</output>
          </div>
          <div class="col-md-6">
		    <label for="inputEmail4" class="form-label">邮箱</label>
		    <output>${user.getEmail()}</output>
          </div>
          <div class="col-md-6">
		    <label for="inputIDnumber" class="form-label">身份证号</label>
		    <output>${user.getIdno() }</output>
          </div>
          <div class="col-md-12">
		    <label for="inputAddress" class="form-label">地址</label>
		    <output>${user.getCity()}</output>
          </div>
        </form>
      </div>
      
      
       <div class="btn">
         <form method="post" action="loginout">
         	<button type="submit">退出登录</button>
      	</form>
      </div>



	  <div class="footer">
	    <ul class="container">
	      <li><a href="helper.html">关于我们</a></li>
	      <li><a href="helper.html#a">版权隐私</a></li>
	      <li><a href="helper.html#b">免责声明</a></li>
	      <li><a href="helper.html#c">联系我们</a></li>
	    </ul>
	    <div class="container">
	      <h4>© 2024 Designed By www.CWBL.com.</h4>
	    </div>
	  </div>

    </div>
  </body>
</html>