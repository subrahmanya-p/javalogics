package numberss;

public class CheckPali {
	public static boolean isPali(int n) {
		int temp=n;
		int rev = 0;
		while (n != 0) {
			rev = (rev * 10) + n % 10;
			n/=10;
			

		}
		return rev==temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3456789;
		System.out.println(isPali(n));
	}

}
