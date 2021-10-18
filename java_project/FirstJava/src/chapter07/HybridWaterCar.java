package chapter07;

public class HybridWaterCar extends HybridCar {
	int waterGauege;

	HybridWaterCar(int gasolineGauge, int electronicGauge, int waterGauge) {

		super(gasolineGauge, electronicGauge);// 2상위클래스의 생성자호출
		this.waterGauege = waterGauege;// 6변수초기화

	}

	public static void main(String[] args) {
		HybridWaterCar hdCar = new HybridWaterCar(10, 20, 30);// 1.생성자 호출

		System.out.println(Car.door);
		System.out.println(HybridCar.door);
		System.out.println(HybridWaterCar.door);
	}
}

class HybridCar extends Car {

	int electronicGauge;

	// 상속관계에서 상위 클래스에 생성자가 존재하면 생성자를 호출해줘야 한다
	// 상위클래스의 변수를 초기화해야하기때문에
	// 초기화할 값을 받아서 상위 클래스의 생성자를 호출해야한다
	HybridCar(int gasolinegauge, int electronicGauge) {
		super(gasolinegauge); // 3.상위클래스의 생성자호출
		this.electronicGauge = electronicGauge;// 5.변수의 초기화
	}

}

class Car {

	static int door = 5;

	int gasolinegauge;

	// Car클래스의 변수를 초기화하는 생성자
	Car(int gasolinegauge) {
		this.gasolinegauge = gasolinegauge;// 4.생성자실햄
	}

}
