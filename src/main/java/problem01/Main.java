package problem01;

public class Main {
	public static void main(String[] args) {
		int[] arr = { -10, -3, 5, 6, -20 };
		findMaxProduct(arr);
	}

	public static void findMaxProduct(int[] arr) {
		
		//
		// 코드를 완성 하십시오.
		//
		int max = arr[0] * arr[1];
		int a = arr[0];
		int b = arr[1];
		
		for (int i = 0; i<arr.length; i++) {
			for (int j = i+1; j<arr.length; j++) {
				if (arr[i]*arr[j]>max) {
					max = arr[i]*arr[j];
					a = arr[i];
					b = arr[j];
				}
			}
		}
		
		System.out.println("[" + a + "," + b + "]");
	}
}
