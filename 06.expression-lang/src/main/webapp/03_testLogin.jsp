<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<pre>
		당신이 입력한 정보입니다. (Java 문법의 표현식 이용)
		아이디: <%= request.getParameter("id") %>
		비밀번호: <%= request.getParameter("pwd") %>
	</pre><br>
	<pre>
		당신이 입력한 정보입니다. (표현 언어(EL) 방식 이용)
		아이디: ${param.id}
		비밀번호: ${param["pwd"]}
	</pre>
</body>
</html>