package chapter06;

public class ArrayTest {

	public static void main(String[] args) {
		
		int[][] arr1= {
				{1,2,3},
				{4,5,6},
				{7,8,9},
				{10,11,12}
		};
		//출력
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				System.out.print(arr1[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("=====================");
		//////////////////////////////
		//행의 시프트
		
		//임시배열선언
		int[] temp = arr1[arr1.length-1];
		
		for(int i=arr1.length-1;i>0;i--) {
			arr1[i] = arr1[i-1];
			
		}
		arr1[0] = temp;
		//////////////////////////////////////
		
		//출력
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				System.out.print(arr1[i][j]+"\t");
			}
			System.out.println();
		}
				
		
		System.out.println("=====================");
		
		int[] arr= {100,22,55};
		
		System.out.println("최대: "+maxValue(arr));

		System.out.println("최소: "+miniValue(arr));
		
		//2차원 배열의 선언
		int[][] arr3 = {
				{1,2,3},
				{4,5,6,7},
				{8,9,10,11,12,13}
				
		};
		
		System.out.println("2차원배열출력");
		addOneDArr(arr3, 10);
		
		//for-each
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
			
		}
		
		for(int num:arr) {//요소의 개수만큼 무조건 돈다
			System.out.println(num);
		}
		
		
		
		
	}
	
	
	
	
	public static void addOneDArr(int[][] arr, int add) {
		
		//2차원 배열의출력
		//행
		for(int i=0;i<arr.length;i++) {
			//열
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		//매개변수로 전달받은 숫자를 각 요소에 더해준다
		for(int i=0;i<arr.length;i++) {
			//열
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] += add;
			}
			
		}
		
		System.out.println("각 요소에 숫자를 더하기====================");
		
		for(int i=0;i<arr.length;i++) {
			//열
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
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
