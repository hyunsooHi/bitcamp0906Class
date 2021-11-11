package fff;

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
		
		
		Menupan[] menupan = new Menupan[10];


		Connection conn = null; // 연결
		Statement stmt = null; // select
		ResultSet rs = null;

		
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
			
			int i=0;
			
			while (rs.next()) {
				int mid = rs.getInt("mid");
				String mname = rs.getString("mname");
				int mprice = rs.getInt("mprice");
				int mnum = rs.getInt("mnum");
				String mtype = rs.getString("mtype");
				System.out.print(mid + "\t" + mname + "\t" + mprice + "\t" + mnum +"\t" + mtype +"\n");
				menupan[i] = new Menupan(mid, mname, mprice,mnum,mtype);
				//System.out.println("주문가격"+menupan[i].mprice+"주문개수"+menupan[i].mnum+"\n"+"\n");
				//list.add(menupan);
				i++;
				
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
		
		}
		

//		===========
//		선택한 메뉴
//		불고기버거 3개 6000원
//		사이다1개    1천원
//		감자튀김1개 	1천원
//
//		가격 4400원
//		==========
//
//		1. 주문취소 (로그인으로 돌아가기) (선택한 메뉴 초기화됨)
//		2. (이전) 메뉴로 돌아가기 (선택한 메뉴 초기화됨)
//		3. 주문완료
//
//		============
		System.out.println("============");
		System.out.println("선택한 메뉴");
		//for(i=0;i<)
		System.out.println(menupan[0].mname +"    " +menupan[0].mnum+" 개  "+ menupan[0].mprice * menupan[0].mnum+" 원"+"");
		System.out.println(menupan[1].mname +"    " +menupan[1].mnum+" 개  "+ menupan[1].mprice * menupan[1].mnum+" 원"+"");
		
		System.out.println("총가격");
		int total_price = menupan[1].mprice * menupan[1].mnum + menupan[0].mprice * menupan[0].mnum;
		
		System.out.println(total_price +"원"+"");
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
			//3. 주문완료();
			System.out.println("============");
			System.out.println("결재수단을 입력해주세요 ");
			System.out.println("1. 카드 ");
			System.out.println("2. 현금 ");
			System.out.println("============");
			int selc = sc.nextInt();
			
			
			if (selc == 1){
				//1. 카드();
				//cardcash = "카드";
			}
			if (selc == 2){
				//2. 현금();
				//cardcash = "현금";
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
			
			
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1,  1);
			pstmt.setInt(2,  total_price);
			pstmt.setString(3, "11/10");
			pstmt.setString(4, "카드");
			pstmt.setString(5, "PUSAN");
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
