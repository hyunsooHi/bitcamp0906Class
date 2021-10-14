package chapter06;
//문제1.

//밑변과 높이 정보를 지정할 수 있는 Triangle 클래스를 정의하자.
//끝으로 밑변과 높이 정보를 변경시킬 수 있는 메서드와 삼각형의 넓이를 계
//산해서 반환하는 메서드도 함께 정의하자.

public class Triangle {

	// 변수 선언
	private double height;
	private double base;

	// 생성자
	public Triangle(double height, double base) {
		this.height = height;
		this.base = base;
	}

		
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}
	
	public double area(double height, double base) {

		return base * height / 2;

	}

	public static void main(String[] args) {
		Triangle tri = new Triangle(3,5);
		System.out.println(tri.area(2, 4));
		tri.base=3;
	}

}
