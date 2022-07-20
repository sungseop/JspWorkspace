<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="member" class="com.ezen.javabeans.MemberBeans"></jsp:useBean>

<%
	member.setName("장보고");
	member.setUserid("bkjang");
%>
이 름: <%= member.getName() %><br>
아이디: <%= member.getUserid() %>
</body>
</html>