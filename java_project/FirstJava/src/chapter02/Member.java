package chapter02;

public class Member {

	// 1. 앞서 생성 했던 Member 클래스에 main() 메소드 안에 아래 조건의 변수를 정의해봅시다.
//	① String 타입의 이름을 저장할 수 있는 변수 name을 정의해봅시다.
//	② int 타입의 나이를 저장할 수 있는 변수 age를 정의해봅시다.
//	③ double 타입의 키를 저장할 수 있는 변수 height를 정의해봅시다.
//	④ boolean 타입의 JAVA책의 보유 여부를 저장할 수 있는 변수 hasBook를 정의해봅시다.
//	⑤ 이름과 나이, 키, 책의 보유 여부를 출력해봅시다.

	// 클래스의 정의
	// [접근제어자] 퍼블릭 디폴트가 접근제어자임 [final] 상수 상속이 안된다는뜻 클래스 이름
	// [접근제어자][final] 클래스 이름
	// 스트링 클래스가 상속이 안됨 예를들어서

//	{
//		변수 정의 =인스턴스변수
//		메소드 정의
//	}
//	

	public String name;// 이름을 저장하는 변수
	// 인스턴스변수 초기화 안해도됨 널 들어감
	// 인스턴스 변수는 자동 초기화됨 널로
	int age;// 사용자의 나이를 저장하는 변수
	double height; // 사용자의 키를 저장하는 변수
	boolean hasBook; // 자바책 보유 여부

	// 코딩할때 변수에 직접 참조하지 않는다
	// 직접 바꾸면 오류나기 쉽다

	// 정보은닉 캡슐화 라고 한다
	// 그렇구나 변수에 퍼블릭 프라이빗을 넣는구나 변수앞에 그런개념이 있구나

	
	//공통코드  회원의 데이터를 출력하는 메소드
	void printData() {
		System.out.println("이름:" + this.name);
		System.out.println("나이:" + this.age);
		System.out.println("키:" + this.height);
		System.out.println("자바책유무" + this.hasBook);
	}
	
	
	public static void main(String[] args) {

		// 변수를 사용하기 위해 저장공간 만든다
		// Member 클래스로 인스턴스를 생성한다 > 이름, 나이 , 키 , 책보유여부 정보를 저장할수있는
		// 메모리 공간을 생성
		Member member = new Member(); // 2개지만 같은페키지라 ㄱㅊ 다른페키지꺼면 임포트 해야함
		// 뉴 치고 맴버치면 그 주소가 0x200이라 할때
		// 왼쪽에 member 에 주소값 들어감
		// 인스턴스의 변수를 참조해서 출력
		// 지금 초기화상태에선 네임엔 null 나머지는 0 0.0 false가 들어가있을거임 그렇게초기화

		member.printData();

		// 인스턴스 변수의 값을 변견
		member.name = "남현수";
		member.age = 20;
		member.height = 185.6;
		member.hasBook = true;
		
		System.out.println("====================");
		System.out.println("인스턴스 변수의 값을 변경");
		System.out.println("====================");
		
		
		member.printData();
		
		
		//공통코드들 => 메소드로 정의
		//
		long jn = 9101012002222L;
		System.out.println(jn);
	}

}
