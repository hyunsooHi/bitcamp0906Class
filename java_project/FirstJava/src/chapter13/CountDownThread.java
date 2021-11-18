package chapter13;

public class CountDownThread extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();

	for(

	int i = 10;i>0;i--)
	{

		System.out.println(i);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("10초동안 입력이없어 프로그램을 종료합니다");
		System.exit(0);

	}
}

}
