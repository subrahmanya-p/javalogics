package numberss;

public class FibonacciWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 2;
		int fib1 = 0;
		int fib2 = 1;
		int fib3 = 0;

		System.out.println(fib1);
		System.out.println(fib2);
		while (i < 10) {
			fib3 = fib1 + fib2;
			System.out.println(fib3);
			fib1 = fib2;
			fib2 = fib3;
			i++;

		}
	}

}
