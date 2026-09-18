package arrayy;

import java.util.Arrays;

public class MoveAllZeroBackWithoutUsingTemp {
	public static void main(String[] args) {
		int[] arr = { 1, -10, -7,0,0,0,0, 2, 5, 40,0, 5, 0, -7, -8, 10 };
		System.out.println("Before:" + Arrays.toString(arr));
		int j = 0;

		for (int i : arr) {
			if (i != 0) {
				arr[j++] = i;
			}

		}
		while (j < arr.length) {
			arr[j++] = 0;
		}
		System.out.println("After:" + Arrays.toString(arr));
	}
}
