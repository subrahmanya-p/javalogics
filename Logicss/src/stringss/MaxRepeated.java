package stringss;

import java.util.HashMap;
import java.util.Map;

public class MaxRepeated {
	public static void main(String[] args) {
		String s = "subrahmnyaaaaAAAAAAAAAAA";
		char c = ' ';
		int max = Integer.MIN_VALUE;

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (char ch : s.toCharArray()) {

			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > max) {
				max = entry.getValue();
				c = entry.getKey();

			}

		}
		System.out.println("Max character:" + c);
		System.out.println("Max Count:" + max);
	}
}
