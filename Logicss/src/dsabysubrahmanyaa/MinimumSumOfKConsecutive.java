package dsabysubrahmanyaa;

public class MinimumSumOfKConsecutive {
	public static void main(String[] args) {

		int[] arr = { 1, 10, 3, 4, 5, 4, 9, 4, 4, 1, 1, 1 };
		int k = 3;
		int sum = 0;
		for (int i = 0; i < k; i++) {
			sum += arr[i];
		}
		int MinSum = sum;
		for (int i = k; i < arr.length; i++) {
			sum = sum - arr[i - k];
			sum +=   arr[i];
			MinSum = Math.min(MinSum, sum);

		}
		System.out.println("MiniMum Sum : " + MinSum);

	}
}