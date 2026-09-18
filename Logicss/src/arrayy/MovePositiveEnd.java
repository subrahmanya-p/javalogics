package arrayy;

import java.util.Arrays;

public class MovePositiveEnd {
	public static void main(String[] args) {

		int[] arr = { 1, -10, -7, 2, 5, 4, 5, 0, -7, -8, 10 };
		System.out.println("Before:" + Arrays.toString(arr));
		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			if (arr[i] <0) {
				i++;
			} else if (arr[j] >= 0) {
				j--;

			} else {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}

		}
		System.out.println("After:" + Arrays.toString(arr));

	}

}
