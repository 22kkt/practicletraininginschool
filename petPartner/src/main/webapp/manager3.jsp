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
                <th>领养ID</th>
                <th>用户ID</th>
                <th>宠物ID</th>
                <th>预留电话</th>
                <th>宠物品种</th>
                <th>申请状态</th>
                <th>修改</th>
            </tr>
        </thead>
        <c:forEach items="${adoptinfolist}" var="adoptinfo">
	        <tbody>
	            <tr>
	                <td>${adoptinfo.id }</td>
	                <td>${adoptinfo.uid }</td>
	                <td>${adoptinfo.pid }</td>
	                <td>${adoptinfo.tel }</td>
	                <td>${adoptinfo.breed}</td>
	                <td>${adoptinfo.status}</td>
	                <td><button onclick="showPopup(${adoptinfo.id})">修改</button></td>
	            </tr>
	        </tbody>
        </c:forEach>
    </table>
   </div>
   
   
 <div class="changeinfo" id="overlay">
		<form class="row g-3" action="changeadoptinfo" method="post" target="hiddenFrame">
		  <div class="col-md-6">
			<label class="form-label">请选择要修改的信息</label>
			<select name="inputSpecies" id="selectBox">
		      <option disabled selected value="0">请选择</option>
			  <option value="status">领养状态</option>
			</select>
		  </div>
		  <div class="col-md-6">
			<label  class="form-label">修改为</label>
			<input id="inputField" name="value">
		  </div>
		  <input type="hidden" id="aid" name="id">
		 <div class="popup_btn">
		        <button class="cancelBtn" onclick="hidePopup()" style="margin-right:10px;">取消</button>
		        <button class="confirmBtn" type="submit" onclick="hidePopup()" style="margin-left:10px;">提交</button>
		  </div>
		</form>
		<iframe name="hiddenFrame" style="display:none;"></iframe>
		
 </div>
 
  <script>
  function showPopup(id){
	    var overlay = document.getElementById("overlay");
	    var aid = document.getElementById('aid');
	    overlay.style.display = "block";
	    aid.value = id;
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
      if (selectedValue === 'status') {
        inputField.type = 'text';
      } else {
        inputField.type = 'String';
      }
    });
  </script>
</body>
</html>