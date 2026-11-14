package slidingwindow;

import java.util.Arrays;
import java.util.LinkedList;

public class FirstNegativeNumber {
	public static void main(String[] args) {
		int[] arr = { 12, -1, -7, 8, -15, 30, 16, 28 };
		int k = 3;
		int[] result = new int[arr.length - k + 1];
		LinkedList<Integer> queue = new LinkedList<Integer>();
		int index = 0;
		for (int i = 0; i < k; i++) {
			if (arr[i] < 0) {
				queue.addLast(i);
			}
		}
		if (queue.isEmpty()) {
			result[index++] = 0;

		} else {
			result[index++] = arr[queue.peekFirst()];

		}
		for (int i = k; i < arr.length; i++) {
			while (!queue.isEmpty() && queue.peekFirst() < i - k + 1) {
				queue.removeFirst();

			}
			if (arr[i] < 0) {
				queue.addLast(i);
			}
			if (queue.isEmpty()) {
				result[index++] = 0;
			} else {
				result[index++] = arr[queue.peekFirst()];

			}

		}
		System.out.println(Arrays.toString(result));

	}
}
