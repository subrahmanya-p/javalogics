package SiddeshSir;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortByBubbleSort {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(2, 44, 3, 2, 4, 6, 6, 4, 4, 4, 4, 666, 55));

		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = 0; j < list.size() - 1 - i; j++) {

				if (list.get(j) > list.get(j + 1)) {
					int temp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, temp);

				}

			}

		}
		System.out.println(list);
	}
}
