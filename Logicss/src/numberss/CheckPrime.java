package numberss;

import java.util.Scanner;

public class CheckPrime {
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
		System.out.println("Enter a Number : ");
		// TODO Auto-generated method stub
		if (isPrime(sc.nextInt())) {
			System.out.println("it is a Prime number");
		} else {
			System.err.println("it is not a prime number");
		}

	}

}
