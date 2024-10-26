<%@page import="User.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>预约寄养</title>
	<link rel="stylesheet" href="bootstrap-5.3.0-alpha1-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="css/base.css">
    <link rel="stylesheet" href="css/foster.css">

</head>
<body>
	<nav class="navbar navbar-expand-lg bg-body-tertiary fixed-top">
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
            		<span>管理</span>
            	</a>
            </c:if>
          </li>
        </ul>
      </div>
    </div>
  </nav>
  <div class="warnning">
  		<div class="fosterinfo">
			<span>如需寄养请提前一天提交寄养预约</span>
			<div class="btn" id="showPopup" onclick="showPopup()">
				<button>填写寄养预约</button>
			</div>
		</div>
   </div>
   <div class="container-fluid">
   		<img alt="" src="image/foster.png">
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
  
   <div id="overlay">
    <div class="popup">
      <p class="popup_title">请填入下列信息</p>
      <div class="information">
		<form class="row g-3" action="fostercommit" method="post" target="hiddenFrame">
		  <div class="col-md-6">
			<label for="inputUserName4" class="form-label">真实姓名</label>
			<input type="text" class="form-control" id="inputUserName4" name="inputUserName4">
		  </div>
		  <div class="col-md-6">
			<label for="inputTel4" class="form-label">电话号码</label>
			<input type="tel" class="form-control" id="inputTel4" name="inputTel4">
		  </div>
		  <div class="col-md-6">
		    <label for="inputDate4" class="form-label">寄养时间</label>
		    <input type="date" class="form-control" id="inputDate4" name="inputDate4">
		  </div>
		  <div class="col-md-6">
		    <label for="inputDate" class="form-label">领回时间</label>
		    <input type="date" class="form-control" id="inputDate" name="inputDate">
		  </div>
		  <div class="col-12">
		    <label class="form-label">寄养宠物种类(只支持寄养猫和狗)</label>
		    <select name="inputSpecies">
		      <option disabled selected value="0">请选择</option>
			  <option value="option1">猫</option>
			  <option value="option2">狗(大型犬)</option>
			  <option value="option3">狗(小型犬)</option>
			</select>
		  </div>
		  <div>
		  	<input type="hidden" name="sessionValueField" value="${user.getId()}">
		  </div>
		 <div class="popup_btn">
	          <button class="cancelBtn" onclick="hidePopup()">取消</button>
	         <button class="confirmBtn" onclick="hidePopup_()" type="submit">提交</button>
      	 </div>
		</form>
		 <iframe name="hiddenFrame" style="display:none;"></iframe>
	  </div>
    </div>
  </div>


	<div id="overlay2">
	    <div class="popup2">
	      <p>宠物中心将在一个工作日内与你取得联系请保持手机通畅</p>
	      <button onclick="hidePopup2()">确认</button>
        </div>
	 </div>
  
   <script>
  function showPopup(){
	    var overlay = document.getElementById("overlay");
	    overlay.style.display = "block";
	  }
	  function hidePopup(){
	    var overlay = document.getElementById("overlay");
	    overlay.style.display = "none";
	  }
	  function hidePopup_(){
	    var overlay = document.getElementById("overlay");
	    overlay.style.display = "none";
	    var overplay2=document.getElementById("overlay2");
	    overplay2.style.display = "block";
	  }
	  function hidePopup2(){
	    var overplay2=document.getElementById("overlay2");
	    overplay2.style.display = "none";
	  }

  </script>
</body>
</html>