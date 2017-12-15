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
<jsp:useBean id="list" class="java.util.ArrayList"></jsp:useBean>
<%
	list.add("홍길동");
	list.add("유관순");
%>
list 개수<%=list.size() %> <br>
<%
    java.util.ArrayList list2 = (java.util.ArrayList)pageContext.getAttribute("list");    
%>
list2.get(1): <%=list2.get(1) %>
</body>
</html>