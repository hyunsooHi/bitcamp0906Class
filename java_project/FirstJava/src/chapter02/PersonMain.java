package chapter02;

public class PersonMain {
	public static void main(String[] args) {

		Person p = new Person();
		p.setMemberName("현수");
		p.setPhoneNumber("01077445588");
		p.setJuminNumber(9422115554478L);

		System.out.println("이름: " + p.getMemberName());
		System.out.println("폰번호: " + p.getPhoneNumber());
		System.out.println("주민번호: " + p.getJuminNumber());

		System.out.println("=======================");
		p.printData();
		
		

	}
}
