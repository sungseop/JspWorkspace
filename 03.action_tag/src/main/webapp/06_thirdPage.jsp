<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>세번째 페이지에서 전달된 각 영역에 데이터 확인</h3>
	<h4>=== thirdPage.jsp ===</h4>
	페이지 영역 데이터: <%= pageContext.getAttribute("name") %><br>
	Request 영역 데이터: <%= request.getAttribute("name") %><br>
	Session 영역 데이터: <%= session.getAttribute("name") %><br>
	Application 영역 데이터: <%= application.getAttribute("name") %><br>
</body>
</html>