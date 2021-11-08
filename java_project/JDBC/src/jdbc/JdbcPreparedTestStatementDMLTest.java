package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcPreparedTestStatementDMLTest {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn = null; // 연결
		Statement stmt = null; // select

		//Dept 저장을 위한 List<Dept>
		List<Dept> list = new ArrayList<Dept>();
		
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
			// 3.// 3. 작업 : crud - > Statement 객체 생성

			stmt = conn.createStatement();
			// Sql : insert
			String sql = "insert into dept(deptno, dname, loc) values(50, 'test', 'SEOUL')";
			
			int cnt= stmt.executeUpdate(sql);//실행횟수래 인트로하니깐 그런가바~
			if(cnt>0) {
				System.out.println("입력되었습니다.");
				
			}else {
				System.out.println("입력실패!");
				
			}

//			4. 종료 : close()

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("데이터베이스에연결할수없습니다");
			e.printStackTrace();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("드라이버클래스를찾을수없습니다");
		} finally {
			
			if (stmt != null) {
				stmt.close();
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
