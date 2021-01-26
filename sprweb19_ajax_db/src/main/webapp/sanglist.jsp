<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	//alert("a");
	$("#showData").empty();
	
	$.ajax({
		type:"get",
		url:"sangpum",
		dataType:"json",
		success:function(sangpums) {
			var str ="<table border='1'>";
			str += "<tr><th>코드</th><th>품명</th><th>수량</th><th>단가</th></tr>"
			//alert(sangpums);
			var list = sangpums.datas;
			$(list).each(function(idx, objArr){
				str += "<tr>";
				str += "<td>" + objArr["code"] + "</td>";
				str += "<td>" + objArr["sang"] + "</td>";
				str += "<td>" + objArr["su"] + "</td>";
				str += "<td>" + objArr.dan + "</td>";
				str += "</tr>";
			});
			str += "</table>";
			$("#showData").append(str);
		},
		error:function(){
			$("#showData").text("에러 발생");
		}
	});
});
</script>
</head>
<body>
** 상품 자료(@MVC - Ajax) **<br>
<div id="showData"></div>
</body>
</html>
