<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="research">
		<h2>설문 조사</h2>
		<table>
			<tr>
				<td>이름 :
				<td><input type="text" name="name" id="name">
			</tr>
			<tr>
			
				<td>성별 :
				<td>
					<input type="radio" name="gender" value="male" checked>남자
					<input type="radio" name="gender" value="female">여자
			</tr>
			<tr>
				<td>좋아하는 계절 :
				<td>
					<input type="checkbox" name="season" value="1" checked>봄
					<input type="checkbox" name="season" value="2">여름
					<input type="checkbox" name="season" value="3">가을
					<input type="checkbox" name="season" value="4">겨울
				</td>
			</tr>							
		</table>
			<input type="submit" value="전송">
			<input type="reset" value="취소">
	</form>
</body>
</html>