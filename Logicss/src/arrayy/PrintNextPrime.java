package arrayy;

public class PrintNextPrime {

	public static int nextPrime(int n) {

		if (n < 2) {
			return 2;
		}

		for (int num = n + 1; num <= Integer.MAX_VALUE; num++) {

			boolean prime = true;

			for (int i = 2; i <= Math.sqrt(num); i++) {

				if (num % i == 0) {
					prime = false;
					break;
				}
			}

			if (prime) {
				return num;
			}
		}

		return -1;
	}

	public static void main(String[] args) {

        System.out.println(nextPrime(10)); 
        System.out.println(nextPrime(20)); 
        System.out.println(nextPrime(7));  
}