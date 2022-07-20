<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>pwd 쿠키 삭제</h3>
<%
	Cookie c = new Cookie("pwd", "");
	c.setMaxAge(0);	// 유효기간을 0으로 설정
	response.addCookie(c);
%>
	<a href="02_getCookies.jsp">쿠키 목록 확인</a>
</body>
</html>