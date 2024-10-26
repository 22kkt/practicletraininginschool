<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Pet Details</title>
    <link rel="stylesheet" href="./css/petinfo.css">
</head>
<body>
    <div class="pet-card">
        <img src="${petinfo.img}" alt="Pet Image">
        <h2>Fluffy</h2>
        <p><strong>品种:</strong>${petinfo.breed}</p>
        <p><strong>性别:</strong> ${petinfo.sex==1?"雄":"雌" }</p>
        <p><strong>年龄:</strong> ${petinfo.gender}</p>
        <p><strong>健康状况:</strong>${petinfo.status }</p>
        
	    <div class="btn">
	    	<button id="showPopup" onclick="showPopup()"><h3>申请领养</h3></button>
	    </div>
    </div>
    
    
   <div id="overlay">
    <div class="popup">
      <p class="popup_title">请确认个人信息</p>
      <div class="information">
		<form class="row g-3">
		  <div class="col-md-6">
			<label for="inputUserName4" class="form-label"><small>真实姓名</small></label>
			<output class="form-control" id="inputUserName4">${user.getName()}</output>
		  </div>
		  <div class="col-md-6">
			<label for="inputTel4" class="form-label"><small>电话号码</small></label>
			<output class="form-control" id="inputTel4">${user.getTel()}</output>
		  </div>
		</form>
	  </div>
      <div class="popup_btn">
        <div>
	        <button class="cancelBtn" onclick="hidePopup()">取消</button>
	        <button class="confirmBtn" onclick="showconfirm()">提交</button>
		</div>      
      </div>
    </div>
  </div>
    
    
    <div class="confirm" id="confirm">
    	<h3>申请提交成功，我们将在5个工作日与您取得联系，请保持手机通畅</h3>
    	<div>
    	 <a href="adoptcommit?petid=${petinfo.id}&userid=${id}"><button>确定</button></a>
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
	  function showconfirm(){
		  var confirm = document.getElementById("confirm");
		  confirm.style.display = "block";
	  }
  </script>
 
</body>
</html>

