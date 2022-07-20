<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	form {
		border: 1px solid gray;
	}
	label {
		display: inline-block;
		width: 70px;
		font-weight: bold;
		background-color: #bbb;
		padding: 2px;
		margin: 1px 1px;
	}
</style>
</head>
<body>	
	<h3>게시판 글쓰기</h3>
	<form method="post" action="boardWrite.jsp">
		<label for="">작성자</label>
		<input type="text" name="name"><br>
		<label for="">비밀번호</label>
		<input type="password" name="pass">(게시물 수정, 삭제시 필요합니다.)<br>
		<label for="">이메일</label>
		<input type="text" name="email"><br>
		<label for="">글 제목</label>
		<input type="text" name="title"><br>
		<label for="">글 내용</label>
		<input type="text" name="content"><br>
		
		<input type="submit" value="등록">
		<input type="reset" value="다시작성">
	</form>
</body>
</html>