package Day06.Board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBConnection {
	
		public Connection con;
		public Statement stmt;
		public PreparedStatement psmt;
		public ResultSet rs;
	
		//기본생성자
		public JDBConnection() {
			// JDBC 드라이버 로드
			//MySQL
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				// DB에 연결
				String url = "jdbc:mysql://localhost:3306/joeun?serverTimezone=Asia/Seoul&allowPublicKeyRetrieval=true&useSSL=false";
				String id = "joeun";
				String pw = "123456";
				
				con = DriverManager.getConnection(url, id, pw);
				
				System.out.println("DB연결 성공");
				
			}catch (Exception e) {
				System.err.println("DB연결 실패");
				e.printStackTrace();
			}
		}
	
//	public static void main(String[] args) {
//		JDBConnection jdbc = new JDBConnection();
//	}
	
}
