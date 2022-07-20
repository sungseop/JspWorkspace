<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="Ex1Servlet">
		<hr>
		<table>
			<tr>
				<td>이름</td>
				<td><input type="text" name="name" id="name" required></td>
			</tr>
			<tr>
				<td>주민등록번호</td>
				<td><input type="text" name="juminno1" id="juminno1" maxlength="6" required> - 
					<input type="text" name="juminno2" id="juminno2" maxlength="7" required></td>
			</tr>
			<tr>
				<td>아이디</td>
				<td><input type="text" name="id" id="id" required></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="psw1" id="psw1" required></td>
			</tr>
			<tr>
				<td>비밀번호 확인</td>
				<td><input type="password" name="psw2" id="psw2" required></td>
			</tr>
			<tr>
				<td>이메일</td>
				<td>
					<input type="text" name="email_id" id="email_id"> @
					<input type="text" name="email_domain" id="email_domain">
					<select name="email_domain2" id="email_domain2" onchange="return do_select()" size='1'>
						<option value="naver.com">naver.com</option>
						<option value="gamil.com">gmail.com</option>
						<option value="nate.com">nate.com</option>
						<option value="daum.net">daum.net</option>
						<option value="hotmail.com">hotmail.com</option>
						<option value="hanmail.net">hanmail.net</option>
						<option value="yahoo.com">yahoo.com</option>
					</select>
			</tr>
			<tr>
				<td>우편번호</td>
				<td><input type="text" name="zip" id="zip"></td>
			</tr>
			<tr>
				<td>주소</td>
				<td><input type="text" name="address1" id="address1"> <input type="text" name="address2" id="address2"></td>
			</tr>
			<tr>
				<td>핸드폰번호</td>
				<td><input type="tel" name="phone_number" id="phone_number" pattern="[0-9]{3}-[0-9]{4}-[0-9]{4}"></td>
			</tr>
			<tr>
				<td>직업</td>
				<td>
					<select id="job" name="job" size="3">
						<option value="학생">학생</option>
						<option value="컴퓨터/인터넷">컴퓨터/인터넷</option>
						<option value="언론">언론</option>
						<option value="공무원">공무원</option>
						<option value="군인">군인</option>
						<option value="서비스업">서비스업</option>
						<option value="교육">교육</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>메일/SMS 정보 수신</td>
				<td><input type="radio" name="chk_mail" value="yes" checked>수신
					<input type="radio" name="chk_mail" value="no">수신거부</td>
			</tr>
			<tr>
				<td>관심분야</td>
				<td>
					<input type="checkbox" name="item" value="생두">생두
					<input type="checkbox" name="item" value="원두">원두
					<input type="checkbox" name="item" value="로스팅">로스팅
					<input type="checkbox" name="item" value="핸드드립">핸드드립
					<input type="checkbox" name="item" value="에스프레소">에스프레소
					<input type="checkbox" name="item" value="창업">창업
				</td>
			</tr>
		</table>
		<input type="submit" value="전송">
		<input type="reset" value="취소">
	</form>
</body>
</html>