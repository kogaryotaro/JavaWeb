<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>1~20</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<%@ include file = "header-nav.jsp" %>

	<h2>1~20まで表示(6の倍数を除く)</h2>
	<br><br>
	<%for(int i = 0; i < 21; i++ ){%>
		<%if(i % 6 != 0) {%>
			<p>~JSPで表示~:　<%= i %> ~</p>
		<%} %>
	<%} %>	

</body>
</html>