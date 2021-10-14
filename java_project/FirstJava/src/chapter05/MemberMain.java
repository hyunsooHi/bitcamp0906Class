package chapter05;

public class MemberMain {

	public static void main(String[] args) {

		Member member = new Member("현수", "01044333443", "전자", 4, "baea@g@#c.c");
		member.printMember();
		System.out.println("================================");
		Member member2 = new Member("현수", "01044333443", "전자", 4, "baea@g@#c.c", "3월3일", "한국");
		member2.printMember();
	}

}
