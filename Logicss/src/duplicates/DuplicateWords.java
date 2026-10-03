package duplicates;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateWords {

	public static void main(String[] args) {
		String strwords[] = "hyy my hh hh name is hyy my name is ".split(" ");
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();

		for (String str : strwords ) {
			map.put(str, map.getOrDefault(str, 0) + 1);

		}

		for (Entry<String, Integer> entry : map.entrySet()) {
			if(entry.getValue()>1)
			System.out.println(entry.getKey() + " " + entry.getValue());

		}
	}
	}


