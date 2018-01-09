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
application.setAttribute("name2", "임꺽정");
session.setAttribute("name2", "홍길동");
request.setAttribute("name2", "유관순");
pageContext.setAttribute("name2", "김구");
%>

<h2>ServletReuquest에서 값 꺼내기</h2>
${name2}<br>
${requestScope.name2}<br>
${sessionScope.name2}<br>
${applicationScope.name2}<br>
</body>
</html>