<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- jstl 사용 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>게시글 조회</title>
	</head>
	
	<body>
		<h3>게시글 조회</h3>
		<hr />
			글 번호 : ${brd.no} <br />
			제목 : ${brd.title} <br />
			내용 : ${brd.content} <br />
			작성자 : ${brd.writer} <br />
			조회수 : ${brd.hit} <br />
			작성일 : ${brd.regdate} <br />
		<hr />
		<a href="selectlist.do"><input type="button" value="목록" /></a>
		<input type="button" value="수정" />
		
		<form action="deleteone.do" method="post" style="display:inline-block;">
			<input type="text" name="no" value="${brd.no}">
			<input type="submit" value="삭제" />
		</form>
		
		<a href="selectone.do?no=${brd.no}"><input type="button" value="이전글" /></a>
		
		<form action="selectnextone.do" method="post" style="display:inline-block;">
			<a href="selectone.do?no=${brd.no}">
				<input type="button" value="다음글" />
			</a>
		</form>
	</body>
</html>