<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>세션 정보 얻어오기</h3>
<%
	// 세션 ID 얻어오기
	String sessionId = session.getId();
	// 세션이 만들어진 시간(밀리초 단위)
	long createdTime = session.getCreationTime();
	// 현재 페이지에서 마지막으로 활동한 시간(밀리초 단위)
	long lastTime = session.getLastAccessedTime();
	// 현재까지 웹 페이지를 이용한 시간(분단위 계산)
	long timeElapsed = (lastTime - createdTime) / 60000;
	// 사용자 액션 없이 세션이 유지되는 시간
	int inactiveTime = session.getMaxInactiveInterval()/60;
%>
세션 ID는 <%= sessionId %> 입니다.<br>
세션 생성시간 <%= createdTime %> 입니다.<br>
웹사이트 이용시간은 <%= timeElapsed %> 입니다.<br>
세션의 유효 시간은 <%= inactiveTime %>분 입니다.<br>
</body>
</html>