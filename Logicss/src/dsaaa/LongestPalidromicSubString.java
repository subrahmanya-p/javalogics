package dsaaa;

public class LongestPalidromicSubString {

	public static boolean isPali(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;

			}
			i++;
			j--;

		}
		return true;
	}

	public static void main(String[] args) {
		String str = "whyyy";
		String res = Character.toString(str.charAt(0));
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length() + 1; j++) {

				String temp = str.substring(i, j);
				if (isPali(temp) && temp.length() > res.length()) {
					res = temp;
				}
///
			}
		}
		System.out.println(res);

	}
}
