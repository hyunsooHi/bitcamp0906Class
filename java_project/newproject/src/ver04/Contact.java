package ver04;

//저장 정보
// 이름// 전화번호// 메일// 주소// 생일// 그룹
//기능
// 위 데이터를 출력하//는 기능

public abstract class Contact implements ShowData {

	// 1변수 2생성자 3메소드 (게터세터)

	// 캡슐화 : 외부 ( 다른인스턴스) 에서 변수를 직접 참조하지 못하도록 하는것
	private String name; // 이름
	private String phoneNumber;// 전화번호 : 000-0000-0000
	private String email; // 메일
	private String address; // 주소
	private String birthDay; // 생일: 20211022
	private String group; // 그룹

	// 생성자 : 변수들을 초기화할때사용
	public Contact(String name, String phoneNumber, String email, String address, String birthDay, String group) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
		this.birthDay = birthDay;
		this.group = group;
	}

	public Contact(String name, String phoneNumber) {
//		super();
//		this.name = name;
//		this.phoneNumber = phoneNumber;
		this(name, phoneNumber, null, null, null, null);// 이거랑 위에거랑 같대

	}

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

	
	
	//기능 : 데이터출력
	public void printContact() {
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phoneNumber);
		System.out.println("이메일 : " + email);
		System.out.println("주소 : " + address);
		System.out.println("생일 : " + birthDay);
		System.out.println("그룹 : " + group);
		
	}

	@Override //이건왜해? 쓰는법 익히고싶은데 안쓰네 오버라이딩해서 데이터 잘 들어갔는지 확인용으로 쓴대!
	public String toString() {
		return "Contact [name=" + name + ", phoneNumber=" + phoneNumber + ", email=" + email + ", address=" + address
				+ ", birthDay=" + birthDay + ", group=" + group + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
