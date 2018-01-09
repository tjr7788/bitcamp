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
pageContext.setAttribute("name", "홍길동");
pageContext.setAttribute("age", 20);
pageContext.setAttribute("working", true);
%>

<h2>PageContext에서 값 꺼내기</h2>
<p>PageCOntext의 getAttribute()를 호출할 때는 "pageScope" 이름을 사용하여 값을 꺼내야 한다.<br>
${pageContext.name}<br>
${pageContext.age}<br>
${pageCOntext.working}<br>
</body>
</html>