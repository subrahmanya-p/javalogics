package numberss;

public class SpyNum {
	public static boolean isSpy(int n) {
		int sum = 0;
		int product = 1;
		int temp = n;

		while (n != 0) {
			sum += n % 10;
			n /= 10;
		}
		n = temp;
		while (n != 0) {
			product *= n % 10;
			n /= 10;
		}
		return sum == product;
	}
	public static void main(String[] args) {
		System.out.println(isSpy(123));
	}

}
