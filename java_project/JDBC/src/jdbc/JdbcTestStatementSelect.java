package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcTestStatementSelect {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn = null; // 연결
		PreparedStatement pstmt = null;

		try {
//			1.드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
//			2. 연결 : Connection
			// String jdbcUrl1 = "jdbc:oracle:thin:@[주소]:[포트]:[데이터베이스]";
			String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String pw = "tiger";

			conn = DriverManager.getConnection(jdbcUrl, user, pw);
			System.out.println("데이터 베이스 연결 성공");
			// 3.// 3. 작업 : crud - > PreparedStatement 객체 생성
			String sql = "insert into dept values(?, ?, ?)";

			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, 60);
			pstmt.setString(2, "DEV");
			pstmt.setString(3, "PUSAN");

			// DML 실행
			int resultCnt = pstmt.executeUpdate();// 이미 sql등록했으니까 exe안에 sql안넣음

			if (resultCnt > 0) {
				System.out.println("입력되었습니다");
			} else {
				System.out.println("입력실패");
			}

			// 4. 종료 : close()

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("데이터베이스에연결할수없습니다");
			e.printStackTrace();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("드라이버클래스를찾을수없습니다");
		} finally {
			if (pstmt != null) {
				pstmt.close();
			}

			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

//			
		}

	}

}
