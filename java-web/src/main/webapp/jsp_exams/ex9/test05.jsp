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
<h3>c:remove 태그</h3>

<c:set var="name" value="홍길동"/>
<c:set var="name2" value="유관순"/>
<c:set var="name3" value="임꺽정"/>
<c:set var="name4" value="김구"/>
${name}<br>
${name2}<br>
${name3}<br>
${name4}<br>
<c:remove var="name2"/>
${name}<br>
${name2}<br>
${name3}<br>
${name4}<br>
</body>
</html>