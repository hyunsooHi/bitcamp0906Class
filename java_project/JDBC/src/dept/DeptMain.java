package dept;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DeptMain {

	public static void main(String[] args) throws SQLException {

		DeptDao deptDao = new DeptDao();

		Connection conn = ConnectionProvider.getConnection();

		List<Dept> list = null;

		try {
			conn = ConnectionProvider.getConnection();
			list = deptDao.selectAllList(conn);

			System.out.println("부서리스트");
			for (Dept dept : list) {
				System.out.println(dept);
			}

			Dept dept = deptDao.selectByDeptno(conn, 10);
			// System.out.println("10번붯" + deptno);

			Dept newDept = new Dept(50, "DEV", "SEOUL");

			int insertCnt = deptDao.insertDept(conn, newDept);

			if (insertCnt > 0) {
				System.out.println("부서정보입력");
			} else {
				System.out.println("실패");
			}
			// System.out.println("입력결과" + deptDao.selectByDeptno(conn, 50));

			Dept editDept = new Dept(50, "Design", "PUSAN");

			int editCnt = deptDao.editDept(conn, editDept);
			if (editCnt > 0) {

				System.out.println("정보가 수정되었습니다");
			} else {
				System.out.println("수정실패 또는 조건에맞는데이터가존재하지않습니다");
			}
			System.out.println("입력결과" + deptDao.selectByDeptno(conn, 50));

		} catch (SQLException e) {
			e.printStackTrace();
		}
		// 부서 리스트를 확인
		// ArrayList<Dept> list = deptDao.selectAllList(conn);

	}

}
