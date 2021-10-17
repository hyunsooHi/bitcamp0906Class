package chapter06;

//1. 국어, 영어, 수학 점수 10개씩을
//저장하는 배열을 정의하고 점수를 모두 출력하고, 
//평균 점수를 출력하는 프로그램을 작성해봅시다. 
public class Average {

	public static void main(String[] args) {

		int subject = 3;// 과목수
		int number = 10;// 학생수
		int[][] score = new int[number][subject];
		int totalKorScore = 0;
		
		for (int i = 0; i < number; i++) {

			for (int j = 0; j < subject; j++) {

				int num = (int) (Math.random() * 101);

				score[i][j] = num;
				System.out.print(score[i][j] + "\t");

			}
			System.out.println();
		}
//
//		for (int[] arr : score) {
//			for (int n : arr) {
//				System.out.print(n + "\t");
//			}
//			System.out.println();
//		}

		int[] aver = { 0, 0, 0 };

		for (int i = 0; i < number; i++) {
			for (int j = 0; j < subject; j++)
				aver[j] += score[i][0];
		}

		for (int j = 0; j < score.length; j++) {
			aver[j] = aver[j] / score.length;
			System.out.println(aver[j]);
		}

		System.out.println(aver[0] + aver[1] + aver[2]);

	}
}
