<%@page import="java100.app.domain.Member"%>
<%@page import="java100.app.listener.ContextLoaderListener"%>
<%@page import="java100.app.dao.MemberDao"%>
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
<h1>회원 수정</h1>
<%
try {
    MemberDao memberDao = ContextLoaderListener.iocContainer.getBean(MemberDao.class);
    Member member = new Member();
    member.setEmail(request.getParameter("email"));
    member.setName(request.getParameter("name"));
    member.setPwd(request.getParameter("pwd"));
    member.setNo(Integer.parseInt(request.getParameter("no")));

    if (memberDao.update(member) > 0 ) { 
        %><p>변경하였습니다.</p>
<%
    } else {
        %><p>'<%=member.getNo() %>'의 성적 정보가 없습니다.</p><%
    }

} catch (Exception e ) {
    e.printStackTrace();
    out.println(e.getMessage());
}
%>
<p><a href='list.jsp'>목록</a></p>
</tbody>
</table>
<jsp:include page="../footer.jsp"/>
</div>
<%@ include file="../jslib.txt" %>
</body>
</html>
  