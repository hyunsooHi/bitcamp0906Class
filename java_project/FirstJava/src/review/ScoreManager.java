package review;

public class ScoreManager {

	private Student[] score;
	private int numOfStudent;

	public ScoreManager(int size) {
		score = new Student[size];
		this.numOfStudent = 0;
	}

	public ScoreManager() {
		this(10);
	}

	public void showAllData() {
		System.out.println("학생 점수 리스트");
		System.out.println("이름\t 국어\t 영어\t 수학\t 총점\t 평균");
		for (int i = 0; i < numOfStudent; i++) {
			System.out.println(score[i].toString());
		}

	}
	
	
	//데이터 추가 Student타입의 참조값 받아서 
	public void insertScore(Student s) {
		score[numOfStudent] = s;
		numOfStudent++;
	}
	
	
	
	

}
