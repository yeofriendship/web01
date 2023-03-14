<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>회원가입</title>
	</head>
	
	<body>
		<div>
			<h3>회원가입</h3>
			<!-- action="" : 해당 주소로 변경 -->
			<!-- method="post" : 이동할 정보를 안보이게 전송 / "get" : 보이게 전송(주소창) -->
			<form action="joinaction.jsp" method="post">
				<!-- <br /> : 줄바꿈 -->
				<!-- <input></input> => 사이에 넣을 것이 없으면 <input />으로 한번에 써도 OK -->
				아이디 : <input type="text" name="id" value="11" /> <br />
				암호 : <input type="text" name="pw" value="11" /> <br />
				암호확인 : <input type="text" name="pw1" value="11" /> <br />
				이름 : <input type="text" name="name" value="11" /> <br />
				나이 : <input type="number" name="age" value="11" /> <br />
				연락처 : <input type="text" name="phone" value="11" /> <br />
				성별 : <input type="text" name="gender" value="M" /> <br />
				<input type="submit" value="회원가입" />
			</form>
		</div>
	</body>
</html>