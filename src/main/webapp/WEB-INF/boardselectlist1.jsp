<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!-- jstl 사용 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="ko">
	<head>
		<meta charset="UTF-8">
		<title>게시판 목록</title>
	</head>

	<body>
		<a href="insertone.do">글쓰기로 이동</a>
		<hr />
		<c:forEach var="obj" items="${list}">
			${obj.no}, <a href="selectone.do?no=${obj.no}">${obj.title}</a>, ${obj.writer}, ${obj.hit}, ${obj.regdate} <br />
		</c:forEach>
		<hr />
		<c:forEach var="i" begin="1" end="${pages}">
			<a href="selectlist.do?page=${i}">${i}</a>
		</c:forEach>
	</body>
</html>