package SiddeshSir;

public class UppercaseCount {

	public static void main(String[] args) {
		String s = "subraha AAAAAAAAAAaashdhbviuy234567890rdtgebenmdfloiuytgfvbnqjwkeorfiuygbnmwkerpf0AaaaaaaaaaaaQWERTYUIOPASDFGHJKLXCVBNM,.QWERTYUIOPASDFGHJKLXCVBNM,SWDEFRGTHYJK9giuhen ";
		int[] freq = new int[26];

		for (char ch : s.toCharArray()) {
			// Check if character is a lowercase letter ('a' through 'z')
			if (ch >= 'A' && ch <= 'Z') {
				freq[ch - 'A']++;
			}
		}

		// Print frequencies
		for (int i = 0; i < 26; i++) {
			if (freq[i] > 0) {
				System.out.println((char) (i + 'A') + "-" + freq[i]);
			}
		}

	}
}