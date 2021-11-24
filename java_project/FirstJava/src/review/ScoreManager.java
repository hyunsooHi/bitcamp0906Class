package review;

public class ScoreManager {


	private Student score[];
	
	private int numOfStudent = 0;
	
	public ScoreManager(int size) {
		score = new Student[size];
		numOfStudent = 0;
	}
	
	public ScoreManager() {
		this(10);
	}
	// 전체 데이터 출력 : 배열의 입력된 모든 데이터를 출력
	public void showAllData() {
		
		for(int i = 0 ; i < numOfStudent ; i++) {
			System.out.println(score[i]);
		}
		
	}
	// 데이터 추가 : 배열의 요소로 추가 -> Student 타입의 참조값
	public void insertScore(Student s) {
		
		score[numOfStudent] = s;
		numOfStudent++;
		
	}
	// 데이터 검색 : 이름 기준 검색 -> 배열의 요소들 중 이름(검색 어)을 비교
//	public void search
//	
//	// 데이터 삭제 : 이름 기준으로 삭제 
//		// -> 배열에 요소에 손흥민 정보를 지운다! -> 손흥민 객체를 참조하는 값이 없으면 삭제
//	public void deleteScore(String name) {
//		search
//	}
//	
//	
//	// 이름으로 배열의 index 찾아 index 값을 반환하는 메소드
//	
//	// 학생 정보를 저장하고 -> 배열에 저장하는 메소드
//	
//	
//	public void index
//	
//	
//	public int searchIndex(String name) {
//		
//		for(int i = 0 ; i < numOfStudent ; i++) {
//			if (score[i].getName().equals(name)) {
//				return i;
//			}
//		}
//		
//	}
//	
	
	
	

}
