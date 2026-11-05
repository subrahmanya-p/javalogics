package dsabysubrahmanyaa;

public class AvgOfEverySubarrayOfSizeK {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 2, 6, 5, 6 };
		int k = 3;
		double[] avg = new double[arr.length - k + 1];
		double sum = 0;
		for (int i = 0; i < k; i++) {
			sum += arr[i];
		}
		avg[0] = sum / k;
		for (int i = k; i < arr.length; i++) {
			sum = sum - arr[i - k];
			sum = sum + arr[i];
			avg[i - k + 1] = sum / k;
		}
		for (double d : avg) {
			System.out.println(d);

		}
	}
}
