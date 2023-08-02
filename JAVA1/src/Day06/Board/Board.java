package Day06.Board;

import java.util.Date;

public class Board {
	private int boardNo;
	private String title;
	private String writer;
	private String content;
	//Date :날짜 / 시간을 다루는 클래스
	private Date regDate;
	private Date updDate;
	//생성자
	public Board() {
		this("제목없음", "글쓴이 없음", "내용없음");
	}
	
	//기본 생성자
	public Board(String title, String writer, String content) {
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.regDate = new Date();
		this.updDate = new Date();
	}

	//getter, setter
	public int getBoardNo() {
		return boardNo;
	}
	
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getWriter() {
		return writer;
	}
	
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public Date getRegDate() {
		return regDate;
	}
	
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
	public Date getUpdDate() {
		return updDate;
	}
	
	public void setUpdDate(Date updDate) {
		this.updDate = updDate;
	}

	//toString
	@Override
	public String toString() {
		return "(" + boardNo + ") 제목 : " + title + ", 작성자 : " + writer + ", 내용 : " + content
				+ ", 작성일자 : " + regDate + ", 수정일자 : " + updDate + "]";
		
	}
	
	
	
}
