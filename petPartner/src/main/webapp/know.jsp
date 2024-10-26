<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
    
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="./bootstrap-5.3.0-alpha1-dist/css/bootstrap.min.css">
  <link rel="stylesheet" href="./css/know.css">
  <link rel="stylesheet" href="./css/base.css">
  <title>养宠技巧</title>
</head>
<body>
  <nav class="navbar navbar-expand-lg bg-body-tertiary fixed-top">
    <div class="container">
      <a class="navbar-brand" href="./index.html">
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
  
  <div class="container">
    <div class="video">
      <h3 style="color: aqua;">| 养宠技巧</h3>
      <div>
        <video src="./video/养宠物的10个小技巧.mp4" controls loop muted></video>
      </div>
      <h3 style="color: deeppink;">| 新手养鸟入门知识</h3>
      <div>
        <video src="./video/新手养鸟入门知识视频.mp4" controls loop muted></video>
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