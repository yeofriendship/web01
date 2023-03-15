package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import dto.Board;

@Mapper
public interface BoardMapper {
	// 게시글 작성
	@Insert({" INSERT INTO board(title, content, writer) ",
			 " VALUES(#{obj.title}, #{obj.content}, #{obj.writer}) "})
	public int insertBoardOne(@Param("obj") Board obj);
	
	// 게시글 나눠서 조회
	@Select({" SELECT * ",
			 " FROM (SELECT b.*, ROW_NUMBER() OVER (ORDER BY b.no DESC) rown FROM board b) ",
			 " WHERE rown BETWEEN #{start} AND #{end} ",
			 " ORDER BY no DESC "})
	public List<Board> selectBoardList(@Param("start") int start, @Param("end") int end);
	
	// 게시글 총 개수
	@Select({" SELECT COUNT(*) FROM board "})
	public long countBoardList();
	
	// 게시글 1개 조회
	@Select({" SELECT * FROM board WHERE no = #{no} "})
	public Board selectBoardOne(@Param("no") long no);
	
	// 게시글 1개 삭제
	@Delete({" DELETE FROM board WHERE no = #{no} "})
	public int deleteBoardOne(@Param("no") long no);
	
	// 다음 게시글 조회
	@Select({" SELECT NVL(MIN(no), 0) FROM board WHERE no > #{no} "})
	public long selectBoardNextOne(@Param("no") long no);
}
