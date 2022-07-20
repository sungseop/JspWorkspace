<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="javax.naming.*" %>
<%@ page import="javax.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>DBCP 연결 테스트</h3>
<%
	// JNDI(Java Naming and Directory Interface) 초기화(JNDI를 이용하기 위한 객체 생성)
	Context initContext = new InitialContext(); // tomcat > server에 적었던 구성파일을 실행하기 위해
	// lookup() = 지정된 이름으로 등록된 서비스를 찾을 때 사용
	Context envContext  = (Context)initContext.lookup("java:/comp/env");
	// JDBC 연결 서비스 등록
	DataSource ds = (DataSource)envContext.lookup("jdbc/myoracle");
	Connection conn = ds.getConnection(); // DBCP에 등록된 오라클 연결을 할당받는다.
	
	if (conn != null) {
		out.print("DBCP 연결 성공!!");
	} else {
		out.print("DBCP 연결 실패!!");
	}
%>
</body>
</html>