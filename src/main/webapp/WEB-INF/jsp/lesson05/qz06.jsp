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
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</head>
<body>
   <div class="container">
      <h1>회원정보 리스트</h1>
      <table class="table text-center">
        <thead>
          <tr>
            <th>No</th>
            <th>이름</th>
            <th>전화번호</th>
            <th>국적</th>
            <th>이메일</th>
            <th>자기소개</th>
          </tr>
        </thead>
        <tbody>
           <c:forEach var="list" items="${members}" varStatus="status">
              <tr>
                <td>${status.count}</td>
                <td>${list.name}</td>
                <td>
                    <c:choose>
                        <c:when test="${fn:startsWith(list.phoneNumber, '010')}">
                           ${list.phoneNumber}
                        </c:when>
                        <c:otherwise>
                        유효하지 않은 전화번호
                        </c:otherwise>
                    </c:choose>
                </td>
                <td>
                    ${fn:replace(list.nationality, '삼국시대', '삼국 -') }
                </td>
                <td>
                    <strong>${fn:split(list.email, '@')[0] }</strong>@${fn:split(list.email, '@')[1] }
                    
                    
                </td>
                <td class="text-left">
                  <!-- 이 부분에서는 if문 보다 choose문이 더 나음 -->
                   <c:if test="${fn:length(list.introduce) > 15 }">
                      <!-- 0~15 -->
                      ${fn:substring(list.introduce, 0, 15 ) }...
                   </c:if>
                   <c:if test="${fn:length(list.introduce) <= 15 }">
                      ${list.introduce }
                   </c:if>
                </td>
              </tr>
           </c:forEach>
        </tbody>
      </table>
   </div>
</body>
</html>