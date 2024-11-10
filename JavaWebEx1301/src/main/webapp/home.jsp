<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>1301</title>
<link rel="stylesheet" href="style.css">
</head>
<body>

	<h1>文字入力</h1>
	<br><br>
	<form action="input-servlet" method="post">
		<input type="text" name="input" required>
		<input type="submit" value="送信">
	</form>
	<br><br>
	
	<% 
		List<String> history = (List<String>) session.getAttribute("history");
		if(history != null){
	%>
	
			<h1>履歴</h1>
			<br>
			<form action="clear-history-servlet" method="get">
				<input type="submit" value="履歴クリア">	
			</form>
			<br>
			
			<%
				for(String his : history){
			%>
					<%=his %><br><br>
			<%
				}
			%>
	<%
		}
	%>

</body>
</html>