package ver04;

import java.util.Scanner;

//1. SmartPhone 클래스를 정의합니다. 이 클래스는 연락처 정보를 관리하는 클래스입니다.
//① Contact 클래스의 인스턴스 10개를 저장 할 수 있는 배열을 정의합시다.
//② 배열에 인스턴스를 저장하고, 수정하고, 삭제, 저장된 데이터의 리스트를 출력하는 메소드를 정의합니다.
//2. main()메소드를 아래의 요구조건을 정의해봅니다.
//① SmartPhone 클래스의 인스턴스를 생성합니다.
//② 사용자로부터 입력을 받아 Contact 인스턴스를 생성해서 SmartPhone 클래스의 인스턴스가 가지고 있는 배열에 추가합니다.
//③ 10번 반복해서 배열에 추가합니다.
//④ 배열의 모든 요소를 출력합니다.
//⑤ 배열의 모든 요소를 검색합니다.
//⑥ 배열의 요소를 삭제해 봅시다.
//⑦ 배열의 요소를 수정해 봅시다.

public class SmartPhone {

	// ① Contact 클래스의 인스턴스 10개를 저장 할 수 있는 배열을 정의합시다.
	// ② 배열에 인스턴스를 저장하고, 수정하고, 삭제, 저장된 데이터의 리스트를 출력하는 메소드를 정의합니다.

	private Contact[] contacts; // Contact 타입의 인스턴스를 저장하는 배열 선언
	private int cnt; // 저장된 Contact타입의 인스턴스 개수, 배열의 index로 사용

	public static Scanner sc = new Scanner(System.in);
	// 스캐너는 처음부터 끝날때까지 계속 있어야 하니까 static으로둠

	public SmartPhone(int size) {
		contacts = new Contact[size];
		cnt = 0;

	}

	// 배열에 요소를 추가하는 메소드: 참조값을 전달받아 배열에 추가하는 기능
	public void addContact(Contact contact) {// 콘택트타입의 콘택트를 받아서
		contacts[cnt++] = contact;
		System.out.println("데이터가 저장되었습니다.");
	}

	// 사용자로부터 데이터를 받아 Contact 객체를 생성하고 배열에 참조값을 저장
	public void insertContact(int select) {
		System.out.println("연락처 등록을 시작합니다.....");
		System.out.println("이름 >>>");
		String name = sc.nextLine();// 원래는 SmartPhone.sc로 참조해야하지만 지금인 저클래스내부에서사용하고있어서 생략해도된다
		System.out.println("전화번호 >>>>");
		String phoneNumber = sc.nextLine();
		System.out.println("이메일>>>>");
		String email = sc.nextLine();
		System.out.println("주소>>");
		String address = sc.nextLine();
		System.out.println("생일>>");
		String birthDay = sc.nextLine();
		System.out.println("그룹>>");
		String group = sc.nextLine();

		if (select == 1) {

			System.out.println("회사 이름을 입력하세요. >>");
			String companyName = sc.nextLine();

			System.out.println("부서 이름을 입력하세요. >>");
			String divName = sc.nextLine();

			System.out.println("직급을 입력하세요 >>");
			String job = sc.nextLine();

			addContact(
					new CompanyContact(name, phoneNumber, email, address, birthDay, group, companyName, divName, job));

		} else {// select ==2임

			System.out.println("거래처 회사 이름을 입력하세요.");
			String companyName = sc.nextLine();
			System.out.println("거래 품목을 입력하세요.");
			String product = sc.nextLine();
			System.out.println("담당자 직급을 입력하세요.");
			String job = sc.nextLine();

			addContact(
					new CustomerContact(name, phoneNumber, email, address, birthDay, group, companyName, product, job));

		}

//		Contact c = new Contact(name, phoneNumber, email, address, birthDay, group)
//		addContact(c);
//		이렇게 해도 되지만

		addContact(new Contact(name, phoneNumber, email, address, birthDay, group));
		// 이렇게 바로 해도 된다
		//
	}

	// 전체 데이터 출럭: 배열은 반복문이다!!
	public void printAllData() {

		System.out.println("리스트를 출력합니다.(" + cnt + "명)");
		System.out.println("==============");

		for (int i = 0; i < cnt; i++) {
			contacts[i].printContact();
			System.out.println("==============");
		}
	}

	// 이름(문자열을)전달받아서 배열의 각 요소의 이름과 비교하고, 같은 요소가 있으면 해당 index반환
	private int searchIndex(String name) {
		int index = -1;// 기본값을 만들어놓고 처리하면서 이값을 변경시키고 리턴은 이거하나하는 스타일

		// 배열의 요소를 반복해서 참조하고 이름과 비교 ->찾으면 반복종료 index반환
		for (int i = 0; i < cnt; i++) {
			if (contacts[i].getName().equals(name)) {
				index = i;
				break;
			}
		}

		return index;
	}

	// 이름으로 검색해서(index찾기) 해당 데이터 출력하는 기능

