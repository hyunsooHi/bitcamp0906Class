package chapter06.score;

public class ScoreManager {
	// 배열을 가지고 있고

	// 배열의 요소를 추가,검색,삭제하는기능을가지는클래스

	private Student[] score;
	private int numOfStudent;

	public ScoreManager(int size) {
		score = new Student[size];
		numOfStudent = 0;
	}

	public ScoreManager() {
		this(10);
	}

	// 전체 데이터 출력 : 배열에 입력된 모든 데이터를 출력
	public void showAllData() {
		System.out.println("학생 점수 리스트");
		System.out.println("======================");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("======================");

		for (int i = 0; i < numOfStudent; i++) {
			System.out.println(score[i]);
		}

		System.out.println("======================");

	}

	// 데이터 추가 : 배열의 요소로 추가 -> Student 타입의 참조값을 넣어줘야한다 객체의 주소를 넣는다
	public void insertScore(Student s) {
		score[numOfStudent++] = s;

		// numOfStudent++;

	}

	// 데이터 검색 : 이름기준검색 -> 배열의 요소들 중 이름(검색 어)을 비교
//	public void searchData(String name) {
//
//		for (int i = 0; i < numOfStudent; i++) {
//			// 검색어와 요소 객체의 name 문자열을 비교
//			if (score[i].getName().equals(name)) {
//				System.out.println(score[i]);
//
//			}
//
//		}
//
//	}
	public void searchData(String name) {

		// -1또는 배열 범위 안의 정수 0~N-1
		int index = searchIndex(name);

		if (index > -1) {
			System.out.println(score[index]);
		} else {
			System.out.println("검색하신 이름의 데이터가 존재하지 않습니다.");
		}

	}
	// 데이터 삭제 :
	// 이름 기준으로 삭제-> 배열에 요소에 손흥민의 정보를 지운다고 한다면 ->손흥민 객체를 참조하는 값이 없으면
	// 참조하는 변수가 없으면 알아서 갈비지가 삭제함 갈수있는주소를 누구도 가지지 않으면 삭제된것이다
	// 배열 내부 변수 주소값이 가리키지 않으면 삭제된다
	// 삭제하는법 1 2 3 4 5 6 중 3 에 null을 넣으면 삭제된다
	// 근데 numofstudent 수 때문에 버그가생긴다 이러면안된다
	// 3을 기준으로 오른쪽을 왼쪽으로 쉬프트해야한다
	// 마지막애는 남아있지만 상관없다 numofstudent가 빼기1해서 한칸왼쪽까지만 볼거니까
	//

//	public void deleteScore(String name) {
//
//		for (int i = 0; i < numOfStudent; i++) {
//			// 검색어와 요소 객체의 name 문자열을 비교
//			if (score[i].getName().equals(name)) {
//				for (int j = i; j < numOfStudent - 1; j++) {
//					score[j] = score[j + 1];
//				}
//				System.out.println("삭제되었습니다.");
//
//			}
//
//		}
//	}

	public void deleteScore(String name) {

		int index = searchIndex(name);

		if (index > -1) {
			// 시프트 : 참조값을 지운다! -> 정보 삭제
			for (int i = index; i < numOfStudent - 1; i++) {
				score[i] = score[i + 1];

			}
			numOfStudent--;
			System.out.println("데이터가 삭제 되었습니다.");

		} else {
			System.out.println("검색하신 이름의 데이터가 존재하지 않습니다.");
		}
	}

	// 배열에 있는 인덱스 i를 찾는 메소드를 만들자 소스가 겹치는건 메소드화 하는게 좋다
	// 이름으로 배열의 index를 찾아 index값을 반환하는 메소드
	private int searchIndex(String name) {
		int index = -1;

		for (int i = 0; i < numOfStudent; i++) {
			if (score[i].getName().equals(name)) {
				index = i;
				break;
			}
		}

		return index;
	}

}
