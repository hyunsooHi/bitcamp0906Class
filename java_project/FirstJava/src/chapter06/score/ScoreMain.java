package chapter06.score;

public class ScoreMain {

	public static void main(String[] args) {

//		3. main()메소드에 아래 내용을 정의해봅시다.
//		① Student 타입의 배열을 선언하고, 요소 10개를 저장할 수 있는 배열 인스턴스를 생성해 봅시다.
		Student[] score = new Student[10]; // null null....

		int numOfStudent = 0;//입력된 학생의 수!, 배열에 입력할때 index로 사용

//		② Student 타입의 인스턴스를 생성하고 배열에 저장하는 코드를 정의해봅시다.
		Student s1 = new Student("손흥민", 100, 100, 100);
		//score[0] = s1;
		score[numOfStudent] = s1;
		numOfStudent++;
		
		Student s2 = new Student("이강인",90,80,70);
		score[numOfStudent] = s2;
		numOfStudent++;
		
		
		for(int i=0;i<numOfStudent;i++) {
//			System.out.println(score[i].getScoreKor()
//					+ "\t" + score[i].getScoreEng()
//					+ "\t" + score[i].getScoreMath()
//					+ "\t" + score[i].getSum()
//					+ "\t" + score[i].getAvg()
//					);
			System.out.println(score[i]);//score[i].toString()
			
		}
		
		
		//score[5].getAvg();//오류!!!
		//데이터입력 배열저장
		//데이터검색 배열요소에서 검색
		//데이터삭제 배열요소삭제
		
		
		
//		③ 배열에 저장된 Student 타입의 인스턴스의 메소드를 이용해서 모든 100 출력해봅시다.

		for (Student student : score) {
			System.out.println(student.getScoreKor() + "\t" + student.getScoreEng() + "\t" + student.getScoreMath()
					+ "\t" + student.getSum() + "\t" + student.getAvg());
		}

		
		
		
	}

}
