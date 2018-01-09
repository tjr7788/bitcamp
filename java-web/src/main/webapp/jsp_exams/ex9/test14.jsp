<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
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
<h3>c:redirect 태그2</h3>
특정 페이지로 다시요청하라고 클라이언트에게 응답하는 태그이다.<br>

<%
pageContext.setAttribute("today", new java.util.Date());
%>
<fmt:formatDate value="${today}"  pattern="yyyy-MM-dd"/><br>
<fmt:formatDate value="${today}"  pattern="dd/MM/YYYY"/>
</body>

</html>