package sort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int arr[] = { 6, 7, 5, 3, 50, 0, -5, -9 };

		System.out.println(arr.length);
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				System.out.println("Comparing :" + arr[j] + " and " + arr[j + 1]);
				if (arr[j] > arr[j + 1]) {

					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					System.out.println("Swapping :" + arr[j] + " and " + arr[j + 1]);
					System.out.println("Array After Swapping :" + Arrays.toString(arr));

				}
			}
			System.out.println( "-----------------------Moved Element-------------- "+ arr[arr.length-1-i]);
			
		}

		System.out.println(Arrays.toString(arr));
	}
}