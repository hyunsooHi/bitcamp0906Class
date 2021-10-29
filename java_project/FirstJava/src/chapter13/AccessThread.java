package chapter13;

public class AccessThread extends Thread {

	IhaveTwoNum twoNum;

	public AccessThread(IhaveTwoNum twoNum) {
		this.twoNum = twoNum;
	}

	@Override
	public void run() {

		twoNum.addOneNum1();
		twoNum.addTwoNum1();
		
		twoNum.addOneNum2();
		twoNum.addTwoNum2();

	}

}
