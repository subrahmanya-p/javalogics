package numberss;

public class Harshadnum {
	public static boolean isHarshadnum(int n) {
		int sum = 0;
		int temp = n;
		while (n != 0) {
			sum += n % 10;
			n /= 10;
		}
		return temp % sum == 0;

	}

	public static void main(String[] args) {
		System.out.println(isHarshadnum(18));
	}

}
