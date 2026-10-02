package numberss;

public class Disariumnum {
	public static boolean isDisariumnum(int n) {
		int digits = 0;
		int sum = 0;
		int temp = n;
		while (temp != 0) {
			digits++;
			temp /= 10;
			
		}
		temp = n;
			while (temp != 0) {
			
			sum += Math.pow(temp % 10, digits);
			temp /= 10;
			digits--;

		}
		return sum == n;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isDisariumnum(135));
	}

}
