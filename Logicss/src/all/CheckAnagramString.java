package all;

public class CheckAnagramString {
	public static boolean isAnagram(String s1, String s2) {
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		if (s1.length() != s2.length()) {
			return false;

		} else {
			for (int i = 0; i < ch1.length; i++) {
				if (ch1[i] != ch2[i])
					return false;

			}
			return true;

		}

	}

	public static void main(String[] args) {
		System.out.println(isAnagram("ssw", "ss"));

	}
}
