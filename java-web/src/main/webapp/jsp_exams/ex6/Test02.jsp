<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP예제</title>
<link rel='stylesheet' href='../common.css'>
</head>
<body>
<h1>JSP 액션 태그</h1>
각 태그는 서블릿 클래스를 만들 떄 특별한 코드를 생성한다.<br>
<h2>jsp:include</h2>
RequestDispatcher의 include()와 같은 기능을 수행한다.<br>
<jsp:include page="Test02_p1.jsp"/>
<hr>
<jsp:include page="Test02_p2.jsp"/>
</body>
</html>