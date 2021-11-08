package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcPreparedStatementSelectTest {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn = null; // 연결
		Statement stmt = null; // select
		ResultSet rs = null;

		//Dept 저장을 위한 List<Dept>
		List<Dept> list = new ArrayList<Dept>();
		
		try {
//			1.드라이버 로드:프로그램에서 한번만 실행해주면 된다
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
			
			// Sql : select
			String sql = "select *from dept order by deptno";
			// sql 실행
			rs = stmt.executeQuery(sql);
			// 반복을통해 행단위데이터검색
			while (rs.next()) {
				int deptno = rs.getInt("deptno");
				String dname = rs.getString(2);
				String loc = rs.getString("loc");
				//System.out.print(deptno + "\t" + dname + "\t" + loc + "\n");
				Dept dept = new Dept(deptno, dname, loc);
				list.add(dept);
				
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
			if (rs != null) {
				rs.close();
			}
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
		
		System.out.println("부서리스트");
		
		for(Dept dept : list) {
			System.out.println(dept);
		}

	}



}
