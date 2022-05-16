<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Калькулятор-Площадь круга</title>
</head>
<body>
<h1>Калькулятор-Площадь круга</h1>
	<form action="${pageContext.request.contextPath}/Calc" method="post"> 
	<label for="rad">Радиус:</label>
	<input type="text" name="rad" id="rad" value="${first}">
	<input type="submit" name="sign" value="Вычислить">
	</form>
</body>
</html>