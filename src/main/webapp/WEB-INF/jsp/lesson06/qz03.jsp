<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css"
	href="/css/lesson06/booking_style.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>


</head>
<body>
    <div class="container text-center">
       <h1>통나무 팬션</h1>
       <nav class="bg-warning">
         <ul class="nav nav-fill">
           <li class="nav-item"><a href="#" class="nav-link text-dark">팬션소개</a></li>
           <li class="nav-item"><a href="#" class="nav-link text-dark">객실보기</a></li>
           <li class="nav-item"><a href="#" class="nav-link text-dark">예약하기</a></li>
           <li class="nav-item"><a href="#" class="nav-link text-dark">예약목록</a></li>
         </ul>
       </nav>
       
       <h3>예약 목록 보기</h3>
       <table class="table">
          <thead>
            <tr>
               <th>이름</th>
               <th>예약날짜</th>
               <th>숙박일수</th>
               <th>숙박인원</th>
               <th>전화번호</th>
               <th>예약상태</th>
            </tr>
          </thead>
          <tbody>
             <c:forEach var="booking" items="${bookingList }">
                <tr>
                   <td>${booking.name}</td>
                   <td>
                      
                      <fmt:formatDate value="${booking.day}" pattern="yyyy년 M월 d일" />
                   </td>
                   <td>${booking.day}</td>
                   <td>${booking.headcount}</td>
                   <td>${booking.phoneNumber}</td>
                   <td>${booking.state}</td>
                </tr>
             </c:forEach>
          </tbody>
       </table>
    </div>
</body>
</html>