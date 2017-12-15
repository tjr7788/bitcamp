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
<h1>회원 정보</h1>
<%
MemberDao memberDao = ContextLoaderListener.iocContainer.getBean(MemberDao.class);
try {

    int no = Integer.parseInt(request.getParameter("no"));

    Member member = memberDao.selectOne(no);
    if (member != null) {
        %>
		<form action='update.jsp' method='post'>
		<div>
		<label for='no'>번호</label>
		<input readonly id='no' type='number' name='no' value='<%=no%>'>
		</div>
		<div>
		<label for='email'>이메일</label>
		<input id='email' type='text' name='email' value='<%=member.getEmail()%>'>
		</div>
		<div>
		<label for='name'>이름</label>
		<input id='name' type='text' name='name' value='<%=member.getName()%>'>
		</div>
		<div>
		<label for='pwd'>비밀번호</label>
		<input id='pwd' type='text' name='pwd' value='<%=member.getPwd()%>'>
		</div>
		<div>
		<label for='date'>생성날짜</label>
		<input id='date' type='text' name='date' value='<%=member.getCreatedDate()%>'>
		</div>
		<button>변경</button>
		<a href='delete.jsp?no=<%=member.getNo()%>'>삭제<a>
		</form>
		<%
    } else {
        %>
        <p>'<%=no %>'번의 회원 정보가 없습니다.\n</p>
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
  