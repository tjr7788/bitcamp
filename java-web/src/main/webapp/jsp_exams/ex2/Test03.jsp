<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<% int a = 10; %>
<head>
<meta charset="UTF-8">
<title>JSP예제</title>
<link rel='stylesheet' href='../common.css'>
</head>
<% int b = 20; %>
<body>
<h1>스크립틀릿(scriptlet element)</h1>
<p>JSP 페이지에 자바 코드를 넣을 사용한다.
</p>
<h1>스크립틀릿 테스트2</h1>
<pre class="jsp">
<%
out.println(a + b);
%>
</pre>
</body>
</html>
<%
class MyInner {} //ㅋㅋ
%>