<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>すべてを表示</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	
	<%@ include file = "header-nav.jsp" %>

	<h2>1~20まで表示</h2>
	<br><br>
	<%for(int i = 0; i < 21; i++ ){%>

			<p>~JSPで表示~:　<%= i %> ~</p>

	<%} %>	

</body>
</html>