package arrayy;

public class Main {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };

		// first half forward
		for (int i = 0; i < arr.length / 2; i++) {
			System.out.print(arr[i]);

		}
		System.out.println();
		// last half
		for (int i = arr.length / 2; i < arr.length; i++) {
			System.out.print(arr[i]);

		}
		System.out.println();
		// last half
		for (int i = arr.length - 1; i >= arr.length / 2; i--) {
			System.out.print(arr[i]);

		}
		System.out.println();
		// last half
		for (int i = arr.length / 2 - 1; i >= 0; i--) {
			System.out.print(arr[i]);

		}
		System.out.println();
		System.out.println("Even");
		for (int i : arr) {
			if (i % 2 == 0) {
				System.out.print(i);
			}
		}
		System.out.println();
		System.out.println("Odd");
		for (int i : arr) {
			if (!(i % 2 == 0)) {
				System.out.print(i);
			}
		}
		System.out.println();
		System.out.println("Event index ");
		int arr1[] = { 5, 4, 7, 6, 3, 2, 1 };
		for (int i = 0; i < arr1.length; i++) {
			if (i % 2 == 0) {
				System.out.print(arr1[i]);
			}

		}
		System.out.println();
		System.out.println(" odd index ");
//		int arr1[] = { 5, 4, 7, 6, 3, 2, 1 };
		for (int i = 0; i < arr1.length; i++) {
			if (!(i % 2 == 0)) {
				System.out.print(arr1[i]);
			}

		}
		System.out.println();
		System.out.println("Sum of all");
		int sumfull = 0;
		for (int i : arr1) {
			sumfull += i;
		}
		System.out.println(sumfull);

		System.out.println();
		System.out.println("Sum of Evenr");
		int sumfullEven = 0;
		for (int i : arr1) {
			if (i % 2 == 0) {
				sumfullEven += i;
			}
		}
		System.out.println(sumfullEven);
		System.out.println();
		System.out.println("Sum of Odd");
		int sumfullOdd = 0;
		for (int i : arr1) {
			if (!(i % 2 == 0)) {
				sumfullOdd += i;
			}
		}
		System.out.println(sumfullOdd);
		System.out.println();

		int product = 1;
		for (int i : arr1) {
			product *= i;
		}
		System.out.println(product);
		System.out.println();
		System.out.println("Total Count:");
		int count = 0;
		for (int i : arr1) {
			count++;
		}
		System.out.println(count);

	}
}
