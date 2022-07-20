<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	pageContext.setAttribute("name", "page 내장객체");
	request.setAttribute("name", "request 내장객체");
	session.setAttribute("name", "session 내장객체");
	application.setAttribute("name", "application 내장객체");
%>
<h3>표현 언어에서 name 속성의 결과</h3>
name 속성의 값은: ${name}
</body>
</html>