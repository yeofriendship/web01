<%@page import="dto.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- jstl 사용 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<input type="text" value="${name}" />
	${name}
	${age}
	
	${mem.userid}
	${mem.userpw}
	
	<hr />
	
	<%
		// java 문법을 사용할 수 있음. request, response 등 미리 객체가 생성되어 있음
		String name = (String)request.getAttribute("name");
		int age = (int)request.getAttribute("age");
		Member obj = (Member)request.getAttribute("mem");
		
		out.println(name);
		out.println(age);
		out.println(obj.getUserid());
		out.println(obj.getUserpw());
	%>
</body>
</html>