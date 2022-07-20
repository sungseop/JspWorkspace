<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>액세서리</h3>
	<p>관심항목을 선택하세요</p>
	<hr>
	<form method="get" action="14_forEachEx2.jsp">
		<input type="checkbox" name="interest" value="신발">신발
		<input type="checkbox" name="interest" value="가방">가방
		<input type="checkbox" name="interest" value="벨트">벨트<br>
		<input type="checkbox" name="interest" value="모자">모자
		<input type="checkbox" name="interest" value="시계">시계
		<input type="checkbox" name="interest" value="주얼리">주얼리<br>
		<input type="submit" value="전송">
	</form>
</body>
</html>