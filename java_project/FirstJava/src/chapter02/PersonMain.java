package chapter02;

public class PersonMain {
	public static void main(String[] args) {

		Person p = new Person();
		p.setMemberName("����");
		p.setPhoneNumber("01077445588");
		p.setJuminNumber(9422115554478L);

		System.out.println("�̸�: " + p.getMemberName());
		System.out.println("����ȣ: " + p.getPhoneNumber());
		System.out.println("�ֹι�ȣ: " + p.getJuminNumber());

		System.out.println("=======================");
		p.printData();
		
		

	}
}
