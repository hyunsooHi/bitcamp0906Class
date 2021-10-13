package chapter03;

//1. Calculator 클래스를 정의해봅시다.

import java.util.Scanner;

public class Calculator {
	// final 변수 앞에 -> 상수
// 클래스 앞에 사용 ->상속의 대상이 아니다
	// java에서 상수: 변수에 최초 초기화된 값을 바꾸지 못한다

	//Scanner scanner = new Scanner();
	final float PI = 3.1415f;
	final String USER_NAME;//dlstmxjstm qustn
	
	//생성자 : 초기화 메소드, 메소드 구조와 유사하지만 반환기능이 없다
	//클래스이름 (){}
	Calculator(String name){
		USER_NAME = name;
	}

	// ① 정수 두 개를 매개변수의 인자로 전달받아 더하기연산 후 출력하는 메소드를 정의
	public void add(int num1, int num2) {
		long result = (long)num1 + num2;
		System.out.println(num1 + "+" + num2 + "=" + result);
	}

	// ② 정수 두 개를 매개변수의 인자로 전달받아 빼기연산 후 출력하는 메소드를 정의
	public void minus(int num1, int num2) {
		long result = (long)num1 - num2;
		System.out.println(num1 + "-" + num2 + "=" + result);

	}

	// ③ 정수 두 개를 매개변수의 인자로 전달받아 곱하기연산 후 출력하는 메소드를 정의
	public void multiply(int num1, int num2) {
		long result = (long)num1 * num2;
		System.out.println(num1 + "*" + num2 + "=" + result);

	}

	// ④ 정수 두 개를 매개변수의 인자로 전달받아 나누기연산 후 출력하는 메소드를 정의
	public void divide(int num1, int num2) {
		float result = (float)num1 / num2;
		System.out.println(num1 + "/" + num2 + "=" + result);

	}

	// ⑤ 실수 반지름 하나를 매개변수의 인자로 전달받아 원의 둘레를 구해 반환하는 메소드를 반환하는 메소드를 정의
	public float circum(float r) {
		return 2 * PI * r;
	}

	// ⑥ 실수 반지름 하나를 매개변수의 인자로 전달받아 원의 넓이를 구해 반환하는 메소드를 반환하는 메소드를 정의
	// 원의 둘레 : 2 x π x r , 월의 넓이 : π x r x r
	public float cirArea(float r) {
		return PI * r * r;
	}
	// ⑦ main() 메소드를 정의하고 각각의 메소드를 호출해서 결과를 콘솔에 출력해봅시다.
	// ⑧ 콘솔에서 사용자에게 데이터를 받아 메소드를 호출할 때 사용자에게 받은 데이터를 메소드의 매개변수의 인자로 전달하는 코드를 main()
	// 메소드
	// 에 추가해봅시다.

	public static void main(String[] args) {
		//메소드를 사용하기 위해 인스턴스를 생성해야한다
		// 더하기
		Calculator cal = new Calculator("현수");
		//상수출력
		System.out.println("PI : " + cal.PI);
		System.out.println("User Name = " + cal.USER_NAME);
		
		//cal.USER_NAME ="dd"; 상수값 변경하면 에러
		cal.add(455555555, 6);
		// 빼기
		cal.minus(3, 5);
		cal.circum(5);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("덧셈을 시작합니다.\n숫자1을 입력해주세요." );
		//랩퍼클래쓰
		int num1 = Integer.parseInt(scanner.nextLine());
		System.out.println("덧셈을 시작합니다.\n숫자2를 입력해주세요." );
		int num2 = Integer.parseInt(scanner.nextLine());
		
		System.out.println("덧셈의 결과." );
		cal.add(num1, num2);
		
		System.out.println("=====================");
		System.out.println("원릐 둘레와 넓이를 구합니다.\n반지름을 입력해주세요.");
		float r = Float.parseFloat(scanner.nextLine());
		
		System.out.println("전달받은 반지름: "+r);
		System.out.println("원의 둘레: "+cal.circum(r));
		System.out.println("원의 넓이 : "+cal.cirArea(r));
		
	}

}
