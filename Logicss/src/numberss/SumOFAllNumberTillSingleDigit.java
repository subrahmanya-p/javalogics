package numberss;

public class SumOFAllNumberTillSingleDigit {
	public static int sum(int n) {
		int sum = 0;
		while (n != 0) {
			sum += n%10;
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
