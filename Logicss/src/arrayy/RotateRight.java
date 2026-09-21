package arrayy;

import java.util.Arrays;

public class RotateRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 4, 5 };
		int k = 1;
		k = k % arr.length;
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i<k; i++) {
			int last = arr[arr.length - 1];

			for (int j = arr.length - 1; j >0 ; j--) {
				arr[j] = arr[j - 1];
			}
			 arr[i]= last;
		}

		System.out.println(Arrays.toString(arr));
	}

}
