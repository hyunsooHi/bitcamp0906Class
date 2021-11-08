package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null; // 연결
		Statement stmt = null; // select
		ResultSet rs = null;


		try {
//			1.드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
//			2. 연결 : Connection
			//String jdbcUrl1 = "jdbc:oracle:thin:@[주소]:[포트]:[데이터베이스]";
			String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String pw = "tiger";
			
			conn = DriverManager.getConnection(jdbcUrl, user, pw);
			System.out.println("데이터 베이스 연결 성공");
				//3.
				
		}catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("데이터베이스에연결할수없습니다");
				e.printStackTrace();
			
			
//			3. 작업 : crud
//			4. 종료 : close()
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("드라이버클래스를찾을수없습니다");
		} finally {
//			re.close();
//			stmt.close();
			if(conn != null) {
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
