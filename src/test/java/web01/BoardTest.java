package web01;

import org.junit.jupiter.api.Test;

import config.MyBatisContext;
import dto.Board;
import mapper.BoardMapper;

class BoardTest {
	BoardMapper mapper 
		= MyBatisContext.getSqlSession().getMapper(BoardMapper.class);

	@Test
	void insertBoardOne() {
		Board b = new Board();
		b.setTitle("제목");
		b.setContent("내용");
		b.setWriter("작성자");
		
		System.out.println(mapper.insertBoardOne(b));
	}

}
