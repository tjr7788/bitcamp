<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<!DOCTYPE>
<html>
<head>
<meta charset="UTF-8">
<title>JSP예제</title>
<link rel='stylesheet' href='../common.css'>
</head>
<body>
<h1>EL 사용법</h1>
<%
session.setAttribute("name", "홍길동");
session.setAttribute("age", 20);
session.setAttribute("working", true);
%>

<h2>ServletReuquest에서 값 꺼내기</h2>
${sessionScope.name}<br>
${sessionScope.age}<br>
${sessionScope.working}<br>
</body>
</html>