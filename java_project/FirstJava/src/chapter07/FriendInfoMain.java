package chapter07;

import java.util.Scanner;

public class FriendInfoMain {

	public static void main(String[] args) {

		FriendInfoHandler handler = new FriendInfoHandler();

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("#### 메뉴 선택 ####");
			System.out.println(" 1. 고교 친구 정보 저장");
			System.out.println(" 2. 대학 친구 정보 저장");
			System.out.println(" 3. 전체 정보 출력");
			System.out.println(" 4. 기본 정보 출력");

			System.out.println(" 5. 프로그램 종료");
			System.out.println(" 메뉴 선택 >>");

			int select = Integer.parseInt(sc.nextLine());

			switch (select) {
			case 1:
			case 2:// 케이스 1 또는 2 라는뜻
				handler.addFriend(select);
				break;
			case 3:
				handler.showAllData();
				break;
			case 4:
				handler.ShowAllSimpleData();
				break;
			case 5:
				System.out.println("프로그램종료합니다");
				System.exit(0); // return

			}

		}

	}

}
