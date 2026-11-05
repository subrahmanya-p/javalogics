package dsabysubrahmanyaa;

public class SumOfConsequegativer {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 4, 9, 4, 4 };
		int k = 3;
		int sum = 0;
		for (int i = 0; i < k; i++) {
			sum += arr[i];

		}
		int Maxsum = sum;
		for (int i = k; i < arr.length; i++) {
			sum = sum - arr[i - k];
			sum = sum + arr[i];
			Maxsum = Math.max(Maxsum, sum);

		}
		System.out.println("The Maximum sum " + Maxsum);

	}

}
