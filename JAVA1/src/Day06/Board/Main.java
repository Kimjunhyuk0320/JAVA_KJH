package Day06.Board;

import java.util.Date;
import java.util.Scanner;

/*
 * 게시판 프로그램
 * 메뉴판
 * 게시글 목록
 * 게시글 읽기
 * 게시글 쓰기
 * 게시글 수정
 * 게시글 삭제
 */
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int max = 10;		//게시글 최대 개수
	static Board[] boardList = new Board[max];
	static DataAccess data = new DataAccess(); //데이터 베이스 접근 객체
	static int manuNo = 0;
	//메뉴판
	public static void menu() {
		System.out.println("############# 게시판 ##############");
		System.out.println("1. 게시글 목록");
		System.out.println("2. 게시글 읽기");
		System.out.println("3. 게시글 쓰기");
		System.out.println("4. 게시글 수정");
		System.out.println("5. 게시글 삭제");
		System.out.println("0. 프로그램 종료");
		System.out.print("######################## 번호입력 : ");
	}
	
	//게시글 목록
	public static void list() {
		System.out.println("############# 게시글 목록 ##############");
		boardList = data.selectList();
		for (Board board : boardList) {
			if(board == null) {
				System.out.println("게시글 없음");
				continue;
			}
			System.out.println(board);
		}
	}
	//게시글 읽기
	public static void read() {
		System.out.println("########### 게시글 읽기 ############");
		// Board board = 게시글읽기요청(boardNo);
		System.out.print("글 번호 : ");
		int boardNo = sc.nextInt();
		Board board = data.select(boardNo);
		String title = board.getTitle();
		String writer = board.getWriter();
		String content = board.getContent();
		Date regDate = board.getRegDate();
		Date updDate = board.getUpdDate();
		System.out.println("# 번호 : " + boardNo + " #######################");
		System.out.println("# 제목 : " + title);
		System.out.println("# 작성자 : " + writer);
		System.out.println("# 내용 : " + content);
		System.out.println("# 등록일자 : " + regDate);
		System.out.println("# 수정일자 : " + updDate);
		System.out.println("#################################");
	}
	
	//게시글 쓰기
	public static void write() {
		System.out.println("######## 게시글 쓰기 ########");
		
		Board board = input();
		int result = data.insert( board );
		if (result > 0) {
			System.out.println(" 게시글이 작성되었습니다");
		}
	}
	//게시글 수정
	public static void update() {
		System.out.println("######## 게시글 수정 ########");
		System.out.print("글 번호 : ");
		int boardNo = sc.nextInt();
		sc.nextLine();
		
		Board board = input();
		board.setBoardNo(boardNo);
		int result = data.update( board );
		if (result > 0) {
			System.out.println(" 게시글이 수정되었습니다");
		}
		
		
		
	}
	
	
	//게시글 삭제
	public static void delete() {
		System.out.println("######## 게시글 삭제 ########");
		System.out.print("글 번호 : ");
		int boardNo = sc.nextInt();
		sc.nextLine();
		
		int result = data.delete( boardNo );
		if (result > 0) {
			System.out.println(" 게시글이 삭제되었습니다");
		}
	}
	//게시글 정보 입력받는 메소드
	public static Board input() {
		System.out.print("제목 : ");
		String title = sc.nextLine();
		
		System.out.print("작성자 : ");
		String writer = sc.nextLine();
		
		System.out.print("내용 : ");
		String content = sc.nextLine();
		
		Board board = new Board(title, writer, content);
		return board;
	}
	//게시판 프로그램 시작
	public static void main(String[] args) {
		int menuNo = 0;		//메뉴번호
		do {
			menu();		//메뉴판 출력
			menuNo = sc.nextInt();	//메뉴번호 입력
			sc.nextLine();   		//엔터를 입력버퍼에서 제거
			
			//프로그램 종료
			if( menuNo == 0 ) break;
			
			//메뉴선택
			switch (menuNo) {
			case 1:		list();		//게시글 목록
						break;
						
			case 2:		read();		//게시글 읽기
						break;
			
			case 3:		write();	//게시글 쓰기
						break;
			
			case 4:		update();		//게시글 수정
						break;

			case 5:		delete();		//게시글 삭제
						break;

			default:	System.out.println("(0~5)사이의 숫자를 입력해주세요.");
						break;
			
			
			
			}
			
			
			
		} while (menuNo != 0 );
		
		System.out.println("프로그램을 종료합니다....");
	}
	
	
	
	
	
	

}
