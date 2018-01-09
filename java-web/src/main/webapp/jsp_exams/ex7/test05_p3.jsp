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
<h1>ServletContext 보관소</h1>
모든클라이언트가 같은 ServletConttext 객체를 공유한다.<br>

<%=application.getAttribute("name")%>

</body>
</html>