	public void searchPrint() {

		System.out.println("검색을 시작합니다....");
		System.out.println("찾고자 하는 이름을 입력하세요>>>");
		String name = sc.nextLine();

		int index = searchIndex(name);
		if (index < 0) {
			// 찾는 데이터가 없다
			System.out.println("찾으시는 이름" + name + "의 정보가 없습니다.");
		} else {
			// 데이터출력
			System.out.println("검색 결과 입니다.");
			System.out.println("============");
			contacts[index].printContact();
			System.out.println("============");

		}

	}

	// 이름으로 검색해서 해당 데이터 삭제하는 기능

	public void deleteContact() {

		System.out.println("데이터 삭제를 시작합니다...");
		System.out.println("삭제하고자 하는 데이터의 이름을 입력하세요. >>");
		String name = sc.nextLine();

		int index = searchIndex(name);

		if (index < 0) {
			System.out.println("삭제하고자 하는 이름" + name + "의 데이터가 존재하지 않습니다");

		} else {
			// 삭제처리: index 위치의 참조값을 index+1위치의 값으로 치환후 시프트
			// 배열의 참조변수가 객체를 가리키고있다 근데 객체를 삭제시킬순없다 그거는
			// 가비지컬렉터가 알아서 참조하지않는 객체를 삭제하는것이다
			//
			// 인덱스 0이면 cnt가 -1보다작아야하니까 말이안됨 버그임

			if (cnt == 1 && index > 0) {
				contacts[0] = null;
				cnt--;
			}

			for (int i = index; i < cnt - 1; i++) {
				contacts[i] = contacts[i + 1];// 시프트로 덮어씌우는거임
				
			}
			cnt--; // 여기에 쓰는게 맞나? 역시 여기 쓰는게 아니었다!
			System.out.println(name + "의 데이터가 삭제되었습니다");

		}

	}

	// 이름으로 검색해서 데이터 수정하는거 ( 사용자에게 수정할 데이터를 받아서 처리해야한다)
	// 원래있던 객체에 set해서 바꾸기 혹은 입력받을때 해당 인덱스 삭제후 인스턴스 생성해서 추가

	// 이름으로 수정함
	public void editContact() {

		System.out.println("데이터수정을 시작합니다");
		System.out.println("변경을 원하는 이름을 입력해 주세요>>");
		String name = sc.nextLine();

		int index = searchIndex(name);
		if (index < 0) {
			// 이름 못찾음
			System.out.println("찾으시는" + name + " 의 정보가 존재하지않습니다");

		} else {
			System.out.println("데이터 수정을 위해 각각의 데이터를 입력하세요");

			System.out.println("이름 >>>");
			String ename = sc.nextLine();// 중복되서 ename으로 고침
			System.out.println("전화번호 >>>>");
			String phoneNumber = sc.nextLine();
			System.out.println("이메일>>>>");
			String email = sc.nextLine();
			System.out.println("주소>>");
			String address = sc.nextLine();
			System.out.println("생일>>");
			String birthDay = sc.nextLine();
			System.out.println("그룹>>");
			String group = sc.nextLine();

			// 수정할때
			// 회사 동료인지 고객인지 분기해야한다
			if (contacts[index] instanceof CompanyContact) {// 회사로 형변환이 가능한지 확인
				// (컴페니 타입의 인스턴스를 참조하고 있다) 그래야 형변환 가능
				CompanyContact contact = (CompanyContact) contacts[index];
				// 하위타입의 객체를 쓰기위해서

				System.out.println("회사 이름을 입력하세요. >>");
				String companyName = sc.nextLine();

				System.out.println("부서 이름을 입력하세요. >>");
				String divName = sc.nextLine();

				System.out.println("직급을 입력하세요 >>");
				String job = sc.nextLine();

				contact.setName(ename);
				contact.setPhoneNumber(phoneNumber);
				contact.setEmail(email);
				contact.setAddress(address);
				contact.setBirthDay(birthDay);
				contact.setGroup(group);

				contact.setCompanyName(companyName);
				contact.setDivName(divName);
				contact.setJob(job);

			} else { // CustomerContact

				CustomerContact contact = (CustomerContact) contacts[index];
				// 형변환

				System.out.println("거래처 회사 이름을 입력하세요.");
				String companyName = sc.nextLine();
				System.out.println("거래 품목을 입력하세요.");
				String product = sc.nextLine();
				System.out.println("담당자 직급을 입력하세요.");
				String job = sc.nextLine();

				contact.setName(ename);
				contact.setPhoneNumber(phoneNumber);
				contact.setEmail(email);
				contact.setAddress(address);
				contact.setBirthDay(birthDay);
				contact.setGroup(group);

				contact.setCompanyName(companyName);
				contact.setProduct(product);
				contact.setJob(job);

			}

			// Contact c c참조변수
			contacts[index].setName(ename);
			contacts[index].setPhoneNumber(phoneNumber);
			contacts[index].setEmail(email);
			contacts[index].setAddress(address);
			contacts[index].setBirthDay(birthDay);
			contacts[index].setGroup(group);

			System.out.println("입력완료");
		}

	}

}
