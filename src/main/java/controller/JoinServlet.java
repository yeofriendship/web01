package controller;

import java.io.IOException;

import dto.Member;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// 1. 상속(extends)
// 서버 재구동 127.0.0.1:8080/web01/join1.jsp 입력
// @WebServlet("/join1.jsp")
@WebServlet("/join1.do")
public class JoinServlet extends HttpServlet {

	// 2. 오버라이드
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 3. View로 필요한 정보를 전달
		req.setAttribute("name", "aaa");
		req.setAttribute("age", 13);
		// 객체 생성 후 전달
		Member obj = new Member();
		obj.setUserid("id01");
		obj.setUserpw("pw01");
		req.setAttribute("mem", obj);

		// 4. View를 화면에 표시
		req.getRequestDispatcher("/WEB-INF/join1.jsp").forward(req, resp);
		// req.getRequestDispatcher("/WEB-INF/join2.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
	
}
