package duplicate;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateNumbers {
	public static void main(String[] args) {
		Set<Integer> i1 = new LinkedHashSet<>();
		int n = 1112345;
		while (n != 0) {
			i1.add(n % 10);
			n /= 10;

		}
		for (Integer integer : i1) {
			System.out.println(integer);

		}

	}

}
