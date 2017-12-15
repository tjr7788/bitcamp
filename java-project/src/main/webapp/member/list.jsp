<%@page import="java100.app.domain.Member"%>
<%@page import="java100.app.dao.MemberDao"%>
<%@page import="java100.app.listener.ContextLoaderListener"%>


<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
    
<!DOCTYPE html>
<html>
<head>
<title>회원관리</title>
<link rel='stylesheet' href='../node_modules/bootstrap/dist/css/bootstrap.min.css'>
<link rel='stylesheet' href='../css/common.css'>
</head>
<body>
<div class='container'>
<%
out.flush();
RequestDispatcher rd = request.getRequestDispatcher("/header.jsp");
rd.include(request, response);
%>
<h1>회원 목록</h1>
<p><button type='button' class='btn btn-dark btn-sm'><a href='form.jsp'>추가</a></button></p>
<table class='table table-hover'>
<thead>
<tr>
</tr>
<th>번호</th><th>이름</th><th>이메일</th><th>생성날짜</th>
</thead>
<tbody>
<%
MemberDao memberDao = ContextLoaderListener.iocContainer.getBean(MemberDao.class);
try {
    List<Member> list = memberDao.selectList();

    for (Member member : list) {
        %>
        <tr>
        <td><%=member.getNo()%></td>
        <td><a href='view.jsp?no=<%=member.getNo()%>'><%=member.getName()%></a></td>
        <td><%=member.getEmail() %></td>
        <td><%=member.getCreatedDate() %></td>
        </tr>
        <%  
    }
} catch (Exception e ) {
    e.printStackTrace();
    out.println(e.getMessage());
}
%>
</tbody>
</table>
<jsp:include page="../footer.jsp"/>
</div>
<%@ include file="../jslib.txt" %>
</body>
</html>
    