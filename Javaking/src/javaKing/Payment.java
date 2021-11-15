package javaKing;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Payment {
	// 변수
	static Scanner scanner = new Scanner(System.in);

	private static String logInId;

	public void setLogInId(String logInId) {
		this.logInId = logInId;
	}

	// 결제 방식을 묻는 메소드
	public int select() {
		// 1. 카드 2. 현금
		System.out.println("\n==================================================");
		System.out.println("결제 방식을 선택해주세요.\n1. 신용/체크카드 2. 카카오페이 3. 만나서 현금");
		System.out.print("> ");
		int userChoice = scanner.nextInt();
		while (true) {
			if (userChoice <= 0 || userChoice > 3) {
				System.out.println("잘못 입력하였습니다.");
				System.out.println("결제 방식을 선택해주세요.\n1. 신용/체크카드 2. 카카오페이 3. 만나서 현금");

				userChoice = scanner.nextInt();
			} else {
				if (userChoice == 1) {
					scanner.nextLine();
					System.out.println("신용/체크카드를 선택하였습니다.");
					System.out.println("카드번호를 입력해주세요.");
					System.out.print("> ");
					scanner.nextLine();
					System.out.println("CVC 3자리를 입력해주세요.");
					System.out.print("> ");
					scanner.nextInt();
					scanner.nextLine();
					System.out.println("카드 비밀번호를 입력하세요.");
					System.out.print("> ");
					scanner.nextLine();
					// 3초간 지연 시키기 (보기 좋으라고...사용)
					try {
						System.out.println("결제 진행중...");
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("결제 완료되었습니다.");
				} else if (userChoice == 2) {
					// 3초간 지연 시키기
					try {
						System.out.println("카카오페이로 결제를 진행...");
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("결제 완료되었습니다.");
				} else {
					// 3초간 지연 시키기
					System.out.println("만나서 현금 결제를 선택하였습니다.");
					try {
						System.out.println("주문 진행중...");
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("주문 완료되었습니다.");
					System.out.println("라이더가 도착하기전에 미리 현금을 준비해 주시길 바랍니다.");
				}
			}

			break;

		}
		return userChoice;
	}

	// 주문정보 저장 메소드
	public ReceiptDto addReceipt(int id, String address, String phoneNum, int totalPrice, String payment) {
		ReceiptDto receipt = new ReceiptDto();
		receipt.setUserid(id);
		receipt.setAddress(address);
		receipt.setPhoneNum(phoneNum);
		receipt.setTotalPrice(totalPrice);
		receipt.setPayment(payment);

		return receipt;
	}

	public void receipt(int userChoice, List<CartDto> list, int totalPrice) {
		Cart cart = new Cart();
		String userId = logInId;
		ReceiptDto receipt = null;
		Connection conn = null;
		LoginDao loginDao = new LoginDao();
		UserDto user = null;
		String payment;
		try {
			conn = ConnectionProvider.getConnection();

			// 트렌젝션 일의 단위
			conn.setAutoCommit(false); // 트렌젝션의 컨트롤 하겠다!

			user = loginDao.logedInfo(conn, userId);

			// sql문 insert into dorder values (주
			if (userChoice == 1 || userChoice == 2) {
				payment = "미리결제완료";
				// 회원 id값으로 회원정보 get
				receipt = addReceipt(user.getId(), user.getAddress(), user.getPhone(), totalPrice, payment);
				ReceiptDao.insertReceipt(conn, receipt);

			} else {
				// DB dorder 의 otype에 "현금결제" 로
				payment = "만나서 현금결제";
				receipt = addReceipt(user.getId(), user.getAddress(), user.getPhone(), totalPrice, payment);
				ReceiptDao.insertReceipt(conn, receipt);
			}
			conn.commit();
		} catch (SQLException e) {

			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();

		}

		System.out.println("\n==================================================");
		try {
			System.out.println("영수증 발급중...");
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("\n==================================================\n");

		System.out.println("⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛ 영 수 증⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛");
		System.out.println("주소: " + receipt.getAddress());
		System.out.println("전화번호: " + receipt.getPhoneNum());
		for (CartDto cartDto : list) {
			System.out.println("메뉴명 : " + cartDto.getMname() + "\t수량: " + cartDto.getMcount() + "\t금액: "
					+ cartDto.getMprice() * cartDto.getMcount());
		}
		System.out.println("\n--------------------------------------------------\n");

		System.out.println("총 결제금액: " + receipt.getTotalPrice() + "원");
		System.out.println("결제방법: " + receipt.getPayment());

		System.out.println("\n==================================================\n");
		System.out.println("1. 메뉴선택화면으로 돌아가기 2. 자바킹 종료");
		System.out.print("> ");
		int select = scanner.nextInt();
		while (select <= 0 || select > 2) {
			System.out.println("잘못 입력하였습니다.");
			System.out.println("1. 메뉴선택화면으로 돌아가기 2. 자바킹 종료");
			System.out.print("> ");
			select = scanner.nextInt();
		}
		if (select == 1) {
			MenuMain menu = new MenuMain();
			try {
				System.out.println("메뉴선택으로 돌아갑니다...");
				Thread.sleep(3000);
				menu.menuMain();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else if (select == 2) {
			System.out.println("이용해주셔서 감사합니다.");
			System.exit(0);
		}
	}

}
