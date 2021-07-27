<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</head>
<body>
   <div class="container">
      <h1>2.카드 명세서</h1>
      
      <table class="table text-center">
         <thead>
           <tr>
             <th>사용처</th>
             <th>가격</th>
             <th>사용날짜</th>
             <th>할부</th>
           </tr>
         </thead>
         <tbody>
           <c:forEach var="bill" items="${cardBills }" varStatus="status">
              <tr>
                <td>${cardBills }</td>
                <td>
                  <fmt:formatNumber value="${bill.pay }" type="currenty" />
                </td>
                <td>
                  <fmt:parseDate value="${bill.date }" pattern="yyyy-mm-dd" var="date" />
                  <fmt:formatDate value="${date }" pattern="yyyy년 m월 d일" />
                </td>
                <td>${bill.installment }</td>
              </tr>
           </c:forEach>
         </tbody>
      </table>
   </div>
</body>
</html>