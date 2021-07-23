<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL Core 라이브러리</title>
</head>
<body>
   <h1>(c:set)</h1>
   <c:set var="numb1" value="36" />
   <c:set var="numb2">3</c:set>
   
   <h4>첫번째 숫자: ${numb1}</h4>
   <h4>두번째 숫자: ${numb2}</h4>
   
   <h4>더하기: ${numb1 + numb2}</h4>
   <h4>뺴기: ${numb1 - numb2}</h4>
   <h4>곱하기: ${numb1 * numb2}</h4>
   <h4>나누기: ${numb1/ numb2}</h4>
   
   <h1>(c:out)</h1>
   
   
   <h1>(c:if)</h1>
   <c:if var="average" value="${(numb1+num2) / 2}"></c:if>
   
   <c:if test="${average >= 10}">
     <h4>${average}</h4>
   </c:if>
   
   <c:if test="${average < 10}">
      <h4>${average}</h4>
   </c:if>
   
   
   
   
</body>
</html>