<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="member" class="com.ezen.javabeans.MemberBeans"/>
	<h3>자바빈의 프로퍼티 설정 테스트</h3>
	<jsp:setProperty property="name" name="member" value="장보고"/>
	<jsp:setProperty property="userid" name="member" value="bkjang"/>
	
	이름: <jsp:getProperty property="name" name="member"/><br>
	아이디: <jsp:getProperty property="userid" name="member"/>
</body>
</html>