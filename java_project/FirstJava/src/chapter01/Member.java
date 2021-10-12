package chapter01;

public class Member {
	//2.Member 클래스를 생성하고,
	//main()메소드를 만들고 자기 자신의 이름을 출력하는 메소드를 만들어 출력해 봅시다. 
	public static void main(String[] args) {
		// 메모리에 올라야 실행
		//스태틱 제어자를 쓰면 메모리올라가는 시점이  바뀜
		//static : 바이트코드가 가상머신에서 실행하는 시점(최초실행)에 메소드 코드가 메모리에 로드된다.
		//멤버클래스를 객체로 쓸때 멤버를 인스턴스로 만들어 실행해줘야..?? 올라간다?
		//메인메소드 보면 인스턴트 안만들어졌는데
		////say를호출하려하니 오류 sayName을 스태틱으로 바꾸던가
		System.out.println("남현수");
		System.out.println("메소드 호출");
		sayName();//에러이유 스태틱이 전역의 의미
		
		
		
//		1. 앞서 생성 했던 Member 클래스에 main() 메소드 안에 아래 조건의 변수를 정의해봅시다.
//		① String 타입의 이름을 저장할 수 있는 변수 name을 정의해봅시다.
//		② int 타입의 나이를 저장할 수 있는 변수 age를 정의해봅시다.
//		③ double 타입의 키를 저장할 수 있는 변수 height를 정의해봅시다.
//		④ boolean 타입의 JAVA책의 보유 여부를 저장할 수 있는 변수 hasBook를 정의해봅시다.
//		⑤ 이름과 나이, 키, 책의 보유 여부를 출력해봅시다.
		
		
	}
	
	//이름을 출력하는 메소드
	//반환타입 메소드 이름 (매개변수,...)
	//스태틱은 공용으로 먼저만들어놓고 빈번하게 쓸때 사용된다
	static void sayName() {
		System.out.println("남현수");
	}
	
	
	
	
	
}
