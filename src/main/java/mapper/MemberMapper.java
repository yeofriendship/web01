package mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import dto.Member;

@Mapper
public interface MemberMapper {
	// 회원가입
	@Insert({" INSERT INTO member(userid, userpw, username, userage, usergender, userphone, userdate) ",
			 " VALUES(#{obj.userid}, #{obj.userpw}, #{obj.username}, #{obj.userage}, #{obj.usergender}, #{obj.userphone}, CURRENT_DATE) "})
	public int insertMemberOne(@Param("obj") Member obj);
}
