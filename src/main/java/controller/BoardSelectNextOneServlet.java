package controller;

import java.io.IOException;

import config.MyBatisContext;
import dto.Board;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mapper.BoardMapper;

@WebServlet(urlPatterns = {"/board/selectnextone.do"})
public class BoardSelectNextOneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public BoardSelectNextOneServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BoardMapper mapper
			=MyBatisContext.getSqlSession().getMapper(BoardMapper.class);
	
		long no = Long.parseLong(request.getParameter("no"));
	
		mapper.selectBoardNextOne(no);
		
//		request.setAttribute("brd", );
		
		request.getRequestDispatcher("/WEB-INF/boardselectone1.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
	}

}
