<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	label {
		display: inline-block;
		width: 70px;
	}
</style>
</head>
<body>
<%
	request.setCharacterEncoding("UTF-8");
%>
	<jsp:useBean id="member" class="com.ezen.javabeans.BoardBean"/>
	<jsp:setProperty property="*" name="member"/>
	
	<h3>입력 완료된 정보</h3>
	<label>작성자</label>
	<jsp:getProperty property="name" name="member"/><br>
	<label>비밀번호</label>
	<jsp:getProperty property="pass" name="member"/><br>
	<label>이메일</label>
	<jsp:getProperty property="email" name="member"/><br>
	<label>글제목</label>
	<jsp:getProperty property="title" name="member"/><br>
	<label>글내용</label>
	<jsp:getProperty property="content" name="member"/>
</body>
</html>