package fff;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cart {
	static Scanner scanner = new Scanner(System.in);

	public static int addCart() {
		int totalPrice = 0;
		CartDao cartDao = CartDao.getInstance();

		Connection conn = null;
		List<CartDTO> list = new ArrayList<CartDTO>();

		try {
			conn = ConnectionProvider.getConnection();

			// 트렌젝션 일의 단위
			conn.setAutoCommit(false); // 트렌젝션의 컨트롤 하겠다!

			int mid;
			while (true) {
				System.out.println("메뉴 번호를 입력하세요./선택이 끝나면 0번을 누르세요");
				System.out.print("> ");
				mid = scanner.nextInt();
				if (mid != 0) {
					list.add(cartDao.selectByCartno(conn, mid));
				} else {
					break;
				}
			}

			for (CartDTO cart : list) {
				System.out.println("메뉴: " + cart.mname + "\t수량: " + cart.mnum + "\t금액: " + cart.mprice * cart.mnum);

			}
			for (int i = 0; i < list.size(); i++) {

				totalPrice += list.get(i).mprice * list.get(i).mnum;
			}

			System.out.println("최종금액: " + totalPrice);

		} catch (SQLException e) {

			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();

		}

		return totalPrice;
	}
}
