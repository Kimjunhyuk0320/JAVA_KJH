package Day07.Ex05_BoardInterface;

import java.sql.SQLException;

public class CommentAccess extends JDBConnection implements DataService {
// 데이터 목록 조회
	public Text[] selectList() {
		
		int max = Main.max;
		Comment[] commentList = new Comment[max];
		
		// SQL
		String sql = " SELECT * "
				   + " FROM comment ";
		
		try {
			stmt = con.createStatement();		// 쿼리 실행 객체 생성
			rs = stmt.executeQuery(sql);		// 쿼리 실행 - 결과-->rs (ResultSet)
			
			int i = 0;
			// 조회 결과를 배열에 추가
			while( rs.next() ) {
				Comment comment = new Comment();
				
				// 결과 데이터 가져오기
				// rs.getXXX("컬럼명") --> 해당 컬럼의 데이터를 가져온다
				comment.setCommentNo( rs.getInt("comment_no") );
				comment.setBoardNo( rs.getInt("board_no") );
				comment.setWriter( rs.getString("writer") );
				comment.setContent( rs.getString("content") );
				comment.setRegDate( rs.getTimestamp("reg_date") );
				comment.setUpdDate( rs.getTimestamp("upd_date") );
				
				if( i >= max ) break;
				commentList[i++] = comment;
			}
			
		} catch (SQLException e) {
			System.err.println("댓글 목록 조회 시, 에러 발생");
			e.printStackTrace();
		}		
		return commentList;
	}
	
	// 특정 글에 해당하는 댓글 데이터 목록 조회
	public Text[] selectList(int boardNo) {
			
			int max = Main.max;
			Comment[] commentList = new Comment[max];
			
			// SQL
			String sql = " SELECT * "
					   + " FROM comment "
					   + " WHERE board_no = ? ";
			
			try {
				psmt = con.prepareStatement(sql);		// 쿼리 실행 객체 생성
				psmt.setInt(1, boardNo);		// 쿼리 실행 객체 생성
				rs = psmt.executeQuery();		// 쿼리 실행 - 결과-->rs (ResultSet)
				
				int i = 0;
				// 조회 결과를 배열에 추가
				while( rs.next() ) {
					Comment comment = new Comment();
					
					// 결과 데이터 가져오기
					// rs.getXXX("컬럼명") --> 해당 컬럼의 데이터를 가져온다
					comment.setCommentNo( rs.getInt("comment_no") );
					comment.setBoardNo( rs.getInt("board_no") );
					comment.setWriter( rs.getString("writer") );
					comment.setContent( rs.getString("content") );
					comment.setRegDate( rs.getTimestamp("reg_date") );
					comment.setUpdDate( rs.getTimestamp("upd_date") );
					
					if( i >= max ) break;
					commentList[i++] = comment;
				}
				
			} catch (SQLException e) {
				System.err.println("댓글 목록 조회 시, 에러 발생");
				e.printStackTrace();
			}		
			return commentList;
		}
	// 데이터 조회
	public Text select(int no) {
		Comment comment = new Comment();
		String sql = " SELECT * "
				   + " FROM comment "
				   + " WHERE comment_no = ? ";
		
		try {
			psmt = con.prepareStatement(sql);		// 쿼리 실행 객체 생성
			// psmt.setXXX( 순서번호, 매핑할 값 );
			psmt.setInt(1, no);				// ?(1) <-- boardNo(글번호)
			rs = psmt.executeQuery();				// 쿼리 실행

			// 조회 결과 가져오기
			if( rs.next() ) {
				comment.setCommentNo( rs.getInt("comment_no") );
				comment.setBoardNo( rs.getInt("board_no") );
				comment.setWriter( rs.getString("writer") );
				comment.setContent( rs.getString("content") );
				comment.setRegDate( rs.getTimestamp("reg_date") );
				comment.setUpdDate( rs.getTimestamp("upd_date") );
			}
			
		} catch (SQLException e) {
			System.err.println("댓글 조회 시, 에러 발생");
			e.printStackTrace();
		}
		return comment;
	}
	
	// 데이터 등록
	public int insert(Text text) {
		int result = 0;
		
		String sql = " INSERT INTO comment( board_no, writer, content ) "
				   + " VALUES( ?, ?, ? ) ";
	
		try {
			psmt = con.prepareStatement(sql);			// 쿼리 실행 객체 생성
			psmt.setInt(1, text.getNo());		// 1번 ? 에 댓글 번호를 매핑
			psmt.setString(2, text.getWriter());		// 2번 ? 에 작성자을 매핑
			psmt.setString(3, text.getContent());		// 3번 ? 에 내용을 매핑
			
			result = psmt.executeUpdate();				// SQL 실행 요청, 적용된 데이터 개수를 받아옴
														// 댓글 1개 쓰기 성공 시, result : 1
														// 				실패 시, result : 0
		} catch (SQLException e) {
			System.err.println("댓글 등록 시, 에러 발생");
			e.printStackTrace();
		}		
		return result;
	}
	
	// 데이터 수정
	public int update(Text text) {
		
		int result = 0;
		
		String sql = " UPDATE comment "
				   + "   SET writer = ? "
				   + "   	,content = ? "
				   + "   	,upd_date = now() "
				   + " WHERE comment_no = ? "
				   ;
		// - now() : 현재 날짜/시간을 반환하는 MySQL 함수

		try {
			psmt = con.prepareStatement(sql);
			psmt.setString(1, text.getWriter());		// 1번 ? 에 작성자을 매핑
			psmt.setString(2, text.getContent());		// 2번 ? 에 내용을 매핑
			psmt.setInt(3, text.getNo());				// 3번 ? 에 댓글 번호를 매핑
			
			result = psmt.executeUpdate();				// SQL 실행 요청, 적용된 데이터 개수를 받아옴
														// 댓글 1개 수정 성공 시, result : 1
														// 				실패 시, result : 0
		} catch (SQLException e) {
			System.err.println("댓글 수정 시, 에러 발생");
			e.printStackTrace();
		}
		return result;
	}

	// 데이터 삭제
	public int delete(int no) {
		int result = 0;
		
		String sql = " DELETE FROM comment "
				   + " WHERE comment_no = ? ";
		
		try {
			psmt = con.prepareStatement(sql);	// 쿼리 실행 객체 생성
			psmt.setInt(1, no);					// 1번 ? 에 글번호를 매핑
			
			result = psmt.executeUpdate();		// SQL 실행 요청
		} catch (SQLException e) {
			System.err.println("댓글 삭제 시, 에러 발생");
			e.printStackTrace();
		}  		
		return result;
	}
}
