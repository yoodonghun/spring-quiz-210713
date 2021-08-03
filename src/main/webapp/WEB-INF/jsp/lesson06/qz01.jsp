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
<link rel="stylesheet" type="text/css" href="/css/lesson06_style.css">

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

</head>
<body>
   <div id="wrap" class="container">
      <div class="d-flex">
         <div class="leftbox">
            <div class="logo mr-3"></div>
            <div class="mt-3">
               <ul class="nav flex-column ">
                    <li class="nav-item font-weight-bold"><a href="#" class="nav-link text-white">날씨</a></li>
                    <li class="nav-item font-weight-bold"><a href="#" class="nav-link text-white">날씨입력</a></li>
                    <li class="nav-item font-weight-bold"><a href="#" class="nav-link text-white">테마날씨</a></li>
                    <li class="nav-item font-weight-bold"><a href="#" class="nav-link text-white">관측 기후</a></li>
               </ul>
            </div>
         </div>
         <div class="rightbox">
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
                <c:forEach var="history" items="${weatherhistoryList }" >
                  <tr>
                    <td>${history.date }</td>
                    <td>${history.weather }</td>
                    <td>${history.temperatures }</td>
                    <td>${history.precipitation }</td>
                    <td>${history.microDust }</td>
                    <td>${history.windSpeed }</td>
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