<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
결과 : <br>
<%@taglib prefix="spr" uri="http://www.springframework.org/tags" %>
<spr:message code="show.disp" /> : <br>
${message}
</body>
</html>