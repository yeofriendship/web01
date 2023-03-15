package controller;

import java.io.IOException;

import config.MyBatisContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mapper.BoardMapper;

@WebServlet(urlPatterns = {"/board/deleteone.do"})
public class BoardDeleteOneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public BoardDeleteOneServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BoardMapper mapper
			=MyBatisContext.getSqlSession().getMapper(BoardMapper.class);
	
		long no = Long.parseLong(request.getParameter("no"));

		int ret = mapper.deleteBoardOne(no);
		
		if (ret==1) {
			response.sendRedirect("selectlist.do");
		}
		else {
			response.sendRedirect("selectone.do");
		}
	}

}
