package slidingwindow;

import java.util.Arrays;
import java.util.LinkedList;

public class MaximumInEveryWindow {

	public static void main(String[] args) {
		int[] arr = { 12, -1, -7, 8, -15, 30, 16, 28 };
		int k = 3;
		int index = 0;
		int[] result = new int[arr.length - k + 1];
		LinkedList<Integer> queue = new LinkedList<Integer>();
		for (int i = 0; i < k; i++) {
			while (!queue.isEmpty() && arr[queue.peekLast()] < arr[i]) {
				queue.removeLast();
			}
			queue.add(i);

		}
		result[index++] = arr[queue.peekFirst()];
		for (int i = k; i < arr.length; i++) {
			while (!queue.isEmpty() && queue.peekFirst() < i - k + 1) {
				queue.removeFirst();

			}
			while (!queue.isEmpty() && arr[queue.peekLast()] < arr[i]) {
				queue.removeLast();
			}
			queue.add(i);
			result[index++] = arr[queue.peekFirst()];

		}

		System.out.println(Arrays.toString(result));
	}

}
