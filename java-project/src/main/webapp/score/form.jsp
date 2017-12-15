<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<title>성적관리</title>
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
<h1>성적 추가</h1>
<form action="add.jsp" method='post'>
<div class="form-group row">
<label class="col-sm-2 col-form-label for='no' ">번호</label>
<div class='col-sm-10'>
<input class="form-control" readonly id='no' type='number' name='no'>
</div>
</div>
<div class="form-group row">
<label for='name' class="col-sm-2 col-form-label">이름</label>
<div class='col-sm-10'>
<input class="form-control" id='name' type='text' name='name'>
</div>
</div>
<div class="form-group row">
<label for='kor' class="col-sm-2 col-form-label">국어</label>
<div class='col-sm-10'>
<input class="form-control" id='kor' type='number' name='kor' value='kor'>
</div>
</div>
<div class="form-group row">
<label for='eng' class="col-sm-2 col-form-label">영어</label>
<div class='col-sm-10'>
<input class="form-control" id='eng' type='number' name='eng' value='eng'>
</div>
</div>
<div class="form-group row">
<label for='math' class="col-sm-2 col-form-label">수학</label>
<div class='col-sm-10'>
<input class="form-control" id='math' type='number' name='math' value='math'>
</div>
</div>
<div class='form-group row'>
<div class='col-sm-10'>
<p><button class='btn btn-dark btn-sm'>저장</button></p>
</div>
</div>
</div>
</form>
</tbody>
</table>
<jsp:include page="../footer.jsp"/>
</div>
<%@ include file="../jslib.txt" %>
</body>
</html>
