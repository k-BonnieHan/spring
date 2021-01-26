<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
<link rel="stylesheet" type="text/css" href="./resources/css/board.css">
</head>
<body>

<h2>* 글 수정 *</h2>
<form action="update" method="post">
<input type="hidden" name="num" value="${data.num}">
<input type="hidden" name="page" value="${page}">
<table border="1" style="width: 80%">
  <tr>
  	<td>이름</td>
  	<td><input type="text" name="name" value="${data.name}"></td>
  </tr>
  <tr>
  	<td>암호</td>
  	<td><input type="text" name="pass"></td>
  </tr>
  <tr>
  	<td>메일</td>
  	<td><input type="text" name="mail" value="${data.mail}"></td>
  </tr>
  <tr>
  	<td>제목</td>
  	<td><input type="text" name="title" value="${data.title}"></td>
  </tr>
  <tr>
  	<td>내용</td>
  	<td>
  		<textarea rows="5" cols="50" name="cont">${data.cont}</textarea>
  	</td>
  </tr>
  <tr>
  	<td colspan="2" style="text-align: center;">
  		<input type="submit" value="수정">
  		<input type="button" value="목록" onclick="location.href='list?page=1'">
  	</td>
  </tr>
</table>
</form>
</body>
</html>