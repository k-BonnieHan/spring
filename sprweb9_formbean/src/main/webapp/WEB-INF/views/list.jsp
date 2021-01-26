<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
결과 : ${data}
<hr>
참고 : command obj 접근 가능 : ${sangpumBean.sang}
<br>
참고 : command obj 별명 접근 가능 : ${my.sang}
<br>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:forEach var="s" items="${myList}">
	${s}&nbsp;&nbsp;
</c:forEach>
</body>
</html>