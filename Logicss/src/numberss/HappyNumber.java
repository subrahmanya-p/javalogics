package numberss;

public class HappyNumber {

	public static int sum(int n) {
		int sum = 0;
		while (n != 0) {
			int digit = n % 10;
			sum += digit * digit;
			n /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		int n = 7;
		while (n > 9) {
			n = sum(n);
		}
		if (n == 1 || n == 7) {
			System.out.println("Yes it is a Happy Number");
		} else {
			System.out.println("It is not");
		}
	}
}