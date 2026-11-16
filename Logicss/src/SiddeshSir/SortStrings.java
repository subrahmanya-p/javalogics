package SiddeshSir;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortStrings {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "mango", "orange", "grapes", "apple",
				"mango", "kiwi", "banana", "papaya", "watermelon", "orange", "pineapple"));
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = 0; j < list.size() - 1 - i; j++) {

				if (list.get(j).compareTo(list.get(j + 1)) > 0) {
					String temp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, temp);

				}

			}

		}
		System.out.println(list);
	}
}
