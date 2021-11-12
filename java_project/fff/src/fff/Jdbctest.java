package fff;

import java.sql.Date;//이거추가함

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Jdbctest {
	
	public static Scanner sc = new Scanner(System.in); 
	
	

	public static void main(String[] args) throws SQLException {
		
		
		//Menupan[] menupan = new Menupan[10];
		ArrayList<Menupan> menupanlist = new ArrayList<Menupan>();

		Connection conn = null; // 연결
		Statement stmt = null; // select
		ResultSet rs = null;
		
		int line_cnt=0;
		String corm = "h";
		
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
			String sql = "select * from macdo";//mid mname mprice mnum mtype
			// sql 실행
			rs = stmt.executeQuery(sql);
			// 반복을통해 행단위데이터검색
			
			
			
			while (rs.next()) {
				int mid = rs.getInt("mid");
				String mname = rs.getString("mname");
				int mprice = rs.getInt("mprice");
				int mnum = rs.getInt("mnum");
				String mtype = rs.getString("mtype");
				System.out.print(mid + "\t" + mname + "\t" + mprice + "\t" + mnum +"\t" + mtype +"\n");
				
				
				
				menupanlist.add(new Menupan(rs.getInt("mid"), rs.getString("mname"), rs.getInt("mprice"), rs.getInt("mnum"), rs.getInt("mprice") * rs.getInt("mnum"),rs.getString("mtype")));
				//menupan[line_cnt] = new Menupan(mid, mname, mprice,mnum,mtype);
				//System.out.println("주문가격"+menupan[i].mprice+"주문개수"+menupan[i].mnum+"\n"+"\n");
				//list.add(menupan);
				//line_cnt++;
				
			}
			System.out.println(menupanlist);

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
		
		}
		
		System.out.println(line_cnt);
		
		System.out.println("============");
		System.out.println("선택한 메뉴");
		
		int total_price = 0;
		
//		for(int i=0;i<line_cnt;i++) {
//			
//			System.out.println(menupan[i].mname +"    " +menupan[i].mnum+" 개  "+ menupan[i].mprice * menupan[i].mnum+" 원"+"");
//			total_price = total_price + menupan[i].mprice * menupan[i].mnum;
//		}
		System.out.println("총가격");
		System.out.println(total_price +"원"+"");
		
		//엔드 셀렉트메소드  주문완료인지 고름
		
		System.out.println("============");
		
		System.out.println("1. 주문취소 ");
		System.out.println("2. 이전 메뉴로 돌아가기 ");
		System.out.println("3. 주문완료 ");
		System.out.println("============");
		
		int select = sc.nextInt();
		if (select == 1){
			//1. 주문취소();
		}
		if (select == 2){
			//2. 이전 메뉴로 돌아가기();
		}
		if (select == 3){
			//3. 주문완료(); 캐시셀렉트 메소드 현금카드고름
			System.out.println("============");
			System.out.println("결재수단을 입력해주세요 ");
			System.out.println("1. 카드 ");
			System.out.println("2. 현금 ");
			System.out.println("============");
			int selc = sc.nextInt();
			
			
			if (selc == 1){
				//1. 카드();
				corm = "c";
			}
			if (selc == 2){
				//2. 현금();
				corm = "m";
			}
			
		}
		
		
		
		
		
		


		
		
		PreparedStatement pstmt = null;
		
		
		
		try {
			// 1. 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. 연결 : Connection
			//String jdbcUrl = "jdbc:oracle:thin:@[주소]:[포트]:[데이터 베이스]";
			String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String pw = "tiger";
			
			conn = DriverManager.getConnection(jdbcUrl, user, pw);
			
			System.out.println("데이터베이스 연결 성공!");
			
			// 3. 작업 : CRUD -> PreparedStatement객체 생성 , 먼저 SQL 등록 후 사용
			String sql = "insert into orderdeli values (?, ?, ?, ?, ?, ?, ?, ?)";
			
			long miliseconds = System.currentTimeMillis();
	        Date date = new Date(miliseconds);
	        System.out.println(date);
			
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1,  2);
			pstmt.setInt(2,  total_price);
			pstmt.setDate(3, date);
			pstmt.setString(4, corm);
			pstmt.setString(5, corm);
			pstmt.setInt(6,  90);
			pstmt.setInt(7,  90);
			pstmt.setInt(8,  90);
			
			// DML 실행
			int resultCnt = pstmt.executeUpdate();
			
			if(resultCnt > 0 ) {
				System.out.println("입력되었습니다.");
			} else  {
				System.out.println("입력실패!");
			}
			
			
			// 4. 종료 : close()
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 클래스를 찾을 수 없습니다.");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("데이터베이스에 연결할 수 없습니다. 연결 실패!");
			e.printStackTrace();
		} finally {
			
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	

	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	



}
