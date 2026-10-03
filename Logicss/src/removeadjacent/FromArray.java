package removeadjacent;

public class FromArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 3, 4, 5, 6, 6, 66, 66, 7, 8, 99, 9, 9, 9, 9 };
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				System.out.println(arr[i]);

			}

		}
		System.out.println(arr[arr.length - 1]);
	}
}
