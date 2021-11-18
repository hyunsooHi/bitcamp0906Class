package testd;

public class ttee {

	public static void main(String[] args) {
//		1.국어, 영어, 수학 점수 10개씩을 저장하는 배열을 정의하고 점수를 모두 출력하고, 평균 점수를 출력하는 프로그램을 작성해봅시다.
//		각 점수는 랜덤한 값을 생성해서 입력합시다.

		
		int[] kor = new int[10];
		int[] eng = new int[10];
		int[] math = new int [10];
		

		int a=(int)(Math.random()*101);//0~100까지

		
		
		
		
		
		int[][] grade = new int[10][3];
		
		for(int i=0; i<grade.length; i++) {
			for(int j=0; j<grade[i].length; j++) {
				a=(int)(Math.random()*101);
				grade[i][j]= a;
				System.out.print(grade[i][j]+" ");
			}
			System.out.println();
		}
		
		int total=0;
		for(int i=0; i<grade.length; i++) {
			
			total += grade[i][0]; //kor
			
		}
		
		System.out.println(total/grade.length);
		
		
		for(int[] b :grade) {
			System.out.println();
			for(int d:b) {
				System.out.print(d+" ");
			}
		}
		
		
		
//		2.Student 클래스를 정의해봅시다.
//
//		  ①학생이름, 국어점수, 영어점수, 수학점수를 저장하는 변수를 정의 합니다.
//
//		  ②변수는 캡슐화를 합니다. getter/setter 메소드를 정의합니다.
//
//		  ③총점과 평균을 구해 결과를 반환하는 메소드를 정의합니다.
//
//		​
//
//		3.main()메소드에 아래 내용을 정의해봅시다.
//
//		  ①Student 타입의 배열을 선언하고, 요소 10개를 저장할 수 있는 배열 인스턴스를 생성해 봅시다.
//
//		  ②Student 타입의 인스턴스를 생성하고 배열에 저장하는 코드를 정의해봅시다.
//
//		  ③배열에 저장된 Student 타입의 인스턴스의 메소드를 이용해서 모든 데이터를 출력해봅시다.
//
//		06
		
		
		
		
		
		
		
		
		
		
	}

}
