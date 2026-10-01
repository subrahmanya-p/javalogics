package all;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWords {
	public static void main(String[] args) {
		String[] strarr = "helllo my name is java java my name is ".split(" ");

		Set<String> strset = new LinkedHashSet<String>();
		for (String string : strarr) {
			strset.add(string);
			
		}
		for (String string : strset) {
			System.out.println(string);
			
		}

	}
}
