package stringss;

public class ReverseConsonent11 {

	public static String ReverseConsonent(String s) {
		char[] ch = s.toCharArray();
		int i = 0;
		int j = ch.length - 1;
		while (i < j) {
			if (Vowels.isVowel(ch[i])) {
				i++;
			} else if (Vowels.isVowel(ch[j])) {
				j--;

			} else {

				char temp = ch[i];
				ch[i] = ch[j];
				ch[j] = temp;
				i++;
				j--;

			}

		}
//		System.out.println(ch);
		return new String(ch);
	}

	public static void main(String[] args) {
		System.out.println(ReverseConsonent("avebigogu"));

	}
}
