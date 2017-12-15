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
<h1>JSP:setProperty</h1>
셋터 호출하기<br>

<%
domain.Member m = new domain.Member();
pageContext.setAttribute("m", m);
%>

<jsp:setProperty property="name" name="m" value="홍길동"/>
<h2>Member 객체 내용</h2>
<%=m.toString()%>

</body>
</html>