<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
<head>
<title>도서 정보</title>
<link rel='stylesheet' href='../../node_modules/bootstrap/dist/css/bootstrap.min.css'>
<link rel='stylesheet' href='../../css/common.css'>
</head>
<body>
<div class='container'>


<h1>도서 상세정보</h1>

<c:if test="${not empty book}">
        <form action='update' method='post' enctype="multipart/form-data">
        
        <div class='form-group row'>
        <label for='no' class='col-sm-2 col-form-label'>번호</label>
        <div class='col-sm-10'>
        <input class='form-control' readonly id='no' type='number' 
                name='no' value='${book.no}'>
        </div>
        </div>
        <div class='form-group row'>
        <label for='bookname' class='col-sm-2 col-form-label'>도서명</label>
        <div class='col-sm-10'>
        <input class='form-control' id='bookname' type='text' 
                name='bookname' value='${book.bookname}'>
        </div>
        </div>
        <div class='form-group row'>
        <label for='publisher' class='col-sm-2 col-form-label'>출판사</label>
        <div class='col-sm-10'>
        <input class='form-control' id='publisher' type='text' value='${book.publisher}'
                    name='publisher'>
        </div>
        </div>
        <div class='form-group row'>
        <label for='regDate' class='col-sm-2 col-form-label'>출판일</label>
        <div class='col-sm-10'>
        <input class='form-control' id='regDate' type='date' name='regDate'
                value='${book.regDate}'>
        </div>
        </div>
        
        <div class='form-group row'>
        <label for='price' class='col-sm-2 col-form-label'>가격</label>
        <div class='col-sm-10'>
        <input class='form-control' id='price' type='number' 
                value='${book.price}'>
        </div>
        </div>
        
        <div class='form-group row'>
        <label for='explanation' class='col-sm-2 col-form-label'>설명</label>
        <div class='col-sm-10'>
        <input class='form-control' id='explanation' type='text' name='explanation'
                value='${book.explanation}'>
        </div>
        </div>
        
        <div class='form-group row'>
		<label for='file' class='col-sm-2 col-form-label'>파일1</label>
		<div class='col-sm-10'>
		<input type="file" class="form-control-file" id="file" name="file">
		</div>
		</div>
        
        <div class='form-group row'>
        <label for='photo' class='col-sm-2 col-form-label'>사진</label>
        <div class='col-sm-10'>
        <img src="${contextPath}/download/${book.photo}" width="500" height="500">
        </div>
        </div>
        
        <div class='form-group row'>
        <div class='col-sm-10'>
        <button class='btn btn-primary btn-sm'>변경</button>
        <a href='delete?no=${book.no}' class='btn btn-primary btn-sm'>삭제</a>
        </div>
        </div>
        </form>
</c:if>
<c:if test="${empty book}">
        <p>'${param.no}'번 게시물이 없습니다.</p>
</c:if>

</div>

</body>
</html>
