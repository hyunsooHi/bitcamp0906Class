package chapter07;

//상속을 목적으로 만드는 기본(상위,조상) 클래스
// 상위 개념의 객체 표현 : 변수 , 메소드

//computer,audio,tv,... 등의 가전제품들을 만들건데
//판매 금액왔다갔다 

public class Product {//extends object 한것과같다

	int price; // 모든 제품의 가격
	int bonusPoint; // 제품 구매하면 제공하는 보너스 점수

	Product(int price) {
		this.price = price;
		this.bonusPoint = price / 10;
		
		
	}

}
