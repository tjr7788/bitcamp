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
java.util.HashMap<String, Object> map = new java.util.HashMap<>();
map.put("name", "홍길동");
map.put("age", 20);
map.put("working", true);
pageContext.setAttribute("map", map);
%>
<h2>List</h2>
${map.name}<br>
${map.age}<br>
${map.working}<br>
</body>
</html>