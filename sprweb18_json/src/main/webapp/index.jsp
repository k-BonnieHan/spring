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
	$("#btnOk").click(function(){
		//alert("a");
		$("#show").html("");
		$.ajax({
			type:"get",
			url:"list",
			data:{"name":"paul"},
			success:function(data){
				//alert(data);
				var str = "";
				str += data.name + "<br>";
				str += data.skills[0] + " ";
				str += data.skills[1];
				$("#show").html(str);
			},
			error:function(){
				$("#show").text("에러");
			}
		});
	});
	
	$("#btnOk2").click(function(){
		$("#show").html("");
		$.ajax({
			type:"get",
			url:"list2",
			success:function(data){
				var str = "<table>";
				
				var list = data.datas;
				$(list).each(function(idx, objArr){
					str += "<tr>";
					str += "<td>" + objArr["name"] + "</td>";
					str += "<td>" + objArr["age"] + "</td>";
					str += "</tr>";
				});
							
				str += "</table>";
				$("#show").html(str);
			},
			error:function(){
				$("#show").text("에러");
			}
		});
	});
});
</script>
</head>
<body>
<a href="list?name=james">json 처리 : 단일 자료</a><br>
<a href="list2">json 처리 : 복수 자료</a><br>
<hr>
Ajax로 json 자료 읽기<br>
<button id="btnOk">한 개의 자료 읽기</button>
<button id="btnOk2">여러 개의 자료 읽기</button>
<br>
<div id="show"></div>
</body>
</html>