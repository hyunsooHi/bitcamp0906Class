package dept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {

	public static Connection getConnection() throws SQLException {// 자주 인스턴스계속마드니까 스테틱

		// String jdbcUrl1 = "jdbc:oracle:thin:@[주소]:[포트]:[데이터베이스]";
		String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String pw = "tiger";

		return DriverManager.getConnection(jdbcUrl, user, pw);

	}

}
