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
request.setAttribute("name", "홍길동");
request.setAttribute("age", 20);
request.setAttribute("working", true);
%>

<h2>ServletReuquest에서 값 꺼내기</h2>
${requestScope.name}<br>
${requestScope.age}<br>
${requestScope.working}<br>
</body>
</html>