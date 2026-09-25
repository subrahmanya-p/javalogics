package numberss;

public class CountAllEven {
	public static void main(String[] args) {
		int n = 34567;
		int count = 0;
		while (n != 0) {
			if ((n%10)%2==0) {
				
				count++;
			}
			n /= 10;

		}
		System.out.println(count);
	}
}
