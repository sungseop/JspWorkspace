<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>영화 목록</title>
</head>
<body>
	<div>
		<h1>영화 목록</h1>
		<table>
			<tr>
				<td colspan="5" style="border: white; text-align:right;">
					<a href="MovieServlet?command=movie_write_form">정보등록</a>
				</td>
			</tr>
			<tr>
			<th>제목</th><th>감독</th><th>배우</th><th>가격</th><th>수정</th><th>삭제</th>
			</tr>
			<c:forEach var="movie" items="${movieList}">
				<tr>
					<td><a href="MovieServlet?command=movie_view&code=${movie.code}">${movie.title}</a></td>
					<td>${movie.director}</td>
					<td>${movie.actor}</td>
					<td>${movie.price}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>