<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="POST" action="/login" modelAttribute="employee">
    User Name:
    <br>
		<input type="text" name="UserID" value="Qi_Yang">
	<br>
    Password:
    <br>
		<input type="password" name="Password" value="123">
		<input type="submit" value="Submit" />
	</form>
</body>
</html>