<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.Date" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% 
		//java 코드 작성
		
		//java.util.Date now1 = new java.util.Date(); 
		//java.time.LocalDateTime  now2 = new java.time.LocalDateTime.now();
		Date now1 = new Date();
		
	%>
	 <%= now1 %> 

	<h1>처음 작성한 파일</h1>
</body>
</html>