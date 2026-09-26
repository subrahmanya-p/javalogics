package numberss;

public class SumCubeEachNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 134567;
		int sum = 0;
		while (n != 0) {
			sum += Math.pow(n % 10, 3);
			n /= 10;
		}
		System.out.println(sum);
	}

}
