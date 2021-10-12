package chapter02;
//2. Person 클래스를 만들어 보고, 아래의 회원 정보를 저장하는 변수들을 선언해봅시다.

//변수이름을 작성하는 규칙에 맞게 직접 변수 이름을 정의해 보세요.
//① 회원이름을 저장하는 변수
//② 회원 전화번호 ( 000-0000-0000 )를 저장하는 변수
//③ 회원 주민등록번호 ( 000000-0000000 또는 0000000000000 )를 저장하는 변수

public class Person {

	// private : 클래스 내부에서 멤버들만 참조가 가능하도록 하는 접근 제어자
	// 데이터저장용도의 변수들은 전부다 프라이빗쳐줘서 은닉쳐준다

	private String memberName;// 회원이름
	private String phoneNumber;// 전화번호
	// String juminNumber;//주민번호

	private long juminNumber;

	// getter 와 셋터로 프라이빗 변수값 바꿈
	// setter 설정 / getter 가져오기
	// setter => 값을 받아서 변수에 저장
	public void setMemberName(String name) {
		memberName = name;
	}

	// getter =>인스턴스 변수를 반환
	public String getMemberName() {
		return memberName;
	}

	public void setPhoneNumber(String number) {
		phoneNumber = number;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setJuminNumber(long number) {
		juminNumber = number;
	}

	public long getJuminNumber() {
		return juminNumber;
	}

	// 변수하나에 게터 세터 클래스를 만들음 대신에 퍼블릭으로 만들음

	// 전체 데이터 출력
	public void printData() {
		System.out.println("이름: " + getMemberName());
		System.out.println("전화번호: " + getPhoneNumber());
		System.out.println("주민번호: " + getJuminNumber());

	}

}
