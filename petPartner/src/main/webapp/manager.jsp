<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>管理员页面</title>
    <link rel="stylesheet" href="bootstrap-5.3.0-alpha1-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="css/base.css">
    <link rel="stylesheet" href="css/manager1.css">
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
            <a class="nav-link" href="#">
              <span>交流圈</span>
            </a>
          </li>
          <li class="nav-item">
            <img src="./iconfront/icon_jkqjaqrih7r/yonghu.png" alt="">
            	<a class="nav-link" href="managerusercontrol">
            		<span>管理</span>
            	</a>
          </li>
        </ul>
      </div>
    </div>
  </nav>
  
  
  
  <div class="management container">
  	 <div class="func" style="margin-right:5px"><a href="managerusercontrol">用户管理</a></div>
	 <div class="func" style="margin:0px 5px 0px 5px"><a href="managerpetcontrol">宠物管理</a></div>
 	 <div class="func" style="margin:0px 5px 0px 5px"><a href="manageradoptcontrol">领养管理</a></div>
 	 <div class="func" style="margin:0px 0px 0px 5px"><a href="managerfostercontrol">寄养管理</a></div>
 	 <div class="func" style="margin-left:0px 0px 0px 5px"><a href="loginout">退出登录</a></div>
  </div>
  
  
  
  
  <div class="container managerform">
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>姓名</th>
                <th>电话</th>
                <th>邮箱</th>
                <th>身份证号</th>
                <th>城市</th>
                <th>管理信息</th>
                <th>修改</th>
            </tr>
        </thead>
        <c:forEach items="${users}" var="user">
	        <tbody>
	            <tr>
	                <td>${user.id }</td>
	                <td>${user.name }</td>
	                <td>${user.tel }</td>
	                <td>${user.email }</td>
	                <td>${user.idno }</td>
	                <td>${user.city }</td>
	                <td>${user.manager}</td>
	                <td><button onclick="showPopup(${user.id })">修改</button></td>
	            </tr>
	        </tbody>
        </c:forEach>
    </table>
   </div>
   
   
 <div class="changeinfo" id="overlay">
		<form class="row g-3" action="changeuserinfo" method="post" target="hiddenFrame">
		  <div class="col-md-6">
			<label class="form-label">请选择要修改的信息</label>
			<select name="inputSpecies" id="selectBox">
		      <option disabled selected value="0">请选择</option>
			  <option value="tel">电话</option>
			  <option value="email">邮箱</option>
			  <option value="idno">身份证号</option>
			  <option value="city">城市</option>
			  <option value="manager">管理身份</option>
			</select>
		  </div>
		  <div class="col-md-6">
			<label  class="form-label">修改为</label>
			<input id="inputField" name="value">
		  </div>
		  <input type="hidden" id="uid" name="id">
		 <div class="popup_btn">
		         <button class="cancelBtn" onclick="hidePopup()" style="margin-right:10px;">取消</button>
		        <button class="confirmBtn" onclick="hidePopup()" style="margin-left:10px;">提交</button>
		  </div>
		</form>
		<iframe name="hiddenFrame" style="display:none;"></iframe>
		
 </div>
 
  <script>
  function showPopup(id){
	    var overlay = document.getElementById("overlay");
	    var uid = document.getElementById('uid');
	    overlay.style.display = "block";
	    uid.value = id;
	  }
	  function hidePopup(){
	    var overlay = document.getElementById("overlay");
	    overlay.style.display = "none";
	  }
  </script>
 
 
 <script>
    const selectBox = document.getElementById('selectBox');
    const inputField = document.getElementById('inputField');

    selectBox.addEventListener('change', function () {
      const selectedValue = this.value;
      if (selectedValue === 'manager') {
        inputField.type = 'text';
      } else {
        inputField.type = 'String';
      }
    });
  </script>
</body>
</html>