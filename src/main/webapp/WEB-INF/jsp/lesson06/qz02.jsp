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
	      제목<br> 
	      <input type="text" id="title" class="form-control">
	      
	      
	      주소<br>
	      <div class="d-flex">
		      <input type="text" id="url" class="form-control ">
		      <button type="button" class="btn btn-info col-1 ml-3">중복확인</button>
	      </div><br>
	      <button type="button" id="addFavoriteBtn" class="btn btn-success form-control">추가</button>
      </div>
      
      <script>
      $(document).ready(function() {
			$('#addFavoriteBtn').on('click', function(e) {
				var title = $('#title').val().trim();
				var url = $('#url').val().trim();
				
				if (title == '') {
					alert("제목을 입력하세요.");
					return;
				}
				
				if (url == '') {
					alert("주소를 입력하세요.");
					return;
				}
				
				if (url.startsWith("http://") == false && url.startsWith("https") == false) {
					alert("주소 형식이 잘못되었습니다.");
					return;
				}
				
				$.ajax({
					type:'post'
					, url: '/lesson06/qz02/add_favorite'
					, data: {'title':title, 'url':url}
				    , dataType : 'json'
					, success: function(data) {
						//alert(data.result);
						if (data.result == 'success') {
							location.href = "/lesson06/qz02/favorite_list";
						}
					}, error:function(e) {
						alert("error:" + e);
					} 
				});
			});
		});
      </script>
   </div>
</body>
</html>