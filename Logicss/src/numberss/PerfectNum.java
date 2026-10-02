package numberss;

public class PerfectNum {
	public static boolean isPerfectNum(int n) {
		int sum = 0;
		for (int i = 2; i * i >= n; i++) {
			if (n % i == 0) {
				sum += i;

			}

		}
		return sum == n;

	}
	public static void main(String[] args) {
		System.out.println(isPerfectNum(6));
	}

}
