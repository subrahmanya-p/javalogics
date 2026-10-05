package arraywithcollection;

import java.util.LinkedHashSet;
import java.util.Set;

public class UnionOfArray {

	public static void main(String[] args) {
		int[] arr1 = { 12, 3, 4, 5, 5 };
		int[] arr2 = { 1, 2, 3, 477, 55 };
		Set set = new LinkedHashSet();
		for (int i : arr1) {
			set.add(i);

		}
		for (int i : arr2) {
			set.add(i);

		}
		System.out.println(set);

	}

}
