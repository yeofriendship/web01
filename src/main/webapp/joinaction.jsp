<%@page import="dto.Member"%>
<%@page import="config.MyBatisContext"%>
<%@page import="mapper.MemberMapper"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>회원가입처리</title>
	</head>
	<body>
	<%
		// 자바 문법 사용
	%>
	
	<%
		// 여기는 기본적으로 몇 가지 클래스의 객체를 생성해 놓았음
		// HttpServletRequest request;   => 요청
		// HttpServletResponse response; => 응답
		// System 객체 생성되어 있음
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String pw1 = request.getParameter("pw1");
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String phone = request.getParameter("phone");
		String gender = request.getParameter("gender");
		
		// 출력
		// out.println(id);
		// out.print(pw);
		
		// DB에 추가하고 적절한 페이지로 이동시켜야 함
		// DB에 추가(Mapper 이용)
		MemberMapper mapper = MyBatisContext.getSqlSession().getMapper(MemberMapper.class);
		
		Member obj = new Member();
		obj.setUserid(id);
		obj.setUserpw(pw);
		obj.setUsername(name);
		obj.setUserage(Integer.parseInt(age));
		obj.setUserphone(phone);
		obj.setUsergender(gender);
		int ret = mapper.insertMemberOne(obj);
		
		if (ret==1){
			response.sendRedirect("joinok.jsp"); // 404 오류 표시
		}
		else{
			response.sendRedirect("join.jsp"); // 회원가입으로 이동
		}
	%>
	</body>
</html>