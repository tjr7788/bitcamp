<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP예제</title>
<link rel='stylesheet' href='../common.css'>
</head>
<body>
<h1>JSP 내장 변수(built-in objects)</h1>
JSP로 생성한 서블릿 클래스의 _jspService() 메소드에서 반드시 선언되어 있어야할 객체</br>

<pre>
1) request:HttpServletRequest
2) response:HttpServletResponse
   => _jspService()의 파라미터 변수이다.
   => 반드시 request, response라는 이름을 가져야 한다.
3) application:ServletContext
4) session:HttpSession
5) pageContext: PageContext
6) page == this
7) config:ServletConfig
8) out:JspWriter
9) error = ServletException 
</pre>

</body>
</html>