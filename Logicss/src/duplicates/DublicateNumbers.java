package duplicates;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DublicateNumbers {
	public static void main(String[] args) {
		int num = 175199895;
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();

		 while (num!=0) {
				map.put(num%10, map.getOrDefault(num%10, 0) + 1);
				num/=10;
		}

		for (Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue()>1) {
				
				System.out.println(entry.getKey() + " " + entry.getValue());
			}

		}
	}

}
