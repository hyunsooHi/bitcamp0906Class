package review;

//3. main()메소드에 아래 내용을 정의해봅시다.
//① Student 타입의 배열을 선언하고, 요소 10개를 저장할 수 있는 배열 인스턴스를 생성해 봅시다.
//② Student 타입의 인스턴스를 생성하고 배열에 저장하는 코드를 정의해봅시다.
//③ 배열에 저장된 Student 타입의 인스턴스의 메소드를 이용해서 모든 데이터를 출력해봅시다.
public class ScoreMain {

	public static void main(String[] args) {

		Student[] students = new Student[10];

		Student s1 = new Student("dd", 100, 100, 100);

		students[0] = s1;
		students[1] = new Student("ee", 44, 44, 44);

		int numOfStudent = 0;
		students[numOfStudent] = s1;
		numOfStudent++;
		Student s2 = new Student("ddd", 100, 100, 100);
		students[numOfStudent] = s2;
		numOfStudent++;

		for (int i = 0; i < numOfStudent; i++) {
			System.out.println(students[i].toString());
		}

		

	}

}
