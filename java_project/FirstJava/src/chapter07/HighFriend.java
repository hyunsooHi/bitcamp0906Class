package chapter07;

public class HighFriend extends Friend {

	// 생성자 호출해서 초기화해야함

	String work;
	
	public HighFriend(String name, String phoneNumber, String address, String work) {
		
		super(name,phoneNumber,address);
		this.work = work;
		
	}

	//shift art s  로 오버라이드
	@Override
	public void showData() {
		// TODO Auto-generated method stub
		super.showData();
		System.out.println("직업: "+work);
	}

	@Override
	public void showBasicInfo() {
		// TODO Auto-generated method stub
		System.out.println("이름: "+name);
		System.out.println("전번: "+phoneNumber);
		
	}
}
