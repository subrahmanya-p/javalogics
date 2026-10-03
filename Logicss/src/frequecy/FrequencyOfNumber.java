package frequecy;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FrequencyOfNumber {
	public static void main(String[] args) {
		int num = 1234519995;
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();

		 while (num!=0) {
				map.put(num%10, map.getOrDefault(num%10, 0) + 1);
				num/=10;
		}

		for (Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());

		}
	}

}
