<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	int n1 = Integer.parseInt(request.getParameter("num1"));
	int n2 = Integer.parseInt(request.getParameter("num2"));
	
	request.setAttribute("number1", n1); // 내장 객체에 자바변수의 값을 속성으로 저장
	request.setAttribute("number2", n2); 
%>
<h3>고전적인 방식(자바 코드)</h3>
<%= n1 %> + <%= n2 %> = <%= n1+n2 %><br>
<h3>표현언어 방식</h3>
${param.num1} + ${param.num2} = ${param.num1 + param.num2}<br>
<h3>표현언어 내의 구분자는 자바변수가 아닌 속성명을 지정해야 함</h3>
${number1} + ${number2} = ${number1+number2}
	
</body>
</html>