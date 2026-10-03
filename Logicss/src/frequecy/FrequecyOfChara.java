package frequecy;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FrequecyOfChara {
	public static void main(String[] args) {
		String str = "abcabababababbababbabababababba";
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (char ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);

		}

		for (Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());

		}
	}

}
