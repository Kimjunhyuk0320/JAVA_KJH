package Day07.Ex05_BoardInterface;

import java.util.Date;

public class Text {

	private int no;
	private String title;
	private String writer;
	private String content;
	private Date regDate;
	private Date updDate;
	
	public Text() {
		this("제목없음", "글쓴이없음", "내용없음");
	}
	
	public Text(String writer, String content) {
		this.writer = writer;
		this.content = content;
		this.regDate = new Date();
		this.updDate = new Date();
	}

	public Text(String title, String writer, String content) {
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.regDate = new Date();
		this.updDate = new Date();
	}

	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
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
	@Override
	public String toString() {
		return "Text [no=" + no + ", title=" + title + ", writer=" + writer + ", content=" + content + ", regDate="
				+ regDate + ", updDate=" + updDate + "]";
	}
	
	
	
}
