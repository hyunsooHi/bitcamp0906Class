package chapter13;

public class ShowThread extends Thread {

	String threadName;

	public ShowThread(String name) {
		this.threadName = name;
	}

	@Override
	public void run() {
		// 새로운 스래드의 실행메소드 : 메인스레드에서 직접호출하지않는다

		for(int i=0;i<100;i++) {
			System.out.println("안녕하세여" + this.threadName + "입니다");
			
			//스레드 제어 메소드 : sleep(ms) ->>매개변수가 1000분의1초  
			//시간만큼 블로상태가된다
			//시간이 지난후 실행가능상태로 전환
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}

		
		
		
		
	}

}
