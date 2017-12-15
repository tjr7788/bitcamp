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
<jsp:useBean id="list" class="java.util.ArrayList"/>
<jsp:useBean id="list2" class="java.util.ArrayList" scope="request"/>\
<h3>PageContext 보관소</h3>
list1 : <%=pageContext.getAttribute("list")%><br>
list2 : <%=pageContext.getAttribute("list2")%><br>
<h3>ServletRequest 보관소</h3>
list1 : <%=request.getAttribute("list")%><br>
list2 : <%=request.getAttribute("list2")%><br>
</body>
</html>