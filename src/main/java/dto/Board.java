package dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter

// regdate는 출력을 하지 않겠다고 설정한거임 (@Data를 쓰면 냅다 전체적으로 다 나와버리니깐 출력하지 않겠다고 설정할 경우 하나하나 써줘야 함)
// 왜 regdate는 출력하지 않나면? 너무 길어서 그럼 그래서 exclude={""}안에 내가 출력하고 싶지 않은 걸 넣어주면 출력이 안됨!
@ToString(exclude = {"regdate"})

@NoArgsConstructor
@AllArgsConstructor
public class Board {
	private long no;
	private String title;
	private String content;
	private String writer;
	private long hit;
	private Date regdate;
}
