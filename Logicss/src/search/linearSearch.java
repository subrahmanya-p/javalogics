package search;

public class linearSearch {
	public static String firstOccurance(int[] arr, int search) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == search) {
				return "The Firts Occurance of the  element  " + search + " is :" + i;

			}

		}
		return "Not Found";

	}

	public static String lastOccurance(int[] arr, int search) {
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] == search) {
				return "The Last Occurance of the  element " + search + " is " + i;

			}

		}
		return "Not Found";

	}

	public static void printAllOccuranceIndex(int[] arr, int search) {
		boolean isFound = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == search) {
				isFound = true;
				System.out.println("The element " + search + " is present at index " + i);

			}

		}
		if (!isFound) {
			System.out.println("Not found");
		}

	}

	public static int countOccurance(int[] arr, int search) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == search) {
				count++;
			}
		}
		return count > 0 ? count : -1;

	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 3, 2,3,3,3,3,3,3,3,3, 4, 5, 6, 5, 6, 7, 8, 9, 8, 7, 7 };

		System.out.println(firstOccurance(arr, 4));
		System.out.println(lastOccurance(arr, 5));
		printAllOccuranceIndex(arr, 2);
		int occur=3;
		System.out.println("Number of occurance of "+occur+"  is: " + countOccurance(arr, occur));
	}

}
