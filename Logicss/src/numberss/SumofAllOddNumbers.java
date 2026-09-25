package numberss;

public class SumofAllOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 11122522;
		int sum = 0;
		while (n != 0) {
			if ((n % 10) % 2 != 0) {

				sum += n % 10;
			}
			n /= 10;

		}
		System.out.println(sum);

	}

}
