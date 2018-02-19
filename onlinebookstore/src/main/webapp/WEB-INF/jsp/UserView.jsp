<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form method="POST" action="/register"
  modelAttribute="employee">
    User Name:<br>
    <input type="text" name="UserID" value="Qi_Yang">
    Password:<br>
     <input type="password" name="Password" value="123">
    <input type="submit" value="Submit" />
</form:form>
</body>
</html>