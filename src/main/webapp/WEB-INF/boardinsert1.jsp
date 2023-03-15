<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- jstl 사용 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="ko">
	<head>
		<meta charset="UTF-8">
		<title>${title}</title>
	</head>

	<body>
		<h3>${title}</h3>
		<form action="insertone.do" method="post">
			제목 : <input type="text" name="title" placeholder="제목입력" /><br/>
			내용 :<textarea rows="6" name="content" placeholder="내용입력"></textarea><br/>
			작성자 : <input type="text" name="writer" placeholder="작성자입력" /><br/>
			<input type="submit" value="글쓰기" />
		</form>
	</body>
</html>