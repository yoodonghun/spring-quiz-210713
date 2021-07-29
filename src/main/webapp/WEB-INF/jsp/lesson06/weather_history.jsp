<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/css/weather_style.css">

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

</head>
<body>
   <div id="wrap" >
      <div class="d-flex">
         <div class="leftbox">
            <div class="logo mr-3">
               <div class="logo d-flex justify-content-center mt-3 mr-2">
					<img
						src="https://upload.wikimedia.org/wikipedia/commons/thumb/3/3f/Emblem_of_the_Government_of_the_Republic_of_Korea.svg/800px-Emblem_of_the_Government_of_the_Republic_of_Korea.svg.png"
						width="25" height="25">
						 <span class="text-white font-weight-bold ml-2">기상청</span>
				</div>
            </div>
            <div>
               <ul class="nav flex-column mt-4">
					<li class="nav-item"><a href="/lesson05/weather_history"
						class="nav-link menu-font">날씨</a></li>
					<li class="nav-item"><a href="/lesson05/add_weather_view"
						class="nav-link menu-font">날씨입력</a></li>
					<li class="nav-item"><a href="#" class="nav-link menu-font">테마날씨</a></li>
					<li class="nav-item"><a href="#" class="nav-link menu-font">관측
							기후</a></li>
				</ul>
            </div>
         </div>
         <div class="rightbox ml-5 mt-2">
            <div class="pastWeather">과거 날씨</div>
            <div>
              <table class="table text-center">
                <thead>
                  <tr>
                    <th>날짜</th>
                    <th>날씨</th>
                    <th>기온</th>
                    <th>강수량</th>
                    <th>미세먼지</th>
                    <th>풍속</th>
                  </tr>
                </thead>
                <tbody>
                <c:forEach var="history" items="${weatherHistoryList }" >
                  <tr>
                    <td>
                        
                        <fmt:formatDate value="${history.date }" pattern="yyyy년 M월 d일" />
                    </td>
                    <td>
	                    <c:choose>
		                    <c:when test="${history.weather eq '맑음'}">
		                       <img src="/image/sunny.jpg" alt="맑음">
		                    </c:when>
		                    <c:when test="${history.weather eq '구름조금'}">
		                       <img src="/image/partlyCloudy.jpg" alt="구름조금">
		                    </c:when>
		                    <c:when test="${history.weather eq '비'}">
		                       <img src="/image/rainy.jpg" alt="비">
		                    </c:when>
		                    <c:when test="${history.weather eq '흐림'}">
		                       <img src="/image/cloudy.jpg" alt="흐림">
		                    </c:when>
		                    <c:otherwise>
		                         ${history.weather}
		                    </c:otherwise>
	                    </c:choose>
                    </td>
                    <td>${history.temperatures }°C</td>
                    <td>${history.precipitation }mm</td>
                    <td>${history.microDust }</td>
                    <td>${history.windSpeed }km/h</td>
                  </tr>
                 </c:forEach> 
                </tbody>
              </table>
            </div>
         </div>
      </div>
   </div>
</body>
</html>