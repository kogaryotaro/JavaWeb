<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログイン画面</title>
<link rel="stylesheet" href="style.css">
</head>
<body>

	<h2>ログイン</h2>
	
	<form action="login-servlet" method="post">
		ユーザーID<input type="text" name="userId" required><br>
		パスワード<input type="text" name="password" required><br><br>
		<input type="submit" value="ログイン">
	</form>
	
	<% 
		String errorMsg = (String) request.getAttribute("errorMsg");
		if(errorMsg != null){
	%>
	
			<p class="error-msg"><%= errorMsg %></p>
	
	<%
		}
	%>

</body>
</html>