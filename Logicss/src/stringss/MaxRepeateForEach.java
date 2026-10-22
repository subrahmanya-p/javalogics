package stringss;

import java.util.HashMap;
import java.util.Map;

public class MaxRepeateForEach {

	static char c = ' ';

	static int max = Integer.MIN_VALUE;

	public static void main(String[] args) {
		String s = "subrahmnyaaaa";

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char ch : s.toCharArray()) {

			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		map.forEach((key, value) -> {
			if (value > max) {
				c = key;
				max = value;

			}

		});

		System.out.println("Max character:" + c);
		System.out.println("Max Count:" + max);
	}
}
