<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.net.URLEncoder" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String id="gdhong";
	String pwd="1234";
	String name="홍길동";
	
	request.setCharacterEncoding("UTF-8");
	
	if (id.equals(request.getParameter("id")) && pwd.equals(request.getParameter("pwd"))) {
		// 정상적인 로그인 -> main화면으로 이동
		response.sendRedirect("04_main.jsp?name="+URLEncoder.encode(name, "UTF-8"));
	} else {
		// 로그인 실패시 ->
		response.sendRedirect("04_loginForm.jsp");
	}
%>
</body>
</html>