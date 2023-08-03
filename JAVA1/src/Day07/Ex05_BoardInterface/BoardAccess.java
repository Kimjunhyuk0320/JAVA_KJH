package Day07.Ex05_BoardInterface;

import java.sql.SQLException;

public class BoardAccess extends JDBConnection implements DataService {
	
	// 데이터 목록 조회
	public Text[] selectList() {
		
		int max = Main.max;
		Board[] boardList = new Board[max];
		
		// SQL
		String sql = " SELECT * "
				   + " FROM board ";
		
		try {
			stmt = con.createStatement();		// 쿼리 실행 객체 생성
			rs = stmt.executeQuery(sql);		// 쿼리 실행 - 결과-->rs (ResultSet)
			
			int i = 0;
			// 조회 결과를 배열에 추가
			while( rs.next() ) {
				Board board = new Board();
				
				// 결과 데이터 가져오기
				// rs.getXXX("컬럼명") --> 해당 컬럼의 데이터를 가져온다
				board.setBoardNo( rs.getInt("board_no") );
				board.setTitle( rs.getString("title") );
				board.setWriter( rs.getString("writer") );
				board.setContent( rs.getString("content") );
				board.setRegDate( rs.getTimestamp("reg_date") );
				board.setUpdDate( rs.getTimestamp("upd_date") );
				
				if( i >= max ) break;
				boardList[i++] = board;
			}
			
		} catch (SQLException e) {
			System.err.println("게시글 목록 조회 시, 에러 발생");
			e.printStackTrace();
		}		
		return boardList;
	}
	
	// 데이터 조회
	public Text select(int no) {
		Board board = new Board();
		String sql = " SELECT * "
				   + " FROM board "
				   + " WHERE board_no = ? ";
		
		try {
			psmt = con.prepareStatement(sql);		// 쿼리 실행 객체 생성
			// psmt.setXXX( 순서번호, 매핑할 값 );
			psmt.setInt(1, no);				// ?(1) <-- boardNo(글번호)
			rs = psmt.executeQuery();				// 쿼리 실행

			// 조회 결과 가져오기
			if( rs.next() ) {
				board.setBoardNo( rs.getInt("board_no") );
				board.setTitle( rs.getString("title") );
				board.setWriter( rs.getString("writer") );
				board.setContent( rs.getString("content") );
				board.setRegDate( rs.getTimestamp("reg_date") );
				board.setUpdDate( rs.getTimestamp("upd_date") );
			}
			
		} catch (SQLException e) {
			System.err.println("게시글 조회 시, 에러 발생");
			e.printStackTrace();
		}
		return board;
	}
	
	// 데이터 등록
	public int insert(Text text) {
		int result = 0;
		
		String sql = " INSERT INTO board( title, writer, content ) "
				   + " VALUES( ?, ?, ? ) ";
	
		try {
			psmt = con.prepareStatement(sql);			// 쿼리 실행 객체 생성
			psmt.setString(1, text.getTitle());		// 1번 ? 에 제목을 매핑
			psmt.setString(2, text.getWriter());		// 2번 ? 에 작성자을 매핑
			psmt.setString(3, text.getContent());		// 3번 ? 에 내용을 매핑
			
			result = psmt.executeUpdate();				// SQL 실행 요청, 적용된 데이터 개수를 받아옴
														// 게시글 1개 쓰기 성공 시, result : 1
														// 				실패 시, result : 0
		} catch (SQLException e) {
			System.err.println("게시글 등록 시, 에러 발생");
			e.printStackTrace();
		}		
		return result;
	}
	
	// 데이터 수정
	public int update(Text text) {
		
		int result = 0;
		
		String sql = " UPDATE board "
				   + "   SET title = ? "
				   + "   	,writer = ? "
				   + "   	,content = ? "
				   + "   	,upd_date = now() "
				   + " WHERE board_no = ? "
				   ;
		// - now() : 현재 날짜/시간을 반환하는 MySQL 함수

		try {
			psmt = con.prepareStatement(sql);
			psmt.setString(1, text.getTitle());		// 1번 ? 에 제목을 매핑
			psmt.setString(2, text.getWriter());		// 2번 ? 에 작성자을 매핑
			psmt.setString(3, text.getContent());		// 3번 ? 에 내용을 매핑
			psmt.setInt(4, text.getNo());			// 4번 ? 에 게시글 번호를 매핑
			
			result = psmt.executeUpdate();				// SQL 실행 요청, 적용된 데이터 개수를 받아옴
														// 게시글 1개 수정 성공 시, result : 1
														// 				실패 시, result : 0
		} catch (SQLException e) {
			System.err.println("게시글 수정 시, 에러 발생");
			e.printStackTrace();
		}
		return result;
	}

	// 데이터 삭제
	public int delete(int no) {
		int result = 0;
		
		String sql = " DELETE FROM board "
				   + " WHERE board_no = ? ";
		
		try {
			psmt = con.prepareStatement(sql);	// 쿼리 실행 객체 생성
			psmt.setInt(1, no);			// 1번 ? 에 글번호를 매핑
			
			result = psmt.executeUpdate();		// SQL 실행 요청
		} catch (SQLException e) {
			System.err.println("게시글 삭제 시, 에러 발생");
			e.printStackTrace();
		}  		
		return result;
	}

	@Override
	public Text[] selectList(int boardNo) {
		
		return null;
	}
	
}

















