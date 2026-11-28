package sort;

import java.util.Arrays;

public class QuickSort {
	static void quickSort(int arr[], int low, int high) {
		if (low < high) {
			int pivotIndex = partition(arr, low, high);
			quickSort(arr, low, pivotIndex - 1);
			quickSort(arr, pivotIndex + 1, high);

		}

	}

	static int partition(int arr[], int low, int high) {
		int i = low - 1;
		int pivot = arr[high];
		for (int j = low; j < high; j++) {
			if (arr[j] < pivot) {
				i++;
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;

			}

		}
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;
		return i + 1;

	}

	public static void main(String[] args) {
		int arr[] = { 1, 3, 5, 6, 1, 0, 0, 98, 0 };
		quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));

	}

}
