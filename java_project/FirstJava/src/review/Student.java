package review;
//2. Student 클래스를 정의해봅시다.

//① 학생이름, 국어점수, 영어점수, 수학점수를 저장하는 변수를 정의 합니다.
//② 변수는 캡슐화를 합니다. getter/setter 메소드를 정의합니다.
//③ 총점과 평균을 구해 결과를 반환하는 메소드를 정의합니다.
//3. main()메소드에 아래 내용을 정의해봅시다.
//① Student 타입의 배열을 선언하고, 요소 10개를 저장할 수 있는 배열 인스턴스를 생성해 봅시다.
//② Student 타입의 인스턴스를 생성하고 배열에 저장하는 코드를 정의해봅시다.
//③ 배열에 저장된 Student 타입의 인스턴스의 메소드를 이용해서 모든 데이터를 출력해봅시다.

public class Student {

	private String name;
	private int kor;
	private int eng;
	private int math;

	public Student(String name, int kor, int eng, int math) {

		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public Student() {
	}

	public int total() {

		return kor + eng + math;
	}

	public float avg() {
		int total = total();
		
		return (float)total/3.0f;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", total()=" + total()
				+ ", avg()=" + avg() + "]";
	}

	

}
