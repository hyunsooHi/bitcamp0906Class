package chapter06;

//문제 1.
//int형 1차원 배열을 매개변수로 전달 받아서 배열에 저장된 최대값,
//그리고 최소값을 구해서 반환하는 메소드를 다음의 형태로 각각 정의.
// public static int miniValue(int[] arr) { . . . . } // 최소값 반환
// public static int maxValue(int[] arr) { . . . . } // 최대값 반환
//
//위의 두 매소드는 인자로 전달되는 배열의 길이에 상관없이 동작하도록 정의.
//두 매소드 실행을 확인인하기 위한 main 메소드 정의.
//int형 배열에 채워질 정수는 프로그램 사용자로부터 입력 받고, 배열의 길이는
//임의로 결정
import java.util.Scanner;

public class Max {
	// 변수선언

	// 메소드선언
	public static int maxValue(int[] arr) {
		int max = 0;// 마찬가지로 최대값의 초기화가 배열들의 요소보다 작아야함 버그발생위험
		// 배열의 최대값 메소드가 이미 존재할것같은데 찾아보면 있을듯
		// 일단 내가 직접 만들어보자

		// 배열의 첫번째 인덱스부터 끝까지 서로서로 비교하여 인덱스가 3개면

		// 1이랑 2 비교하고 더 큰거를 맥스에 넣고
		// 맥스랑 3이랑 비교하고 더큰거를 맥스에 넣고
		// 맥스랑 4랑 비교하고 더큰거를 맥스에 넣고

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}

		return max;
	}

	public static int miniValue(int[] arr) {
		int min = 1000;// 근데 최솟값 초기화가 배열 요소들보다 커야하는데 ?? 안그러면 버그
		// 배열의 최대값 메소드가 이미 존재할것같은데 찾아보면 있을듯
		// 일단 내가 직접 만들어보자

		// 배열의 첫번째 인덱스부터 끝까지 서로서로 비교하여 인덱스가 3개면

		// 1이랑 2 비교하고 더 큰거를 맥스에 넣고
		// 맥스랑 3이랑 비교하고 더큰거를 맥스에 넣고
		// 맥스랑 4랑 비교하고 더큰거를 맥스에 넣고

		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}

		return min;
	}

	public static void main(String[] args) {
		int[] arr = { 3, 7, 4, 6, 1 };
		int[] arr2= {0,0,0,0,0};
		System.out.println(maxValue(arr));
		System.out.println(miniValue(arr));
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자입력");
		
		int a = Integer.parseInt(scanner.nextLine());
		System.out.println("받은숫자"+a);
		
		
		System.out.println("나가려면 q 누르세요");
		System.out.println(arr2.length);
		System.out.println(arr2[arr2.length-1]);
		
		arr2[4] = 5;

		arr2[1] = 5;
		arr2[2] = 5;
		arr2[3] = 5;
		arr2[6] = 5;
		System.out.println(arr2[1]);
		
//		int z=arr2.length;
//		System.out.println(z);
//		arr2[arr2.length] = Integer.parseInt(scanner.nextLine());
//		
//		
//		while( !(scanner.nextLine().equals("q")) )
//		{
//			int i=0;
//			i++;
//			System.out.println(arr2.length);
//			arr2[arr2.length-1] = Integer.parseInt(scanner.nextLine());
//			System.out.println(i+"번째 받은숫자"+arr2[arr2.length]);
//		}


		System.out.println("입력한배열"+arr2[arr2.length]);
		
		
		

	}

}
