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
<h3>c:forEach 태그</h3>
반복문을 생성할 때 사용하는 태그이다.<br>
<%
pageContext.setAttribute("list1", new String[]{"홍길동","유관순","김구","안중근"});
%>
<c:forEach items="${list1}" var="item" begin="2">
${item},
</c:forEach>
<br>
<%
ArrayList<String> list2 = new ArrayList<>();
list2.add("홍길동");
list2.add("임꺽정");
list2.add("유관순");
pageContext.setAttribute("list2", list2);
%>
<c:forEach items="${list2}" var="item" end="2">
${item},
</c:forEach>

<br>
<%
HashMap<String, Object> list3 = new HashMap<>();
list3.put("name", "홍길동");
list3.put("age", 20);
list3.put("working", true);
pageContext.setAttribute("list3", list3);
%>
<c:forEach items="${list3}" var="item">
${item.key} = ${item.value},
</c:forEach>
<br>
<c:forEach items="홍길동,유관순,안중근" var="item">
${item},
</c:forEach>
</body>
</html>