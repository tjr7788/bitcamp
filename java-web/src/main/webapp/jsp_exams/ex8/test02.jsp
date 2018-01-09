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
<h1>EL(Expression Language) 사용법</h1>
<h2>미리 등록된 객체 이름</h2>
<pre>

<%--
pageContext  => PageContext  => ${pageContext}
servletCOntext => ServletCOntext => ${pageCOntext.servletContext.프로퍼티명}
session  => HttpSession => ${pageContext.session.프로퍼티명}
request  => ServletRequest => ${pageContext.request.프로퍼티명}
response => ServletResponse => ${pageContext.response.프로퍼티명}

param => reqeust.getParameter(파라미터명) => ${param.파라미터명}
paramValues => request.getParameterValues(파라미터명) => ${paramValues.파라미터명}
header => request.getHeader("User-Agent") => ${header["User-Agent"]} => ${header.헤더명}
headerValues => request.getHeaders(헤더명) => ${headervalues.헤더명}
cookie => Cookie[]  cookies = request.getCookies(); => ${cookie.쿠키명}
initParam => config.getINitParameter(파라미터명) => ${initParam.파라미터명}
pageScope => pageContext.getAttribute(프로퍼티명) => ${pageScope.프로퍼티명}
requestScope => request.getAttribute(프로퍼티명) => ${requetScope.프로퍼티명}
sessionScope => session.getAttribute(프로퍼티명) => ${sessionScope.프로퍼티명}
applicationScope => application.getAttribute(프로퍼티명) => ${apllication.프로퍼티명}
--%>
</pre>

</body>
</html>