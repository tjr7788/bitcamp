<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>    
<!DOCTYPE html>
<html>
<head>
<title>게시판</title>
<link rel='stylesheet' href='../../node_modules/bootstrap/dist/css/bootstrap.min.css'>
<link rel='stylesheet' href='../../css/common.css'>
</head>
<body>
<div class='container'>

<h1>도서 목록</h1>
<jsp:include page="../listToolbar.jsp"/>
<table class='table table-hover'>
<thead>
<tr>
<th>도서사진</th><th>도서명</th><th>출판사</th><th>가격</th>
</tr>
</thead>
<tbody>

<c:forEach items="${list}" var="book">
    <c:set  var="bookname" value="${fn:length(book.bookname) == 0 ? 
    '(제목이 없습니다.)' : book.bookname}"/>
        <tr>
        <td><img src="${contextPath}/download/${book.photo}" width="50" height="50"></td>
        <%--   
        <td><a href='${board.no}'>${fn:substring(title, 0, 20)}
        ${(fn:length(title) > 20) ? '...' : ''}</a></td>
        --%>
        <td><a href='${book.no}'><span class="d-inline-block text-truncate" 
            style="max-width: 300px;">${bookname}</span></a></td>
        <td>${book.publisher}</td>
        <td>${book.price}</td>
        </tr>
</c:forEach>

</tbody>
</table>


</div>
<jsp:include page="../paging.jsp"/>

</body>
</html>