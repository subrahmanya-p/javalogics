package recursion;

public class PrintEven {
	public static void print(int n) {
		System.out.println("hey");
		if (n == 10) {
			return;

		}
		if (n % 2 == 0) {
			System.out.println(n);
		}
		print(n + 1);

	}

	public static void main(String[] args) {
		print(1);
	}
}
