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
<h3>c:set 태그</h3>
<p>자바의 출력문을 생성하는 태그</p>

<jsp:useBean id="member" class="domain.Member" scope="request"/>
이름 : ${reqeustScope.member.name}
나이 : ${reqeustScope.member.age}
재직 : ${reqeustScope.member.working}

<c:set target="${member}" property="name" value="홍길동"/>
<c:set target="${member}" property="age" value=20/>
<c:set target="${member}" property="working" value=true/>
이름 : ${reqeustScope.member.name}
나이 : ${reqeustScope.member.age}
재직 : ${reqeustScope.member.working}
</body>
</html>