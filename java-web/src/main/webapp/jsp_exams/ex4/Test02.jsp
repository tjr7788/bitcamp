<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<%!
   public int a;
%>
<meta charset="UTF-8">
<title>JSP예제</title>
<link rel='stylesheet' href='../common.css'>
</head>
<%!
   {
     this.a = 100;
     this.b = 200;
   }
%>
<body>
<h1>선언부</h1>
<%!
   private int m() {
    return a + b;
}
%>
서블릿 클래스에 필드나 메소드를 만들 때 사용한다.<br>
필드를 선언하는 경우 주의해야 한다.<br>
서블릿 객체는 오직 한 개만 생성되기 때문에 필드도 한 개만 생성된다.<br>
그리고 그 필드를 여러 클라이언트가 공유한다.<br>
따라서 클라이언트마다 구분되어야 할 값을 필드에 저장하면 안된다.<br>
클라이언트들이 공유하는 값은 서블릿 필드에 저장해도 된다.<br>
메소드 또한 여러 클라이언트들이 공유한다는 것을 잊지 말아야 한다.<br>
<h2>JSP 코드</h2>
<pre class="jsp">
&lt;%!
    public int a;
    private void m() {}
    static {}
    {}
%>
</pre>
<p></p>
a + b = <%=m() %>
</body>
</html>
<%!
   public int b;
%>