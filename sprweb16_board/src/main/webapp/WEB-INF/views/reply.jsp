<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
<link rel="stylesheet" type="text/css" href="./resources/css/board.css">
</head>
<body>
<h2>* 글쓰기 *</h2>
<form action="reply" method="post">
<input type="hidden" name="num" value="${data.num}">
<input type="hidden" name="page" value="${page}">
<input type="hidden" name="gnum" value="${data.gnum}">
<input type="hidden" name="onum" value="${data.onum}">
<input type="hidden" name="nested" value="${data.nested}">
<input type="hidden" name="bip" value="<%=request.getRemoteAddr()%>">

<table border="1" style="width: 80%">
  <tr>
  	<td>이름</td>
  	<td><input type="text" name="name"></td>
  </tr>
  <tr>
  	<td>암호</td>
  	<td><input type="text" name="password"></td>
  </tr>
  <tr>
  	<td>메일</td>
  	<td><input type="text" name="mail"></td>
  </tr>
  <tr>
  	<td>제목</td>
  	<td><input type="text" name="title" value="[Re]:${data.title}"></td>
  </tr>
  <tr>
  	<td>내용</td>
  	<td>
  		<textarea rows="5" cols="50" name="cont"></textarea>
  	</td>
  </tr>
  <tr>
  	<td colspan="2" style="text-align: center;">
  		<input type="submit" value="작성">
  		<input type="button" value="목록" onclick="location.href='list?page=${page}'">
  	</td>
  </tr>
</table>
</form>
</body>
</html>