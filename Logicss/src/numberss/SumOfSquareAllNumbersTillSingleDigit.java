package numberss;

public class SumOfSquareAllNumbersTillSingleDigit {
	public static int sum(int n) {
		int sum = 0;
		while (n != 0) {
			sum += Math.pow(n % 10, 2);
			n /= 10;
		}
		return sum;

	}

	public static void main(String[] args) {
		int n = 78;
		while (n > 9) {
			n = sum(n);

		}
		System.out.println(n);

	}
}
