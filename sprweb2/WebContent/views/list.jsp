<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
결과 보기:
<br>
<%
String str = (String)request.getAttribute("say");
out.println(str);
%>
<br>
${requestScope.say }
<br>
${say }
</body>
</html>