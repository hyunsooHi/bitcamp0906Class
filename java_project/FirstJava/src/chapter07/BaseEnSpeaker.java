package chapter07;

public class BaseEnSpeaker extends Speaker {// Speaker클래스상속받음

	private int baseRate;

	public void setBaseRate(int base) {

		baseRate = base;
	}

	// 오버라이딩
	// 상위클래스의 메소드 선언부와 똑같이만들고 처리부는 변경

	// @에노테이션 쓰면, 자바 문법도 주석도 아니지만 이렇게한다
	// 상위클래스의 메소드를 오버라이딩한다, 오버라이딩의 규칙에 맞게 정의하는지 체크
	@Override
	public void showCurrentState() {
		super.showCurrentState();
		System.out.println("베이스 크기" + baseRate);

	}

	public static void main(String[] args) {
		BaseEnSpeaker bSpeaker = new BaseEnSpeaker();
		bSpeaker.showCurrentState();

		System.out.println("======");

		Speaker speaker = new Speaker();
		speaker.showCurrentState();

		System.out.println("===========");

		// 다형성
		// 상위 타입의 참조 변수 = 하위 타입의 인스턴스
		//참조변수의 타입에 정의된 멤버만 사용이 가능
		Speaker sp = new BaseEnSpeaker();
		sp.showCurrentState();
		//sp.setBaseRate(100);//오류발생 메모리에는 있으나
		//타입이 스키퍼라고 했기때문에
		

		// 베이스가 메모리에올라왔으므로 베이스의 오버라이드된게 보여짐

	}

}
