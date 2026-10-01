package all;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] ch = "asdfghjhgfdssdasdfgygtf".toCharArray();
		Set<Character> c1 = new LinkedHashSet<>();
		for (char ele : ch) {
			c1.add(ele);

		}
		for (Character character : c1) {
			System.out.print(character + " ");
		}

	}

}
