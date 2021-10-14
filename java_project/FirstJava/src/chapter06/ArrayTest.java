package chapter06;

public class ArrayTest {

	public static void main(String[] args) {
		
		int[] arr= {100,22,55};
		
		System.out.println("최대: "+maxValue(arr));

		System.out.println("최대: "+miniValue(arr));
	}

	public static int miniValue(int[] arr) {

		// 최솟값
		int minVal = arr[0];// 처음값을 최소값으로 저장

		// 각 요쇼의 값과 최소값들 비교후 더 작은값을 최소로 저장

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] < minVal) {
				minVal = arr[i];
			}
		}

		return minVal;
	}

	public static int maxValue(int[] arr) {
		// 최솟값
		int maxVal = arr[0];// 처음값을 최소값으로 저장

		// 각 요쇼의 값과 최소값들 비교후 더 작은값을 최소로 저장

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] > maxVal) {
				maxVal = arr[i];
			}
		}

		return maxVal;
	}

}
