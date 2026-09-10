package search;

import java.util.Arrays;

public class BinarySearchh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 2, 4, 5, 4, 3 };
		
		int search=5;
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.binarySearch(arr, 7));

	}

}
