<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>领养</title>
  <link rel="stylesheet" href="./bootstrap-5.3.0-alpha1-dist/css/bootstrap.min.css">
  <link rel="stylesheet" href="./css/adopt.css">
  <link rel="stylesheet" href="./css/base.css">
  <script src="https://code.jquery.com/jquery-3.0.0.min.js"></script>
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
            	<a class="nav-link" href="User.jsp">
            		<span>用户</span>
            	</a>
            </c:if>
            <c:if test="${1 == usermanager}">
            	<a class="nav-link" href="managerusercontrol">
            		<span>管理</span>
            	</a>
            </c:if>
          </li>
        </ul>
      </div>
    </div>
  </nav>
  
  
  <div id='dataDisplay'></div>
  <div class="dog container pet"   style="height:800px;">
    <h3 id="dog">狗</h3>
    <div class="content">
      <ul> 
        <c:forEach items="${petlist}" var="pet">
        	<c:if test="${pet.species=='狗'}">
		        <li>
		          <a href="#">
		            <div class="pic"><img src="${pet.img}" alt=""></div>
		            <div class="info">
		              <h4>品种：${pet.breed}</h4>
		              <c:if test="${pet.sex==1}">
			              <p>性别：雄</p>
		              </c:if>
		              <c:if test="${pet.sex==2}">
			              <p>性别：雌</p>
		              </c:if>
		              <p>年龄：${pet.gender}</p>
		            </div>
		          </a>
		          <div>
		         	 <a class="cover" href="petinfo?pet=${pet.id}"  >
			            <p>选择领养</p>
			            <p></p>
		            </a>
		          </div>
		        </li>
        	</c:if>
        </c:forEach>
      </ul>
  </div>
  </div>

  <div class="cat container pet" style="height:800px;">
    <h3 id="cat">猫</h3>
    <div class="content">
      <ul>
        <c:forEach items="${petlist}" var="pet">
        <c:if test="${pet.species=='猫'}">
		        <li>
		          <a href="#">
		            <div class="pic"><img src="${pet.img }" alt=""></div>
		            <div class="info">
		              <h4>品种：${pet.breed}</h4>
		              <c:if test="${pet.sex==1}">
			              <p>性别：雄</p>
		              </c:if>
		              <c:if test="${pet.sex==2}">
			              <p>性别：雌</p>
		              </c:if>
		              <p>年龄：${pet.gender}</p>
		            </div>
		          </a>
		          <div>
		         	 <a class="cover" href="petinfo?pet=${pet.id}" >
			            <p>选择领养</p>
			            <p></p>
		            </a>
		          </div>
		        </li>
        	</c:if>
        </c:forEach>
      </ul>
  </div>
  </div>

  <div class="bird container pet" style="height:800px;">
    <h3 id="bird">鸟</h3>
    <div class="content">
      <ul>
      <c:forEach items="${petlist}" var="pet">
        <c:if test="${pet.species=='鸟'}">
		        <li>
		          <a href="#">
		            <div class="pic"><img src="${pet.img }" alt=""></div>
		            <div class="info">
		              <h4>品种：${pet.breed}</h4>
		              <c:if test="${pet.sex==1}">
			              <p>性别：雄</p>
		              </c:if>
		              <c:if test="${pet.sex==2}">
			              <p>性别：雌</p>
		              </c:if>
		              <p>年龄：${pet.gender}</p>
		            </div>
		          </a>
		          <div>
		         	 <a class="cover" href="petinfo?pet=${pet.id}"  >
			            <p>选择领养</p>
			            <p></p>
		            </a>
		          </div>
		        </li>
        	</c:if>
        </c:forEach>
      </ul>
  </div>
  </div>

  <div class="rabbit container pet" style="height:800px;">
    <h3 id="rabbit">兔</h3>
    <div class="content">
      <ul>
        <c:forEach items="${petlist}" var="pet">
        	<c:if test="${pet.species=='兔'}">
		        <li>
		          <a href="#">
		            <div class="pic"><img src="${pet.img }"></div>
		            <div class="info">
		              <h4>品种：${pet.breed}</h4>
		              <c:if test="${pet.sex==1}">
			              <p>性别：雄</p>
		              </c:if>
		              <c:if test="${pet.sex==2}">
			              <p>性别：雌</p>
		              </c:if>
		              <p>年龄：${pet.gender}</p>
		            </div>
		          </a>
		          <div>
		         	 <a class="cover" href="petinfo?pet=${pet.id}">
			            <p>选择领养</p>
			            <p></p>
		            </a>
		          </div>
		        </li>
        	</c:if>
      </c:forEach> 
      </ul>
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