package SiddeshSir;

public class CountVowels {

	public static void main(String[] args) {
		String s = "subraha AAAAAAAAAAaashdhbviuy234567890rdtgebenmdfloiuytgfvbnqjwkeorfiuygbnmwkerpf0AaaaaaaaaaaaQWERTYUIOPASDFGHJKLXCVBNM,.QWERTYUIOPASDFGHJKLXCVBNM,SWDEFRGTHYJK9giuhen ";
		int[] freq = new int[127];

		for (char ch : s.toCharArray()) {
		
			if (Vowels.isVowel(ch)) {
				freq[ch ]++;
			}
		}

		// Print frequencies
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] > 0) {
				System.out.println((char) (i ) + "-" + freq[i]);
			}
		}

	}
}