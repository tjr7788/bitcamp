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
<h1>지시부</h1>
<p>
JSP 페이지를 작성할 떄 사용한 문자집합을 지정한다.<br>
JSP 엔진이 템플릿 데이터를 출력문으로 바꿀 때 참조한다.<br>
</p>
서블릿 클래스에 특별한 작업을 지시할 때 사용한다.<br>
&lt;%@ include file="" %>
<h2>JSP 코드</h2>
JSP 페이지에 다른 파일의 내용을 포함시킬 때 사용한다.
<pre class="jsp">
    &lt;%@ taglib uri="URL" prefix="네임스페이스명"%>
</pre>
</body>
</html>
