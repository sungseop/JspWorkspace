<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>회원 전용 페이지</h3>
	<form method="get" action="logout.do">
		안녕하세요! ${loginUser.name}(${loginUser.userid})님<br>
		<br>
		<input type="submit" value="로그아웃">&nbsp;
		<input type="button" value="회원정보 변경" onclick="location.href='memberUpdate.do?userid=${loginUser.userid}'">
	</form>
</body>
</html>