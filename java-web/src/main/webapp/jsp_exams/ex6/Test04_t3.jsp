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
<h1>JSP:getProperty</h1>
겟터 호출하기<br>
setProperty를 사용하는 경우 new 명령을 사용하여 객체를 만든 후<br>
그 객체를 PageContext에 담아 놓고 사용해도 문제가 없는다,<br>
getProperty를 사용하는 경우네는 useBean을 통해 객체를 생성해야만 사용할 수 있다.<br>

<jsp:useBean id="m" class="domain.Member">
	<jsp:setProperty name="m" property="name" value="홍길동"/>
	<jsp:setProperty name="m" property="age" value="20"/>
	<jsp:setProperty name="m" property="working" value="true"/>
</jsp:useBean>
이름 : <jsp:getProperty property="name" name="m"/><br>
이름 : <jsp:getProperty property="age" name="m"/><br>
이름 : <jsp:getProperty property="working" name="m"/><br>
<h2>Member 객체 내용</h2>
<%=m.toString()%>

</body>
</html>