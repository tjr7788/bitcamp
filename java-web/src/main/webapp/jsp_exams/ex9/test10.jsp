<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
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
<h3>c:forTokens 태그</h3>
특정 구분자로 분리된 문자열을 전문적으로 처리하는 태그이다.<br>
<p>배열:
<c:url var="url" value="https://search.daum.net/search">
https://search.daum.net/search?w=tot&DA=YZR&t__nil_searchbox=btn&sug=&sugo=&q=java
    <c:param name="w" value="tot"/>
    <c:param name="DA" value="YZR"/>
    <c:param name="t__nil_searchbox" value="btn"/>
    
    
</c:url> 
</body>

</html>