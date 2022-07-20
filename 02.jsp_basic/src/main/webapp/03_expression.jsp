<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 선언문</title>
</head>
<body>
	<!-- HTML의 주석 -->
	<%-- JSP의 선언문 --%>
	<%!
		String str = "안녕하세요!";
		int a = 5, b = -5;
		
		// 절대값을 반환하는 메소드
		public int abs(int n) {
			if (n < 0) {
				n = -n;
			}
			
			return n;
		}
	%>
	<%-- 표현식을 이용한 값 출력 --%>
	<%= str %><br>
	<%= a %>의 절대값 = <%= abs(a) %><br>
	<%= b %>의 절대값 = <%= abs(b) %><br>
	<%
		out.print(str + "<br>");
		out.print(a + "의 절대값 = " + abs(a) + "<br>");
		out.print(b + "의 절대값 = " + abs(b) + "<br>");
	%>
</body>
</html>