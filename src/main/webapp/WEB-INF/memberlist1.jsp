<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!-- jstl 사용 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>회원목록</title>
</head>

<body>
	<!-- p.388 -->
	<!-- c:forEach var="변수명" items="컬렉션 혹은 배열" -->
	<c:forEach var="obj" items="${list}">
		${obj.userid}, ${obj.username} <br />
	</c:forEach>	
</body>
</html>