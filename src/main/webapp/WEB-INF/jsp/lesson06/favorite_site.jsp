<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</head>
<body>
   <div class="container">
      <h1>즐겨 찾기 추가하기</h1>
      <div>
	      <label for="name">제목</label><br> 
	      <input type="text" id="name" class="form-control">
	      <label for="url">주소</label><br> 
	      <input type="text" id="url" class="form-control"><br>
	      <button type="button" id="favoriteBtn" class="btn btn-success form-control">추가</button>
      </div>
      
      <script>
         $(document).ready(function(){
        	 $("#favoriteBtn").on("click", function(e){
        		let name = $("#name").val().trim(); 
        		let url = $("#url").val().trim();
        		
        		if(name == " "){
        			alert("제목 입력");
        			return;
        		}
        		if(url == " "){
        			alert("사이트주소 입력");
        			return;
        		}
        		if(url.startsWith("http") ===  false && url.startWith("https") === false)
        			alert("주소가 틀렸습니다")
        			return;
        			  
        		
        		//서버 전송
        		$.ajax({ 
        			type: "post" //Reauest Method
        			,data: {'name':name, 'url':url}
        		    ,url:"/lesson06/qz01/favorite_site"
        		    ,dataType: 'json' //Response body의 결과값이 json으로
        		    //AJAX 통신 후 response로는 String 또는 JSON이 반드시 리턴되어야 한다
        		    ,success: function(data) {
        		       alert(data.result);
        		       location.href = "/lesson06/qz01/favorite_site"
        		    }
        		    ,error: function(e){
        		    	alert("error": e);
        		    }
        		});
        	 });
        	 
         });
      </script>
   </div>
</body>
</html>