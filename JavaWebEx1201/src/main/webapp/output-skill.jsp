<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>出力データ</title>
<link rel="stylesheet" href="style.css">
</head>
<body>

	<h1>内容確認</h1>
	
	<% 
			@SuppressWarnings("unchecked")
			List<String> infoSkill = (List<String>) request.getAttribute("infoSkill");
			for (String skill : infoSkill){
	%>
				<%= skill %><br><br>
	
	<%
			} 
	%>
	＝＝＝＝＝＝＝＝これはOutputServetで書き出しています<br><br>
	<a href="input-skill.html">入力画面へ</a>

</body>
</html>