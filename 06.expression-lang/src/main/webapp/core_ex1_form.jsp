<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="core_ex1_test.jsp">
		연산자를 선택하세요<br>
		<select name="operator">
			<option value="1">+</option>
			<option value="2">-</option>
			<option value="3">*</option>
			<option value="4">/</option>
		</select><br>
		2개의 정수를 입력해 주세요<br>
		<input type="number" name="num1" id="num1">
		<input type="number" name="num2" id="num2"><br>
		<input type="submit" value="전송">
	</form>
</body>
</html>