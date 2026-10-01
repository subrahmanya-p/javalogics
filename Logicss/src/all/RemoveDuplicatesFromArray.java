package all;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray {
	public static void main(String[] args) {
		int[] arr = { 3, 4, 3, 2, 2, 4, 4, 4, 3, 3, 4, 4 };
		Set<Integer> i1 = new LinkedHashSet<Integer>();

		for (int i : arr) {
			i1.add(i);

		}
		for (Integer integer : i1) {
			System.out.println(integer);

		}

	}
}
