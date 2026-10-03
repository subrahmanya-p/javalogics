package unique;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class UniqueElements {
	public static void main(String[] args) {
		char chaarrr[] = "abcabababababbababbabababababba".toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (char ch : chaarrr) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);

		}

		for (Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue()==1)
			System.out.println(entry.getKey() + " " + entry.getValue());

		}
	}

}
