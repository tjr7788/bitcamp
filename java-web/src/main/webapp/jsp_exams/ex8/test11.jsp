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
domain.Member member = new domain.Member();
member.setName("홍길동");
member.setAge(20);
member.setWorking(true);

pageContext.setAttribute("member", member);
%>
<h2>자바 객체</h2>
${member.name}<br>
${member.age}<br>
${member.working}<br>
</body>
</html>