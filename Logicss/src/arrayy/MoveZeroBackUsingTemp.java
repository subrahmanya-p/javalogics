package arrayy;

import java.util.Arrays;

public class MoveZeroBackUsingTemp {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 0, 5, 9, 80, 0, 8, 0 };
		System.out.println("Before:" + Arrays.toString(arr));
		int temp[] = new int[arr.length];
		int j = 0;
		for (int i = 0; i < temp.length; i++) {
			if (arr[i] != 0) {
				temp[j++] = arr[i];
			}
		}
		System.out.println("After:" + Arrays.toString(temp));
	}
}
