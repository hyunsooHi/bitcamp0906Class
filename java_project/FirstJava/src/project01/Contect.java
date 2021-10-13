package project01;
//

//저장 정보
// 이름
// 전화번호
// 이메일
// 주소
// 생일
// 그룹
//기능
// 위 데이터를 출력하는 기능
//
//추가 요구 사항
// 변수들은 직접 참조를 막아 캡슐화 처리를 하도록 해봅시다.
//변수의 직접 참조는 안되지만 변수의 값을 얻을 수 있는 메소드(getter)와
//변수에 값을 저장할 수 있는 메소드(setter)를 정의합니다.
// 인스턴스 생성과 함께 데이터를 초기화 할 수 있도록 생성자를 정의해봅시다.
// 저장할 데이터를 콘솔에서 사용자의 입력 값으로 인스턴스를 생성해봅시다.
//실행 과정
// main()메소드를 정의합니다.
// 연락처 데이터를 저장하는 인스턴스를 생성합니다.
// 변수 값을 반환하는 각각의 메소드를 호출해서 각 데이터를 출력문으로 출력합니다.
// 생성된 인스턴스의 정보 출력 메소드를 호출합니다.
// 인스턴스의 각 변수에 값을 바꾸는 메소드를 이용해서 데이터를 수정합니다.
// 인스턴스의 출력메소드를 다시 실행합니다.
import java.util.Scanner;

public class Contect {
	private String name;
	private String phoneNumber;
	private String email;
	private String address;
	private String birthDay;
	private String group;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	
	public Contect(String name, String phoneNumber, String email, String address, String birthDay, String group) {
		
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
		this.birthDay = birthDay;
		this.group = group;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Content content = new Content();
		
		Contect.setName(scanner.nextLine());
		
	}
	

}
