package SiddeshSir;

public class Consonents {

	public static void main(String[] args) {
		String s = "subraha AAAAAAAAAAaashdhbviuy234567890rdtgebe!!!!!!!!!!!!!nmdfloiuytgfvbnqjwkeorfiuygbnmwkerpf0AaaaaaaaaaaaQWERTYUIOPASDFGHJKLXCVBNM,.QWERTYUIOPASDFGHJKLXCVBNM,SWDEFRGTHYJK9giuhen ";
		int[] freq = new int[127];

		for (char ch : s.toCharArray()) {
		
			if (!Vowels.isVowel(ch)&&( (ch>='A'&& ch<='Z')|| (ch>='a'&& ch<='z'))) {
				freq[ch ]++;
			}
		}
//
		// Print frequencies
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] > 0) {
				System.out.println((char) (i ) + "-" + freq[i]);
			}
		}

	}
}