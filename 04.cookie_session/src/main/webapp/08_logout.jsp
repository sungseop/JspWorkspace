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
	session.invalidate();	// 세션 제거
%>
<script type="text/javascript">
	alert("로그아웃 되었습니다!");
	// 로그인 폼으로 이동
	location.href="08_loginForm.jsp";
</script>
</body>
</html>