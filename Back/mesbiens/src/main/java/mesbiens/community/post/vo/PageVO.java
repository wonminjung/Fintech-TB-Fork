package mesbiens.community.post.vo;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class PageVO {
	private int startrow; // 시작 행
    private int endrow; // 끝 행
    private int page; // 현재 페이지
    private int maxpage; // 총 페이지 수
    private long totalCount; // 총 레코드 수
    private List<PostVO> guestBookList; // 페이징된 방명록 목록

}