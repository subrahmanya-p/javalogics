package Palidrome;

//import sun.security.x509.FreshestCRLExtension;

public class SmallestPalidromeWord13 {
	public static String longestPalidrome(String s) {
		String[] str = s.split(" ");
		String res = "";
		for (int i = 0; i <= str.length - 1; i++) {
			if (CheckPalidrome1.isPalidrome(str[i])) {
				if (str[i].length() < res.length() || res.isEmpty()) {

					res = str[i];
				}
			}

		}

		return res;
//		return "";

	}

	public static void main(String[] args) {
		System.out.println(longestPalidrome(" aa level add  aaaaaaaaa java aaaaaaaaaaaaaaa a"));
	}

}
