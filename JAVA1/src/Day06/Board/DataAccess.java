package Day06.Board;

import java.sql.SQLException;

public class DataAccess extends JDBConnection {
	
	// 데이터 목록 조회
	public Board[] selectList() {
		int max = Main.max;
		Board[] boardList = new Board[max];
		
		//SQL 
		String sql = " SELECT * "
				   + " FROM board ";
		try {
			stmt = con.createStatement(); //쿼리 실행 객체 생성
			rs = stmt.executeQuery(sql);  //쿼리 실행 - 결과 --->rs (ResultSet)
			int i = 0;
			//조회 결과를 배열에 추가
			while(rs.next()) {
				Board board = new Board();
				
				// 결과 데이터 가져오기
				// rs.getXXX("컬럼명") --> 해당 컬럼의 데이터를 가져온다
				board.setBoardNo(rs.getInt("board_no"));
				board.setTitle(rs.getString("title"));
				board.setWriter(rs.getString("writer"));
				board.setContent(rs.getString("content"));
				board.setRegDate(rs.getTimestamp("reg_date"));
				board.setUpdDate(rs.getTimestamp("upd_date"));
				if ( i >= max) break;
				boardList[i++] = board;
			}
			
			
			
		} catch (SQLException e) {
			System.err.println("게시글 목록 조회 시, 에러 발생");
			e.printStackTrace();
		}	
		return boardList;
	}
	
	//데이터 조회
	public Board select(int boardNo) {
		Board board = new Board();
		String sql = "SELECT * "
				   + "FROM board"
				   + " WHERE board_no = ? ";
		
		try {
			psmt = con.prepareStatement(sql);		//쿼리실행 객체 생성
			// psmt.setXXX( 순서번호, 매핑할 값 );
			psmt.setInt(1, boardNo);				//?(1) <--board(글번호)
			rs = psmt.executeQuery();				//쿼리 실행
			
			//조회결과 가져오기
			if( rs.next()) {
				board.setBoardNo(rs.getInt("board_no"));
				board.setTitle(rs.getString("title"));
				board.setWriter(rs.getString("writer"));
				board.setContent(rs.getString("content"));
				board.setRegDate(rs.getTimestamp("reg_date"));
				board.setUpdDate(rs.getTimestamp("upd_date"));
			}
			
			
		} catch (SQLException e) {
			System.err.println("게시글 조회 시, 에러발생");
			e.printStackTrace();
		}
		return board;
	}
	
	
	//데이터 등록
	public int insert(Board board) {
		int result = 0;
		String sql = " INSERT INTO board( title, writer, content ) "
				   + " VALUES( ?, ?, ?) ";
		try {
			psmt = con.prepareStatement(sql);
			psmt.setString(1,  board.getTitle());
			psmt.setString(2,  board.getWriter());
			psmt.setString(3,  board.getContent());
			
			result = psmt.executeUpdate();
			
		} catch (SQLException e) {
			System.err.println("게시글 등록 시, 에러발생");
			e.printStackTrace();
		}
		return result;
	}
	//데이터 수정
	public int update(Board board) {
		int result = 0;
		String sql = " UPDATE board "
				   + " SET title = ? "
				   + " 		,writer =  ? "
				   + " 		,content =  ? "
				   + " 		,upd_date = now() "
				   + " WHERE board_no = ? ";
		// - now(): 현재 날짜/시간을 반환하는 MySQL 함수
		
		try {
			psmt = con.prepareStatement(sql);
			psmt.setString(1,  board.getTitle());
			psmt.setString(2,  board.getWriter());
			psmt.setString(3,  board.getContent());
			psmt.setInt(4,  board.getBoardNo());
			
			result = psmt.executeUpdate();
			
		} catch (SQLException e) {
			System.err.println("게시글 수정 시, 에러발생");
			e.printStackTrace();
		}
		return result;
	}
	
	//데이터삭제
	public int delete(int boardNo) {
		int result = 0;
		String sql = " DELETE FROM board "
				   + " WHERE board_no = ? ";
		try {
			psmt = con.prepareStatement(sql);
			psmt.setInt(1,  boardNo);
			
			result = psmt.executeUpdate();
		} catch (SQLException e) {
			System.err.println("게시글 삭제 시, 에러발생");
			e.printStackTrace();
		}
		return result;
	}
}
