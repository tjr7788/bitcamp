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
<h1>JSP:useBean</h1>
<%
pageContext.setAttribute("list", new java.util.ArrayList());
%>
<jsp:useBean id="list" type="java.util.ArrayList"></jsp:useBean>
<p>
list 개수<%=list.size() %>
</p>
</body>
</html>