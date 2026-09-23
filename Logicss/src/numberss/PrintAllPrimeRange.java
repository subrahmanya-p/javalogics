package numberss;

import java.util.Scanner;

public class PrintAllPrimeRange {
	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		} else {
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % 2 == 0) {
					return false;

				}
			}
			return true;
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Starting Range : ");
		int start = sc.nextInt();
		System.out.println("Enter the Starting Range : ");
		int end = sc.nextInt();
		for (int i = start; i <= end; i++) {
			if (isPrime(i)) {
				System.out.println(i);

			}

		}

		// TODO Auto-generated method stub

	}

}
