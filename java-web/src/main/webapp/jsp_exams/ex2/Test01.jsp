<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP예제</title>
<link rel='stylesheet' href='../common.css'>
</head>
<body>
<h1>스크립틀릿(scriptlet element)</h1>
<p>JSP 페이지에 자바 코드를 넣을 사용한다.
</p>
<h1>스크립틀릿 테스트</h1>
<pre class="jsp">
<%
int a = 10;
int b = 20;
out.println(a + b);
%>
</pre>
</body>
</html>