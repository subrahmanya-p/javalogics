package slidingwindow;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CountEventNumbers {
	public static void main(String[] args) {
		int[] arr = { 2,3,4,5,5,6};
		int k = 3;
		int index = 0;
		int[] even = new int[arr.length - k + 1];
		for (int i = 0; i < k; i++)
			if (arr[i] % 2 == 0) {
				even[index]++;
			}
		index++;
		for (int i = k; i < arr.length; i++) {
			even[index] = even[index - 1];
			int lastElement = arr[i - k];
			if (lastElement % 2 == 0) {
				even[index]--;
			}
			if (arr[i] % 2 == 0) {
				even[index]++;
			}
			index++;
		}
		 System.out.println(Arrays.toString(even));
	}

}
