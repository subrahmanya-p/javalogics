package reverse;

import java.util.Arrays;

public class ReverseNotTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 4, 5, 6, 4, 3, 4 };
		System.out.println("Original Array :" + Arrays.toString(arr));
		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}

		System.out.println("Reverse Array : " + Arrays.toString(arr));
	}

}
