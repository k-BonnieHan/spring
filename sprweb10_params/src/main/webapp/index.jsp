<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
** 요청 파라미터 연습 **<br>
<a href="kbs/login?type=admin">관리자</a><br>
<a href="kbs/login?type=user">일반인</a><br>
<a href="kbs/login">파라미터 없음</a><br>
<br>
<form action="kbs/login" method="post">
data : <input type="text" name="type" value="user">
<input type="submit" value="전송">
</form>

<hr>
요청URL으로부터 정보 얻기 
<br>
<form action="mbc/korea" method="post">
data : <input type="text" name="name" value="tom">
<input type="submit" value="전송">
</form>
<br>
<form action="mbc/usa" method="post">
data : <input type="text" name="name" value="james">
<input type="submit" value="전송">
</form>
<br>
요청URL으로부터 정보 얻기 2
<br>
<form action="ent/bighit/singer/bts" method="get">
신곡 : <input type="text" name="title" value="다이너마이트">
<input type="submit" value="전송">
</form>
<br>
<form action="ent/yg/singer/blackpink" method="get">
신곡 : <input type="text" name="title" value="아이스크림">
<input type="submit" value="전송">
</form>
</body>
</html>






