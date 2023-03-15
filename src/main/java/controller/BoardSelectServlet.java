package controller;

import java.io.IOException;
import java.util.List;

import config.MyBatisContext;
import dto.Board;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mapper.BoardMapper;

@WebServlet(urlPatterns = "/board/selectlist.do")
public class BoardSelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public BoardSelectServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BoardMapper mapper
			= MyBatisContext.getSqlSession().getMapper(BoardMapper.class);
		
		int page = 1;
		if (request.getParameter("page") != null) {
			// get에는 ?page=1일 경우 1의 값을 읽는 방법
			page = Integer.parseInt(request.getParameter("page"));	
		}
		
		// 1. Mapper를 통해서 결과값 가져오기
		List<Board> list = mapper.selectBoardList(10*page-9, 10*page); // page=1 => 1~10, page=2 => 11~20, page=3 => 21~30
		long total = mapper.countBoardList(); // 글 개수 36 => 총 페이지 4, 글 개수 30 => 총 페이지 3
		
		// 2. View로 값 전달
		request.setAttribute("list", list);
		request.setAttribute("pages", ((total-1)/10) + 1);
		
		// 3. View 표시
		request.getRequestDispatcher("/WEB-INF/boardselectlist1.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
