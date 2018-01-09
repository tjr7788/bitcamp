<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP예제</title>
<link rel='stylesheet' href='../common.css'>
</head>
<body>
<h1>JSTL</h1>
<h2>Core 라이브러리</h2>
<h3>c:out 태그</h3>
<p>자바의 출력문을 생성하는 태그</p>
<c:set var="name" value="홍길동"/><br>
<c:set var="name2">임꺽정</c:set><br>
<c:set var="name3" value="유관순" scope="request"/><br>
<c:set var="name4" value="안중근" scope="session"/><br>
<c:set var="name5" value="윤봉길" scope="application"/><br>
${name}<br>
${name2}<br>
${name3}<br>
${name4}<br>
${name5}<br>


</body>
</html>