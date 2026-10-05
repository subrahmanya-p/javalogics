package arraywithcollection;

import java.util.LinkedHashSet;
import java.util.Set;

public class InterSection {
	public static void main(String[] args) {
		int[] arr2 = { 1, 2, 3, 477, 55 };
		int[] arr1 = { 12, 3, 4, 55, 5 };
		Set set = new LinkedHashSet();
		Set set2 = new LinkedHashSet();
		for (int i : arr1) {
			set.add(i);

		}
		for (int i : arr2) {
			if (set.contains(i)) {
				set2.add(i);

			}

		}
		System.out.println(set2);

	}
}
