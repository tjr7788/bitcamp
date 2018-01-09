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
<h3>c:choose 태그</h3>
여러 조건에 따라 여러 개로 분기할 떄 사용하는 태그<br>
<c:set var="leve" value="0"/>

<c:when test="${level ==  0}">손님입니다.</c:when>
<c:when test="${level ==  1}">고객입니다.</c:when>
<c:when test="${level ==  2}">사람입니다.</c:when>

</body>
</html>