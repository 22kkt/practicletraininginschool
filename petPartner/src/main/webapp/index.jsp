<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>首页</title>
  <link rel="stylesheet" href="./bootstrap-5.3.0-alpha1-dist/css/bootstrap.min.css">
  <link rel="stylesheet" href="./css/index.css">
  <link rel="stylesheet" href="./css/base.css">
</head>
<body>
  <nav class="navbar navbar-expand-lg bg-body-tertiary fixed-top">
    <div class="container">
      <a class="navbar-brand" href="./index.jsp">
        <img src="./iconfront/icon_jkqjaqrih7r/keji-.png" alt="">
        <h3>宠物伴侣</h3>
      </a>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav">
          <li class="nav-item">
            <img src="./iconfront/icon_jkqjaqrih7r/aixinlingyanghover.png" alt="">
            <a class="nav-link active" aria-current="page" href="adopt">
              <span>领养</span>
            </a>
          </li>
          <li class="nav-item">
            <img src="./iconfront/icon_jkqjaqrih7r/chongwujiyang1.png" alt="">
            <a class="nav-link" href="foster.jsp">
              <span>寄养</span>
            </a>
          </li>
          <li class="nav-item">
            <img src="./iconfront/icon_jkqjaqrih7r/mianshizhong-.png" alt="">
            <a class="nav-link" href="know.jsp">
              <span>技巧</span>
            </a>
          </li>
          <li class="nav-item">
            <img src="./iconfront/icon_jkqjaqrih7r/yonghu.png" alt="">
            <c:if test="${null == tel}">
            	<a class="nav-link" href="login.jsp">
            		<span>用户</span>
            	</a>
            </c:if>
            <c:if test="${null != tel and 0==usermanager}">
            	<a class="nav-link" href="myadopt?uid=${id}">
            		<span>用户</span>
            	</a>
            </c:if>
            <c:if test="${1 == usermanager}">
            	<a class="nav-link" href="managerusercontrol">
            		<span>用户</span>
            	</a>
            </c:if>
          </li>
        </ul>
      </div>
    </div>
  </nav>

  <div id="carouselExampleIndicators" class="carousel slide">
    <div class="carousel-indicators">
      <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
      <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1" aria-label="Slide 2"></button>
      <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2" aria-label="Slide 3"></button>
      <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="3" aria-label="Slide 4"></button>
    </div>
    <div class="carousel-inner">
      <div class="carousel-item active">
        
      </div>
      <div class="carousel-item">
        
      </div>
      <div class="carousel-item">
        
      </div>
      <div class="carousel-item">
        
      </div>
    </div>
    <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
      <span class="carousel-control-prev-icon" aria-hidden="true"></span>
      <span class="visually-hidden">Previous</span>
    </button>
    <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
      <span class="carousel-control-next-icon" aria-hidden="true"></span>
      <span class="visually-hidden">Next</span>
    </button>
  </div>
  
  <div class="project container">
    <div class="title">
      <h2>宠物种类</h2>
      <p>活泼可爱的萌宠，萌化你的心</p>
    </div>
    <div class="content">
      <div class="row">
        <div class="col-lg-3 col-md-6"><a href="./adopt#dog">
          <img src="./image/dog.jpg" alt="">
          <h3>狗</h3>
        </a></div>
        <div class="col-lg-3 col-md-6"><a href="./adopt#cat">
          <img src="./image/cat.jpg" alt="">
          <h3>猫</h3>
        </a></div>
        <div class="col-lg-3 col-md-6"><a href="./adopt#bird">
          <img src="./image/bird.jpg" alt="">
          <h3>鸟</h3>
        </a></div>
        <div class="col-lg-3 col-md-6"><a href="./adopt#rabbit">
          <img src="./image/rabbit.jpg" alt="">
          <h3>兔</h3>
        </a></div>
      </div>
    </div>
  </div>

  <div class="footer">
    <ul class="container">
      <li><a href="./helper.html">关于我们</a></li>
      <li><a href="./helper.html#a">版权隐私</a></li>
      <li><a href="./helper.html#b">免责声明</a></li>
      <li><a href="./helper.html#c">联系我们</a></li>
    </ul>
    <div class="container">
      <h4>© 2024 Designed By www.CWBL.com.</h4>
    </div>
  </div>
  <script src="./bootstrap-5.3.0-alpha1-dist/js/bootstrap.min.js"></script>
  
</body>
</html>