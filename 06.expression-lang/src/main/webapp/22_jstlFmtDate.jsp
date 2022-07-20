<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:set var="now" value="<%= new java.util.Date() %>"/>
	\${now} : ${now}<br>
	날짜 표시: <fmt:formatDate value="${now}" type="date"/><br>
	시간 표시: <fmt:formatDate value="${now}" type="time"/><br>
	날짜와 시간 표시: <fmt:formatDate value="${now}" type="both" dateStyle="long" timeStyle="long"/><br>
	pattern 사용: <fmt:formatDate value="${now}" pattern="yyyy년 MM월 dd일 hh시 mm분 ss초"/><br>
</body>
</html>