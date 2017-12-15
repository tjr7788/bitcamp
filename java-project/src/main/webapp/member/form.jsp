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
<h1>회원 추가</h1>
<form action='add.jsp' method='post'>
<div class="form-group row">
<label class="col-sm-2 col-form-label" for='name'>이름</label>
<div class='col-sm-10'>
<input class="form-control" id='name' type='text' name='name'>

</div>
</div>
<div class="form-group row">
<label class="col-sm-2 col-form-label" for='email'>이메일</label>
<div class='col-sm-10'>
<input class="form-control" id='email' type='text' name='email'>

</div>
</div>
<div class="form-group row">
<label class="col-sm-2 col-form-label" for='password'>비밀번호</label>
<div class='col-sm-10'>
<input class="form-control" id='password' type='password' name='password'>

</div>
</div>
<button>추가</button>
</form>
</tbody>
</table>
<jsp:include page="../footer.jsp"/>
</div>
<%@ include file="../jslib.txt" %>
</body>
</html>
