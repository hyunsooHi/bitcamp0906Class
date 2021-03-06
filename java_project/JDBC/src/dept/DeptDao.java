package dept;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

// Data Access Object : Sql 처리만하는 클래스
public class DeptDao {

	// 전체 리스트를 구하는 메소드 : select -> 매개변수로 Connect을 전달받고, List<Dept>
	public List<Dept> selectAllList(Connection conn) {

		Statement stmt = null;
		ResultSet rs = null;
		List<Dept> result = new ArrayList<Dept>();

		try {
			// 결과 생성
			stmt = conn.createStatement();

			String sql = "select * from dept";
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				result.add(new Dept(rs.getInt(1), rs.getString(2), rs.getString(3)));

			}

		} catch (SQLException e) {
			System.out.println("예외");
			e.printStackTrace();
		} finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(stmt);

		}

		return result;

	}

	// 부서 정보를 검색하는 메소드 : select -> 매개변수로 Connect을 전달받고, Dept

	public Dept selectByDeptno(Connection conn, int deptno) {

		PreparedStatement pstmt = null;
		ResultSet rs = null;

		// 검색 결과 : 부서정보
		Dept dept = null;

		// sql : select에대한
		String sql = "select * from dept where deptno=?";
		// 결과 -> 1 또는 0행

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, deptno);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				dept = new Dept(rs.getInt(1), rs.getString(2), rs.getString(3));

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);

		}
		return dept;

	}

	// 부서 정보를 입력하는 메소드 : insert -> Dept 객체를 전달받아서 입력
	public int insertDept(Connection conn, Dept dept) {

		PreparedStatement pstmt = null;

		int resultCnt = 0;

		// sql : insert
		String sql = "insert into dept values (?,?,?)";

		try {
			pstmt = conn.prepareStatement(sql);

			// sql 파라미터 설정
			pstmt.setInt(1, dept.getDeptno());
			pstmt.setString(1, dept.getDname());
			pstmt.setString(1, dept.getLoc());

			resultCnt = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JdbcUtil.close(pstmt);
			
		}

		return resultCnt;

	}

	// 부서 정보를 수정하는 메소드 : update ->Connection 전달받고 Dept 객체를 전달받아서 수정
	public int editDept(Connection conn, Dept dept) {

		PreparedStatement pstmt = null;

		int resultCnt = 0;

		// sql : update
		String sql = "update dept set dname=?, loc=? where deptno=?";

		try {
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, dept.getDname());
			pstmt.setString(2, dept.getLoc());
			pstmt.setInt(3, dept.getDeptno());

			resultCnt = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JdbcUtil.close(pstmt);

		}

		return resultCnt;

	}

	// 부서 정보를 삭제하는 메소드 : delete ->Connection 전달받고 부서번호(PK)를 전달받아서 삭제

	public int deleteDept(Connection conn, int deptno) {

		PreparedStatement pstmt = null;
		int resultCnt = 0;

		// sql : delete
		String sql = "delete from dept where deptno=?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, deptno);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JdbcUtil.close(pstmt);
			
		}

		return resultCnt;

	}
	// ??커넥션을 밖에서 만들어 전달하는게 중요하다 잘 이해가 안가는데
	//

}
