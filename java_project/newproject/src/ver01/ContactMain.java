package ver01;

public class ContactMain {

	public static void main(String[] args) {

		// 인스턴스생성 > new 클래스이름 > 클래스()생성자 호출

		Contact contact1 = new Contact("현수", "01033445566", "nam@huns.soo", "seoul", "20211010", "친구");
		Contact contact2 = new Contact("현수", "01033445577");

		// getter 메소드 이용해서 출력
		System.out.println("이름: " + contact1.getName());
		System.out.println("이름: " + contact2.getName());

		System.out.println("==============================");

		// 저장된 전체 데이터 출력
		contact1.printContact();
		System.out.println("==============================");
		contact2.printContact();

		System.out.println("==============================");

		// 데이터변경 : setter메소드이용
		
		contact2.setEmail("nam@naver.com");
		contact2.setAddress("서울");
		contact2.setBirthDay("2000-10-10");
		contact2.setGroup("친구");
		
		System.out.println("데이터변경 (추가)");
		contact2.printContact();
		
		//오버라이딩해서 데이터 잘 들어갔는지 확인용으로 쓴대!
		contact1.toString();
		

	}

}
