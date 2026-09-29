package numberss;

public class ArmStrong {
	public static boolean isArmStrong(int n) {
		int temp = n;
		int sum = 0;
		while (n != 0) {
			sum += Math.pow(n % 10, 3);
			n/=10;
			
		}
		return temp==sum;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isArmStrong(1));

	}

}
